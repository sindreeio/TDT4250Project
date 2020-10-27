/**
 */
package polet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alcohol Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link polet.AlcoholContent#getPercent <em>Percent</em>}</li>
 * </ul>
 *
 * @see polet.PoletPackage#getAlcoholContent()
 * @model
 * @generated
 */
public interface AlcoholContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percent</em>' attribute.
	 * @see #setPercent(float)
	 * @see polet.PoletPackage#getAlcoholContent_Percent()
	 * @model unique="false" id="true"
	 * @generated
	 */
	float getPercent();

	/**
	 * Sets the value of the '{@link polet.AlcoholContent#getPercent <em>Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent</em>' attribute.
	 * @see #getPercent()
	 * @generated
	 */
	void setPercent(float value);

} // AlcoholContent
