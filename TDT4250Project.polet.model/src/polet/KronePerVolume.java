/**
 */
package polet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Krone Per Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link polet.KronePerVolume#getDerivedNumber <em>Derived Number</em>}</li>
 *   <li>{@link polet.KronePerVolume#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see polet.PoletPackage#getKronePerVolume()
 * @model
 * @generated
 */
public interface KronePerVolume extends EObject {
	/**
	 * Returns the value of the '<em><b>Derived Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Number</em>' attribute.
	 * @see #setDerivedNumber(float)
	 * @see polet.PoletPackage#getKronePerVolume_DerivedNumber()
	 * @model id="true" derived="true"
	 * @generated
	 */
	float getDerivedNumber();

	/**
	 * Sets the value of the '{@link polet.KronePerVolume#getDerivedNumber <em>Derived Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived Number</em>' attribute.
	 * @see #getDerivedNumber()
	 * @generated
	 */
	void setDerivedNumber(float value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' reference list.
	 * The list contents are of type {@link polet.Product}.
	 * It is bidirectional and its opposite is '{@link polet.Product#getKronePerVolume <em>Krone Per Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' reference list.
	 * @see polet.PoletPackage#getKronePerVolume_Products()
	 * @see polet.Product#getKronePerVolume
	 * @model opposite="kronePerVolume"
	 * @generated
	 */
	EList<Product> getProducts();

} // KronePerVolume
