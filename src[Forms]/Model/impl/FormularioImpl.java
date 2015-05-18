/**
 */
package Model.impl;

import Model.Dados;
import Model.Formulario;
import Model.ModelPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formulario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.FormularioImpl#getFistname <em>Fistname</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getLastname <em>Lastname</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getState <em>State</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getCity <em>City</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getCEP <em>CEP</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getAddres1 <em>Addres1</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getAddres2 <em>Addres2</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getCPF <em>CPF</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getNascimento <em>Nascimento</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTxtFirstName <em>Txt First Name</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTxtLastName <em>Txt Last Name</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTxtDataDeNascimento <em>Txt Data De Nascimento</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTxtEmail <em>Txt Email</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTxtCpf <em>Txt Cpf</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTxtPhone <em>Txt Phone</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTxtAddres <em>Txt Addres</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTxtAddres_1 <em>Txt Addres 1</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTxtCep <em>Txt Cep</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTxtCity <em>Txt City</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTxtState <em>Txt State</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTxtCountry <em>Txt Country</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getBtnEnviar <em>Btn Enviar</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTf_firstname <em>Tf firstname</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTf_lastname <em>Tf lastname</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getLblLastName <em>Lbl Last Name</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTf_nascimento <em>Tf nascimento</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTf_email <em>Tf email</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getLblEmail <em>Lbl Email</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTf_CPF <em>Tf CPF</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getLblCpf <em>Lbl Cpf</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getLblPhone <em>Lbl Phone</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTf_phone <em>Tf phone</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getLblAddres <em>Lbl Addres</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTf_Addres1 <em>Tf Addres1</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getLblAddres_1 <em>Lbl Addres 1</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTf_Addres2 <em>Tf Addres2</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getLblCep <em>Lbl Cep</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTf_CEP <em>Tf CEP</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#get_lblCity <em>lbl City</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTf_city <em>Tf city</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getLblState <em>Lbl State</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTf_state <em>Tf state</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getLblCountry <em>Lbl Country</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getTf_country <em>Tf country</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getComboBox <em>Combo Box</em>}</li>
 *   <li>{@link Model.impl.FormularioImpl#getLblDataDeNascimento <em>Lbl Data De Nascimento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormularioImpl extends MinimalEObjectImpl.Container implements Formulario {
	/**
	 * The cached value of the '{@link #getFistname() <em>Fistname</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFistname()
	 * @generated
	 * @ordered
	 */
	protected Dados fistname;

	/**
	 * The cached value of the '{@link #getLastname() <em>Lastname</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected Dados lastname;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected Dados country;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected Dados state;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected Dados city;

	/**
	 * The cached value of the '{@link #getCEP() <em>CEP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCEP()
	 * @generated
	 * @ordered
	 */
	protected Dados cep;

	/**
	 * The cached value of the '{@link #getAddres1() <em>Addres1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddres1()
	 * @generated
	 * @ordered
	 */
	protected Dados addres1;

	/**
	 * The cached value of the '{@link #getAddres2() <em>Addres2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddres2()
	 * @generated
	 * @ordered
	 */
	protected Dados addres2;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected Dados phone;

	/**
	 * The cached value of the '{@link #getCPF() <em>CPF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPF()
	 * @generated
	 * @ordered
	 */
	protected Dados cpf;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected Dados email;

	/**
	 * The cached value of the '{@link #getNascimento() <em>Nascimento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNascimento()
	 * @generated
	 * @ordered
	 */
	protected Dados nascimento;

	/**
	 * The default value of the '{@link #getFrame() <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected static final Object FRAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected Object frame = FRAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTxtFirstName() <em>Txt First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final Object TXT_FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTxtFirstName() <em>Txt First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtFirstName()
	 * @generated
	 * @ordered
	 */
	protected Object txtFirstName = TXT_FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTxtLastName() <em>Txt Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtLastName()
	 * @generated
	 * @ordered
	 */
	protected static final Object TXT_LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTxtLastName() <em>Txt Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtLastName()
	 * @generated
	 * @ordered
	 */
	protected Object txtLastName = TXT_LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTxtDataDeNascimento() <em>Txt Data De Nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtDataDeNascimento()
	 * @generated
	 * @ordered
	 */
	protected static final Object TXT_DATA_DE_NASCIMENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTxtDataDeNascimento() <em>Txt Data De Nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtDataDeNascimento()
	 * @generated
	 * @ordered
	 */
	protected Object txtDataDeNascimento = TXT_DATA_DE_NASCIMENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTxtEmail() <em>Txt Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtEmail()
	 * @generated
	 * @ordered
	 */
	protected static final Object TXT_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTxtEmail() <em>Txt Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtEmail()
	 * @generated
	 * @ordered
	 */
	protected Object txtEmail = TXT_EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTxtCpf() <em>Txt Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtCpf()
	 * @generated
	 * @ordered
	 */
	protected static final Object TXT_CPF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTxtCpf() <em>Txt Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtCpf()
	 * @generated
	 * @ordered
	 */
	protected Object txtCpf = TXT_CPF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTxtPhone() <em>Txt Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtPhone()
	 * @generated
	 * @ordered
	 */
	protected static final Object TXT_PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTxtPhone() <em>Txt Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtPhone()
	 * @generated
	 * @ordered
	 */
	protected Object txtPhone = TXT_PHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTxtAddres() <em>Txt Addres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtAddres()
	 * @generated
	 * @ordered
	 */
	protected static final Object TXT_ADDRES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTxtAddres() <em>Txt Addres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtAddres()
	 * @generated
	 * @ordered
	 */
	protected Object txtAddres = TXT_ADDRES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTxtAddres_1() <em>Txt Addres 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtAddres_1()
	 * @generated
	 * @ordered
	 */
	protected static final Object TXT_ADDRES_1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTxtAddres_1() <em>Txt Addres 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtAddres_1()
	 * @generated
	 * @ordered
	 */
	protected Object txtAddres_1 = TXT_ADDRES_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getTxtCep() <em>Txt Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtCep()
	 * @generated
	 * @ordered
	 */
	protected static final Object TXT_CEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTxtCep() <em>Txt Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtCep()
	 * @generated
	 * @ordered
	 */
	protected Object txtCep = TXT_CEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTxtCity() <em>Txt City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtCity()
	 * @generated
	 * @ordered
	 */
	protected static final Object TXT_CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTxtCity() <em>Txt City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtCity()
	 * @generated
	 * @ordered
	 */
	protected Object txtCity = TXT_CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTxtState() <em>Txt State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtState()
	 * @generated
	 * @ordered
	 */
	protected static final Object TXT_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTxtState() <em>Txt State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtState()
	 * @generated
	 * @ordered
	 */
	protected Object txtState = TXT_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTxtCountry() <em>Txt Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtCountry()
	 * @generated
	 * @ordered
	 */
	protected static final Object TXT_COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTxtCountry() <em>Txt Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtCountry()
	 * @generated
	 * @ordered
	 */
	protected Object txtCountry = TXT_COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBtnEnviar() <em>Btn Enviar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtnEnviar()
	 * @generated
	 * @ordered
	 */
	protected static final Object BTN_ENVIAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBtnEnviar() <em>Btn Enviar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtnEnviar()
	 * @generated
	 * @ordered
	 */
	protected Object btnEnviar = BTN_ENVIAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTf_firstname() <em>Tf firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_firstname()
	 * @generated
	 * @ordered
	 */
	protected static final Object TF_FIRSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTf_firstname() <em>Tf firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_firstname()
	 * @generated
	 * @ordered
	 */
	protected Object tf_firstname = TF_FIRSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTf_lastname() <em>Tf lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_lastname()
	 * @generated
	 * @ordered
	 */
	protected static final Object TF_LASTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTf_lastname() <em>Tf lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_lastname()
	 * @generated
	 * @ordered
	 */
	protected Object tf_lastname = TF_LASTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLblLastName() <em>Lbl Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblLastName()
	 * @generated
	 * @ordered
	 */
	protected static final Object LBL_LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLblLastName() <em>Lbl Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblLastName()
	 * @generated
	 * @ordered
	 */
	protected Object lblLastName = LBL_LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTf_nascimento() <em>Tf nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_nascimento()
	 * @generated
	 * @ordered
	 */
	protected static final Object TF_NASCIMENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTf_nascimento() <em>Tf nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_nascimento()
	 * @generated
	 * @ordered
	 */
	protected Object tf_nascimento = TF_NASCIMENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTf_email() <em>Tf email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_email()
	 * @generated
	 * @ordered
	 */
	protected static final Object TF_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTf_email() <em>Tf email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_email()
	 * @generated
	 * @ordered
	 */
	protected Object tf_email = TF_EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLblEmail() <em>Lbl Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblEmail()
	 * @generated
	 * @ordered
	 */
	protected static final Object LBL_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLblEmail() <em>Lbl Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblEmail()
	 * @generated
	 * @ordered
	 */
	protected Object lblEmail = LBL_EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTf_CPF() <em>Tf CPF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_CPF()
	 * @generated
	 * @ordered
	 */
	protected static final Object TF_CPF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTf_CPF() <em>Tf CPF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_CPF()
	 * @generated
	 * @ordered
	 */
	protected Object tf_CPF = TF_CPF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLblCpf() <em>Lbl Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblCpf()
	 * @generated
	 * @ordered
	 */
	protected static final Object LBL_CPF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLblCpf() <em>Lbl Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblCpf()
	 * @generated
	 * @ordered
	 */
	protected Object lblCpf = LBL_CPF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLblPhone() <em>Lbl Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblPhone()
	 * @generated
	 * @ordered
	 */
	protected static final Object LBL_PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLblPhone() <em>Lbl Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblPhone()
	 * @generated
	 * @ordered
	 */
	protected Object lblPhone = LBL_PHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTf_phone() <em>Tf phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_phone()
	 * @generated
	 * @ordered
	 */
	protected static final Object TF_PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTf_phone() <em>Tf phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_phone()
	 * @generated
	 * @ordered
	 */
	protected Object tf_phone = TF_PHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLblAddres() <em>Lbl Addres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblAddres()
	 * @generated
	 * @ordered
	 */
	protected static final Object LBL_ADDRES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLblAddres() <em>Lbl Addres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblAddres()
	 * @generated
	 * @ordered
	 */
	protected Object lblAddres = LBL_ADDRES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTf_Addres1() <em>Tf Addres1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_Addres1()
	 * @generated
	 * @ordered
	 */
	protected static final Object TF_ADDRES1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTf_Addres1() <em>Tf Addres1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_Addres1()
	 * @generated
	 * @ordered
	 */
	protected Object tf_Addres1 = TF_ADDRES1_EDEFAULT;

	/**
	 * The default value of the '{@link #getLblAddres_1() <em>Lbl Addres 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblAddres_1()
	 * @generated
	 * @ordered
	 */
	protected static final Object LBL_ADDRES_1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLblAddres_1() <em>Lbl Addres 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblAddres_1()
	 * @generated
	 * @ordered
	 */
	protected Object lblAddres_1 = LBL_ADDRES_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getTf_Addres2() <em>Tf Addres2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_Addres2()
	 * @generated
	 * @ordered
	 */
	protected static final Object TF_ADDRES2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTf_Addres2() <em>Tf Addres2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_Addres2()
	 * @generated
	 * @ordered
	 */
	protected Object tf_Addres2 = TF_ADDRES2_EDEFAULT;

	/**
	 * The default value of the '{@link #getLblCep() <em>Lbl Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblCep()
	 * @generated
	 * @ordered
	 */
	protected static final Object LBL_CEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLblCep() <em>Lbl Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblCep()
	 * @generated
	 * @ordered
	 */
	protected Object lblCep = LBL_CEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTf_CEP() <em>Tf CEP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_CEP()
	 * @generated
	 * @ordered
	 */
	protected static final Object TF_CEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTf_CEP() <em>Tf CEP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_CEP()
	 * @generated
	 * @ordered
	 */
	protected Object tf_CEP = TF_CEP_EDEFAULT;

	/**
	 * The default value of the '{@link #get_lblCity() <em>lbl City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_lblCity()
	 * @generated
	 * @ordered
	 */
	protected static final Object _LBL_CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get_lblCity() <em>lbl City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_lblCity()
	 * @generated
	 * @ordered
	 */
	protected Object _lblCity = _LBL_CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTf_city() <em>Tf city</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_city()
	 * @generated
	 * @ordered
	 */
	protected static final Object TF_CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTf_city() <em>Tf city</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_city()
	 * @generated
	 * @ordered
	 */
	protected Object tf_city = TF_CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLblState() <em>Lbl State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblState()
	 * @generated
	 * @ordered
	 */
	protected static final Object LBL_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLblState() <em>Lbl State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblState()
	 * @generated
	 * @ordered
	 */
	protected Object lblState = LBL_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTf_state() <em>Tf state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_state()
	 * @generated
	 * @ordered
	 */
	protected static final Object TF_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTf_state() <em>Tf state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_state()
	 * @generated
	 * @ordered
	 */
	protected Object tf_state = TF_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLblCountry() <em>Lbl Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblCountry()
	 * @generated
	 * @ordered
	 */
	protected static final Object LBL_COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLblCountry() <em>Lbl Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblCountry()
	 * @generated
	 * @ordered
	 */
	protected Object lblCountry = LBL_COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTf_country() <em>Tf country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_country()
	 * @generated
	 * @ordered
	 */
	protected static final Object TF_COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTf_country() <em>Tf country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTf_country()
	 * @generated
	 * @ordered
	 */
	protected Object tf_country = TF_COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getComboBox() <em>Combo Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComboBox()
	 * @generated
	 * @ordered
	 */
	protected static final Object COMBO_BOX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComboBox() <em>Combo Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComboBox()
	 * @generated
	 * @ordered
	 */
	protected Object comboBox = COMBO_BOX_EDEFAULT;

	/**
	 * The default value of the '{@link #getLblDataDeNascimento() <em>Lbl Data De Nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblDataDeNascimento()
	 * @generated
	 * @ordered
	 */
	protected static final Object LBL_DATA_DE_NASCIMENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLblDataDeNascimento() <em>Lbl Data De Nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblDataDeNascimento()
	 * @generated
	 * @ordered
	 */
	protected Object lblDataDeNascimento = LBL_DATA_DE_NASCIMENTO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormularioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FORMULARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados getFistname() {
		if (fistname != null && fistname.eIsProxy()) {
			InternalEObject oldFistname = (InternalEObject)fistname;
			fistname = (Dados)eResolveProxy(oldFistname);
			if (fistname != oldFistname) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FORMULARIO__FISTNAME, oldFistname, fistname));
			}
		}
		return fistname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados basicGetFistname() {
		return fistname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFistname(Dados newFistname) {
		Dados oldFistname = fistname;
		fistname = newFistname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__FISTNAME, oldFistname, fistname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados getLastname() {
		if (lastname != null && lastname.eIsProxy()) {
			InternalEObject oldLastname = (InternalEObject)lastname;
			lastname = (Dados)eResolveProxy(oldLastname);
			if (lastname != oldLastname) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FORMULARIO__LASTNAME, oldLastname, lastname));
			}
		}
		return lastname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados basicGetLastname() {
		return lastname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastname(Dados newLastname) {
		Dados oldLastname = lastname;
		lastname = newLastname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__LASTNAME, oldLastname, lastname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados getCountry() {
		if (country != null && country.eIsProxy()) {
			InternalEObject oldCountry = (InternalEObject)country;
			country = (Dados)eResolveProxy(oldCountry);
			if (country != oldCountry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FORMULARIO__COUNTRY, oldCountry, country));
			}
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados basicGetCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(Dados newCountry) {
		Dados oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados getState() {
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject)state;
			state = (Dados)eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FORMULARIO__STATE, oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados basicGetState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(Dados newState) {
		Dados oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados getCity() {
		if (city != null && city.eIsProxy()) {
			InternalEObject oldCity = (InternalEObject)city;
			city = (Dados)eResolveProxy(oldCity);
			if (city != oldCity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FORMULARIO__CITY, oldCity, city));
			}
		}
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados basicGetCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(Dados newCity) {
		Dados oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados getCEP() {
		if (cep != null && cep.eIsProxy()) {
			InternalEObject oldCEP = (InternalEObject)cep;
			cep = (Dados)eResolveProxy(oldCEP);
			if (cep != oldCEP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FORMULARIO__CEP, oldCEP, cep));
			}
		}
		return cep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados basicGetCEP() {
		return cep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCEP(Dados newCEP) {
		Dados oldCEP = cep;
		cep = newCEP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__CEP, oldCEP, cep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados getAddres1() {
		if (addres1 != null && addres1.eIsProxy()) {
			InternalEObject oldAddres1 = (InternalEObject)addres1;
			addres1 = (Dados)eResolveProxy(oldAddres1);
			if (addres1 != oldAddres1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FORMULARIO__ADDRES1, oldAddres1, addres1));
			}
		}
		return addres1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados basicGetAddres1() {
		return addres1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddres1(Dados newAddres1) {
		Dados oldAddres1 = addres1;
		addres1 = newAddres1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__ADDRES1, oldAddres1, addres1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados getAddres2() {
		if (addres2 != null && addres2.eIsProxy()) {
			InternalEObject oldAddres2 = (InternalEObject)addres2;
			addres2 = (Dados)eResolveProxy(oldAddres2);
			if (addres2 != oldAddres2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FORMULARIO__ADDRES2, oldAddres2, addres2));
			}
		}
		return addres2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados basicGetAddres2() {
		return addres2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddres2(Dados newAddres2) {
		Dados oldAddres2 = addres2;
		addres2 = newAddres2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__ADDRES2, oldAddres2, addres2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados getPhone() {
		if (phone != null && phone.eIsProxy()) {
			InternalEObject oldPhone = (InternalEObject)phone;
			phone = (Dados)eResolveProxy(oldPhone);
			if (phone != oldPhone) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FORMULARIO__PHONE, oldPhone, phone));
			}
		}
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados basicGetPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(Dados newPhone) {
		Dados oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__PHONE, oldPhone, phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados getCPF() {
		if (cpf != null && cpf.eIsProxy()) {
			InternalEObject oldCPF = (InternalEObject)cpf;
			cpf = (Dados)eResolveProxy(oldCPF);
			if (cpf != oldCPF) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FORMULARIO__CPF, oldCPF, cpf));
			}
		}
		return cpf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados basicGetCPF() {
		return cpf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPF(Dados newCPF) {
		Dados oldCPF = cpf;
		cpf = newCPF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__CPF, oldCPF, cpf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados getEmail() {
		if (email != null && email.eIsProxy()) {
			InternalEObject oldEmail = (InternalEObject)email;
			email = (Dados)eResolveProxy(oldEmail);
			if (email != oldEmail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FORMULARIO__EMAIL, oldEmail, email));
			}
		}
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados basicGetEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(Dados newEmail) {
		Dados oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados getNascimento() {
		if (nascimento != null && nascimento.eIsProxy()) {
			InternalEObject oldNascimento = (InternalEObject)nascimento;
			nascimento = (Dados)eResolveProxy(oldNascimento);
			if (nascimento != oldNascimento) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FORMULARIO__NASCIMENTO, oldNascimento, nascimento));
			}
		}
		return nascimento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dados basicGetNascimento() {
		return nascimento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNascimento(Dados newNascimento) {
		Dados oldNascimento = nascimento;
		nascimento = newNascimento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__NASCIMENTO, oldNascimento, nascimento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFrame() {
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrame(Object newFrame) {
		Object oldFrame = frame;
		frame = newFrame;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__FRAME, oldFrame, frame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTxtFirstName() {
		return txtFirstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxtFirstName(Object newTxtFirstName) {
		Object oldTxtFirstName = txtFirstName;
		txtFirstName = newTxtFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TXT_FIRST_NAME, oldTxtFirstName, txtFirstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTxtLastName() {
		return txtLastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxtLastName(Object newTxtLastName) {
		Object oldTxtLastName = txtLastName;
		txtLastName = newTxtLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TXT_LAST_NAME, oldTxtLastName, txtLastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTxtDataDeNascimento() {
		return txtDataDeNascimento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxtDataDeNascimento(Object newTxtDataDeNascimento) {
		Object oldTxtDataDeNascimento = txtDataDeNascimento;
		txtDataDeNascimento = newTxtDataDeNascimento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TXT_DATA_DE_NASCIMENTO, oldTxtDataDeNascimento, txtDataDeNascimento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTxtEmail() {
		return txtEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxtEmail(Object newTxtEmail) {
		Object oldTxtEmail = txtEmail;
		txtEmail = newTxtEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TXT_EMAIL, oldTxtEmail, txtEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTxtCpf() {
		return txtCpf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxtCpf(Object newTxtCpf) {
		Object oldTxtCpf = txtCpf;
		txtCpf = newTxtCpf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TXT_CPF, oldTxtCpf, txtCpf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTxtPhone() {
		return txtPhone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxtPhone(Object newTxtPhone) {
		Object oldTxtPhone = txtPhone;
		txtPhone = newTxtPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TXT_PHONE, oldTxtPhone, txtPhone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTxtAddres() {
		return txtAddres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxtAddres(Object newTxtAddres) {
		Object oldTxtAddres = txtAddres;
		txtAddres = newTxtAddres;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TXT_ADDRES, oldTxtAddres, txtAddres));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTxtAddres_1() {
		return txtAddres_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxtAddres_1(Object newTxtAddres_1) {
		Object oldTxtAddres_1 = txtAddres_1;
		txtAddres_1 = newTxtAddres_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TXT_ADDRES_1, oldTxtAddres_1, txtAddres_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTxtCep() {
		return txtCep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxtCep(Object newTxtCep) {
		Object oldTxtCep = txtCep;
		txtCep = newTxtCep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TXT_CEP, oldTxtCep, txtCep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTxtCity() {
		return txtCity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxtCity(Object newTxtCity) {
		Object oldTxtCity = txtCity;
		txtCity = newTxtCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TXT_CITY, oldTxtCity, txtCity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTxtState() {
		return txtState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxtState(Object newTxtState) {
		Object oldTxtState = txtState;
		txtState = newTxtState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TXT_STATE, oldTxtState, txtState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTxtCountry() {
		return txtCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxtCountry(Object newTxtCountry) {
		Object oldTxtCountry = txtCountry;
		txtCountry = newTxtCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TXT_COUNTRY, oldTxtCountry, txtCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBtnEnviar() {
		return btnEnviar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBtnEnviar(Object newBtnEnviar) {
		Object oldBtnEnviar = btnEnviar;
		btnEnviar = newBtnEnviar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__BTN_ENVIAR, oldBtnEnviar, btnEnviar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTf_firstname() {
		return tf_firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTf_firstname(Object newTf_firstname) {
		Object oldTf_firstname = tf_firstname;
		tf_firstname = newTf_firstname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TF_FIRSTNAME, oldTf_firstname, tf_firstname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTf_lastname() {
		return tf_lastname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTf_lastname(Object newTf_lastname) {
		Object oldTf_lastname = tf_lastname;
		tf_lastname = newTf_lastname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TF_LASTNAME, oldTf_lastname, tf_lastname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLblLastName() {
		return lblLastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLblLastName(Object newLblLastName) {
		Object oldLblLastName = lblLastName;
		lblLastName = newLblLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__LBL_LAST_NAME, oldLblLastName, lblLastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTf_nascimento() {
		return tf_nascimento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTf_nascimento(Object newTf_nascimento) {
		Object oldTf_nascimento = tf_nascimento;
		tf_nascimento = newTf_nascimento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TF_NASCIMENTO, oldTf_nascimento, tf_nascimento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTf_email() {
		return tf_email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTf_email(Object newTf_email) {
		Object oldTf_email = tf_email;
		tf_email = newTf_email;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TF_EMAIL, oldTf_email, tf_email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLblEmail() {
		return lblEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLblEmail(Object newLblEmail) {
		Object oldLblEmail = lblEmail;
		lblEmail = newLblEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__LBL_EMAIL, oldLblEmail, lblEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTf_CPF() {
		return tf_CPF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTf_CPF(Object newTf_CPF) {
		Object oldTf_CPF = tf_CPF;
		tf_CPF = newTf_CPF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TF_CPF, oldTf_CPF, tf_CPF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLblCpf() {
		return lblCpf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLblCpf(Object newLblCpf) {
		Object oldLblCpf = lblCpf;
		lblCpf = newLblCpf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__LBL_CPF, oldLblCpf, lblCpf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLblPhone() {
		return lblPhone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLblPhone(Object newLblPhone) {
		Object oldLblPhone = lblPhone;
		lblPhone = newLblPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__LBL_PHONE, oldLblPhone, lblPhone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTf_phone() {
		return tf_phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTf_phone(Object newTf_phone) {
		Object oldTf_phone = tf_phone;
		tf_phone = newTf_phone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TF_PHONE, oldTf_phone, tf_phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLblAddres() {
		return lblAddres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLblAddres(Object newLblAddres) {
		Object oldLblAddres = lblAddres;
		lblAddres = newLblAddres;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__LBL_ADDRES, oldLblAddres, lblAddres));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTf_Addres1() {
		return tf_Addres1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTf_Addres1(Object newTf_Addres1) {
		Object oldTf_Addres1 = tf_Addres1;
		tf_Addres1 = newTf_Addres1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TF_ADDRES1, oldTf_Addres1, tf_Addres1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLblAddres_1() {
		return lblAddres_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLblAddres_1(Object newLblAddres_1) {
		Object oldLblAddres_1 = lblAddres_1;
		lblAddres_1 = newLblAddres_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__LBL_ADDRES_1, oldLblAddres_1, lblAddres_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTf_Addres2() {
		return tf_Addres2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTf_Addres2(Object newTf_Addres2) {
		Object oldTf_Addres2 = tf_Addres2;
		tf_Addres2 = newTf_Addres2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TF_ADDRES2, oldTf_Addres2, tf_Addres2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLblCep() {
		return lblCep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLblCep(Object newLblCep) {
		Object oldLblCep = lblCep;
		lblCep = newLblCep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__LBL_CEP, oldLblCep, lblCep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTf_CEP() {
		return tf_CEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTf_CEP(Object newTf_CEP) {
		Object oldTf_CEP = tf_CEP;
		tf_CEP = newTf_CEP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TF_CEP, oldTf_CEP, tf_CEP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object get_lblCity() {
		return _lblCity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_lblCity(Object new_lblCity) {
		Object old_lblCity = _lblCity;
		_lblCity = new_lblCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__LBL_CITY, old_lblCity, _lblCity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTf_city() {
		return tf_city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTf_city(Object newTf_city) {
		Object oldTf_city = tf_city;
		tf_city = newTf_city;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TF_CITY, oldTf_city, tf_city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLblState() {
		return lblState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLblState(Object newLblState) {
		Object oldLblState = lblState;
		lblState = newLblState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__LBL_STATE, oldLblState, lblState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTf_state() {
		return tf_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTf_state(Object newTf_state) {
		Object oldTf_state = tf_state;
		tf_state = newTf_state;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TF_STATE, oldTf_state, tf_state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLblCountry() {
		return lblCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLblCountry(Object newLblCountry) {
		Object oldLblCountry = lblCountry;
		lblCountry = newLblCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__LBL_COUNTRY, oldLblCountry, lblCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTf_country() {
		return tf_country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTf_country(Object newTf_country) {
		Object oldTf_country = tf_country;
		tf_country = newTf_country;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__TF_COUNTRY, oldTf_country, tf_country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getComboBox() {
		return comboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComboBox(Object newComboBox) {
		Object oldComboBox = comboBox;
		comboBox = newComboBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__COMBO_BOX, oldComboBox, comboBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLblDataDeNascimento() {
		return lblDataDeNascimento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLblDataDeNascimento(Object newLblDataDeNascimento) {
		Object oldLblDataDeNascimento = lblDataDeNascimento;
		lblDataDeNascimento = newLblDataDeNascimento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FORMULARIO__LBL_DATA_DE_NASCIMENTO, oldLblDataDeNascimento, lblDataDeNascimento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Formulario() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initialize() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.FORMULARIO__FISTNAME:
				if (resolve) return getFistname();
				return basicGetFistname();
			case ModelPackage.FORMULARIO__LASTNAME:
				if (resolve) return getLastname();
				return basicGetLastname();
			case ModelPackage.FORMULARIO__COUNTRY:
				if (resolve) return getCountry();
				return basicGetCountry();
			case ModelPackage.FORMULARIO__STATE:
				if (resolve) return getState();
				return basicGetState();
			case ModelPackage.FORMULARIO__CITY:
				if (resolve) return getCity();
				return basicGetCity();
			case ModelPackage.FORMULARIO__CEP:
				if (resolve) return getCEP();
				return basicGetCEP();
			case ModelPackage.FORMULARIO__ADDRES1:
				if (resolve) return getAddres1();
				return basicGetAddres1();
			case ModelPackage.FORMULARIO__ADDRES2:
				if (resolve) return getAddres2();
				return basicGetAddres2();
			case ModelPackage.FORMULARIO__PHONE:
				if (resolve) return getPhone();
				return basicGetPhone();
			case ModelPackage.FORMULARIO__CPF:
				if (resolve) return getCPF();
				return basicGetCPF();
			case ModelPackage.FORMULARIO__EMAIL:
				if (resolve) return getEmail();
				return basicGetEmail();
			case ModelPackage.FORMULARIO__NASCIMENTO:
				if (resolve) return getNascimento();
				return basicGetNascimento();
			case ModelPackage.FORMULARIO__FRAME:
				return getFrame();
			case ModelPackage.FORMULARIO__TXT_FIRST_NAME:
				return getTxtFirstName();
			case ModelPackage.FORMULARIO__TXT_LAST_NAME:
				return getTxtLastName();
			case ModelPackage.FORMULARIO__TXT_DATA_DE_NASCIMENTO:
				return getTxtDataDeNascimento();
			case ModelPackage.FORMULARIO__TXT_EMAIL:
				return getTxtEmail();
			case ModelPackage.FORMULARIO__TXT_CPF:
				return getTxtCpf();
			case ModelPackage.FORMULARIO__TXT_PHONE:
				return getTxtPhone();
			case ModelPackage.FORMULARIO__TXT_ADDRES:
				return getTxtAddres();
			case ModelPackage.FORMULARIO__TXT_ADDRES_1:
				return getTxtAddres_1();
			case ModelPackage.FORMULARIO__TXT_CEP:
				return getTxtCep();
			case ModelPackage.FORMULARIO__TXT_CITY:
				return getTxtCity();
			case ModelPackage.FORMULARIO__TXT_STATE:
				return getTxtState();
			case ModelPackage.FORMULARIO__TXT_COUNTRY:
				return getTxtCountry();
			case ModelPackage.FORMULARIO__BTN_ENVIAR:
				return getBtnEnviar();
			case ModelPackage.FORMULARIO__TF_FIRSTNAME:
				return getTf_firstname();
			case ModelPackage.FORMULARIO__TF_LASTNAME:
				return getTf_lastname();
			case ModelPackage.FORMULARIO__LBL_LAST_NAME:
				return getLblLastName();
			case ModelPackage.FORMULARIO__TF_NASCIMENTO:
				return getTf_nascimento();
			case ModelPackage.FORMULARIO__TF_EMAIL:
				return getTf_email();
			case ModelPackage.FORMULARIO__LBL_EMAIL:
				return getLblEmail();
			case ModelPackage.FORMULARIO__TF_CPF:
				return getTf_CPF();
			case ModelPackage.FORMULARIO__LBL_CPF:
				return getLblCpf();
			case ModelPackage.FORMULARIO__LBL_PHONE:
				return getLblPhone();
			case ModelPackage.FORMULARIO__TF_PHONE:
				return getTf_phone();
			case ModelPackage.FORMULARIO__LBL_ADDRES:
				return getLblAddres();
			case ModelPackage.FORMULARIO__TF_ADDRES1:
				return getTf_Addres1();
			case ModelPackage.FORMULARIO__LBL_ADDRES_1:
				return getLblAddres_1();
			case ModelPackage.FORMULARIO__TF_ADDRES2:
				return getTf_Addres2();
			case ModelPackage.FORMULARIO__LBL_CEP:
				return getLblCep();
			case ModelPackage.FORMULARIO__TF_CEP:
				return getTf_CEP();
			case ModelPackage.FORMULARIO__LBL_CITY:
				return get_lblCity();
			case ModelPackage.FORMULARIO__TF_CITY:
				return getTf_city();
			case ModelPackage.FORMULARIO__LBL_STATE:
				return getLblState();
			case ModelPackage.FORMULARIO__TF_STATE:
				return getTf_state();
			case ModelPackage.FORMULARIO__LBL_COUNTRY:
				return getLblCountry();
			case ModelPackage.FORMULARIO__TF_COUNTRY:
				return getTf_country();
			case ModelPackage.FORMULARIO__COMBO_BOX:
				return getComboBox();
			case ModelPackage.FORMULARIO__LBL_DATA_DE_NASCIMENTO:
				return getLblDataDeNascimento();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.FORMULARIO__FISTNAME:
				setFistname((Dados)newValue);
				return;
			case ModelPackage.FORMULARIO__LASTNAME:
				setLastname((Dados)newValue);
				return;
			case ModelPackage.FORMULARIO__COUNTRY:
				setCountry((Dados)newValue);
				return;
			case ModelPackage.FORMULARIO__STATE:
				setState((Dados)newValue);
				return;
			case ModelPackage.FORMULARIO__CITY:
				setCity((Dados)newValue);
				return;
			case ModelPackage.FORMULARIO__CEP:
				setCEP((Dados)newValue);
				return;
			case ModelPackage.FORMULARIO__ADDRES1:
				setAddres1((Dados)newValue);
				return;
			case ModelPackage.FORMULARIO__ADDRES2:
				setAddres2((Dados)newValue);
				return;
			case ModelPackage.FORMULARIO__PHONE:
				setPhone((Dados)newValue);
				return;
			case ModelPackage.FORMULARIO__CPF:
				setCPF((Dados)newValue);
				return;
			case ModelPackage.FORMULARIO__EMAIL:
				setEmail((Dados)newValue);
				return;
			case ModelPackage.FORMULARIO__NASCIMENTO:
				setNascimento((Dados)newValue);
				return;
			case ModelPackage.FORMULARIO__FRAME:
				setFrame((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TXT_FIRST_NAME:
				setTxtFirstName((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TXT_LAST_NAME:
				setTxtLastName((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TXT_DATA_DE_NASCIMENTO:
				setTxtDataDeNascimento((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TXT_EMAIL:
				setTxtEmail((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TXT_CPF:
				setTxtCpf((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TXT_PHONE:
				setTxtPhone((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TXT_ADDRES:
				setTxtAddres((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TXT_ADDRES_1:
				setTxtAddres_1((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TXT_CEP:
				setTxtCep((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TXT_CITY:
				setTxtCity((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TXT_STATE:
				setTxtState((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TXT_COUNTRY:
				setTxtCountry((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__BTN_ENVIAR:
				setBtnEnviar((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TF_FIRSTNAME:
				setTf_firstname((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TF_LASTNAME:
				setTf_lastname((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__LBL_LAST_NAME:
				setLblLastName((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TF_NASCIMENTO:
				setTf_nascimento((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TF_EMAIL:
				setTf_email((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__LBL_EMAIL:
				setLblEmail((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TF_CPF:
				setTf_CPF((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__LBL_CPF:
				setLblCpf((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__LBL_PHONE:
				setLblPhone((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TF_PHONE:
				setTf_phone((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__LBL_ADDRES:
				setLblAddres((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TF_ADDRES1:
				setTf_Addres1((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__LBL_ADDRES_1:
				setLblAddres_1((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TF_ADDRES2:
				setTf_Addres2((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__LBL_CEP:
				setLblCep((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TF_CEP:
				setTf_CEP((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__LBL_CITY:
				set_lblCity((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TF_CITY:
				setTf_city((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__LBL_STATE:
				setLblState((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TF_STATE:
				setTf_state((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__LBL_COUNTRY:
				setLblCountry((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__TF_COUNTRY:
				setTf_country((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__COMBO_BOX:
				setComboBox((Object)newValue);
				return;
			case ModelPackage.FORMULARIO__LBL_DATA_DE_NASCIMENTO:
				setLblDataDeNascimento((Object)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.FORMULARIO__FISTNAME:
				setFistname((Dados)null);
				return;
			case ModelPackage.FORMULARIO__LASTNAME:
				setLastname((Dados)null);
				return;
			case ModelPackage.FORMULARIO__COUNTRY:
				setCountry((Dados)null);
				return;
			case ModelPackage.FORMULARIO__STATE:
				setState((Dados)null);
				return;
			case ModelPackage.FORMULARIO__CITY:
				setCity((Dados)null);
				return;
			case ModelPackage.FORMULARIO__CEP:
				setCEP((Dados)null);
				return;
			case ModelPackage.FORMULARIO__ADDRES1:
				setAddres1((Dados)null);
				return;
			case ModelPackage.FORMULARIO__ADDRES2:
				setAddres2((Dados)null);
				return;
			case ModelPackage.FORMULARIO__PHONE:
				setPhone((Dados)null);
				return;
			case ModelPackage.FORMULARIO__CPF:
				setCPF((Dados)null);
				return;
			case ModelPackage.FORMULARIO__EMAIL:
				setEmail((Dados)null);
				return;
			case ModelPackage.FORMULARIO__NASCIMENTO:
				setNascimento((Dados)null);
				return;
			case ModelPackage.FORMULARIO__FRAME:
				setFrame(FRAME_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TXT_FIRST_NAME:
				setTxtFirstName(TXT_FIRST_NAME_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TXT_LAST_NAME:
				setTxtLastName(TXT_LAST_NAME_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TXT_DATA_DE_NASCIMENTO:
				setTxtDataDeNascimento(TXT_DATA_DE_NASCIMENTO_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TXT_EMAIL:
				setTxtEmail(TXT_EMAIL_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TXT_CPF:
				setTxtCpf(TXT_CPF_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TXT_PHONE:
				setTxtPhone(TXT_PHONE_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TXT_ADDRES:
				setTxtAddres(TXT_ADDRES_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TXT_ADDRES_1:
				setTxtAddres_1(TXT_ADDRES_1_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TXT_CEP:
				setTxtCep(TXT_CEP_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TXT_CITY:
				setTxtCity(TXT_CITY_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TXT_STATE:
				setTxtState(TXT_STATE_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TXT_COUNTRY:
				setTxtCountry(TXT_COUNTRY_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__BTN_ENVIAR:
				setBtnEnviar(BTN_ENVIAR_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TF_FIRSTNAME:
				setTf_firstname(TF_FIRSTNAME_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TF_LASTNAME:
				setTf_lastname(TF_LASTNAME_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__LBL_LAST_NAME:
				setLblLastName(LBL_LAST_NAME_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TF_NASCIMENTO:
				setTf_nascimento(TF_NASCIMENTO_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TF_EMAIL:
				setTf_email(TF_EMAIL_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__LBL_EMAIL:
				setLblEmail(LBL_EMAIL_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TF_CPF:
				setTf_CPF(TF_CPF_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__LBL_CPF:
				setLblCpf(LBL_CPF_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__LBL_PHONE:
				setLblPhone(LBL_PHONE_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TF_PHONE:
				setTf_phone(TF_PHONE_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__LBL_ADDRES:
				setLblAddres(LBL_ADDRES_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TF_ADDRES1:
				setTf_Addres1(TF_ADDRES1_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__LBL_ADDRES_1:
				setLblAddres_1(LBL_ADDRES_1_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TF_ADDRES2:
				setTf_Addres2(TF_ADDRES2_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__LBL_CEP:
				setLblCep(LBL_CEP_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TF_CEP:
				setTf_CEP(TF_CEP_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__LBL_CITY:
				set_lblCity(_LBL_CITY_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TF_CITY:
				setTf_city(TF_CITY_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__LBL_STATE:
				setLblState(LBL_STATE_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TF_STATE:
				setTf_state(TF_STATE_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__LBL_COUNTRY:
				setLblCountry(LBL_COUNTRY_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__TF_COUNTRY:
				setTf_country(TF_COUNTRY_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__COMBO_BOX:
				setComboBox(COMBO_BOX_EDEFAULT);
				return;
			case ModelPackage.FORMULARIO__LBL_DATA_DE_NASCIMENTO:
				setLblDataDeNascimento(LBL_DATA_DE_NASCIMENTO_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.FORMULARIO__FISTNAME:
				return fistname != null;
			case ModelPackage.FORMULARIO__LASTNAME:
				return lastname != null;
			case ModelPackage.FORMULARIO__COUNTRY:
				return country != null;
			case ModelPackage.FORMULARIO__STATE:
				return state != null;
			case ModelPackage.FORMULARIO__CITY:
				return city != null;
			case ModelPackage.FORMULARIO__CEP:
				return cep != null;
			case ModelPackage.FORMULARIO__ADDRES1:
				return addres1 != null;
			case ModelPackage.FORMULARIO__ADDRES2:
				return addres2 != null;
			case ModelPackage.FORMULARIO__PHONE:
				return phone != null;
			case ModelPackage.FORMULARIO__CPF:
				return cpf != null;
			case ModelPackage.FORMULARIO__EMAIL:
				return email != null;
			case ModelPackage.FORMULARIO__NASCIMENTO:
				return nascimento != null;
			case ModelPackage.FORMULARIO__FRAME:
				return FRAME_EDEFAULT == null ? frame != null : !FRAME_EDEFAULT.equals(frame);
			case ModelPackage.FORMULARIO__TXT_FIRST_NAME:
				return TXT_FIRST_NAME_EDEFAULT == null ? txtFirstName != null : !TXT_FIRST_NAME_EDEFAULT.equals(txtFirstName);
			case ModelPackage.FORMULARIO__TXT_LAST_NAME:
				return TXT_LAST_NAME_EDEFAULT == null ? txtLastName != null : !TXT_LAST_NAME_EDEFAULT.equals(txtLastName);
			case ModelPackage.FORMULARIO__TXT_DATA_DE_NASCIMENTO:
				return TXT_DATA_DE_NASCIMENTO_EDEFAULT == null ? txtDataDeNascimento != null : !TXT_DATA_DE_NASCIMENTO_EDEFAULT.equals(txtDataDeNascimento);
			case ModelPackage.FORMULARIO__TXT_EMAIL:
				return TXT_EMAIL_EDEFAULT == null ? txtEmail != null : !TXT_EMAIL_EDEFAULT.equals(txtEmail);
			case ModelPackage.FORMULARIO__TXT_CPF:
				return TXT_CPF_EDEFAULT == null ? txtCpf != null : !TXT_CPF_EDEFAULT.equals(txtCpf);
			case ModelPackage.FORMULARIO__TXT_PHONE:
				return TXT_PHONE_EDEFAULT == null ? txtPhone != null : !TXT_PHONE_EDEFAULT.equals(txtPhone);
			case ModelPackage.FORMULARIO__TXT_ADDRES:
				return TXT_ADDRES_EDEFAULT == null ? txtAddres != null : !TXT_ADDRES_EDEFAULT.equals(txtAddres);
			case ModelPackage.FORMULARIO__TXT_ADDRES_1:
				return TXT_ADDRES_1_EDEFAULT == null ? txtAddres_1 != null : !TXT_ADDRES_1_EDEFAULT.equals(txtAddres_1);
			case ModelPackage.FORMULARIO__TXT_CEP:
				return TXT_CEP_EDEFAULT == null ? txtCep != null : !TXT_CEP_EDEFAULT.equals(txtCep);
			case ModelPackage.FORMULARIO__TXT_CITY:
				return TXT_CITY_EDEFAULT == null ? txtCity != null : !TXT_CITY_EDEFAULT.equals(txtCity);
			case ModelPackage.FORMULARIO__TXT_STATE:
				return TXT_STATE_EDEFAULT == null ? txtState != null : !TXT_STATE_EDEFAULT.equals(txtState);
			case ModelPackage.FORMULARIO__TXT_COUNTRY:
				return TXT_COUNTRY_EDEFAULT == null ? txtCountry != null : !TXT_COUNTRY_EDEFAULT.equals(txtCountry);
			case ModelPackage.FORMULARIO__BTN_ENVIAR:
				return BTN_ENVIAR_EDEFAULT == null ? btnEnviar != null : !BTN_ENVIAR_EDEFAULT.equals(btnEnviar);
			case ModelPackage.FORMULARIO__TF_FIRSTNAME:
				return TF_FIRSTNAME_EDEFAULT == null ? tf_firstname != null : !TF_FIRSTNAME_EDEFAULT.equals(tf_firstname);
			case ModelPackage.FORMULARIO__TF_LASTNAME:
				return TF_LASTNAME_EDEFAULT == null ? tf_lastname != null : !TF_LASTNAME_EDEFAULT.equals(tf_lastname);
			case ModelPackage.FORMULARIO__LBL_LAST_NAME:
				return LBL_LAST_NAME_EDEFAULT == null ? lblLastName != null : !LBL_LAST_NAME_EDEFAULT.equals(lblLastName);
			case ModelPackage.FORMULARIO__TF_NASCIMENTO:
				return TF_NASCIMENTO_EDEFAULT == null ? tf_nascimento != null : !TF_NASCIMENTO_EDEFAULT.equals(tf_nascimento);
			case ModelPackage.FORMULARIO__TF_EMAIL:
				return TF_EMAIL_EDEFAULT == null ? tf_email != null : !TF_EMAIL_EDEFAULT.equals(tf_email);
			case ModelPackage.FORMULARIO__LBL_EMAIL:
				return LBL_EMAIL_EDEFAULT == null ? lblEmail != null : !LBL_EMAIL_EDEFAULT.equals(lblEmail);
			case ModelPackage.FORMULARIO__TF_CPF:
				return TF_CPF_EDEFAULT == null ? tf_CPF != null : !TF_CPF_EDEFAULT.equals(tf_CPF);
			case ModelPackage.FORMULARIO__LBL_CPF:
				return LBL_CPF_EDEFAULT == null ? lblCpf != null : !LBL_CPF_EDEFAULT.equals(lblCpf);
			case ModelPackage.FORMULARIO__LBL_PHONE:
				return LBL_PHONE_EDEFAULT == null ? lblPhone != null : !LBL_PHONE_EDEFAULT.equals(lblPhone);
			case ModelPackage.FORMULARIO__TF_PHONE:
				return TF_PHONE_EDEFAULT == null ? tf_phone != null : !TF_PHONE_EDEFAULT.equals(tf_phone);
			case ModelPackage.FORMULARIO__LBL_ADDRES:
				return LBL_ADDRES_EDEFAULT == null ? lblAddres != null : !LBL_ADDRES_EDEFAULT.equals(lblAddres);
			case ModelPackage.FORMULARIO__TF_ADDRES1:
				return TF_ADDRES1_EDEFAULT == null ? tf_Addres1 != null : !TF_ADDRES1_EDEFAULT.equals(tf_Addres1);
			case ModelPackage.FORMULARIO__LBL_ADDRES_1:
				return LBL_ADDRES_1_EDEFAULT == null ? lblAddres_1 != null : !LBL_ADDRES_1_EDEFAULT.equals(lblAddres_1);
			case ModelPackage.FORMULARIO__TF_ADDRES2:
				return TF_ADDRES2_EDEFAULT == null ? tf_Addres2 != null : !TF_ADDRES2_EDEFAULT.equals(tf_Addres2);
			case ModelPackage.FORMULARIO__LBL_CEP:
				return LBL_CEP_EDEFAULT == null ? lblCep != null : !LBL_CEP_EDEFAULT.equals(lblCep);
			case ModelPackage.FORMULARIO__TF_CEP:
				return TF_CEP_EDEFAULT == null ? tf_CEP != null : !TF_CEP_EDEFAULT.equals(tf_CEP);
			case ModelPackage.FORMULARIO__LBL_CITY:
				return _LBL_CITY_EDEFAULT == null ? _lblCity != null : !_LBL_CITY_EDEFAULT.equals(_lblCity);
			case ModelPackage.FORMULARIO__TF_CITY:
				return TF_CITY_EDEFAULT == null ? tf_city != null : !TF_CITY_EDEFAULT.equals(tf_city);
			case ModelPackage.FORMULARIO__LBL_STATE:
				return LBL_STATE_EDEFAULT == null ? lblState != null : !LBL_STATE_EDEFAULT.equals(lblState);
			case ModelPackage.FORMULARIO__TF_STATE:
				return TF_STATE_EDEFAULT == null ? tf_state != null : !TF_STATE_EDEFAULT.equals(tf_state);
			case ModelPackage.FORMULARIO__LBL_COUNTRY:
				return LBL_COUNTRY_EDEFAULT == null ? lblCountry != null : !LBL_COUNTRY_EDEFAULT.equals(lblCountry);
			case ModelPackage.FORMULARIO__TF_COUNTRY:
				return TF_COUNTRY_EDEFAULT == null ? tf_country != null : !TF_COUNTRY_EDEFAULT.equals(tf_country);
			case ModelPackage.FORMULARIO__COMBO_BOX:
				return COMBO_BOX_EDEFAULT == null ? comboBox != null : !COMBO_BOX_EDEFAULT.equals(comboBox);
			case ModelPackage.FORMULARIO__LBL_DATA_DE_NASCIMENTO:
				return LBL_DATA_DE_NASCIMENTO_EDEFAULT == null ? lblDataDeNascimento != null : !LBL_DATA_DE_NASCIMENTO_EDEFAULT.equals(lblDataDeNascimento);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.FORMULARIO___FORMULARIO:
				Formulario();
				return null;
			case ModelPackage.FORMULARIO___INITIALIZE:
				initialize();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (frame: ");
		result.append(frame);
		result.append(", txtFirstName: ");
		result.append(txtFirstName);
		result.append(", txtLastName: ");
		result.append(txtLastName);
		result.append(", txtDataDeNascimento: ");
		result.append(txtDataDeNascimento);
		result.append(", txtEmail: ");
		result.append(txtEmail);
		result.append(", txtCpf: ");
		result.append(txtCpf);
		result.append(", txtPhone: ");
		result.append(txtPhone);
		result.append(", txtAddres: ");
		result.append(txtAddres);
		result.append(", txtAddres_1: ");
		result.append(txtAddres_1);
		result.append(", txtCep: ");
		result.append(txtCep);
		result.append(", txtCity: ");
		result.append(txtCity);
		result.append(", txtState: ");
		result.append(txtState);
		result.append(", txtCountry: ");
		result.append(txtCountry);
		result.append(", btnEnviar: ");
		result.append(btnEnviar);
		result.append(", tf_firstname: ");
		result.append(tf_firstname);
		result.append(", tf_lastname: ");
		result.append(tf_lastname);
		result.append(", lblLastName: ");
		result.append(lblLastName);
		result.append(", tf_nascimento: ");
		result.append(tf_nascimento);
		result.append(", tf_email: ");
		result.append(tf_email);
		result.append(", lblEmail: ");
		result.append(lblEmail);
		result.append(", tf_CPF: ");
		result.append(tf_CPF);
		result.append(", lblCpf: ");
		result.append(lblCpf);
		result.append(", lblPhone: ");
		result.append(lblPhone);
		result.append(", tf_phone: ");
		result.append(tf_phone);
		result.append(", lblAddres: ");
		result.append(lblAddres);
		result.append(", tf_Addres1: ");
		result.append(tf_Addres1);
		result.append(", lblAddres_1: ");
		result.append(lblAddres_1);
		result.append(", tf_Addres2: ");
		result.append(tf_Addres2);
		result.append(", lblCep: ");
		result.append(lblCep);
		result.append(", tf_CEP: ");
		result.append(tf_CEP);
		result.append(", _lblCity: ");
		result.append(_lblCity);
		result.append(", tf_city: ");
		result.append(tf_city);
		result.append(", lblState: ");
		result.append(lblState);
		result.append(", tf_state: ");
		result.append(tf_state);
		result.append(", lblCountry: ");
		result.append(lblCountry);
		result.append(", tf_country: ");
		result.append(tf_country);
		result.append(", comboBox: ");
		result.append(comboBox);
		result.append(", lblDataDeNascimento: ");
		result.append(lblDataDeNascimento);
		result.append(')');
		return result.toString();
	}

} //FormularioImpl
