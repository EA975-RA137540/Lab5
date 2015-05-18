/**
 */
package Model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = Model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link Model.impl.FormularioImpl <em>Formulario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.FormularioImpl
	 * @see Model.impl.ModelPackageImpl#getFormulario()
	 * @generated
	 */
	int FORMULARIO = 0;

	/**
	 * The feature id for the '<em><b>Fistname</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__FISTNAME = 0;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__LASTNAME = 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__COUNTRY = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__STATE = 3;

	/**
	 * The feature id for the '<em><b>City</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__CITY = 4;

	/**
	 * The feature id for the '<em><b>CEP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__CEP = 5;

	/**
	 * The feature id for the '<em><b>Addres1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__ADDRES1 = 6;

	/**
	 * The feature id for the '<em><b>Addres2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__ADDRES2 = 7;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__PHONE = 8;

	/**
	 * The feature id for the '<em><b>CPF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__CPF = 9;

	/**
	 * The feature id for the '<em><b>Email</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__EMAIL = 10;

	/**
	 * The feature id for the '<em><b>Nascimento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__NASCIMENTO = 11;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__FRAME = 12;

	/**
	 * The feature id for the '<em><b>Txt First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TXT_FIRST_NAME = 13;

	/**
	 * The feature id for the '<em><b>Txt Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TXT_LAST_NAME = 14;

	/**
	 * The feature id for the '<em><b>Txt Data De Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TXT_DATA_DE_NASCIMENTO = 15;

	/**
	 * The feature id for the '<em><b>Txt Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TXT_EMAIL = 16;

	/**
	 * The feature id for the '<em><b>Txt Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TXT_CPF = 17;

	/**
	 * The feature id for the '<em><b>Txt Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TXT_PHONE = 18;

	/**
	 * The feature id for the '<em><b>Txt Addres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TXT_ADDRES = 19;

	/**
	 * The feature id for the '<em><b>Txt Addres 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TXT_ADDRES_1 = 20;

	/**
	 * The feature id for the '<em><b>Txt Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TXT_CEP = 21;

	/**
	 * The feature id for the '<em><b>Txt City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TXT_CITY = 22;

	/**
	 * The feature id for the '<em><b>Txt State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TXT_STATE = 23;

	/**
	 * The feature id for the '<em><b>Txt Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TXT_COUNTRY = 24;

	/**
	 * The feature id for the '<em><b>Btn Enviar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__BTN_ENVIAR = 25;

	/**
	 * The feature id for the '<em><b>Tf firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TF_FIRSTNAME = 26;

	/**
	 * The feature id for the '<em><b>Tf lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TF_LASTNAME = 27;

	/**
	 * The feature id for the '<em><b>Lbl Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__LBL_LAST_NAME = 28;

	/**
	 * The feature id for the '<em><b>Tf nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TF_NASCIMENTO = 29;

	/**
	 * The feature id for the '<em><b>Tf email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TF_EMAIL = 30;

	/**
	 * The feature id for the '<em><b>Lbl Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__LBL_EMAIL = 31;

	/**
	 * The feature id for the '<em><b>Tf CPF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TF_CPF = 32;

	/**
	 * The feature id for the '<em><b>Lbl Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__LBL_CPF = 33;

	/**
	 * The feature id for the '<em><b>Lbl Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__LBL_PHONE = 34;

	/**
	 * The feature id for the '<em><b>Tf phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TF_PHONE = 35;

	/**
	 * The feature id for the '<em><b>Lbl Addres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__LBL_ADDRES = 36;

	/**
	 * The feature id for the '<em><b>Tf Addres1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TF_ADDRES1 = 37;

	/**
	 * The feature id for the '<em><b>Lbl Addres 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__LBL_ADDRES_1 = 38;

	/**
	 * The feature id for the '<em><b>Tf Addres2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TF_ADDRES2 = 39;

	/**
	 * The feature id for the '<em><b>Lbl Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__LBL_CEP = 40;

	/**
	 * The feature id for the '<em><b>Tf CEP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TF_CEP = 41;

	/**
	 * The feature id for the '<em><b>lbl City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__LBL_CITY = 42;

	/**
	 * The feature id for the '<em><b>Tf city</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TF_CITY = 43;

	/**
	 * The feature id for the '<em><b>Lbl State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__LBL_STATE = 44;

	/**
	 * The feature id for the '<em><b>Tf state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TF_STATE = 45;

	/**
	 * The feature id for the '<em><b>Lbl Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__LBL_COUNTRY = 46;

	/**
	 * The feature id for the '<em><b>Tf country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__TF_COUNTRY = 47;

	/**
	 * The feature id for the '<em><b>Combo Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__COMBO_BOX = 48;

	/**
	 * The feature id for the '<em><b>Lbl Data De Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__LBL_DATA_DE_NASCIMENTO = 49;

	/**
	 * The number of structural features of the '<em>Formulario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO_FEATURE_COUNT = 50;

	/**
	 * The operation id for the '<em>Formulario</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO___FORMULARIO = 0;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO___INITIALIZE = 1;

	/**
	 * The number of operations of the '<em>Formulario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Model.impl.DadosImpl <em>Dados</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.DadosImpl
	 * @see Model.impl.ModelPackageImpl#getDados()
	 * @generated
	 */
	int DADOS = 1;

	/**
	 * The feature id for the '<em><b>Dados</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DADOS__DADOS = 0;

	/**
	 * The number of structural features of the '<em>Dados</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DADOS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Imprime</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DADOS___IMPRIME = 0;

	/**
	 * The number of operations of the '<em>Dados</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DADOS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Model.impl.PrintImpl <em>Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.PrintImpl
	 * @see Model.impl.ModelPackageImpl#getPrint()
	 * @generated
	 */
	int PRINT = 2;

	/**
	 * The feature id for the '<em><b>Fist Name Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__FIST_NAME_LABEL = 0;

	/**
	 * The feature id for the '<em><b>Last Name Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__LAST_NAME_LABEL = 1;

	/**
	 * The feature id for the '<em><b>Nascimento Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__NASCIMENTO_LABEL = 2;

	/**
	 * The feature id for the '<em><b>Email Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__EMAIL_LABEL = 3;

	/**
	 * The feature id for the '<em><b>Cpf Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__CPF_LABEL = 4;

	/**
	 * The feature id for the '<em><b>Phone Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__PHONE_LABEL = 5;

	/**
	 * The feature id for the '<em><b>Addres1 Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__ADDRES1_LABEL = 6;

	/**
	 * The feature id for the '<em><b>Addres2 Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__ADDRES2_LABEL = 7;

	/**
	 * The feature id for the '<em><b>Cep Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__CEP_LABEL = 8;

	/**
	 * The feature id for the '<em><b>City Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__CITY_LABEL = 9;

	/**
	 * The feature id for the '<em><b>State Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__STATE_LABEL = 10;

	/**
	 * The feature id for the '<em><b>Country Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__COUNTRY_LABEL = 11;

	/**
	 * The feature id for the '<em><b>Content Pane</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__CONTENT_PANE = 12;

	/**
	 * The feature id for the '<em><b>Title Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__TITLE_LABEL = 13;

	/**
	 * The number of structural features of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_FEATURE_COUNT = 14;

	/**
	 * The operation id for the '<em>Print</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT___PRINT = 0;

	/**
	 * The number of operations of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '<em>JFrame</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JFrame
	 * @see Model.impl.ModelPackageImpl#getJFrame()
	 * @generated
	 */
	int JFRAME = 3;

	/**
	 * The meta object id for the '<em>JText Field</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JTextField
	 * @see Model.impl.ModelPackageImpl#getJTextField()
	 * @generated
	 */
	int JTEXT_FIELD = 4;

	/**
	 * The meta object id for the '<em>JButton</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JButton
	 * @see Model.impl.ModelPackageImpl#getJButton()
	 * @generated
	 */
	int JBUTTON = 5;

	/**
	 * The meta object id for the '<em>JLabel</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JLabel
	 * @see Model.impl.ModelPackageImpl#getJLabel()
	 * @generated
	 */
	int JLABEL = 6;

	/**
	 * The meta object id for the '<em>JCombo Box</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JComboBox
	 * @see Model.impl.ModelPackageImpl#getJComboBox()
	 * @generated
	 */
	int JCOMBO_BOX = 7;

	/**
	 * The meta object id for the '<em>JPanel</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JPanel
	 * @see Model.impl.ModelPackageImpl#getJPanel()
	 * @generated
	 */
	int JPANEL = 8;


	/**
	 * Returns the meta object for class '{@link Model.Formulario <em>Formulario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formulario</em>'.
	 * @see Model.Formulario
	 * @generated
	 */
	EClass getFormulario();

	/**
	 * Returns the meta object for the reference '{@link Model.Formulario#getFistname <em>Fistname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fistname</em>'.
	 * @see Model.Formulario#getFistname()
	 * @see #getFormulario()
	 * @generated
	 */
	EReference getFormulario_Fistname();

	/**
	 * Returns the meta object for the reference '{@link Model.Formulario#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lastname</em>'.
	 * @see Model.Formulario#getLastname()
	 * @see #getFormulario()
	 * @generated
	 */
	EReference getFormulario_Lastname();

	/**
	 * Returns the meta object for the reference '{@link Model.Formulario#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see Model.Formulario#getCountry()
	 * @see #getFormulario()
	 * @generated
	 */
	EReference getFormulario_Country();

	/**
	 * Returns the meta object for the reference '{@link Model.Formulario#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see Model.Formulario#getState()
	 * @see #getFormulario()
	 * @generated
	 */
	EReference getFormulario_State();

	/**
	 * Returns the meta object for the reference '{@link Model.Formulario#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>City</em>'.
	 * @see Model.Formulario#getCity()
	 * @see #getFormulario()
	 * @generated
	 */
	EReference getFormulario_City();

	/**
	 * Returns the meta object for the reference '{@link Model.Formulario#getCEP <em>CEP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CEP</em>'.
	 * @see Model.Formulario#getCEP()
	 * @see #getFormulario()
	 * @generated
	 */
	EReference getFormulario_CEP();

	/**
	 * Returns the meta object for the reference '{@link Model.Formulario#getAddres1 <em>Addres1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Addres1</em>'.
	 * @see Model.Formulario#getAddres1()
	 * @see #getFormulario()
	 * @generated
	 */
	EReference getFormulario_Addres1();

	/**
	 * Returns the meta object for the reference '{@link Model.Formulario#getAddres2 <em>Addres2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Addres2</em>'.
	 * @see Model.Formulario#getAddres2()
	 * @see #getFormulario()
	 * @generated
	 */
	EReference getFormulario_Addres2();

	/**
	 * Returns the meta object for the reference '{@link Model.Formulario#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Phone</em>'.
	 * @see Model.Formulario#getPhone()
	 * @see #getFormulario()
	 * @generated
	 */
	EReference getFormulario_Phone();

	/**
	 * Returns the meta object for the reference '{@link Model.Formulario#getCPF <em>CPF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CPF</em>'.
	 * @see Model.Formulario#getCPF()
	 * @see #getFormulario()
	 * @generated
	 */
	EReference getFormulario_CPF();

	/**
	 * Returns the meta object for the reference '{@link Model.Formulario#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Email</em>'.
	 * @see Model.Formulario#getEmail()
	 * @see #getFormulario()
	 * @generated
	 */
	EReference getFormulario_Email();

	/**
	 * Returns the meta object for the reference '{@link Model.Formulario#getNascimento <em>Nascimento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nascimento</em>'.
	 * @see Model.Formulario#getNascimento()
	 * @see #getFormulario()
	 * @generated
	 */
	EReference getFormulario_Nascimento();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame</em>'.
	 * @see Model.Formulario#getFrame()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Frame();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTxtFirstName <em>Txt First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Txt First Name</em>'.
	 * @see Model.Formulario#getTxtFirstName()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_TxtFirstName();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTxtLastName <em>Txt Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Txt Last Name</em>'.
	 * @see Model.Formulario#getTxtLastName()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_TxtLastName();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTxtDataDeNascimento <em>Txt Data De Nascimento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Txt Data De Nascimento</em>'.
	 * @see Model.Formulario#getTxtDataDeNascimento()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_TxtDataDeNascimento();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTxtEmail <em>Txt Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Txt Email</em>'.
	 * @see Model.Formulario#getTxtEmail()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_TxtEmail();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTxtCpf <em>Txt Cpf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Txt Cpf</em>'.
	 * @see Model.Formulario#getTxtCpf()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_TxtCpf();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTxtPhone <em>Txt Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Txt Phone</em>'.
	 * @see Model.Formulario#getTxtPhone()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_TxtPhone();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTxtAddres <em>Txt Addres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Txt Addres</em>'.
	 * @see Model.Formulario#getTxtAddres()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_TxtAddres();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTxtAddres_1 <em>Txt Addres 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Txt Addres 1</em>'.
	 * @see Model.Formulario#getTxtAddres_1()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_TxtAddres_1();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTxtCep <em>Txt Cep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Txt Cep</em>'.
	 * @see Model.Formulario#getTxtCep()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_TxtCep();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTxtCity <em>Txt City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Txt City</em>'.
	 * @see Model.Formulario#getTxtCity()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_TxtCity();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTxtState <em>Txt State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Txt State</em>'.
	 * @see Model.Formulario#getTxtState()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_TxtState();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTxtCountry <em>Txt Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Txt Country</em>'.
	 * @see Model.Formulario#getTxtCountry()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_TxtCountry();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getBtnEnviar <em>Btn Enviar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Btn Enviar</em>'.
	 * @see Model.Formulario#getBtnEnviar()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_BtnEnviar();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTf_firstname <em>Tf firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tf firstname</em>'.
	 * @see Model.Formulario#getTf_firstname()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Tf_firstname();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTf_lastname <em>Tf lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tf lastname</em>'.
	 * @see Model.Formulario#getTf_lastname()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Tf_lastname();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getLblLastName <em>Lbl Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lbl Last Name</em>'.
	 * @see Model.Formulario#getLblLastName()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_LblLastName();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTf_nascimento <em>Tf nascimento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tf nascimento</em>'.
	 * @see Model.Formulario#getTf_nascimento()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Tf_nascimento();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTf_email <em>Tf email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tf email</em>'.
	 * @see Model.Formulario#getTf_email()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Tf_email();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getLblEmail <em>Lbl Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lbl Email</em>'.
	 * @see Model.Formulario#getLblEmail()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_LblEmail();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTf_CPF <em>Tf CPF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tf CPF</em>'.
	 * @see Model.Formulario#getTf_CPF()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Tf_CPF();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getLblCpf <em>Lbl Cpf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lbl Cpf</em>'.
	 * @see Model.Formulario#getLblCpf()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_LblCpf();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getLblPhone <em>Lbl Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lbl Phone</em>'.
	 * @see Model.Formulario#getLblPhone()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_LblPhone();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTf_phone <em>Tf phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tf phone</em>'.
	 * @see Model.Formulario#getTf_phone()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Tf_phone();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getLblAddres <em>Lbl Addres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lbl Addres</em>'.
	 * @see Model.Formulario#getLblAddres()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_LblAddres();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTf_Addres1 <em>Tf Addres1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tf Addres1</em>'.
	 * @see Model.Formulario#getTf_Addres1()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Tf_Addres1();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getLblAddres_1 <em>Lbl Addres 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lbl Addres 1</em>'.
	 * @see Model.Formulario#getLblAddres_1()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_LblAddres_1();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTf_Addres2 <em>Tf Addres2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tf Addres2</em>'.
	 * @see Model.Formulario#getTf_Addres2()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Tf_Addres2();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getLblCep <em>Lbl Cep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lbl Cep</em>'.
	 * @see Model.Formulario#getLblCep()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_LblCep();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTf_CEP <em>Tf CEP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tf CEP</em>'.
	 * @see Model.Formulario#getTf_CEP()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Tf_CEP();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#get_lblCity <em>lbl City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>lbl City</em>'.
	 * @see Model.Formulario#get_lblCity()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario__lblCity();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTf_city <em>Tf city</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tf city</em>'.
	 * @see Model.Formulario#getTf_city()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Tf_city();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getLblState <em>Lbl State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lbl State</em>'.
	 * @see Model.Formulario#getLblState()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_LblState();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTf_state <em>Tf state</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tf state</em>'.
	 * @see Model.Formulario#getTf_state()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Tf_state();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getLblCountry <em>Lbl Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lbl Country</em>'.
	 * @see Model.Formulario#getLblCountry()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_LblCountry();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getTf_country <em>Tf country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tf country</em>'.
	 * @see Model.Formulario#getTf_country()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Tf_country();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getComboBox <em>Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Combo Box</em>'.
	 * @see Model.Formulario#getComboBox()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_ComboBox();

	/**
	 * Returns the meta object for the attribute '{@link Model.Formulario#getLblDataDeNascimento <em>Lbl Data De Nascimento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lbl Data De Nascimento</em>'.
	 * @see Model.Formulario#getLblDataDeNascimento()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_LblDataDeNascimento();

	/**
	 * Returns the meta object for the '{@link Model.Formulario#Formulario() <em>Formulario</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Formulario</em>' operation.
	 * @see Model.Formulario#Formulario()
	 * @generated
	 */
	EOperation getFormulario__Formulario();

	/**
	 * Returns the meta object for the '{@link Model.Formulario#initialize() <em>Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see Model.Formulario#initialize()
	 * @generated
	 */
	EOperation getFormulario__Initialize();

	/**
	 * Returns the meta object for class '{@link Model.Dados <em>Dados</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dados</em>'.
	 * @see Model.Dados
	 * @generated
	 */
	EClass getDados();

	/**
	 * Returns the meta object for the attribute '{@link Model.Dados#getDados <em>Dados</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dados</em>'.
	 * @see Model.Dados#getDados()
	 * @see #getDados()
	 * @generated
	 */
	EAttribute getDados_Dados();

	/**
	 * Returns the meta object for the '{@link Model.Dados#imprime() <em>Imprime</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Imprime</em>' operation.
	 * @see Model.Dados#imprime()
	 * @generated
	 */
	EOperation getDados__Imprime();

	/**
	 * Returns the meta object for class '{@link Model.Print <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print</em>'.
	 * @see Model.Print
	 * @generated
	 */
	EClass getPrint();

	/**
	 * Returns the meta object for the attribute '{@link Model.Print#getFistNameLabel <em>Fist Name Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fist Name Label</em>'.
	 * @see Model.Print#getFistNameLabel()
	 * @see #getPrint()
	 * @generated
	 */
	EAttribute getPrint_FistNameLabel();

	/**
	 * Returns the meta object for the attribute '{@link Model.Print#getLastNameLabel <em>Last Name Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name Label</em>'.
	 * @see Model.Print#getLastNameLabel()
	 * @see #getPrint()
	 * @generated
	 */
	EAttribute getPrint_LastNameLabel();

	/**
	 * Returns the meta object for the attribute '{@link Model.Print#getNascimentoLabel <em>Nascimento Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nascimento Label</em>'.
	 * @see Model.Print#getNascimentoLabel()
	 * @see #getPrint()
	 * @generated
	 */
	EAttribute getPrint_NascimentoLabel();

	/**
	 * Returns the meta object for the attribute '{@link Model.Print#getEmailLabel <em>Email Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Label</em>'.
	 * @see Model.Print#getEmailLabel()
	 * @see #getPrint()
	 * @generated
	 */
	EAttribute getPrint_EmailLabel();

	/**
	 * Returns the meta object for the attribute '{@link Model.Print#getCpfLabel <em>Cpf Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpf Label</em>'.
	 * @see Model.Print#getCpfLabel()
	 * @see #getPrint()
	 * @generated
	 */
	EAttribute getPrint_CpfLabel();

	/**
	 * Returns the meta object for the attribute '{@link Model.Print#getPhoneLabel <em>Phone Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Label</em>'.
	 * @see Model.Print#getPhoneLabel()
	 * @see #getPrint()
	 * @generated
	 */
	EAttribute getPrint_PhoneLabel();

	/**
	 * Returns the meta object for the attribute '{@link Model.Print#getAddres1Label <em>Addres1 Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addres1 Label</em>'.
	 * @see Model.Print#getAddres1Label()
	 * @see #getPrint()
	 * @generated
	 */
	EAttribute getPrint_Addres1Label();

	/**
	 * Returns the meta object for the attribute '{@link Model.Print#getAddres2Label <em>Addres2 Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addres2 Label</em>'.
	 * @see Model.Print#getAddres2Label()
	 * @see #getPrint()
	 * @generated
	 */
	EAttribute getPrint_Addres2Label();

	/**
	 * Returns the meta object for the attribute '{@link Model.Print#getCepLabel <em>Cep Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cep Label</em>'.
	 * @see Model.Print#getCepLabel()
	 * @see #getPrint()
	 * @generated
	 */
	EAttribute getPrint_CepLabel();

	/**
	 * Returns the meta object for the attribute '{@link Model.Print#getCityLabel <em>City Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City Label</em>'.
	 * @see Model.Print#getCityLabel()
	 * @see #getPrint()
	 * @generated
	 */
	EAttribute getPrint_CityLabel();

	/**
	 * Returns the meta object for the attribute '{@link Model.Print#getStateLabel <em>State Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Label</em>'.
	 * @see Model.Print#getStateLabel()
	 * @see #getPrint()
	 * @generated
	 */
	EAttribute getPrint_StateLabel();

	/**
	 * Returns the meta object for the attribute '{@link Model.Print#getCountryLabel <em>Country Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Label</em>'.
	 * @see Model.Print#getCountryLabel()
	 * @see #getPrint()
	 * @generated
	 */
	EAttribute getPrint_CountryLabel();

	/**
	 * Returns the meta object for the attribute '{@link Model.Print#getContentPane <em>Content Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Pane</em>'.
	 * @see Model.Print#getContentPane()
	 * @see #getPrint()
	 * @generated
	 */
	EAttribute getPrint_ContentPane();

	/**
	 * Returns the meta object for the attribute '{@link Model.Print#getTitleLabel <em>Title Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Label</em>'.
	 * @see Model.Print#getTitleLabel()
	 * @see #getPrint()
	 * @generated
	 */
	EAttribute getPrint_TitleLabel();

	/**
	 * Returns the meta object for the '{@link Model.Print#Print() <em>Print</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print</em>' operation.
	 * @see Model.Print#Print()
	 * @generated
	 */
	EOperation getPrint__Print();

	/**
	 * Returns the meta object for data type '{@link JFrame <em>JFrame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JFrame</em>'.
	 * @see JFrame
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getJFrame();

	/**
	 * Returns the meta object for data type '{@link JTextField <em>JText Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JText Field</em>'.
	 * @see JTextField
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getJTextField();

	/**
	 * Returns the meta object for data type '{@link JButton <em>JButton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JButton</em>'.
	 * @see JButton
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getJButton();

	/**
	 * Returns the meta object for data type '{@link JLabel <em>JLabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JLabel</em>'.
	 * @see JLabel
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getJLabel();

	/**
	 * Returns the meta object for data type '{@link JComboBox <em>JCombo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JCombo Box</em>'.
	 * @see JComboBox
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getJComboBox();

	/**
	 * Returns the meta object for data type '{@link JPanel <em>JPanel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JPanel</em>'.
	 * @see JPanel
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getJPanel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Model.impl.FormularioImpl <em>Formulario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.FormularioImpl
		 * @see Model.impl.ModelPackageImpl#getFormulario()
		 * @generated
		 */
		EClass FORMULARIO = eINSTANCE.getFormulario();

		/**
		 * The meta object literal for the '<em><b>Fistname</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULARIO__FISTNAME = eINSTANCE.getFormulario_Fistname();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULARIO__LASTNAME = eINSTANCE.getFormulario_Lastname();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULARIO__COUNTRY = eINSTANCE.getFormulario_Country();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULARIO__STATE = eINSTANCE.getFormulario_State();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULARIO__CITY = eINSTANCE.getFormulario_City();

		/**
		 * The meta object literal for the '<em><b>CEP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULARIO__CEP = eINSTANCE.getFormulario_CEP();

		/**
		 * The meta object literal for the '<em><b>Addres1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULARIO__ADDRES1 = eINSTANCE.getFormulario_Addres1();

		/**
		 * The meta object literal for the '<em><b>Addres2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULARIO__ADDRES2 = eINSTANCE.getFormulario_Addres2();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULARIO__PHONE = eINSTANCE.getFormulario_Phone();

		/**
		 * The meta object literal for the '<em><b>CPF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULARIO__CPF = eINSTANCE.getFormulario_CPF();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULARIO__EMAIL = eINSTANCE.getFormulario_Email();

		/**
		 * The meta object literal for the '<em><b>Nascimento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULARIO__NASCIMENTO = eINSTANCE.getFormulario_Nascimento();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__FRAME = eINSTANCE.getFormulario_Frame();

		/**
		 * The meta object literal for the '<em><b>Txt First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TXT_FIRST_NAME = eINSTANCE.getFormulario_TxtFirstName();

		/**
		 * The meta object literal for the '<em><b>Txt Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TXT_LAST_NAME = eINSTANCE.getFormulario_TxtLastName();

		/**
		 * The meta object literal for the '<em><b>Txt Data De Nascimento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TXT_DATA_DE_NASCIMENTO = eINSTANCE.getFormulario_TxtDataDeNascimento();

		/**
		 * The meta object literal for the '<em><b>Txt Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TXT_EMAIL = eINSTANCE.getFormulario_TxtEmail();

		/**
		 * The meta object literal for the '<em><b>Txt Cpf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TXT_CPF = eINSTANCE.getFormulario_TxtCpf();

		/**
		 * The meta object literal for the '<em><b>Txt Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TXT_PHONE = eINSTANCE.getFormulario_TxtPhone();

		/**
		 * The meta object literal for the '<em><b>Txt Addres</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TXT_ADDRES = eINSTANCE.getFormulario_TxtAddres();

		/**
		 * The meta object literal for the '<em><b>Txt Addres 1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TXT_ADDRES_1 = eINSTANCE.getFormulario_TxtAddres_1();

		/**
		 * The meta object literal for the '<em><b>Txt Cep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TXT_CEP = eINSTANCE.getFormulario_TxtCep();

		/**
		 * The meta object literal for the '<em><b>Txt City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TXT_CITY = eINSTANCE.getFormulario_TxtCity();

		/**
		 * The meta object literal for the '<em><b>Txt State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TXT_STATE = eINSTANCE.getFormulario_TxtState();

		/**
		 * The meta object literal for the '<em><b>Txt Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TXT_COUNTRY = eINSTANCE.getFormulario_TxtCountry();

		/**
		 * The meta object literal for the '<em><b>Btn Enviar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__BTN_ENVIAR = eINSTANCE.getFormulario_BtnEnviar();

		/**
		 * The meta object literal for the '<em><b>Tf firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TF_FIRSTNAME = eINSTANCE.getFormulario_Tf_firstname();

		/**
		 * The meta object literal for the '<em><b>Tf lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TF_LASTNAME = eINSTANCE.getFormulario_Tf_lastname();

		/**
		 * The meta object literal for the '<em><b>Lbl Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__LBL_LAST_NAME = eINSTANCE.getFormulario_LblLastName();

		/**
		 * The meta object literal for the '<em><b>Tf nascimento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TF_NASCIMENTO = eINSTANCE.getFormulario_Tf_nascimento();

		/**
		 * The meta object literal for the '<em><b>Tf email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TF_EMAIL = eINSTANCE.getFormulario_Tf_email();

		/**
		 * The meta object literal for the '<em><b>Lbl Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__LBL_EMAIL = eINSTANCE.getFormulario_LblEmail();

		/**
		 * The meta object literal for the '<em><b>Tf CPF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TF_CPF = eINSTANCE.getFormulario_Tf_CPF();

		/**
		 * The meta object literal for the '<em><b>Lbl Cpf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__LBL_CPF = eINSTANCE.getFormulario_LblCpf();

		/**
		 * The meta object literal for the '<em><b>Lbl Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__LBL_PHONE = eINSTANCE.getFormulario_LblPhone();

		/**
		 * The meta object literal for the '<em><b>Tf phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TF_PHONE = eINSTANCE.getFormulario_Tf_phone();

		/**
		 * The meta object literal for the '<em><b>Lbl Addres</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__LBL_ADDRES = eINSTANCE.getFormulario_LblAddres();

		/**
		 * The meta object literal for the '<em><b>Tf Addres1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TF_ADDRES1 = eINSTANCE.getFormulario_Tf_Addres1();

		/**
		 * The meta object literal for the '<em><b>Lbl Addres 1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__LBL_ADDRES_1 = eINSTANCE.getFormulario_LblAddres_1();

		/**
		 * The meta object literal for the '<em><b>Tf Addres2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TF_ADDRES2 = eINSTANCE.getFormulario_Tf_Addres2();

		/**
		 * The meta object literal for the '<em><b>Lbl Cep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__LBL_CEP = eINSTANCE.getFormulario_LblCep();

		/**
		 * The meta object literal for the '<em><b>Tf CEP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TF_CEP = eINSTANCE.getFormulario_Tf_CEP();

		/**
		 * The meta object literal for the '<em><b>lbl City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__LBL_CITY = eINSTANCE.getFormulario__lblCity();

		/**
		 * The meta object literal for the '<em><b>Tf city</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TF_CITY = eINSTANCE.getFormulario_Tf_city();

		/**
		 * The meta object literal for the '<em><b>Lbl State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__LBL_STATE = eINSTANCE.getFormulario_LblState();

		/**
		 * The meta object literal for the '<em><b>Tf state</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TF_STATE = eINSTANCE.getFormulario_Tf_state();

		/**
		 * The meta object literal for the '<em><b>Lbl Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__LBL_COUNTRY = eINSTANCE.getFormulario_LblCountry();

		/**
		 * The meta object literal for the '<em><b>Tf country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__TF_COUNTRY = eINSTANCE.getFormulario_Tf_country();

		/**
		 * The meta object literal for the '<em><b>Combo Box</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__COMBO_BOX = eINSTANCE.getFormulario_ComboBox();

		/**
		 * The meta object literal for the '<em><b>Lbl Data De Nascimento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__LBL_DATA_DE_NASCIMENTO = eINSTANCE.getFormulario_LblDataDeNascimento();

		/**
		 * The meta object literal for the '<em><b>Formulario</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORMULARIO___FORMULARIO = eINSTANCE.getFormulario__Formulario();

		/**
		 * The meta object literal for the '<em><b>Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORMULARIO___INITIALIZE = eINSTANCE.getFormulario__Initialize();

		/**
		 * The meta object literal for the '{@link Model.impl.DadosImpl <em>Dados</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.DadosImpl
		 * @see Model.impl.ModelPackageImpl#getDados()
		 * @generated
		 */
		EClass DADOS = eINSTANCE.getDados();

		/**
		 * The meta object literal for the '<em><b>Dados</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DADOS__DADOS = eINSTANCE.getDados_Dados();

		/**
		 * The meta object literal for the '<em><b>Imprime</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DADOS___IMPRIME = eINSTANCE.getDados__Imprime();

		/**
		 * The meta object literal for the '{@link Model.impl.PrintImpl <em>Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.PrintImpl
		 * @see Model.impl.ModelPackageImpl#getPrint()
		 * @generated
		 */
		EClass PRINT = eINSTANCE.getPrint();

		/**
		 * The meta object literal for the '<em><b>Fist Name Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT__FIST_NAME_LABEL = eINSTANCE.getPrint_FistNameLabel();

		/**
		 * The meta object literal for the '<em><b>Last Name Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT__LAST_NAME_LABEL = eINSTANCE.getPrint_LastNameLabel();

		/**
		 * The meta object literal for the '<em><b>Nascimento Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT__NASCIMENTO_LABEL = eINSTANCE.getPrint_NascimentoLabel();

		/**
		 * The meta object literal for the '<em><b>Email Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT__EMAIL_LABEL = eINSTANCE.getPrint_EmailLabel();

		/**
		 * The meta object literal for the '<em><b>Cpf Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT__CPF_LABEL = eINSTANCE.getPrint_CpfLabel();

		/**
		 * The meta object literal for the '<em><b>Phone Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT__PHONE_LABEL = eINSTANCE.getPrint_PhoneLabel();

		/**
		 * The meta object literal for the '<em><b>Addres1 Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT__ADDRES1_LABEL = eINSTANCE.getPrint_Addres1Label();

		/**
		 * The meta object literal for the '<em><b>Addres2 Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT__ADDRES2_LABEL = eINSTANCE.getPrint_Addres2Label();

		/**
		 * The meta object literal for the '<em><b>Cep Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT__CEP_LABEL = eINSTANCE.getPrint_CepLabel();

		/**
		 * The meta object literal for the '<em><b>City Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT__CITY_LABEL = eINSTANCE.getPrint_CityLabel();

		/**
		 * The meta object literal for the '<em><b>State Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT__STATE_LABEL = eINSTANCE.getPrint_StateLabel();

		/**
		 * The meta object literal for the '<em><b>Country Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT__COUNTRY_LABEL = eINSTANCE.getPrint_CountryLabel();

		/**
		 * The meta object literal for the '<em><b>Content Pane</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT__CONTENT_PANE = eINSTANCE.getPrint_ContentPane();

		/**
		 * The meta object literal for the '<em><b>Title Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINT__TITLE_LABEL = eINSTANCE.getPrint_TitleLabel();

		/**
		 * The meta object literal for the '<em><b>Print</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRINT___PRINT = eINSTANCE.getPrint__Print();

		/**
		 * The meta object literal for the '<em>JFrame</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JFrame
		 * @see Model.impl.ModelPackageImpl#getJFrame()
		 * @generated
		 */
		EDataType JFRAME = eINSTANCE.getJFrame();

		/**
		 * The meta object literal for the '<em>JText Field</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JTextField
		 * @see Model.impl.ModelPackageImpl#getJTextField()
		 * @generated
		 */
		EDataType JTEXT_FIELD = eINSTANCE.getJTextField();

		/**
		 * The meta object literal for the '<em>JButton</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JButton
		 * @see Model.impl.ModelPackageImpl#getJButton()
		 * @generated
		 */
		EDataType JBUTTON = eINSTANCE.getJButton();

		/**
		 * The meta object literal for the '<em>JLabel</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JLabel
		 * @see Model.impl.ModelPackageImpl#getJLabel()
		 * @generated
		 */
		EDataType JLABEL = eINSTANCE.getJLabel();

		/**
		 * The meta object literal for the '<em>JCombo Box</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JComboBox
		 * @see Model.impl.ModelPackageImpl#getJComboBox()
		 * @generated
		 */
		EDataType JCOMBO_BOX = eINSTANCE.getJComboBox();

		/**
		 * The meta object literal for the '<em>JPanel</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JPanel
		 * @see Model.impl.ModelPackageImpl#getJPanel()
		 * @generated
		 */
		EDataType JPANEL = eINSTANCE.getJPanel();

	}

} //ModelPackage
