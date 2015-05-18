/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dados</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Dados#getDados <em>Dados</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getDados()
 * @model
 * @generated
 */
public interface Dados extends EObject {
	/**
	 * Returns the value of the '<em><b>Dados</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dados</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dados</em>' attribute.
	 * @see #setDados(String)
	 * @see Model.ModelPackage#getDados_Dados()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDados();

	/**
	 * Sets the value of the '{@link Model.Dados#getDados <em>Dados</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dados</em>' attribute.
	 * @see #getDados()
	 * @generated
	 */
	void setDados(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void imprime();

} // Dados
