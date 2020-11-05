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
 *   <li>{@link polet.ProductType#getName <em>Name</em>}</li>
 *   <li>{@link polet.ProductType#getProducts <em>Products</em>}</li>
 *   <li>{@link polet.ProductType#getProductTypeInMealType <em>Product Type In Meal Type</em>}</li>
 *   <li>{@link polet.ProductType#getProductTypeInRegion <em>Product Type In Region</em>}</li>
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see polet.PoletPackage#getProductType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link polet.ProductType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link polet.Product}.
	 * It is bidirectional and its opposite is '{@link polet.Product#getProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see polet.PoletPackage#getProductType_Products()
	 * @see polet.Product#getProductType
	 * @model opposite="productType" containment="true"
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * Returns the value of the '<em><b>Product Type In Meal Type</b></em>' reference list.
	 * The list contents are of type {@link polet.ProductOfTypeInMealType}.
	 * It is bidirectional and its opposite is '{@link polet.ProductOfTypeInMealType#getProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Type In Meal Type</em>' reference list.
	 * @see polet.PoletPackage#getProductType_ProductTypeInMealType()
	 * @see polet.ProductOfTypeInMealType#getProductType
	 * @model opposite="productType"
	 * @generated
	 */
	EList<ProductOfTypeInMealType> getProductTypeInMealType();

	/**
	 * Returns the value of the '<em><b>Product Type In Region</b></em>' reference list.
	 * The list contents are of type {@link polet.ProductOfTypeInRegion}.
	 * It is bidirectional and its opposite is '{@link polet.ProductOfTypeInRegion#getProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Type In Region</em>' reference list.
	 * @see polet.PoletPackage#getProductType_ProductTypeInRegion()
	 * @see polet.ProductOfTypeInRegion#getProductType
	 * @model opposite="productType"
	 * @generated
	 */
	EList<ProductOfTypeInRegion> getProductTypeInRegion();

} // ProductType
