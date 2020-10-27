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
 *   <li>{@link polet.Categories#getAlcoholContents <em>Alcohol Contents</em>}</li>
 *   <li>{@link polet.Categories#getCountries <em>Countries</em>}</li>
 *   <li>{@link polet.Categories#getPrices <em>Prices</em>}</li>
 *   <li>{@link polet.Categories#getProductTypes <em>Product Types</em>}</li>
 *   <li>{@link polet.Categories#getVolumes <em>Volumes</em>}</li>
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
	 * Returns the value of the '<em><b>Alcohol Contents</b></em>' containment reference list.
	 * The list contents are of type {@link polet.AlcoholContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alcohol Contents</em>' containment reference list.
	 * @see polet.PoletPackage#getCategories_AlcoholContents()
	 * @model containment="true"
	 * @generated
	 */
	EList<AlcoholContent> getAlcoholContents();

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
	 * Returns the value of the '<em><b>Prices</b></em>' containment reference list.
	 * The list contents are of type {@link polet.Price}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prices</em>' containment reference list.
	 * @see polet.PoletPackage#getCategories_Prices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Price> getPrices();

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
	 * Returns the value of the '<em><b>Volumes</b></em>' containment reference list.
	 * The list contents are of type {@link polet.Volume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' containment reference list.
	 * @see polet.PoletPackage#getCategories_Volumes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Volume> getVolumes();

} // Categories
