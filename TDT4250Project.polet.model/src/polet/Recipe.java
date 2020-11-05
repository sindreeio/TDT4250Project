/**
 */
package polet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link polet.Recipe#getName <em>Name</em>}</li>
 *   <li>{@link polet.Recipe#getRecepieId <em>Recepie Id</em>}</li>
 *   <li>{@link polet.Recipe#getMealType <em>Meal Type</em>}</li>
 *   <li>{@link polet.Recipe#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see polet.PoletPackage#getRecipe()
 * @model
 * @generated
 */
public interface Recipe extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see polet.PoletPackage#getRecipe_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link polet.Recipe#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Recepie Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recepie Id</em>' attribute.
	 * @see #setRecepieId(String)
	 * @see polet.PoletPackage#getRecipe_RecepieId()
	 * @model id="true"
	 * @generated
	 */
	String getRecepieId();

	/**
	 * Sets the value of the '{@link polet.Recipe#getRecepieId <em>Recepie Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recepie Id</em>' attribute.
	 * @see #getRecepieId()
	 * @generated
	 */
	void setRecepieId(String value);

	/**
	 * Returns the value of the '<em><b>Meal Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link polet.MealType#getRecipies <em>Recipies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meal Type</em>' container reference.
	 * @see #setMealType(MealType)
	 * @see polet.PoletPackage#getRecipe_MealType()
	 * @see polet.MealType#getRecipies
	 * @model opposite="recipies" transient="false"
	 * @generated
	 */
	MealType getMealType();

	/**
	 * Sets the value of the '{@link polet.Recipe#getMealType <em>Meal Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meal Type</em>' container reference.
	 * @see #getMealType()
	 * @generated
	 */
	void setMealType(MealType value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' attribute.
	 * @see #setLink(String)
	 * @see polet.PoletPackage#getRecipe_Link()
	 * @model
	 * @generated
	 */
	String getLink();

	/**
	 * Sets the value of the '{@link polet.Recipe#getLink <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' attribute.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(String value);

} // Recipe
