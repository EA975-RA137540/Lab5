/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formulario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Formulario#getFistname <em>Fistname</em>}</li>
 *   <li>{@link Model.Formulario#getLastname <em>Lastname</em>}</li>
 *   <li>{@link Model.Formulario#getCountry <em>Country</em>}</li>
 *   <li>{@link Model.Formulario#getState <em>State</em>}</li>
 *   <li>{@link Model.Formulario#getCity <em>City</em>}</li>
 *   <li>{@link Model.Formulario#getCEP <em>CEP</em>}</li>
 *   <li>{@link Model.Formulario#getAddres1 <em>Addres1</em>}</li>
 *   <li>{@link Model.Formulario#getAddres2 <em>Addres2</em>}</li>
 *   <li>{@link Model.Formulario#getPhone <em>Phone</em>}</li>
 *   <li>{@link Model.Formulario#getCPF <em>CPF</em>}</li>
 *   <li>{@link Model.Formulario#getEmail <em>Email</em>}</li>
 *   <li>{@link Model.Formulario#getNascimento <em>Nascimento</em>}</li>
 *   <li>{@link Model.Formulario#getFrame <em>Frame</em>}</li>
 *   <li>{@link Model.Formulario#getTxtFirstName <em>Txt First Name</em>}</li>
 *   <li>{@link Model.Formulario#getTxtLastName <em>Txt Last Name</em>}</li>
 *   <li>{@link Model.Formulario#getTxtDataDeNascimento <em>Txt Data De Nascimento</em>}</li>
 *   <li>{@link Model.Formulario#getTxtEmail <em>Txt Email</em>}</li>
 *   <li>{@link Model.Formulario#getTxtCpf <em>Txt Cpf</em>}</li>
 *   <li>{@link Model.Formulario#getTxtPhone <em>Txt Phone</em>}</li>
 *   <li>{@link Model.Formulario#getTxtAddres <em>Txt Addres</em>}</li>
 *   <li>{@link Model.Formulario#getTxtAddres_1 <em>Txt Addres 1</em>}</li>
 *   <li>{@link Model.Formulario#getTxtCep <em>Txt Cep</em>}</li>
 *   <li>{@link Model.Formulario#getTxtCity <em>Txt City</em>}</li>
 *   <li>{@link Model.Formulario#getTxtState <em>Txt State</em>}</li>
 *   <li>{@link Model.Formulario#getTxtCountry <em>Txt Country</em>}</li>
 *   <li>{@link Model.Formulario#getBtnEnviar <em>Btn Enviar</em>}</li>
 *   <li>{@link Model.Formulario#getTf_firstname <em>Tf firstname</em>}</li>
 *   <li>{@link Model.Formulario#getTf_lastname <em>Tf lastname</em>}</li>
 *   <li>{@link Model.Formulario#getLblLastName <em>Lbl Last Name</em>}</li>
 *   <li>{@link Model.Formulario#getTf_nascimento <em>Tf nascimento</em>}</li>
 *   <li>{@link Model.Formulario#getTf_email <em>Tf email</em>}</li>
 *   <li>{@link Model.Formulario#getLblEmail <em>Lbl Email</em>}</li>
 *   <li>{@link Model.Formulario#getTf_CPF <em>Tf CPF</em>}</li>
 *   <li>{@link Model.Formulario#getLblCpf <em>Lbl Cpf</em>}</li>
 *   <li>{@link Model.Formulario#getLblPhone <em>Lbl Phone</em>}</li>
 *   <li>{@link Model.Formulario#getTf_phone <em>Tf phone</em>}</li>
 *   <li>{@link Model.Formulario#getLblAddres <em>Lbl Addres</em>}</li>
 *   <li>{@link Model.Formulario#getTf_Addres1 <em>Tf Addres1</em>}</li>
 *   <li>{@link Model.Formulario#getLblAddres_1 <em>Lbl Addres 1</em>}</li>
 *   <li>{@link Model.Formulario#getTf_Addres2 <em>Tf Addres2</em>}</li>
 *   <li>{@link Model.Formulario#getLblCep <em>Lbl Cep</em>}</li>
 *   <li>{@link Model.Formulario#getTf_CEP <em>Tf CEP</em>}</li>
 *   <li>{@link Model.Formulario#get_lblCity <em>lbl City</em>}</li>
 *   <li>{@link Model.Formulario#getTf_city <em>Tf city</em>}</li>
 *   <li>{@link Model.Formulario#getLblState <em>Lbl State</em>}</li>
 *   <li>{@link Model.Formulario#getTf_state <em>Tf state</em>}</li>
 *   <li>{@link Model.Formulario#getLblCountry <em>Lbl Country</em>}</li>
 *   <li>{@link Model.Formulario#getTf_country <em>Tf country</em>}</li>
 *   <li>{@link Model.Formulario#getComboBox <em>Combo Box</em>}</li>
 *   <li>{@link Model.Formulario#getLblDataDeNascimento <em>Lbl Data De Nascimento</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getFormulario()
 * @model
 * @generated
 */
public interface Formulario extends EObject {
	/**
	 * Returns the value of the '<em><b>Fistname</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fistname</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fistname</em>' reference.
	 * @see #setFistname(Dados)
	 * @see Model.ModelPackage#getFormulario_Fistname()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Dados getFistname();

	/**
	 * Sets the value of the '{@link Model.Formulario#getFistname <em>Fistname</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fistname</em>' reference.
	 * @see #getFistname()
	 * @generated
	 */
	void setFistname(Dados value);

	/**
	 * Returns the value of the '<em><b>Lastname</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lastname</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lastname</em>' reference.
	 * @see #setLastname(Dados)
	 * @see Model.ModelPackage#getFormulario_Lastname()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Dados getLastname();

	/**
	 * Sets the value of the '{@link Model.Formulario#getLastname <em>Lastname</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lastname</em>' reference.
	 * @see #getLastname()
	 * @generated
	 */
	void setLastname(Dados value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' reference.
	 * @see #setCountry(Dados)
	 * @see Model.ModelPackage#getFormulario_Country()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Dados getCountry();

	/**
	 * Sets the value of the '{@link Model.Formulario#getCountry <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Dados value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(Dados)
	 * @see Model.ModelPackage#getFormulario_State()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Dados getState();

	/**
	 * Sets the value of the '{@link Model.Formulario#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(Dados value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' reference.
	 * @see #setCity(Dados)
	 * @see Model.ModelPackage#getFormulario_City()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Dados getCity();

	/**
	 * Sets the value of the '{@link Model.Formulario#getCity <em>City</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' reference.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(Dados value);

	/**
	 * Returns the value of the '<em><b>CEP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CEP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CEP</em>' reference.
	 * @see #setCEP(Dados)
	 * @see Model.ModelPackage#getFormulario_CEP()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Dados getCEP();

	/**
	 * Sets the value of the '{@link Model.Formulario#getCEP <em>CEP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CEP</em>' reference.
	 * @see #getCEP()
	 * @generated
	 */
	void setCEP(Dados value);

	/**
	 * Returns the value of the '<em><b>Addres1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addres1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addres1</em>' reference.
	 * @see #setAddres1(Dados)
	 * @see Model.ModelPackage#getFormulario_Addres1()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Dados getAddres1();

	/**
	 * Sets the value of the '{@link Model.Formulario#getAddres1 <em>Addres1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addres1</em>' reference.
	 * @see #getAddres1()
	 * @generated
	 */
	void setAddres1(Dados value);

	/**
	 * Returns the value of the '<em><b>Addres2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addres2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addres2</em>' reference.
	 * @see #setAddres2(Dados)
	 * @see Model.ModelPackage#getFormulario_Addres2()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Dados getAddres2();

	/**
	 * Sets the value of the '{@link Model.Formulario#getAddres2 <em>Addres2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addres2</em>' reference.
	 * @see #getAddres2()
	 * @generated
	 */
	void setAddres2(Dados value);

	/**
	 * Returns the value of the '<em><b>Phone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' reference.
	 * @see #setPhone(Dados)
	 * @see Model.ModelPackage#getFormulario_Phone()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Dados getPhone();

	/**
	 * Sets the value of the '{@link Model.Formulario#getPhone <em>Phone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' reference.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(Dados value);

	/**
	 * Returns the value of the '<em><b>CPF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CPF</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CPF</em>' reference.
	 * @see #setCPF(Dados)
	 * @see Model.ModelPackage#getFormulario_CPF()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Dados getCPF();

	/**
	 * Sets the value of the '{@link Model.Formulario#getCPF <em>CPF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPF</em>' reference.
	 * @see #getCPF()
	 * @generated
	 */
	void setCPF(Dados value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' reference.
	 * @see #setEmail(Dados)
	 * @see Model.ModelPackage#getFormulario_Email()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Dados getEmail();

	/**
	 * Sets the value of the '{@link Model.Formulario#getEmail <em>Email</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' reference.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(Dados value);

	/**
	 * Returns the value of the '<em><b>Nascimento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nascimento</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nascimento</em>' reference.
	 * @see #setNascimento(Dados)
	 * @see Model.ModelPackage#getFormulario_Nascimento()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Dados getNascimento();

	/**
	 * Sets the value of the '{@link Model.Formulario#getNascimento <em>Nascimento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nascimento</em>' reference.
	 * @see #getNascimento()
	 * @generated
	 */
	void setNascimento(Dados value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' attribute.
	 * @see #setFrame(JFrame)
	 * @see Model.ModelPackage#getFormulario_Frame()
	 * @model dataType="Model.JFrame" required="true" ordered="false"
	 * @generated
	 */
	Object getFrame();

	/**
	 * Sets the value of the '{@link Model.Formulario#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' attribute.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(Object value);

	/**
	 * Returns the value of the '<em><b>Txt First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Txt First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Txt First Name</em>' attribute.
	 * @see #setTxtFirstName(JTextField)
	 * @see Model.ModelPackage#getFormulario_TxtFirstName()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTxtFirstName();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTxtFirstName <em>Txt First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Txt First Name</em>' attribute.
	 * @see #getTxtFirstName()
	 * @generated
	 */
	void setTxtFirstName(Object value);

	/**
	 * Returns the value of the '<em><b>Txt Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Txt Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Txt Last Name</em>' attribute.
	 * @see #setTxtLastName(JTextField)
	 * @see Model.ModelPackage#getFormulario_TxtLastName()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTxtLastName();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTxtLastName <em>Txt Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Txt Last Name</em>' attribute.
	 * @see #getTxtLastName()
	 * @generated
	 */
	void setTxtLastName(Object value);

	/**
	 * Returns the value of the '<em><b>Txt Data De Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Txt Data De Nascimento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Txt Data De Nascimento</em>' attribute.
	 * @see #setTxtDataDeNascimento(JTextField)
	 * @see Model.ModelPackage#getFormulario_TxtDataDeNascimento()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTxtDataDeNascimento();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTxtDataDeNascimento <em>Txt Data De Nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Txt Data De Nascimento</em>' attribute.
	 * @see #getTxtDataDeNascimento()
	 * @generated
	 */
	void setTxtDataDeNascimento(Object value);

	/**
	 * Returns the value of the '<em><b>Txt Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Txt Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Txt Email</em>' attribute.
	 * @see #setTxtEmail(JTextField)
	 * @see Model.ModelPackage#getFormulario_TxtEmail()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTxtEmail();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTxtEmail <em>Txt Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Txt Email</em>' attribute.
	 * @see #getTxtEmail()
	 * @generated
	 */
	void setTxtEmail(Object value);

	/**
	 * Returns the value of the '<em><b>Txt Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Txt Cpf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Txt Cpf</em>' attribute.
	 * @see #setTxtCpf(JTextField)
	 * @see Model.ModelPackage#getFormulario_TxtCpf()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTxtCpf();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTxtCpf <em>Txt Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Txt Cpf</em>' attribute.
	 * @see #getTxtCpf()
	 * @generated
	 */
	void setTxtCpf(Object value);

	/**
	 * Returns the value of the '<em><b>Txt Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Txt Phone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Txt Phone</em>' attribute.
	 * @see #setTxtPhone(JTextField)
	 * @see Model.ModelPackage#getFormulario_TxtPhone()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTxtPhone();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTxtPhone <em>Txt Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Txt Phone</em>' attribute.
	 * @see #getTxtPhone()
	 * @generated
	 */
	void setTxtPhone(Object value);

	/**
	 * Returns the value of the '<em><b>Txt Addres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Txt Addres</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Txt Addres</em>' attribute.
	 * @see #setTxtAddres(JTextField)
	 * @see Model.ModelPackage#getFormulario_TxtAddres()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTxtAddres();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTxtAddres <em>Txt Addres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Txt Addres</em>' attribute.
	 * @see #getTxtAddres()
	 * @generated
	 */
	void setTxtAddres(Object value);

	/**
	 * Returns the value of the '<em><b>Txt Addres 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Txt Addres 1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Txt Addres 1</em>' attribute.
	 * @see #setTxtAddres_1(JTextField)
	 * @see Model.ModelPackage#getFormulario_TxtAddres_1()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTxtAddres_1();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTxtAddres_1 <em>Txt Addres 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Txt Addres 1</em>' attribute.
	 * @see #getTxtAddres_1()
	 * @generated
	 */
	void setTxtAddres_1(Object value);

	/**
	 * Returns the value of the '<em><b>Txt Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Txt Cep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Txt Cep</em>' attribute.
	 * @see #setTxtCep(JTextField)
	 * @see Model.ModelPackage#getFormulario_TxtCep()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTxtCep();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTxtCep <em>Txt Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Txt Cep</em>' attribute.
	 * @see #getTxtCep()
	 * @generated
	 */
	void setTxtCep(Object value);

	/**
	 * Returns the value of the '<em><b>Txt City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Txt City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Txt City</em>' attribute.
	 * @see #setTxtCity(JTextField)
	 * @see Model.ModelPackage#getFormulario_TxtCity()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTxtCity();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTxtCity <em>Txt City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Txt City</em>' attribute.
	 * @see #getTxtCity()
	 * @generated
	 */
	void setTxtCity(Object value);

	/**
	 * Returns the value of the '<em><b>Txt State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Txt State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Txt State</em>' attribute.
	 * @see #setTxtState(JTextField)
	 * @see Model.ModelPackage#getFormulario_TxtState()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTxtState();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTxtState <em>Txt State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Txt State</em>' attribute.
	 * @see #getTxtState()
	 * @generated
	 */
	void setTxtState(Object value);

	/**
	 * Returns the value of the '<em><b>Txt Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Txt Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Txt Country</em>' attribute.
	 * @see #setTxtCountry(JTextField)
	 * @see Model.ModelPackage#getFormulario_TxtCountry()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTxtCountry();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTxtCountry <em>Txt Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Txt Country</em>' attribute.
	 * @see #getTxtCountry()
	 * @generated
	 */
	void setTxtCountry(Object value);

	/**
	 * Returns the value of the '<em><b>Btn Enviar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Btn Enviar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Btn Enviar</em>' attribute.
	 * @see #setBtnEnviar(JButton)
	 * @see Model.ModelPackage#getFormulario_BtnEnviar()
	 * @model dataType="Model.JButton" required="true" ordered="false"
	 * @generated
	 */
	Object getBtnEnviar();

	/**
	 * Sets the value of the '{@link Model.Formulario#getBtnEnviar <em>Btn Enviar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Btn Enviar</em>' attribute.
	 * @see #getBtnEnviar()
	 * @generated
	 */
	void setBtnEnviar(Object value);

	/**
	 * Returns the value of the '<em><b>Tf firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tf firstname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tf firstname</em>' attribute.
	 * @see #setTf_firstname(JTextField)
	 * @see Model.ModelPackage#getFormulario_Tf_firstname()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTf_firstname();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTf_firstname <em>Tf firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tf firstname</em>' attribute.
	 * @see #getTf_firstname()
	 * @generated
	 */
	void setTf_firstname(Object value);

	/**
	 * Returns the value of the '<em><b>Tf lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tf lastname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tf lastname</em>' attribute.
	 * @see #setTf_lastname(JTextField)
	 * @see Model.ModelPackage#getFormulario_Tf_lastname()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTf_lastname();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTf_lastname <em>Tf lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tf lastname</em>' attribute.
	 * @see #getTf_lastname()
	 * @generated
	 */
	void setTf_lastname(Object value);

	/**
	 * Returns the value of the '<em><b>Lbl Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lbl Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lbl Last Name</em>' attribute.
	 * @see #setLblLastName(JLabel)
	 * @see Model.ModelPackage#getFormulario_LblLastName()
	 * @model dataType="Model.JLabel" required="true" ordered="false"
	 * @generated
	 */
	Object getLblLastName();

	/**
	 * Sets the value of the '{@link Model.Formulario#getLblLastName <em>Lbl Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lbl Last Name</em>' attribute.
	 * @see #getLblLastName()
	 * @generated
	 */
	void setLblLastName(Object value);

	/**
	 * Returns the value of the '<em><b>Tf nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tf nascimento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tf nascimento</em>' attribute.
	 * @see #setTf_nascimento(JTextField)
	 * @see Model.ModelPackage#getFormulario_Tf_nascimento()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTf_nascimento();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTf_nascimento <em>Tf nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tf nascimento</em>' attribute.
	 * @see #getTf_nascimento()
	 * @generated
	 */
	void setTf_nascimento(Object value);

	/**
	 * Returns the value of the '<em><b>Tf email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tf email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tf email</em>' attribute.
	 * @see #setTf_email(JTextField)
	 * @see Model.ModelPackage#getFormulario_Tf_email()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTf_email();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTf_email <em>Tf email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tf email</em>' attribute.
	 * @see #getTf_email()
	 * @generated
	 */
	void setTf_email(Object value);

	/**
	 * Returns the value of the '<em><b>Lbl Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lbl Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lbl Email</em>' attribute.
	 * @see #setLblEmail(JLabel)
	 * @see Model.ModelPackage#getFormulario_LblEmail()
	 * @model dataType="Model.JLabel" required="true" ordered="false"
	 * @generated
	 */
	Object getLblEmail();

	/**
	 * Sets the value of the '{@link Model.Formulario#getLblEmail <em>Lbl Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lbl Email</em>' attribute.
	 * @see #getLblEmail()
	 * @generated
	 */
	void setLblEmail(Object value);

	/**
	 * Returns the value of the '<em><b>Tf CPF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tf CPF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tf CPF</em>' attribute.
	 * @see #setTf_CPF(JTextField)
	 * @see Model.ModelPackage#getFormulario_Tf_CPF()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTf_CPF();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTf_CPF <em>Tf CPF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tf CPF</em>' attribute.
	 * @see #getTf_CPF()
	 * @generated
	 */
	void setTf_CPF(Object value);

	/**
	 * Returns the value of the '<em><b>Lbl Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lbl Cpf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lbl Cpf</em>' attribute.
	 * @see #setLblCpf(JLabel)
	 * @see Model.ModelPackage#getFormulario_LblCpf()
	 * @model dataType="Model.JLabel" required="true" ordered="false"
	 * @generated
	 */
	Object getLblCpf();

	/**
	 * Sets the value of the '{@link Model.Formulario#getLblCpf <em>Lbl Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lbl Cpf</em>' attribute.
	 * @see #getLblCpf()
	 * @generated
	 */
	void setLblCpf(Object value);

	/**
	 * Returns the value of the '<em><b>Lbl Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lbl Phone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lbl Phone</em>' attribute.
	 * @see #setLblPhone(JLabel)
	 * @see Model.ModelPackage#getFormulario_LblPhone()
	 * @model dataType="Model.JLabel" required="true" ordered="false"
	 * @generated
	 */
	Object getLblPhone();

	/**
	 * Sets the value of the '{@link Model.Formulario#getLblPhone <em>Lbl Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lbl Phone</em>' attribute.
	 * @see #getLblPhone()
	 * @generated
	 */
	void setLblPhone(Object value);

	/**
	 * Returns the value of the '<em><b>Tf phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tf phone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tf phone</em>' attribute.
	 * @see #setTf_phone(JTextField)
	 * @see Model.ModelPackage#getFormulario_Tf_phone()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTf_phone();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTf_phone <em>Tf phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tf phone</em>' attribute.
	 * @see #getTf_phone()
	 * @generated
	 */
	void setTf_phone(Object value);

	/**
	 * Returns the value of the '<em><b>Lbl Addres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lbl Addres</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lbl Addres</em>' attribute.
	 * @see #setLblAddres(JLabel)
	 * @see Model.ModelPackage#getFormulario_LblAddres()
	 * @model dataType="Model.JLabel" required="true" ordered="false"
	 * @generated
	 */
	Object getLblAddres();

	/**
	 * Sets the value of the '{@link Model.Formulario#getLblAddres <em>Lbl Addres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lbl Addres</em>' attribute.
	 * @see #getLblAddres()
	 * @generated
	 */
	void setLblAddres(Object value);

	/**
	 * Returns the value of the '<em><b>Tf Addres1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tf Addres1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tf Addres1</em>' attribute.
	 * @see #setTf_Addres1(JTextField)
	 * @see Model.ModelPackage#getFormulario_Tf_Addres1()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTf_Addres1();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTf_Addres1 <em>Tf Addres1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tf Addres1</em>' attribute.
	 * @see #getTf_Addres1()
	 * @generated
	 */
	void setTf_Addres1(Object value);

	/**
	 * Returns the value of the '<em><b>Lbl Addres 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lbl Addres 1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lbl Addres 1</em>' attribute.
	 * @see #setLblAddres_1(JLabel)
	 * @see Model.ModelPackage#getFormulario_LblAddres_1()
	 * @model dataType="Model.JLabel" required="true" ordered="false"
	 * @generated
	 */
	Object getLblAddres_1();

	/**
	 * Sets the value of the '{@link Model.Formulario#getLblAddres_1 <em>Lbl Addres 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lbl Addres 1</em>' attribute.
	 * @see #getLblAddres_1()
	 * @generated
	 */
	void setLblAddres_1(Object value);

	/**
	 * Returns the value of the '<em><b>Tf Addres2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tf Addres2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tf Addres2</em>' attribute.
	 * @see #setTf_Addres2(JTextField)
	 * @see Model.ModelPackage#getFormulario_Tf_Addres2()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTf_Addres2();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTf_Addres2 <em>Tf Addres2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tf Addres2</em>' attribute.
	 * @see #getTf_Addres2()
	 * @generated
	 */
	void setTf_Addres2(Object value);

	/**
	 * Returns the value of the '<em><b>Lbl Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lbl Cep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lbl Cep</em>' attribute.
	 * @see #setLblCep(JLabel)
	 * @see Model.ModelPackage#getFormulario_LblCep()
	 * @model dataType="Model.JLabel" required="true" ordered="false"
	 * @generated
	 */
	Object getLblCep();

	/**
	 * Sets the value of the '{@link Model.Formulario#getLblCep <em>Lbl Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lbl Cep</em>' attribute.
	 * @see #getLblCep()
	 * @generated
	 */
	void setLblCep(Object value);

	/**
	 * Returns the value of the '<em><b>Tf CEP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tf CEP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tf CEP</em>' attribute.
	 * @see #setTf_CEP(JTextField)
	 * @see Model.ModelPackage#getFormulario_Tf_CEP()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTf_CEP();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTf_CEP <em>Tf CEP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tf CEP</em>' attribute.
	 * @see #getTf_CEP()
	 * @generated
	 */
	void setTf_CEP(Object value);

	/**
	 * Returns the value of the '<em><b>lbl City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>lbl City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>lbl City</em>' attribute.
	 * @see #set_lblCity(JLabel)
	 * @see Model.ModelPackage#getFormulario__lblCity()
	 * @model dataType="Model.JLabel" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName=' lblCity'"
	 * @generated
	 */
	Object get_lblCity();

	/**
	 * Sets the value of the '{@link Model.Formulario#get_lblCity <em>lbl City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>lbl City</em>' attribute.
	 * @see #get_lblCity()
	 * @generated
	 */
	void set_lblCity(Object value);

	/**
	 * Returns the value of the '<em><b>Tf city</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tf city</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tf city</em>' attribute.
	 * @see #setTf_city(JTextField)
	 * @see Model.ModelPackage#getFormulario_Tf_city()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTf_city();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTf_city <em>Tf city</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tf city</em>' attribute.
	 * @see #getTf_city()
	 * @generated
	 */
	void setTf_city(Object value);

	/**
	 * Returns the value of the '<em><b>Lbl State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lbl State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lbl State</em>' attribute.
	 * @see #setLblState(JLabel)
	 * @see Model.ModelPackage#getFormulario_LblState()
	 * @model dataType="Model.JLabel" required="true" ordered="false"
	 * @generated
	 */
	Object getLblState();

	/**
	 * Sets the value of the '{@link Model.Formulario#getLblState <em>Lbl State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lbl State</em>' attribute.
	 * @see #getLblState()
	 * @generated
	 */
	void setLblState(Object value);

	/**
	 * Returns the value of the '<em><b>Tf state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tf state</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tf state</em>' attribute.
	 * @see #setTf_state(JTextField)
	 * @see Model.ModelPackage#getFormulario_Tf_state()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTf_state();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTf_state <em>Tf state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tf state</em>' attribute.
	 * @see #getTf_state()
	 * @generated
	 */
	void setTf_state(Object value);

	/**
	 * Returns the value of the '<em><b>Lbl Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lbl Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lbl Country</em>' attribute.
	 * @see #setLblCountry(JLabel)
	 * @see Model.ModelPackage#getFormulario_LblCountry()
	 * @model dataType="Model.JLabel" required="true" ordered="false"
	 * @generated
	 */
	Object getLblCountry();

	/**
	 * Sets the value of the '{@link Model.Formulario#getLblCountry <em>Lbl Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lbl Country</em>' attribute.
	 * @see #getLblCountry()
	 * @generated
	 */
	void setLblCountry(Object value);

	/**
	 * Returns the value of the '<em><b>Tf country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tf country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tf country</em>' attribute.
	 * @see #setTf_country(JTextField)
	 * @see Model.ModelPackage#getFormulario_Tf_country()
	 * @model dataType="Model.JTextField" required="true" ordered="false"
	 * @generated
	 */
	Object getTf_country();

	/**
	 * Sets the value of the '{@link Model.Formulario#getTf_country <em>Tf country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tf country</em>' attribute.
	 * @see #getTf_country()
	 * @generated
	 */
	void setTf_country(Object value);

	/**
	 * Returns the value of the '<em><b>Combo Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combo Box</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combo Box</em>' attribute.
	 * @see #setComboBox(JComboBox)
	 * @see Model.ModelPackage#getFormulario_ComboBox()
	 * @model dataType="Model.JComboBox" required="true" ordered="false"
	 * @generated
	 */
	Object getComboBox();

	/**
	 * Sets the value of the '{@link Model.Formulario#getComboBox <em>Combo Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combo Box</em>' attribute.
	 * @see #getComboBox()
	 * @generated
	 */
	void setComboBox(Object value);

	/**
	 * Returns the value of the '<em><b>Lbl Data De Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lbl Data De Nascimento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lbl Data De Nascimento</em>' attribute.
	 * @see #setLblDataDeNascimento(JLabel)
	 * @see Model.ModelPackage#getFormulario_LblDataDeNascimento()
	 * @model dataType="Model.JLabel" required="true" ordered="false"
	 * @generated
	 */
	Object getLblDataDeNascimento();

	/**
	 * Sets the value of the '{@link Model.Formulario#getLblDataDeNascimento <em>Lbl Data De Nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lbl Data De Nascimento</em>' attribute.
	 * @see #getLblDataDeNascimento()
	 * @generated
	 */
	void setLblDataDeNascimento(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void Formulario();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize();

} // Formulario
