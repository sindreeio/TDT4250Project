/**
 */
package polet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Of Type In Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link polet.ProductOfTypeInRegion#getProducts <em>Products</em>}</li>
 *   <li>{@link polet.ProductOfTypeInRegion#getProductType <em>Product Type</em>}</li>
 *   <li>{@link polet.ProductOfTypeInRegion#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @see polet.PoletPackage#getProductOfTypeInRegion()
 * @model
 * @generated
 */
public interface ProductOfTypeInRegion extends EObject {
	/**
	 * Returns the value of the '<em><b>Products</b></em>' reference list.
	 * The list contents are of type {@link polet.Product}.
	 * It is bidirectional and its opposite is '{@link polet.Product#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' reference list.
	 * @see polet.PoletPackage#getProductOfTypeInRegion_Products()
	 * @see polet.Product#getRegion
	 * @model opposite="region"
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * Returns the value of the '<em><b>Product Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link polet.ProductType#getProductTypeInRegion <em>Product Type In Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Type</em>' reference.
	 * @see #setProductType(ProductType)
	 * @see polet.PoletPackage#getProductOfTypeInRegion_ProductType()
	 * @see polet.ProductType#getProductTypeInRegion
	 * @model opposite="productTypeInRegion"
	 * @generated
	 */
	ProductType getProductType();

	/**
	 * Sets the value of the '{@link polet.ProductOfTypeInRegion#getProductType <em>Product Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Type</em>' reference.
	 * @see #getProductType()
	 * @generated
	 */
	void setProductType(ProductType value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link polet.Region#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' container reference.
	 * @see #setRegion(Region)
	 * @see polet.PoletPackage#getProductOfTypeInRegion_Region()
	 * @see polet.Region#getProducts
	 * @model opposite="products" transient="false"
	 * @generated
	 */
	Region getRegion();

	/**
	 * Sets the value of the '{@link polet.ProductOfTypeInRegion#getRegion <em>Region</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' container reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(Region value);

} // ProductOfTypeInRegion
