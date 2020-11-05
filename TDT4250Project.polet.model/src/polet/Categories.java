/**
 */
package polet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categories</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link polet.Categories#getCountries <em>Countries</em>}</li>
 *   <li>{@link polet.Categories#getProductTypes <em>Product Types</em>}</li>
 *   <li>{@link polet.Categories#getMealTypes <em>Meal Types</em>}</li>
 * </ul>
 *
 * @see polet.PoletPackage#getCategories()
 * @model
 * @generated
 */
public interface Categories extends EObject {
	/**
	 * Returns the value of the '<em><b>Countries</b></em>' containment reference list.
	 * The list contents are of type {@link polet.Country}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Countries</em>' containment reference list.
	 * @see polet.PoletPackage#getCategories_Countries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Country> getCountries();

	/**
	 * Returns the value of the '<em><b>Product Types</b></em>' containment reference list.
	 * The list contents are of type {@link polet.ProductType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Types</em>' containment reference list.
	 * @see polet.PoletPackage#getCategories_ProductTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductType> getProductTypes();

	/**
	 * Returns the value of the '<em><b>Meal Types</b></em>' containment reference list.
	 * The list contents are of type {@link polet.MealType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meal Types</em>' containment reference list.
	 * @see polet.PoletPackage#getCategories_MealTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MealType> getMealTypes();

} // Categories
