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
 *   <li>{@link polet.Categories#getProducts <em>Products</em>}</li>
 *   <li>{@link polet.Categories#getCountries <em>Countries</em>}</li>
 *   <li>{@link polet.Categories#getProductTypes <em>Product Types</em>}</li>
 *   <li>{@link polet.Categories#getKronePerVolumes <em>Krone Per Volumes</em>}</li>
 *   <li>{@link polet.Categories#getAlcoholPerKrones <em>Alcohol Per Krones</em>}</li>
 *   <li>{@link polet.Categories#getRecepies <em>Recepies</em>}</li>
 *   <li>{@link polet.Categories#getMealTypes <em>Meal Types</em>}</li>
 * </ul>
 *
 * @see polet.PoletPackage#getCategories()
 * @model
 * @generated
 */
public interface Categories extends EObject {
	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link polet.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see polet.PoletPackage#getCategories_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getProducts();

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
	 * Returns the value of the '<em><b>Krone Per Volumes</b></em>' containment reference list.
	 * The list contents are of type {@link polet.KronePerVolume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Krone Per Volumes</em>' containment reference list.
	 * @see polet.PoletPackage#getCategories_KronePerVolumes()
	 * @model containment="true"
	 * @generated
	 */
	EList<KronePerVolume> getKronePerVolumes();

	/**
	 * Returns the value of the '<em><b>Alcohol Per Krones</b></em>' containment reference list.
	 * The list contents are of type {@link polet.KronePerAlcohol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alcohol Per Krones</em>' containment reference list.
	 * @see polet.PoletPackage#getCategories_AlcoholPerKrones()
	 * @model containment="true"
	 * @generated
	 */
	EList<KronePerAlcohol> getAlcoholPerKrones();

	/**
	 * Returns the value of the '<em><b>Recepies</b></em>' containment reference list.
	 * The list contents are of type {@link polet.Recipe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recepies</em>' containment reference list.
	 * @see polet.PoletPackage#getCategories_Recepies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Recipe> getRecepies();

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
