/**
 */
package com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.FormatterTestLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface FormatterTestLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "formatterTestLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.avaloq.com/tools/ddk/xtext/formatter/FormatterTestLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "formatterTestLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FormatterTestLanguagePackage eINSTANCE = com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.RootImpl <em>Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.RootImpl
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getRoot()
   * @generated
   */
  int ROOT = 0;

  /**
   * The number of structural features of the '<em>Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.LineImpl <em>Line</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.LineImpl
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getLine()
   * @generated
   */
  int LINE = 1;

  /**
   * The number of structural features of the '<em>Line</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.DeclImpl <em>Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.DeclImpl
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getDecl()
   * @generated
   */
  int DECL = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL__TYPE = LINE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL__NAME = LINE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL_FEATURE_COUNT = LINE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.AssignImpl <em>Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.AssignImpl
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getAssign()
   * @generated
   */
  int ASSIGN = 3;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__VAR = LINE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__OP = LINE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__VAL = LINE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_FEATURE_COUNT = LINE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.MethImpl <em>Meth</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.MethImpl
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getMeth()
   * @generated
   */
  int METH = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METH__NAME = LINE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METH__PARAM = LINE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Meth</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METH_FEATURE_COUNT = LINE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.ParamImpl <em>Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.ParamImpl
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getParam()
   * @generated
   */
  int PARAM = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__TYPE = 1;

  /**
   * The number of structural features of the '<em>Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.SpaceImpl <em>Space</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.SpaceImpl
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getSpace()
   * @generated
   */
  int SPACE = 6;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPACE__VAL = LINE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Space</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPACE_FEATURE_COUNT = LINE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestLinewrapImpl <em>Test Linewrap</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestLinewrapImpl
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getTestLinewrap()
   * @generated
   */
  int TEST_LINEWRAP = 7;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_LINEWRAP__ITEMS = ROOT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Test Linewrap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_LINEWRAP_FEATURE_COUNT = ROOT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestLinewrapMinMaxImpl <em>Test Linewrap Min Max</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestLinewrapMinMaxImpl
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getTestLinewrapMinMax()
   * @generated
   */
  int TEST_LINEWRAP_MIN_MAX = 8;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_LINEWRAP_MIN_MAX__ITEMS = ROOT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Test Linewrap Min Max</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_LINEWRAP_MIN_MAX_FEATURE_COUNT = ROOT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestIndentationImpl <em>Test Indentation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestIndentationImpl
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getTestIndentation()
   * @generated
   */
  int TEST_INDENTATION = 9;

  /**
   * The feature id for the '<em><b>Sub</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_INDENTATION__SUB = ROOT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_INDENTATION__ITEMS = ROOT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Semi</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_INDENTATION__SEMI = ROOT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Test Indentation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_INDENTATION_FEATURE_COUNT = ROOT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestColumnImpl <em>Test Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestColumnImpl
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getTestColumn()
   * @generated
   */
  int TEST_COLUMN = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_COLUMN__NAME = ROOT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_COLUMN__ITEMS = ROOT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Test Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_COLUMN_FEATURE_COUNT = ROOT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestOffsetImpl <em>Test Offset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestOffsetImpl
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getTestOffset()
   * @generated
   */
  int TEST_OFFSET = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_OFFSET__VALUE = ROOT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>First</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_OFFSET__FIRST = ROOT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Second</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_OFFSET__SECOND = ROOT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Test Offset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_OFFSET_FEATURE_COUNT = ROOT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestRightPaddingImpl <em>Test Right Padding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestRightPaddingImpl
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getTestRightPadding()
   * @generated
   */
  int TEST_RIGHT_PADDING = 12;

  /**
   * The feature id for the '<em><b>P1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_RIGHT_PADDING__P1 = ROOT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>P2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_RIGHT_PADDING__P2 = ROOT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Test Right Padding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_RIGHT_PADDING_FEATURE_COUNT = ROOT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FqnObjImpl <em>Fqn Obj</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FqnObjImpl
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getFqnObj()
   * @generated
   */
  int FQN_OBJ = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FQN_OBJ__NAME = LINE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fqn Obj</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FQN_OBJ_FEATURE_COUNT = LINE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FqnRefImpl <em>Fqn Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FqnRefImpl
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getFqnRef()
   * @generated
   */
  int FQN_REF = 14;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FQN_REF__REF = LINE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fqn Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FQN_REF_FEATURE_COUNT = LINE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.EnumerationImpl <em>Enumeration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.EnumerationImpl
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getEnumeration()
   * @generated
   */
  int ENUMERATION = 15;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__VAL = LINE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_FEATURE_COUNT = LINE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.SuppressedHiddenImpl <em>Suppressed Hidden</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.SuppressedHiddenImpl
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getSuppressedHidden()
   * @generated
   */
  int SUPPRESSED_HIDDEN = 16;

  /**
   * The feature id for the '<em><b>Vals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPRESSED_HIDDEN__VALS = LINE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Suppressed Hidden</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPRESSED_HIDDEN_FEATURE_COUNT = LINE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.SuppressedHiddenSubImpl <em>Suppressed Hidden Sub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.SuppressedHiddenSubImpl
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getSuppressedHiddenSub()
   * @generated
   */
  int SUPPRESSED_HIDDEN_SUB = 17;

  /**
   * The feature id for the '<em><b>Idval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPRESSED_HIDDEN_SUB__IDVAL = 0;

  /**
   * The number of structural features of the '<em>Suppressed Hidden Sub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPRESSED_HIDDEN_SUB_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.SuppressedHiddenSubSubImpl <em>Suppressed Hidden Sub Sub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.SuppressedHiddenSubSubImpl
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getSuppressedHiddenSubSub()
   * @generated
   */
  int SUPPRESSED_HIDDEN_SUB_SUB = 18;

  /**
   * The feature id for the '<em><b>Idval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPRESSED_HIDDEN_SUB_SUB__IDVAL = SUPPRESSED_HIDDEN_SUB__IDVAL;

  /**
   * The number of structural features of the '<em>Suppressed Hidden Sub Sub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPRESSED_HIDDEN_SUB_SUB_FEATURE_COUNT = SUPPRESSED_HIDDEN_SUB_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.SuppressedHiddenSubIDImpl <em>Suppressed Hidden Sub ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.SuppressedHiddenSubIDImpl
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getSuppressedHiddenSubID()
   * @generated
   */
  int SUPPRESSED_HIDDEN_SUB_ID = 19;

  /**
   * The feature id for the '<em><b>Idval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPRESSED_HIDDEN_SUB_ID__IDVAL = SUPPRESSED_HIDDEN_SUB__IDVAL;

  /**
   * The number of structural features of the '<em>Suppressed Hidden Sub ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPRESSED_HIDDEN_SUB_ID_FEATURE_COUNT = SUPPRESSED_HIDDEN_SUB_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.DatatypesImpl <em>Datatypes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.DatatypesImpl
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getDatatypes()
   * @generated
   */
  int DATATYPES = 20;

  /**
   * The feature id for the '<em><b>Val1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPES__VAL1 = LINE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Val2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPES__VAL2 = LINE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Val3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPES__VAL3 = LINE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Datatypes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPES_FEATURE_COUNT = LINE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Enum1 <em>Enum1</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Enum1
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getEnum1()
   * @generated
   */
  int ENUM1 = 21;


  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Root
   * @generated
   */
  EClass getRoot();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Line <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Line</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Line
   * @generated
   */
  EClass getLine();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Decl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decl</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Decl
   * @generated
   */
  EClass getDecl();

  /**
   * Returns the meta object for the attribute list '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Decl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Decl#getType()
   * @see #getDecl()
   * @generated
   */
  EAttribute getDecl_Type();

  /**
   * Returns the meta object for the attribute list '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Decl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Decl#getName()
   * @see #getDecl()
   * @generated
   */
  EAttribute getDecl_Name();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Assign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Assign
   * @generated
   */
  EClass getAssign();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Assign#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Assign#getVar()
   * @see #getAssign()
   * @generated
   */
  EAttribute getAssign_Var();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Assign#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Assign#getOp()
   * @see #getAssign()
   * @generated
   */
  EAttribute getAssign_Op();

  /**
   * Returns the meta object for the attribute list '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Assign#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Val</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Assign#getVal()
   * @see #getAssign()
   * @generated
   */
  EAttribute getAssign_Val();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Meth <em>Meth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meth</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Meth
   * @generated
   */
  EClass getMeth();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Meth#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Meth#getName()
   * @see #getMeth()
   * @generated
   */
  EAttribute getMeth_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Meth#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Param</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Meth#getParam()
   * @see #getMeth()
   * @generated
   */
  EReference getMeth_Param();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Param
   * @generated
   */
  EClass getParam();

  /**
   * Returns the meta object for the attribute list '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Param#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Param#getName()
   * @see #getParam()
   * @generated
   */
  EAttribute getParam_Name();

  /**
   * Returns the meta object for the attribute list '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Param#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Param#getType()
   * @see #getParam()
   * @generated
   */
  EAttribute getParam_Type();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Space <em>Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Space</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Space
   * @generated
   */
  EClass getSpace();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Space#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Space#getVal()
   * @see #getSpace()
   * @generated
   */
  EAttribute getSpace_Val();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestLinewrap <em>Test Linewrap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Linewrap</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestLinewrap
   * @generated
   */
  EClass getTestLinewrap();

  /**
   * Returns the meta object for the containment reference list '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestLinewrap#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestLinewrap#getItems()
   * @see #getTestLinewrap()
   * @generated
   */
  EReference getTestLinewrap_Items();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestLinewrapMinMax <em>Test Linewrap Min Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Linewrap Min Max</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestLinewrapMinMax
   * @generated
   */
  EClass getTestLinewrapMinMax();

  /**
   * Returns the meta object for the containment reference list '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestLinewrapMinMax#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestLinewrapMinMax#getItems()
   * @see #getTestLinewrapMinMax()
   * @generated
   */
  EReference getTestLinewrapMinMax_Items();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestIndentation <em>Test Indentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Indentation</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestIndentation
   * @generated
   */
  EClass getTestIndentation();

  /**
   * Returns the meta object for the containment reference list '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestIndentation#getSub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestIndentation#getSub()
   * @see #getTestIndentation()
   * @generated
   */
  EReference getTestIndentation_Sub();

  /**
   * Returns the meta object for the containment reference list '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestIndentation#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestIndentation#getItems()
   * @see #getTestIndentation()
   * @generated
   */
  EReference getTestIndentation_Items();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestIndentation#isSemi <em>Semi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Semi</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestIndentation#isSemi()
   * @see #getTestIndentation()
   * @generated
   */
  EAttribute getTestIndentation_Semi();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestColumn <em>Test Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Column</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestColumn
   * @generated
   */
  EClass getTestColumn();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestColumn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestColumn#getName()
   * @see #getTestColumn()
   * @generated
   */
  EAttribute getTestColumn_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestColumn#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestColumn#getItems()
   * @see #getTestColumn()
   * @generated
   */
  EReference getTestColumn_Items();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestOffset <em>Test Offset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Offset</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestOffset
   * @generated
   */
  EClass getTestOffset();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestOffset#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestOffset#getValue()
   * @see #getTestOffset()
   * @generated
   */
  EAttribute getTestOffset_Value();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestOffset#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestOffset#getFirst()
   * @see #getTestOffset()
   * @generated
   */
  EAttribute getTestOffset_First();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestOffset#getSecond <em>Second</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Second</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestOffset#getSecond()
   * @see #getTestOffset()
   * @generated
   */
  EAttribute getTestOffset_Second();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestRightPadding <em>Test Right Padding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Right Padding</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestRightPadding
   * @generated
   */
  EClass getTestRightPadding();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestRightPadding#getP1 <em>P1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>P1</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestRightPadding#getP1()
   * @see #getTestRightPadding()
   * @generated
   */
  EAttribute getTestRightPadding_P1();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestRightPadding#getP2 <em>P2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>P2</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.TestRightPadding#getP2()
   * @see #getTestRightPadding()
   * @generated
   */
  EAttribute getTestRightPadding_P2();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.FqnObj <em>Fqn Obj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fqn Obj</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.FqnObj
   * @generated
   */
  EClass getFqnObj();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.FqnObj#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.FqnObj#getName()
   * @see #getFqnObj()
   * @generated
   */
  EAttribute getFqnObj_Name();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.FqnRef <em>Fqn Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fqn Ref</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.FqnRef
   * @generated
   */
  EClass getFqnRef();

  /**
   * Returns the meta object for the reference '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.FqnRef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.FqnRef#getRef()
   * @see #getFqnRef()
   * @generated
   */
  EReference getFqnRef_Ref();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Enumeration
   * @generated
   */
  EClass getEnumeration();

  /**
   * Returns the meta object for the attribute list '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Enumeration#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Val</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Enumeration#getVal()
   * @see #getEnumeration()
   * @generated
   */
  EAttribute getEnumeration_Val();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.SuppressedHidden <em>Suppressed Hidden</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Suppressed Hidden</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.SuppressedHidden
   * @generated
   */
  EClass getSuppressedHidden();

  /**
   * Returns the meta object for the containment reference list '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.SuppressedHidden#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vals</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.SuppressedHidden#getVals()
   * @see #getSuppressedHidden()
   * @generated
   */
  EReference getSuppressedHidden_Vals();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.SuppressedHiddenSub <em>Suppressed Hidden Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Suppressed Hidden Sub</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.SuppressedHiddenSub
   * @generated
   */
  EClass getSuppressedHiddenSub();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.SuppressedHiddenSub#getIdval <em>Idval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Idval</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.SuppressedHiddenSub#getIdval()
   * @see #getSuppressedHiddenSub()
   * @generated
   */
  EAttribute getSuppressedHiddenSub_Idval();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.SuppressedHiddenSubSub <em>Suppressed Hidden Sub Sub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Suppressed Hidden Sub Sub</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.SuppressedHiddenSubSub
   * @generated
   */
  EClass getSuppressedHiddenSubSub();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.SuppressedHiddenSubID <em>Suppressed Hidden Sub ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Suppressed Hidden Sub ID</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.SuppressedHiddenSubID
   * @generated
   */
  EClass getSuppressedHiddenSubID();

  /**
   * Returns the meta object for class '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Datatypes <em>Datatypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatypes</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Datatypes
   * @generated
   */
  EClass getDatatypes();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Datatypes#getVal1 <em>Val1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val1</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Datatypes#getVal1()
   * @see #getDatatypes()
   * @generated
   */
  EAttribute getDatatypes_Val1();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Datatypes#getVal2 <em>Val2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val2</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Datatypes#getVal2()
   * @see #getDatatypes()
   * @generated
   */
  EAttribute getDatatypes_Val2();

  /**
   * Returns the meta object for the attribute '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Datatypes#getVal3 <em>Val3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val3</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Datatypes#getVal3()
   * @see #getDatatypes()
   * @generated
   */
  EAttribute getDatatypes_Val3();

  /**
   * Returns the meta object for enum '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Enum1 <em>Enum1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Enum1</em>'.
   * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Enum1
   * @generated
   */
  EEnum getEnum1();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FormatterTestLanguageFactory getFormatterTestLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.RootImpl <em>Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.RootImpl
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getRoot()
     * @generated
     */
    EClass ROOT = eINSTANCE.getRoot();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.LineImpl <em>Line</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.LineImpl
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getLine()
     * @generated
     */
    EClass LINE = eINSTANCE.getLine();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.DeclImpl <em>Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.DeclImpl
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getDecl()
     * @generated
     */
    EClass DECL = eINSTANCE.getDecl();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECL__TYPE = eINSTANCE.getDecl_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECL__NAME = eINSTANCE.getDecl_Name();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.AssignImpl <em>Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.AssignImpl
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getAssign()
     * @generated
     */
    EClass ASSIGN = eINSTANCE.getAssign();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGN__VAR = eINSTANCE.getAssign_Var();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGN__OP = eINSTANCE.getAssign_Op();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGN__VAL = eINSTANCE.getAssign_Val();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.MethImpl <em>Meth</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.MethImpl
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getMeth()
     * @generated
     */
    EClass METH = eINSTANCE.getMeth();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METH__NAME = eINSTANCE.getMeth_Name();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METH__PARAM = eINSTANCE.getMeth_Param();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.ParamImpl <em>Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.ParamImpl
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getParam()
     * @generated
     */
    EClass PARAM = eINSTANCE.getParam();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM__NAME = eINSTANCE.getParam_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM__TYPE = eINSTANCE.getParam_Type();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.SpaceImpl <em>Space</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.SpaceImpl
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getSpace()
     * @generated
     */
    EClass SPACE = eINSTANCE.getSpace();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPACE__VAL = eINSTANCE.getSpace_Val();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestLinewrapImpl <em>Test Linewrap</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestLinewrapImpl
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getTestLinewrap()
     * @generated
     */
    EClass TEST_LINEWRAP = eINSTANCE.getTestLinewrap();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_LINEWRAP__ITEMS = eINSTANCE.getTestLinewrap_Items();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestLinewrapMinMaxImpl <em>Test Linewrap Min Max</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestLinewrapMinMaxImpl
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getTestLinewrapMinMax()
     * @generated
     */
    EClass TEST_LINEWRAP_MIN_MAX = eINSTANCE.getTestLinewrapMinMax();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_LINEWRAP_MIN_MAX__ITEMS = eINSTANCE.getTestLinewrapMinMax_Items();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestIndentationImpl <em>Test Indentation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestIndentationImpl
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getTestIndentation()
     * @generated
     */
    EClass TEST_INDENTATION = eINSTANCE.getTestIndentation();

    /**
     * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_INDENTATION__SUB = eINSTANCE.getTestIndentation_Sub();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_INDENTATION__ITEMS = eINSTANCE.getTestIndentation_Items();

    /**
     * The meta object literal for the '<em><b>Semi</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_INDENTATION__SEMI = eINSTANCE.getTestIndentation_Semi();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestColumnImpl <em>Test Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestColumnImpl
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getTestColumn()
     * @generated
     */
    EClass TEST_COLUMN = eINSTANCE.getTestColumn();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_COLUMN__NAME = eINSTANCE.getTestColumn_Name();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_COLUMN__ITEMS = eINSTANCE.getTestColumn_Items();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestOffsetImpl <em>Test Offset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestOffsetImpl
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getTestOffset()
     * @generated
     */
    EClass TEST_OFFSET = eINSTANCE.getTestOffset();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_OFFSET__VALUE = eINSTANCE.getTestOffset_Value();

    /**
     * The meta object literal for the '<em><b>First</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_OFFSET__FIRST = eINSTANCE.getTestOffset_First();

    /**
     * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_OFFSET__SECOND = eINSTANCE.getTestOffset_Second();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestRightPaddingImpl <em>Test Right Padding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.TestRightPaddingImpl
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getTestRightPadding()
     * @generated
     */
    EClass TEST_RIGHT_PADDING = eINSTANCE.getTestRightPadding();

    /**
     * The meta object literal for the '<em><b>P1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_RIGHT_PADDING__P1 = eINSTANCE.getTestRightPadding_P1();

    /**
     * The meta object literal for the '<em><b>P2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_RIGHT_PADDING__P2 = eINSTANCE.getTestRightPadding_P2();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FqnObjImpl <em>Fqn Obj</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FqnObjImpl
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getFqnObj()
     * @generated
     */
    EClass FQN_OBJ = eINSTANCE.getFqnObj();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FQN_OBJ__NAME = eINSTANCE.getFqnObj_Name();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FqnRefImpl <em>Fqn Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FqnRefImpl
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getFqnRef()
     * @generated
     */
    EClass FQN_REF = eINSTANCE.getFqnRef();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FQN_REF__REF = eINSTANCE.getFqnRef_Ref();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.EnumerationImpl
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getEnumeration()
     * @generated
     */
    EClass ENUMERATION = eINSTANCE.getEnumeration();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION__VAL = eINSTANCE.getEnumeration_Val();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.SuppressedHiddenImpl <em>Suppressed Hidden</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.SuppressedHiddenImpl
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getSuppressedHidden()
     * @generated
     */
    EClass SUPPRESSED_HIDDEN = eINSTANCE.getSuppressedHidden();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUPPRESSED_HIDDEN__VALS = eINSTANCE.getSuppressedHidden_Vals();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.SuppressedHiddenSubImpl <em>Suppressed Hidden Sub</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.SuppressedHiddenSubImpl
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getSuppressedHiddenSub()
     * @generated
     */
    EClass SUPPRESSED_HIDDEN_SUB = eINSTANCE.getSuppressedHiddenSub();

    /**
     * The meta object literal for the '<em><b>Idval</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUPPRESSED_HIDDEN_SUB__IDVAL = eINSTANCE.getSuppressedHiddenSub_Idval();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.SuppressedHiddenSubSubImpl <em>Suppressed Hidden Sub Sub</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.SuppressedHiddenSubSubImpl
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getSuppressedHiddenSubSub()
     * @generated
     */
    EClass SUPPRESSED_HIDDEN_SUB_SUB = eINSTANCE.getSuppressedHiddenSubSub();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.SuppressedHiddenSubIDImpl <em>Suppressed Hidden Sub ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.SuppressedHiddenSubIDImpl
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getSuppressedHiddenSubID()
     * @generated
     */
    EClass SUPPRESSED_HIDDEN_SUB_ID = eINSTANCE.getSuppressedHiddenSubID();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.DatatypesImpl <em>Datatypes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.DatatypesImpl
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getDatatypes()
     * @generated
     */
    EClass DATATYPES = eINSTANCE.getDatatypes();

    /**
     * The meta object literal for the '<em><b>Val1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATATYPES__VAL1 = eINSTANCE.getDatatypes_Val1();

    /**
     * The meta object literal for the '<em><b>Val2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATATYPES__VAL2 = eINSTANCE.getDatatypes_Val2();

    /**
     * The meta object literal for the '<em><b>Val3</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATATYPES__VAL3 = eINSTANCE.getDatatypes_Val3();

    /**
     * The meta object literal for the '{@link com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Enum1 <em>Enum1</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.Enum1
     * @see com.avaloq.tools.ddk.xtext.formatter.formatterTestLanguage.impl.FormatterTestLanguagePackageImpl#getEnum1()
     * @generated
     */
    EEnum ENUM1 = eINSTANCE.getEnum1();

  }

} //FormatterTestLanguagePackage
