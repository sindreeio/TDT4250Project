/**
 */
package polet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link polet.Country#getCountryId <em>Country Id</em>}</li>
 *   <li>{@link polet.Country#getCountry <em>Country</em>}</li>
 *   <li>{@link polet.Country#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @see polet.PoletPackage#getCountry()
 * @model
 * @generated
 */
public interface Country extends EObject {
	/**
	 * Returns the value of the '<em><b>Country Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Id</em>' attribute.
	 * @see #setCountryId(String)
	 * @see polet.PoletPackage#getCountry_CountryId()
	 * @model id="true"
	 * @generated
	 */
	String getCountryId();

	/**
	 * Sets the value of the '{@link polet.Country#getCountryId <em>Country Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Id</em>' attribute.
	 * @see #getCountryId()
	 * @generated
	 */
	void setCountryId(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see polet.PoletPackage#getCountry_Country()
	 * @model ordered="false"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link polet.Country#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link polet.Region}.
	 * It is bidirectional and its opposite is '{@link polet.Region#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see polet.PoletPackage#getCountry_Regions()
	 * @see polet.Region#getCountry
	 * @model opposite="country" containment="true" ordered="false"
	 * @generated
	 */
	EList<Region> getRegions();

} // Country
