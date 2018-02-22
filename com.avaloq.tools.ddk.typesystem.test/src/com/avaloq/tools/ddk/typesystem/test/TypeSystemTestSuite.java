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
package com.avaloq.tools.ddk.typesystem.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.avaloq.tools.ddk.typesystem.AbstractTypeProviderTest;
import com.avaloq.tools.ddk.typesystem.BuiltInTypeModelAccessTest;
import com.avaloq.tools.ddk.typesystem.ParameterListMatcherTest;


/**
 * Empty class serving only as holder for JUnit4 annotations.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
// @Format-Off
    AbstractTypeProviderTest.class,
    ParameterListMatcherTest.class,
    BuiltInTypeModelAccessTest.class
// @Format-On
})
public class TypeSystemTestSuite {

}
