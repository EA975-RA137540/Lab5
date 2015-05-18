/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.Print;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Print</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.PrintImpl#getFistNameLabel <em>Fist Name Label</em>}</li>
 *   <li>{@link Model.impl.PrintImpl#getLastNameLabel <em>Last Name Label</em>}</li>
 *   <li>{@link Model.impl.PrintImpl#getNascimentoLabel <em>Nascimento Label</em>}</li>
 *   <li>{@link Model.impl.PrintImpl#getEmailLabel <em>Email Label</em>}</li>
 *   <li>{@link Model.impl.PrintImpl#getCpfLabel <em>Cpf Label</em>}</li>
 *   <li>{@link Model.impl.PrintImpl#getPhoneLabel <em>Phone Label</em>}</li>
 *   <li>{@link Model.impl.PrintImpl#getAddres1Label <em>Addres1 Label</em>}</li>
 *   <li>{@link Model.impl.PrintImpl#getAddres2Label <em>Addres2 Label</em>}</li>
 *   <li>{@link Model.impl.PrintImpl#getCepLabel <em>Cep Label</em>}</li>
 *   <li>{@link Model.impl.PrintImpl#getCityLabel <em>City Label</em>}</li>
 *   <li>{@link Model.impl.PrintImpl#getStateLabel <em>State Label</em>}</li>
 *   <li>{@link Model.impl.PrintImpl#getCountryLabel <em>Country Label</em>}</li>
 *   <li>{@link Model.impl.PrintImpl#getContentPane <em>Content Pane</em>}</li>
 *   <li>{@link Model.impl.PrintImpl#getTitleLabel <em>Title Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrintImpl extends MinimalEObjectImpl.Container implements Print {
	/**
	 * The default value of the '{@link #getFistNameLabel() <em>Fist Name Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFistNameLabel()
	 * @generated
	 * @ordered
	 */
	protected static final Object FIST_NAME_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFistNameLabel() <em>Fist Name Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFistNameLabel()
	 * @generated
	 * @ordered
	 */
	protected Object fistNameLabel = FIST_NAME_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastNameLabel() <em>Last Name Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastNameLabel()
	 * @generated
	 * @ordered
	 */
	protected static final Object LAST_NAME_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastNameLabel() <em>Last Name Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastNameLabel()
	 * @generated
	 * @ordered
	 */
	protected Object lastNameLabel = LAST_NAME_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNascimentoLabel() <em>Nascimento Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNascimentoLabel()
	 * @generated
	 * @ordered
	 */
	protected static final Object NASCIMENTO_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNascimentoLabel() <em>Nascimento Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNascimentoLabel()
	 * @generated
	 * @ordered
	 */
	protected Object nascimentoLabel = NASCIMENTO_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailLabel() <em>Email Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailLabel()
	 * @generated
	 * @ordered
	 */
	protected static final Object EMAIL_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailLabel() <em>Email Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailLabel()
	 * @generated
	 * @ordered
	 */
	protected Object emailLabel = EMAIL_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpfLabel() <em>Cpf Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpfLabel()
	 * @generated
	 * @ordered
	 */
	protected static final Object CPF_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpfLabel() <em>Cpf Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpfLabel()
	 * @generated
	 * @ordered
	 */
	protected Object cpfLabel = CPF_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneLabel() <em>Phone Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneLabel()
	 * @generated
	 * @ordered
	 */
	protected static final Object PHONE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoneLabel() <em>Phone Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneLabel()
	 * @generated
	 * @ordered
	 */
	protected Object phoneLabel = PHONE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddres1Label() <em>Addres1 Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddres1Label()
	 * @generated
	 * @ordered
	 */
	protected static final Object ADDRES1_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddres1Label() <em>Addres1 Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddres1Label()
	 * @generated
	 * @ordered
	 */
	protected Object addres1Label = ADDRES1_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddres2Label() <em>Addres2 Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddres2Label()
	 * @generated
	 * @ordered
	 */
	protected static final Object ADDRES2_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddres2Label() <em>Addres2 Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddres2Label()
	 * @generated
	 * @ordered
	 */
	protected Object addres2Label = ADDRES2_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCepLabel() <em>Cep Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCepLabel()
	 * @generated
	 * @ordered
	 */
	protected static final Object CEP_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCepLabel() <em>Cep Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCepLabel()
	 * @generated
	 * @ordered
	 */
	protected Object cepLabel = CEP_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCityLabel() <em>City Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityLabel()
	 * @generated
	 * @ordered
	 */
	protected static final Object CITY_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCityLabel() <em>City Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityLabel()
	 * @generated
	 * @ordered
	 */
	protected Object cityLabel = CITY_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStateLabel() <em>State Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateLabel()
	 * @generated
	 * @ordered
	 */
	protected static final Object STATE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateLabel() <em>State Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateLabel()
	 * @generated
	 * @ordered
	 */
	protected Object stateLabel = STATE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountryLabel() <em>Country Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryLabel()
	 * @generated
	 * @ordered
	 */
	protected static final Object COUNTRY_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountryLabel() <em>Country Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryLabel()
	 * @generated
	 * @ordered
	 */
	protected Object countryLabel = COUNTRY_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentPane() <em>Content Pane</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPane()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONTENT_PANE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentPane() <em>Content Pane</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPane()
	 * @generated
	 * @ordered
	 */
	protected Object contentPane = CONTENT_PANE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitleLabel() <em>Title Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleLabel()
	 * @generated
	 * @ordered
	 */
	protected static final Object TITLE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitleLabel() <em>Title Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleLabel()
	 * @generated
	 * @ordered
	 */
	protected Object titleLabel = TITLE_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PRINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFistNameLabel() {
		return fistNameLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFistNameLabel(Object newFistNameLabel) {
		Object oldFistNameLabel = fistNameLabel;
		fistNameLabel = newFistNameLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRINT__FIST_NAME_LABEL, oldFistNameLabel, fistNameLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLastNameLabel() {
		return lastNameLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastNameLabel(Object newLastNameLabel) {
		Object oldLastNameLabel = lastNameLabel;
		lastNameLabel = newLastNameLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRINT__LAST_NAME_LABEL, oldLastNameLabel, lastNameLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNascimentoLabel() {
		return nascimentoLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNascimentoLabel(Object newNascimentoLabel) {
		Object oldNascimentoLabel = nascimentoLabel;
		nascimentoLabel = newNascimentoLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRINT__NASCIMENTO_LABEL, oldNascimentoLabel, nascimentoLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getEmailLabel() {
		return emailLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmailLabel(Object newEmailLabel) {
		Object oldEmailLabel = emailLabel;
		emailLabel = newEmailLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRINT__EMAIL_LABEL, oldEmailLabel, emailLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCpfLabel() {
		return cpfLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpfLabel(Object newCpfLabel) {
		Object oldCpfLabel = cpfLabel;
		cpfLabel = newCpfLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRINT__CPF_LABEL, oldCpfLabel, cpfLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPhoneLabel() {
		return phoneLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneLabel(Object newPhoneLabel) {
		Object oldPhoneLabel = phoneLabel;
		phoneLabel = newPhoneLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRINT__PHONE_LABEL, oldPhoneLabel, phoneLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAddres1Label() {
		return addres1Label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddres1Label(Object newAddres1Label) {
		Object oldAddres1Label = addres1Label;
		addres1Label = newAddres1Label;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRINT__ADDRES1_LABEL, oldAddres1Label, addres1Label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAddres2Label() {
		return addres2Label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddres2Label(Object newAddres2Label) {
		Object oldAddres2Label = addres2Label;
		addres2Label = newAddres2Label;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRINT__ADDRES2_LABEL, oldAddres2Label, addres2Label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCepLabel() {
		return cepLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCepLabel(Object newCepLabel) {
		Object oldCepLabel = cepLabel;
		cepLabel = newCepLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRINT__CEP_LABEL, oldCepLabel, cepLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCityLabel() {
		return cityLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCityLabel(Object newCityLabel) {
		Object oldCityLabel = cityLabel;
		cityLabel = newCityLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRINT__CITY_LABEL, oldCityLabel, cityLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStateLabel() {
		return stateLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateLabel(Object newStateLabel) {
		Object oldStateLabel = stateLabel;
		stateLabel = newStateLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRINT__STATE_LABEL, oldStateLabel, stateLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCountryLabel() {
		return countryLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountryLabel(Object newCountryLabel) {
		Object oldCountryLabel = countryLabel;
		countryLabel = newCountryLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRINT__COUNTRY_LABEL, oldCountryLabel, countryLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getContentPane() {
		return contentPane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentPane(Object newContentPane) {
		Object oldContentPane = contentPane;
		contentPane = newContentPane;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRINT__CONTENT_PANE, oldContentPane, contentPane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTitleLabel() {
		return titleLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitleLabel(Object newTitleLabel) {
		Object oldTitleLabel = titleLabel;
		titleLabel = newTitleLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRINT__TITLE_LABEL, oldTitleLabel, titleLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Print() {
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
			case ModelPackage.PRINT__FIST_NAME_LABEL:
				return getFistNameLabel();
			case ModelPackage.PRINT__LAST_NAME_LABEL:
				return getLastNameLabel();
			case ModelPackage.PRINT__NASCIMENTO_LABEL:
				return getNascimentoLabel();
			case ModelPackage.PRINT__EMAIL_LABEL:
				return getEmailLabel();
			case ModelPackage.PRINT__CPF_LABEL:
				return getCpfLabel();
			case ModelPackage.PRINT__PHONE_LABEL:
				return getPhoneLabel();
			case ModelPackage.PRINT__ADDRES1_LABEL:
				return getAddres1Label();
			case ModelPackage.PRINT__ADDRES2_LABEL:
				return getAddres2Label();
			case ModelPackage.PRINT__CEP_LABEL:
				return getCepLabel();
			case ModelPackage.PRINT__CITY_LABEL:
				return getCityLabel();
			case ModelPackage.PRINT__STATE_LABEL:
				return getStateLabel();
			case ModelPackage.PRINT__COUNTRY_LABEL:
				return getCountryLabel();
			case ModelPackage.PRINT__CONTENT_PANE:
				return getContentPane();
			case ModelPackage.PRINT__TITLE_LABEL:
				return getTitleLabel();
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
			case ModelPackage.PRINT__FIST_NAME_LABEL:
				setFistNameLabel((Object)newValue);
				return;
			case ModelPackage.PRINT__LAST_NAME_LABEL:
				setLastNameLabel((Object)newValue);
				return;
			case ModelPackage.PRINT__NASCIMENTO_LABEL:
				setNascimentoLabel((Object)newValue);
				return;
			case ModelPackage.PRINT__EMAIL_LABEL:
				setEmailLabel((Object)newValue);
				return;
			case ModelPackage.PRINT__CPF_LABEL:
				setCpfLabel((Object)newValue);
				return;
			case ModelPackage.PRINT__PHONE_LABEL:
				setPhoneLabel((Object)newValue);
				return;
			case ModelPackage.PRINT__ADDRES1_LABEL:
				setAddres1Label((Object)newValue);
				return;
			case ModelPackage.PRINT__ADDRES2_LABEL:
				setAddres2Label((Object)newValue);
				return;
			case ModelPackage.PRINT__CEP_LABEL:
				setCepLabel((Object)newValue);
				return;
			case ModelPackage.PRINT__CITY_LABEL:
				setCityLabel((Object)newValue);
				return;
			case ModelPackage.PRINT__STATE_LABEL:
				setStateLabel((Object)newValue);
				return;
			case ModelPackage.PRINT__COUNTRY_LABEL:
				setCountryLabel((Object)newValue);
				return;
			case ModelPackage.PRINT__CONTENT_PANE:
				setContentPane((Object)newValue);
				return;
			case ModelPackage.PRINT__TITLE_LABEL:
				setTitleLabel((Object)newValue);
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
			case ModelPackage.PRINT__FIST_NAME_LABEL:
				setFistNameLabel(FIST_NAME_LABEL_EDEFAULT);
				return;
			case ModelPackage.PRINT__LAST_NAME_LABEL:
				setLastNameLabel(LAST_NAME_LABEL_EDEFAULT);
				return;
			case ModelPackage.PRINT__NASCIMENTO_LABEL:
				setNascimentoLabel(NASCIMENTO_LABEL_EDEFAULT);
				return;
			case ModelPackage.PRINT__EMAIL_LABEL:
				setEmailLabel(EMAIL_LABEL_EDEFAULT);
				return;
			case ModelPackage.PRINT__CPF_LABEL:
				setCpfLabel(CPF_LABEL_EDEFAULT);
				return;
			case ModelPackage.PRINT__PHONE_LABEL:
				setPhoneLabel(PHONE_LABEL_EDEFAULT);
				return;
			case ModelPackage.PRINT__ADDRES1_LABEL:
				setAddres1Label(ADDRES1_LABEL_EDEFAULT);
				return;
			case ModelPackage.PRINT__ADDRES2_LABEL:
				setAddres2Label(ADDRES2_LABEL_EDEFAULT);
				return;
			case ModelPackage.PRINT__CEP_LABEL:
				setCepLabel(CEP_LABEL_EDEFAULT);
				return;
			case ModelPackage.PRINT__CITY_LABEL:
				setCityLabel(CITY_LABEL_EDEFAULT);
				return;
			case ModelPackage.PRINT__STATE_LABEL:
				setStateLabel(STATE_LABEL_EDEFAULT);
				return;
			case ModelPackage.PRINT__COUNTRY_LABEL:
				setCountryLabel(COUNTRY_LABEL_EDEFAULT);
				return;
			case ModelPackage.PRINT__CONTENT_PANE:
				setContentPane(CONTENT_PANE_EDEFAULT);
				return;
			case ModelPackage.PRINT__TITLE_LABEL:
				setTitleLabel(TITLE_LABEL_EDEFAULT);
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
			case ModelPackage.PRINT__FIST_NAME_LABEL:
				return FIST_NAME_LABEL_EDEFAULT == null ? fistNameLabel != null : !FIST_NAME_LABEL_EDEFAULT.equals(fistNameLabel);
			case ModelPackage.PRINT__LAST_NAME_LABEL:
				return LAST_NAME_LABEL_EDEFAULT == null ? lastNameLabel != null : !LAST_NAME_LABEL_EDEFAULT.equals(lastNameLabel);
			case ModelPackage.PRINT__NASCIMENTO_LABEL:
				return NASCIMENTO_LABEL_EDEFAULT == null ? nascimentoLabel != null : !NASCIMENTO_LABEL_EDEFAULT.equals(nascimentoLabel);
			case ModelPackage.PRINT__EMAIL_LABEL:
				return EMAIL_LABEL_EDEFAULT == null ? emailLabel != null : !EMAIL_LABEL_EDEFAULT.equals(emailLabel);
			case ModelPackage.PRINT__CPF_LABEL:
				return CPF_LABEL_EDEFAULT == null ? cpfLabel != null : !CPF_LABEL_EDEFAULT.equals(cpfLabel);
			case ModelPackage.PRINT__PHONE_LABEL:
				return PHONE_LABEL_EDEFAULT == null ? phoneLabel != null : !PHONE_LABEL_EDEFAULT.equals(phoneLabel);
			case ModelPackage.PRINT__ADDRES1_LABEL:
				return ADDRES1_LABEL_EDEFAULT == null ? addres1Label != null : !ADDRES1_LABEL_EDEFAULT.equals(addres1Label);
			case ModelPackage.PRINT__ADDRES2_LABEL:
				return ADDRES2_LABEL_EDEFAULT == null ? addres2Label != null : !ADDRES2_LABEL_EDEFAULT.equals(addres2Label);
			case ModelPackage.PRINT__CEP_LABEL:
				return CEP_LABEL_EDEFAULT == null ? cepLabel != null : !CEP_LABEL_EDEFAULT.equals(cepLabel);
			case ModelPackage.PRINT__CITY_LABEL:
				return CITY_LABEL_EDEFAULT == null ? cityLabel != null : !CITY_LABEL_EDEFAULT.equals(cityLabel);
			case ModelPackage.PRINT__STATE_LABEL:
				return STATE_LABEL_EDEFAULT == null ? stateLabel != null : !STATE_LABEL_EDEFAULT.equals(stateLabel);
			case ModelPackage.PRINT__COUNTRY_LABEL:
				return COUNTRY_LABEL_EDEFAULT == null ? countryLabel != null : !COUNTRY_LABEL_EDEFAULT.equals(countryLabel);
			case ModelPackage.PRINT__CONTENT_PANE:
				return CONTENT_PANE_EDEFAULT == null ? contentPane != null : !CONTENT_PANE_EDEFAULT.equals(contentPane);
			case ModelPackage.PRINT__TITLE_LABEL:
				return TITLE_LABEL_EDEFAULT == null ? titleLabel != null : !TITLE_LABEL_EDEFAULT.equals(titleLabel);
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
			case ModelPackage.PRINT___PRINT:
				Print();
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
		result.append(" (fistNameLabel: ");
		result.append(fistNameLabel);
		result.append(", lastNameLabel: ");
		result.append(lastNameLabel);
		result.append(", nascimentoLabel: ");
		result.append(nascimentoLabel);
		result.append(", emailLabel: ");
		result.append(emailLabel);
		result.append(", cpfLabel: ");
		result.append(cpfLabel);
		result.append(", phoneLabel: ");
		result.append(phoneLabel);
		result.append(", addres1Label: ");
		result.append(addres1Label);
		result.append(", addres2Label: ");
		result.append(addres2Label);
		result.append(", cepLabel: ");
		result.append(cepLabel);
		result.append(", cityLabel: ");
		result.append(cityLabel);
		result.append(", stateLabel: ");
		result.append(stateLabel);
		result.append(", countryLabel: ");
		result.append(countryLabel);
		result.append(", contentPane: ");
		result.append(contentPane);
		result.append(", titleLabel: ");
		result.append(titleLabel);
		result.append(')');
		return result.toString();
	}

} //PrintImpl
