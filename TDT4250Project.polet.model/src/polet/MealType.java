/**
 */
package polet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link polet.MealType#getName <em>Name</em>}</li>
 *   <li>{@link polet.MealType#getRecipies <em>Recipies</em>}</li>
 *   <li>{@link polet.MealType#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see polet.PoletPackage#getMealType()
 * @model
 * @generated
 */
public interface MealType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see polet.PoletPackage#getMealType_Name()
	 * @model dataType="polet.MealTypes"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link polet.MealType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Recipies</b></em>' reference list.
	 * The list contents are of type {@link polet.Recipe}.
	 * It is bidirectional and its opposite is '{@link polet.Recipe#getMealType <em>Meal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipies</em>' reference list.
	 * @see polet.PoletPackage#getMealType_Recipies()
	 * @see polet.Recipe#getMealType
	 * @model opposite="mealType"
	 * @generated
	 */
	EList<Recipe> getRecipies();

	/**
	 * Returns the value of the '<em><b>Products</b></em>' reference list.
	 * The list contents are of type {@link polet.Product}.
	 * It is bidirectional and its opposite is '{@link polet.Product#getSutibleFor <em>Sutible For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' reference list.
	 * @see polet.PoletPackage#getMealType_Products()
	 * @see polet.Product#getSutibleFor
	 * @model opposite="sutibleFor"
	 * @generated
	 */
	EList<Product> getProducts();

} // MealType
