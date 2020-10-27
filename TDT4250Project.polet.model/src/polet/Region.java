/**
 */
package polet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link polet.Region#getRegionId <em>Region Id</em>}</li>
 *   <li>{@link polet.Region#getRegion <em>Region</em>}</li>
 *   <li>{@link polet.Region#getCountry <em>Country</em>}</li>
 *   <li>{@link polet.Region#getProduces <em>Produces</em>}</li>
 * </ul>
 *
 * @see polet.PoletPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends EObject {
	/**
	 * Returns the value of the '<em><b>Region Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Id</em>' attribute.
	 * @see #setRegionId(String)
	 * @see polet.PoletPackage#getRegion_RegionId()
	 * @model default="" id="true" ordered="false"
	 * @generated
	 */
	String getRegionId();

	/**
	 * Sets the value of the '{@link polet.Region#getRegionId <em>Region Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Id</em>' attribute.
	 * @see #getRegionId()
	 * @generated
	 */
	void setRegionId(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see polet.PoletPackage#getRegion_Region()
	 * @model
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link polet.Region#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link polet.Country#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' container reference.
	 * @see #setCountry(Country)
	 * @see polet.PoletPackage#getRegion_Country()
	 * @see polet.Country#getRegions
	 * @model opposite="regions" transient="false"
	 * @generated
	 */
	Country getCountry();

	/**
	 * Sets the value of the '{@link polet.Region#getCountry <em>Country</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' container reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Country value);

	/**
	 * Returns the value of the '<em><b>Produces</b></em>' reference list.
	 * The list contents are of type {@link polet.ProductType}.
	 * It is bidirectional and its opposite is '{@link polet.ProductType#getProducedIn <em>Produced In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produces</em>' reference list.
	 * @see polet.PoletPackage#getRegion_Produces()
	 * @see polet.ProductType#getProducedIn
	 * @model opposite="producedIn"
	 * @generated
	 */
	EList<ProductType> getProduces();

} // Region
