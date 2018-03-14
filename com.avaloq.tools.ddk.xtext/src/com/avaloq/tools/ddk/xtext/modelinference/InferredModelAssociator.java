/*******************************************************************************
 * Copyright (c) 2016 Avaloq Evolution AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Avaloq Evolution AG - initial API and implementation
 *******************************************************************************/
package com.avaloq.tools.ddk.xtext.modelinference;

import static com.google.common.collect.Lists.newArrayList;

import java.util.AbstractSet;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.parser.antlr.IReferableElementsUnloader;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.IAcceptor;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;


/**
 * Manager for associations between source and inferred model elements.
 * Based on {@link org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator}
 */
@Singleton
public class InferredModelAssociator implements IInferredModelAssociations, IInferredModelAssociator, IDerivedStateComputer {

  private static final Logger LOGGER = Logger.getLogger(InferredModelAssociator.class);

  private static final int EXPECTED_INFERRED_ELEMENTS_PER_SOURCE = 4;

  @Inject
  private IReferableElementsUnloader.GenericUnloader unloader;

  @Inject
  private Provider<IModelInferrer> inferrerProvider;

  /**
   * An adapter that holds the mapping between source- and inferred-model elements.
   */
  public static class Adapter extends AdapterImpl {
    private final Map<EObject, Set<EObject>> sourceToInferredModelMap = newLinkedHashMapWithCapacity(40);
    private final Map<EObject, Set<EObject>> inferredModelToSourceMap = newLinkedHashMapWithCapacity(40);

    @Override
    public boolean isAdapterForType(final Object type) {
      return Adapter.class == type;
    }

    public Map<EObject, Set<EObject>> getSourceToInferredModelMap() {
      return sourceToInferredModelMap;
    }

    public Map<EObject, Set<EObject>> getInferredModelToSourceMap() {
      return inferredModelToSourceMap;
    }
  }

  /**
   * Get the adaptor mapping for the resource and install it if not already installed.
   *
   * @param resource
   *          the resource
   * @return the adaptor mapping
   */
  protected Adapter getOrInstall(final Resource resource) {
    if (!(resource instanceof XtextResource)) {
      return new Adapter();
    }
    // if (!languageName.equals(((XtextResource) resource).getLanguageName())) {
    // return new Adapter();
    // }
    Adapter adapter = (Adapter) EcoreUtil.getAdapter(resource.eAdapters(), Adapter.class);
    if (adapter == null) {
      adapter = new Adapter();
      resource.eAdapters().add(adapter);
    }
    return adapter;
  }

  /**
   * Get the source- to inferred-model element map for the resource.
   *
   * @param resource
   *          the resource
   * @return the map
   */
  protected Map<EObject, Set<EObject>> getSourceToInferredModelMap(final Resource resource) {
    return getOrInstall(resource).getSourceToInferredModelMap();
  }

  /**
   * Get the inferred-model- to source-model element map for the resource.
   *
   * @param resource
   *          the resource
   * @return the map
   */
  protected Map<EObject, Set<EObject>> getInferredModelToSourceMap(final Resource resource) {
    return getOrInstall(resource).getInferredModelToSourceMap();
  }

  /** {@inheritDoc} */
  @Override
  public void associate(final EObject sourceModelElement, final EObject inferredModelElement) {
    if (sourceModelElement != null) {
      Resource resource = sourceModelElement.eResource();
      Map<EObject, Set<EObject>> sourceToInferredModelMap = getSourceToInferredModelMap(resource);
      sourceToInferredModelMap.computeIfAbsent(sourceModelElement, k -> Sets.newHashSetWithExpectedSize(EXPECTED_INFERRED_ELEMENTS_PER_SOURCE)).add(inferredModelElement);
      Map<EObject, Set<EObject>> inferredModelToSourceMap = getInferredModelToSourceMap(resource);
      putIntoSmallSetMap(inferredModelElement, sourceModelElement, inferredModelToSourceMap, false);
    }
  }

  /** {@inheritDoc} */
  @Override
  public void associatePrimary(final EObject sourceModelElement, final EObject inferredModelElement) {
    if (sourceModelElement != null) {
      Resource resource = sourceModelElement.eResource();
      Map<EObject, Set<EObject>> sourceToInferredModelMap = getSourceToInferredModelMap(resource);
      sourceToInferredModelMap.computeIfAbsent(sourceModelElement, k -> Sets.newHashSetWithExpectedSize(EXPECTED_INFERRED_ELEMENTS_PER_SOURCE)).add(inferredModelElement);
      Map<EObject, Set<EObject>> inferredModelToSourceMap = getInferredModelToSourceMap(resource);
      putIntoSmallSetMap(inferredModelElement, sourceModelElement, inferredModelToSourceMap, true);
    }
  }

  /** {@inheritDoc} */
  @Override
  public Set<EObject> getInferredModelElements(final EObject sourceModelElement) {
    if (sourceModelElement == null) {
      return Collections.emptySet();
    }
    Map<EObject, Set<EObject>> map = getSourceToInferredModelMap(sourceModelElement.eResource());
    Set<EObject> result = map.get(sourceModelElement);
    return result != null ? result : Collections.emptySet();
  }

  /** {@inheritDoc} */
  @Override
  public Set<EObject> getSourceModelElements(final EObject inferredModelElement) {
    if (inferredModelElement == null) {
      return Collections.emptySet();
    }
    Map<EObject, Set<EObject>> map = getInferredModelToSourceMap(inferredModelElement.eResource());
    Set<EObject> result = map.get(inferredModelElement);
    return result != null ? result : Collections.emptySet();
  }

  /** {@inheritDoc} */
  @Override
  public EObject getPrimarySourceModelElement(final EObject inferredModelElement) {
    if (inferredModelElement == null) {
      return null;
    }
    Map<EObject, Set<EObject>> map = getInferredModelToSourceMap(inferredModelElement.eResource());
    Set<EObject> result = map.get(inferredModelElement);
    return result != null ? result.iterator().next() : null;
  }

  /** {@inheritDoc} */
  @Override
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean isPreLinkingPhase) {
    if (resource.getContents().isEmpty()) {
      return;
    }
    EObject eObject = resource.getContents().get(0);
    try {
      IModelInferrer inferrer = inferrerProvider.get();
      inferrer.inferTargetModel(eObject, createAcceptor(resource), isPreLinkingPhase);
      // CHECKSTYLE:OFF
    } catch (RuntimeException e) {
      // CHECKSTYLE:ON
      LOGGER.error("Failed to install derived state for resource " + resource.getURI(), e); //$NON-NLS-1$
    }
  }

  /**
   * Creates a new acceptor for the given resource.
   *
   * @param resource
   *          resource, must not be {@code null}
   * @return new acceptor, never {@code null}
   */
  protected IAcceptor<EObject> createAcceptor(final DerivedStateAwareResource resource) {
    return new IAcceptor<EObject>() {
      private InferenceContainer container;

      @Override
      public void accept(final EObject t) {
        if (t != null) {
          if (container == null) {
            container = ModelInferenceFactory.eINSTANCE.createInferenceContainer();
            resource.getContents().add(container);
          }
          container.getContents().add(t);
        }
      }
    };
  }

  /** {@inheritDoc} */
  @Override
  public void discardDerivedState(final DerivedStateAwareResource resource) {
    List<EObject> derived = newArrayList();
    EList<EObject> resourcesContentsList = resource.getContents();
    for (int i = 1; i < resourcesContentsList.size(); i++) {
      EObject eObject = resourcesContentsList.get(i);
      unloader.unloadRoot(eObject);
      derived.add(eObject);
    }
    resourcesContentsList.removeAll(derived);
    getSourceToInferredModelMap(resource).clear();
    getInferredModelToSourceMap(resource).clear();
  }

  private static <K, V> Map<K, V> newLinkedHashMapWithCapacity(final int capacity) {
    return new LinkedHashMap<K, V>(capacity) {
      private static final long serialVersionUID = 1L;

      @Override
      public void clear() {
        if (isEmpty()) {
          return;
        }
        super.clear();
      }
    };
  }

  private static <K, V> void putIntoSmallSetMap(final K key, final V value, final Map<? super K, Set<V>> map, final boolean head) {
    Set<V> set = map.get(key);
    if (head) {
      if (set == null) {
        set = new LinkedListBasedSet<V>();
        map.put(key, set);
      }
      set.remove(value);
      ((LinkedListBasedSet<V>) set).elements.addFirst(value);
    } else {
      if (set == null) {
        set = new LinkedListBasedSet<V>();
        map.put(key, set);
      }
      set.add(value);
    }
  }

  /**
   * Set implementation based on {@link LinkedList}.
   *
   * @param <E>
   *          generic element type
   */
  private static class LinkedListBasedSet<E> extends AbstractSet<E> {

    private final Deque<E> elements = Lists.newLinkedList();

    @Override
    public boolean add(final E e) {
      if (elements.contains(e)) {
        return false;
      }
      return elements.add(e);
    }

    @Override
    public Iterator<E> iterator() {
      return elements.iterator();
    }

    @Override
    public int size() {
      return elements.size();
    }

  }

}
