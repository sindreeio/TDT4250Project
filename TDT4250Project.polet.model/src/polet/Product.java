/**
 */
package polet;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link polet.Product#getName <em>Name</em>}</li>
 *   <li>{@link polet.Product#getProductType <em>Product Type</em>}</li>
 *   <li>{@link polet.Product#getPrice <em>Price</em>}</li>
 *   <li>{@link polet.Product#getAlcoholContent <em>Alcohol Content</em>}</li>
 *   <li>{@link polet.Product#getVolume <em>Volume</em>}</li>
 *   <li>{@link polet.Product#getMealTypes <em>Meal Types</em>}</li>
 *   <li>{@link polet.Product#getRegion <em>Region</em>}</li>
 *   <li>{@link polet.Product#getPricePerAlcohol <em>Price Per Alcohol</em>}</li>
 *   <li>{@link polet.Product#getPricePerVolume <em>Price Per Volume</em>}</li>
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
	 * Returns the value of the '<em><b>Alcohol Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alcohol Content</em>' attribute.
	 * @see #setAlcoholContent(float)
	 * @see polet.PoletPackage#getProduct_AlcoholContent()
	 * @model
	 * @generated
	 */
	float getAlcoholContent();

	/**
	 * Sets the value of the '{@link polet.Product#getAlcoholContent <em>Alcohol Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alcohol Content</em>' attribute.
	 * @see #getAlcoholContent()
	 * @generated
	 */
	void setAlcoholContent(float value);

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
	 * Returns the value of the '<em><b>Region</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link polet.ProductOfTypeInRegion#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' reference.
	 * @see #setRegion(ProductOfTypeInRegion)
	 * @see polet.PoletPackage#getProduct_Region()
	 * @see polet.ProductOfTypeInRegion#getProducts
	 * @model opposite="products"
	 * @generated
	 */
	ProductOfTypeInRegion getRegion();

	/**
	 * Sets the value of the '{@link polet.Product#getRegion <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(ProductOfTypeInRegion value);

	/**
	 * Returns the value of the '<em><b>Price Per Alcohol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Per Alcohol</em>' attribute.
	 * @see #setPricePerAlcohol(float)
	 * @see polet.PoletPackage#getProduct_PricePerAlcohol()
	 * @model derived="true"
	 * @generated
	 */
	float getPricePerAlcohol();

	/**
	 * Sets the value of the '{@link polet.Product#getPricePerAlcohol <em>Price Per Alcohol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Per Alcohol</em>' attribute.
	 * @see #getPricePerAlcohol()
	 * @generated
	 */
	void setPricePerAlcohol(float value);

	/**
	 * Returns the value of the '<em><b>Price Per Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Per Volume</em>' attribute.
	 * @see #setPricePerVolume(float)
	 * @see polet.PoletPackage#getProduct_PricePerVolume()
	 * @model derived="true"
	 * @generated
	 */
	float getPricePerVolume();

	/**
	 * Sets the value of the '{@link polet.Product#getPricePerVolume <em>Price Per Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Per Volume</em>' attribute.
	 * @see #getPricePerVolume()
	 * @generated
	 */
	void setPricePerVolume(float value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see polet.PoletPackage#getProduct_Price()
	 * @model
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link polet.Product#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Product Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link polet.ProductType#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Type</em>' container reference.
	 * @see #setProductType(ProductType)
	 * @see polet.PoletPackage#getProduct_ProductType()
	 * @see polet.ProductType#getProducts
	 * @model opposite="products" transient="false"
	 * @generated
	 */
	ProductType getProductType();

	/**
	 * Sets the value of the '{@link polet.Product#getProductType <em>Product Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Type</em>' container reference.
	 * @see #getProductType()
	 * @generated
	 */
	void setProductType(ProductType value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(float)
	 * @see polet.PoletPackage#getProduct_Volume()
	 * @model
	 * @generated
	 */
	float getVolume();

	/**
	 * Sets the value of the '{@link polet.Product#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(float value);

	/**
	 * Returns the value of the '<em><b>Meal Types</b></em>' reference list.
	 * The list contents are of type {@link polet.ProductOfTypeInMealType}.
	 * It is bidirectional and its opposite is '{@link polet.ProductOfTypeInMealType#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meal Types</em>' reference list.
	 * @see polet.PoletPackage#getProduct_MealTypes()
	 * @see polet.ProductOfTypeInMealType#getProducts
	 * @model opposite="products"
	 * @generated
	 */
	EList<ProductOfTypeInMealType> getMealTypes();

} // Product
