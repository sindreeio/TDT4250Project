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
 *   <li>{@link polet.Region#getName <em>Name</em>}</li>
 *   <li>{@link polet.Region#getCountry <em>Country</em>}</li>
 *   <li>{@link polet.Region#getProducts <em>Products</em>}</li>
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see polet.PoletPackage#getRegion_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link polet.Region#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link polet.ProductOfTypeInRegion}.
	 * It is bidirectional and its opposite is '{@link polet.ProductOfTypeInRegion#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see polet.PoletPackage#getRegion_Products()
	 * @see polet.ProductOfTypeInRegion#getRegion
	 * @model opposite="region" containment="true"
	 * @generated
	 */
	EList<ProductOfTypeInRegion> getProducts();

} // Region
