/**
 */
package polet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Of Type In Meal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link polet.ProductOfTypeInMealType#getMealType <em>Meal Type</em>}</li>
 *   <li>{@link polet.ProductOfTypeInMealType#getProducts <em>Products</em>}</li>
 *   <li>{@link polet.ProductOfTypeInMealType#getProductType <em>Product Type</em>}</li>
 * </ul>
 *
 * @see polet.PoletPackage#getProductOfTypeInMealType()
 * @model
 * @generated
 */
public interface ProductOfTypeInMealType extends EObject {
	/**
	 * Returns the value of the '<em><b>Meal Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link polet.MealType#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meal Type</em>' container reference.
	 * @see #setMealType(MealType)
	 * @see polet.PoletPackage#getProductOfTypeInMealType_MealType()
	 * @see polet.MealType#getProducts
	 * @model opposite="products" transient="false"
	 * @generated
	 */
	MealType getMealType();

	/**
	 * Sets the value of the '{@link polet.ProductOfTypeInMealType#getMealType <em>Meal Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meal Type</em>' container reference.
	 * @see #getMealType()
	 * @generated
	 */
	void setMealType(MealType value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' reference list.
	 * The list contents are of type {@link polet.Product}.
	 * It is bidirectional and its opposite is '{@link polet.Product#getMealTypes <em>Meal Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' reference list.
	 * @see polet.PoletPackage#getProductOfTypeInMealType_Products()
	 * @see polet.Product#getMealTypes
	 * @model opposite="MealTypes"
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * Returns the value of the '<em><b>Product Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link polet.ProductType#getProductTypeInMealType <em>Product Type In Meal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Type</em>' reference.
	 * @see #setProductType(ProductType)
	 * @see polet.PoletPackage#getProductOfTypeInMealType_ProductType()
	 * @see polet.ProductType#getProductTypeInMealType
	 * @model opposite="productTypeInMealType"
	 * @generated
	 */
	ProductType getProductType();

	/**
	 * Sets the value of the '{@link polet.ProductOfTypeInMealType#getProductType <em>Product Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Type</em>' reference.
	 * @see #getProductType()
	 * @generated
	 */
	void setProductType(ProductType value);

} // ProductOfTypeInMealType
