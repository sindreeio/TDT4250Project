/**
 */
package polet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recepie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link polet.Recepie#getName <em>Name</em>}</li>
 *   <li>{@link polet.Recepie#getRecepieId <em>Recepie Id</em>}</li>
 *   <li>{@link polet.Recepie#getMealType <em>Meal Type</em>}</li>
 *   <li>{@link polet.Recepie#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see polet.PoletPackage#getRecepie()
 * @model
 * @generated
 */
public interface Recepie extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see polet.PoletPackage#getRecepie_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link polet.Recepie#getName <em>Name</em>}' attribute.
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
	 * @see polet.PoletPackage#getRecepie_RecepieId()
	 * @model id="true"
	 * @generated
	 */
	String getRecepieId();

	/**
	 * Sets the value of the '{@link polet.Recepie#getRecepieId <em>Recepie Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recepie Id</em>' attribute.
	 * @see #getRecepieId()
	 * @generated
	 */
	void setRecepieId(String value);

	/**
	 * Returns the value of the '<em><b>Meal Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meal Type</em>' reference.
	 * @see #setMealType(MealType)
	 * @see polet.PoletPackage#getRecepie_MealType()
	 * @model
	 * @generated
	 */
	MealType getMealType();

	/**
	 * Sets the value of the '{@link polet.Recepie#getMealType <em>Meal Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meal Type</em>' reference.
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
	 * @see polet.PoletPackage#getRecepie_Link()
	 * @model
	 * @generated
	 */
	String getLink();

	/**
	 * Sets the value of the '{@link polet.Recepie#getLink <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' attribute.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(String value);

} // Recepie
