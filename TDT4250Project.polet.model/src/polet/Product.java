/**
 */
package polet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link polet.Product#getProductId <em>Product Id</em>}</li>
 *   <li>{@link polet.Product#getAlcoholContent <em>Alcohol Content</em>}</li>
 *   <li>{@link polet.Product#getName <em>Name</em>}</li>
 *   <li>{@link polet.Product#getPrice <em>Price</em>}</li>
 *   <li>{@link polet.Product#getCountry <em>Country</em>}</li>
 *   <li>{@link polet.Product#getProductType <em>Product Type</em>}</li>
 *   <li>{@link polet.Product#getVolume <em>Volume</em>}</li>
 *   <li>{@link polet.Product#getAlcoholPerKrone <em>Alcohol Per Krone</em>}</li>
 *   <li>{@link polet.Product#getKronePerVolume <em>Krone Per Volume</em>}</li>
 * </ul>
 *
 * @see polet.PoletPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends EObject {
	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see polet.PoletPackage#getProduct_ProductId()
	 * @model id="true"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link polet.Product#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Alcohol Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alcohol Content</em>' reference.
	 * @see #setAlcoholContent(AlcoholContent)
	 * @see polet.PoletPackage#getProduct_AlcoholContent()
	 * @model
	 * @generated
	 */
	AlcoholContent getAlcoholContent();

	/**
	 * Sets the value of the '{@link polet.Product#getAlcoholContent <em>Alcohol Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alcohol Content</em>' reference.
	 * @see #getAlcoholContent()
	 * @generated
	 */
	void setAlcoholContent(AlcoholContent value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see polet.PoletPackage#getProduct_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link polet.Product#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' reference.
	 * @see #setPrice(Price)
	 * @see polet.PoletPackage#getProduct_Price()
	 * @model
	 * @generated
	 */
	Price getPrice();

	/**
	 * Sets the value of the '{@link polet.Product#getPrice <em>Price</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' reference.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(Price value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' reference.
	 * @see #setCountry(Country)
	 * @see polet.PoletPackage#getProduct_Country()
	 * @model
	 * @generated
	 */
	Country getCountry();

	/**
	 * Sets the value of the '{@link polet.Product#getCountry <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Country value);

	/**
	 * Returns the value of the '<em><b>Product Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link polet.ProductType#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Type</em>' reference.
	 * @see #setProductType(ProductType)
	 * @see polet.PoletPackage#getProduct_ProductType()
	 * @see polet.ProductType#getProducts
	 * @model opposite="products"
	 * @generated
	 */
	ProductType getProductType();

	/**
	 * Sets the value of the '{@link polet.Product#getProductType <em>Product Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Type</em>' reference.
	 * @see #getProductType()
	 * @generated
	 */
	void setProductType(ProductType value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' reference.
	 * @see #setVolume(Volume)
	 * @see polet.PoletPackage#getProduct_Volume()
	 * @model
	 * @generated
	 */
	Volume getVolume();

	/**
	 * Sets the value of the '{@link polet.Product#getVolume <em>Volume</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' reference.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(Volume value);

	/**
	 * Returns the value of the '<em><b>Alcohol Per Krone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alcohol Per Krone</em>' attribute.
	 * @see #setAlcoholPerKrone(float)
	 * @see polet.PoletPackage#getProduct_AlcoholPerKrone()
	 * @model derived="true"
	 * @generated
	 */
	float getAlcoholPerKrone();

	/**
	 * Sets the value of the '{@link polet.Product#getAlcoholPerKrone <em>Alcohol Per Krone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alcohol Per Krone</em>' attribute.
	 * @see #getAlcoholPerKrone()
	 * @generated
	 */
	void setAlcoholPerKrone(float value);

	/**
	 * Returns the value of the '<em><b>Krone Per Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Krone Per Volume</em>' attribute.
	 * @see #setKronePerVolume(float)
	 * @see polet.PoletPackage#getProduct_KronePerVolume()
	 * @model derived="true"
	 * @generated
	 */
	float getKronePerVolume();

	/**
	 * Sets the value of the '{@link polet.Product#getKronePerVolume <em>Krone Per Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Krone Per Volume</em>' attribute.
	 * @see #getKronePerVolume()
	 * @generated
	 */
	void setKronePerVolume(float value);

} // Product
