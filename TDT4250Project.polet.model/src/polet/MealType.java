/**
 */
package polet;

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
 *   <li>{@link polet.MealType#getMealTypes <em>Meal Types</em>}</li>
 * </ul>
 *
 * @see polet.PoletPackage#getMealType()
 * @model
 * @generated
 */
public interface MealType extends EObject {
	/**
	 * Returns the value of the '<em><b>Meal Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meal Types</em>' attribute.
	 * @see #setMealTypes(String)
	 * @see polet.PoletPackage#getMealType_MealTypes()
	 * @model dataType="polet.MealTypes"
	 * @generated
	 */
	String getMealTypes();

	/**
	 * Sets the value of the '{@link polet.MealType#getMealTypes <em>Meal Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meal Types</em>' attribute.
	 * @see #getMealTypes()
	 * @generated
	 */
	void setMealTypes(String value);

} // MealType
