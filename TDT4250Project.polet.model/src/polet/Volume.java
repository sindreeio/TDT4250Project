/**
 */
package polet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link polet.Volume#getLiters <em>Liters</em>}</li>
 * </ul>
 *
 * @see polet.PoletPackage#getVolume()
 * @model
 * @generated
 */
public interface Volume extends EObject {
	/**
	 * Returns the value of the '<em><b>Liters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liters</em>' attribute.
	 * @see #setLiters(float)
	 * @see polet.PoletPackage#getVolume_Liters()
	 * @model id="true"
	 * @generated
	 */
	float getLiters();

	/**
	 * Sets the value of the '{@link polet.Volume#getLiters <em>Liters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Liters</em>' attribute.
	 * @see #getLiters()
	 * @generated
	 */
	void setLiters(float value);

} // Volume
