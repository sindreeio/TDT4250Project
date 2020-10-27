/**
 */
package polet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Price</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link polet.Price#getSalesPrice <em>Sales Price</em>}</li>
 * </ul>
 *
 * @see polet.PoletPackage#getPrice()
 * @model
 * @generated
 */
public interface Price extends EObject {
	/**
	 * Returns the value of the '<em><b>Sales Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Price</em>' attribute.
	 * @see #setSalesPrice(float)
	 * @see polet.PoletPackage#getPrice_SalesPrice()
	 * @model id="true"
	 * @generated
	 */
	float getSalesPrice();

	/**
	 * Sets the value of the '{@link polet.Price#getSalesPrice <em>Sales Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Price</em>' attribute.
	 * @see #getSalesPrice()
	 * @generated
	 */
	void setSalesPrice(float value);

} // Price
