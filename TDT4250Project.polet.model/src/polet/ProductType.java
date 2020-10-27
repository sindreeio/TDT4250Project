/**
 */
package polet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link polet.ProductType#getProductTypeId <em>Product Type Id</em>}</li>
 *   <li>{@link polet.ProductType#getProductTypeName <em>Product Type Name</em>}</li>
 *   <li>{@link polet.ProductType#getProducedIn <em>Produced In</em>}</li>
 *   <li>{@link polet.ProductType#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see polet.PoletPackage#getProductType()
 * @model
 * @generated
 */
public interface ProductType extends EObject {
	/**
	 * Returns the value of the '<em><b>Product Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Type Id</em>' attribute.
	 * @see #setProductTypeId(String)
	 * @see polet.PoletPackage#getProductType_ProductTypeId()
	 * @model id="true"
	 * @generated
	 */
	String getProductTypeId();

	/**
	 * Sets the value of the '{@link polet.ProductType#getProductTypeId <em>Product Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Type Id</em>' attribute.
	 * @see #getProductTypeId()
	 * @generated
	 */
	void setProductTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Product Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Type Name</em>' attribute.
	 * @see #setProductTypeName(String)
	 * @see polet.PoletPackage#getProductType_ProductTypeName()
	 * @model
	 * @generated
	 */
	String getProductTypeName();

	/**
	 * Sets the value of the '{@link polet.ProductType#getProductTypeName <em>Product Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Type Name</em>' attribute.
	 * @see #getProductTypeName()
	 * @generated
	 */
	void setProductTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Produced In</b></em>' reference list.
	 * The list contents are of type {@link polet.Region}.
	 * It is bidirectional and its opposite is '{@link polet.Region#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced In</em>' reference list.
	 * @see polet.PoletPackage#getProductType_ProducedIn()
	 * @see polet.Region#getProduces
	 * @model opposite="produces"
	 * @generated
	 */
	EList<Region> getProducedIn();

	/**
	 * Returns the value of the '<em><b>Products</b></em>' reference list.
	 * The list contents are of type {@link polet.Product}.
	 * It is bidirectional and its opposite is '{@link polet.Product#getProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' reference list.
	 * @see polet.PoletPackage#getProductType_Products()
	 * @see polet.Product#getProductType
	 * @model opposite="productType"
	 * @generated
	 */
	EList<Product> getProducts();

} // ProductType
