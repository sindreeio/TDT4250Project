/**
 */
package polet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see polet.PoletFactory
 * @model kind="package"
 * @generated
 */
public interface PoletPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "polet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/TDT4250Project.polet/model/polet.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "polet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PoletPackage eINSTANCE = polet.impl.PoletPackageImpl.init();

	/**
	 * The meta object id for the '{@link polet.impl.CategoriesImpl <em>Categories</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polet.impl.CategoriesImpl
	 * @see polet.impl.PoletPackageImpl#getCategories()
	 * @generated
	 */
	int CATEGORIES = 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES__PRODUCTS = 0;

	/**
	 * The feature id for the '<em><b>Alcohol Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES__ALCOHOL_CONTENTS = 1;

	/**
	 * The feature id for the '<em><b>Countries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES__COUNTRIES = 2;

	/**
	 * The feature id for the '<em><b>Prices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES__PRICES = 3;

	/**
	 * The feature id for the '<em><b>Product Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES__PRODUCT_TYPES = 4;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES__VOLUMES = 5;

	/**
	 * The number of structural features of the '<em>Categories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Categories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link polet.impl.PriceImpl <em>Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polet.impl.PriceImpl
	 * @see polet.impl.PoletPackageImpl#getPrice()
	 * @generated
	 */
	int PRICE = 1;

	/**
	 * The feature id for the '<em><b>Sales Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE__SALES_PRICE = 0;

	/**
	 * The number of structural features of the '<em>Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link polet.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polet.impl.ProductImpl
	 * @see polet.impl.PoletPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 2;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_ID = 0;

	/**
	 * The feature id for the '<em><b>Alcohol Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ALCOHOL_CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Price</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRICE = 3;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__COUNTRY = 4;

	/**
	 * The feature id for the '<em><b>Product Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__VOLUME = 6;

	/**
	 * The feature id for the '<em><b>Alcohol Per Krone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ALCOHOL_PER_KRONE = 7;

	/**
	 * The feature id for the '<em><b>Krone Per Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__KRONE_PER_VOLUME = 8;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link polet.impl.AlcoholContentImpl <em>Alcohol Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polet.impl.AlcoholContentImpl
	 * @see polet.impl.PoletPackageImpl#getAlcoholContent()
	 * @generated
	 */
	int ALCOHOL_CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALCOHOL_CONTENT__PERCENT = 0;

	/**
	 * The number of structural features of the '<em>Alcohol Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALCOHOL_CONTENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Alcohol Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALCOHOL_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link polet.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polet.impl.CountryImpl
	 * @see polet.impl.PoletPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 4;

	/**
	 * The feature id for the '<em><b>Country Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__COUNTRY_ID = 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__COUNTRY = 1;

	/**
	 * The feature id for the '<em><b>Regions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__REGIONS = 2;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link polet.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polet.impl.RegionImpl
	 * @see polet.impl.PoletPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 5;

	/**
	 * The feature id for the '<em><b>Region Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__REGION_ID = 0;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__REGION = 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__COUNTRY = 2;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__PRODUCES = 3;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link polet.impl.ProductTypeImpl <em>Product Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polet.impl.ProductTypeImpl
	 * @see polet.impl.PoletPackageImpl#getProductType()
	 * @generated
	 */
	int PRODUCT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Product Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__PRODUCT_TYPE_ID = 0;

	/**
	 * The feature id for the '<em><b>Product Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__PRODUCT_TYPE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Produced In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__PRODUCED_IN = 2;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__PRODUCTS = 3;

	/**
	 * The number of structural features of the '<em>Product Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Product Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link polet.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polet.impl.VolumeImpl
	 * @see polet.impl.PoletPackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 7;

	/**
	 * The feature id for the '<em><b>Liters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__LITERS = 0;

	/**
	 * The number of structural features of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link polet.Categories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categories</em>'.
	 * @see polet.Categories
	 * @generated
	 */
	EClass getCategories();

	/**
	 * Returns the meta object for the containment reference list '{@link polet.Categories#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see polet.Categories#getProducts()
	 * @see #getCategories()
	 * @generated
	 */
	EReference getCategories_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link polet.Categories#getAlcoholContents <em>Alcohol Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alcohol Contents</em>'.
	 * @see polet.Categories#getAlcoholContents()
	 * @see #getCategories()
	 * @generated
	 */
	EReference getCategories_AlcoholContents();

	/**
	 * Returns the meta object for the containment reference list '{@link polet.Categories#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Countries</em>'.
	 * @see polet.Categories#getCountries()
	 * @see #getCategories()
	 * @generated
	 */
	EReference getCategories_Countries();

	/**
	 * Returns the meta object for the containment reference list '{@link polet.Categories#getPrices <em>Prices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prices</em>'.
	 * @see polet.Categories#getPrices()
	 * @see #getCategories()
	 * @generated
	 */
	EReference getCategories_Prices();

	/**
	 * Returns the meta object for the containment reference list '{@link polet.Categories#getProductTypes <em>Product Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Types</em>'.
	 * @see polet.Categories#getProductTypes()
	 * @see #getCategories()
	 * @generated
	 */
	EReference getCategories_ProductTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link polet.Categories#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volumes</em>'.
	 * @see polet.Categories#getVolumes()
	 * @see #getCategories()
	 * @generated
	 */
	EReference getCategories_Volumes();

	/**
	 * Returns the meta object for class '{@link polet.Price <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Price</em>'.
	 * @see polet.Price
	 * @generated
	 */
	EClass getPrice();

	/**
	 * Returns the meta object for the attribute '{@link polet.Price#getSalesPrice <em>Sales Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sales Price</em>'.
	 * @see polet.Price#getSalesPrice()
	 * @see #getPrice()
	 * @generated
	 */
	EAttribute getPrice_SalesPrice();

	/**
	 * Returns the meta object for class '{@link polet.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see polet.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link polet.Product#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Id</em>'.
	 * @see polet.Product#getProductId()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ProductId();

	/**
	 * Returns the meta object for the reference '{@link polet.Product#getAlcoholContent <em>Alcohol Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alcohol Content</em>'.
	 * @see polet.Product#getAlcoholContent()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_AlcoholContent();

	/**
	 * Returns the meta object for the attribute '{@link polet.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see polet.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the reference '{@link polet.Product#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Price</em>'.
	 * @see polet.Product#getPrice()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Price();

	/**
	 * Returns the meta object for the reference '{@link polet.Product#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see polet.Product#getCountry()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Country();

	/**
	 * Returns the meta object for the reference '{@link polet.Product#getProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Type</em>'.
	 * @see polet.Product#getProductType()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ProductType();

	/**
	 * Returns the meta object for the reference '{@link polet.Product#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Volume</em>'.
	 * @see polet.Product#getVolume()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Volume();

	/**
	 * Returns the meta object for the attribute '{@link polet.Product#getAlcoholPerKrone <em>Alcohol Per Krone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alcohol Per Krone</em>'.
	 * @see polet.Product#getAlcoholPerKrone()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_AlcoholPerKrone();

	/**
	 * Returns the meta object for the attribute '{@link polet.Product#getKronePerVolume <em>Krone Per Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Krone Per Volume</em>'.
	 * @see polet.Product#getKronePerVolume()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_KronePerVolume();

	/**
	 * Returns the meta object for class '{@link polet.AlcoholContent <em>Alcohol Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alcohol Content</em>'.
	 * @see polet.AlcoholContent
	 * @generated
	 */
	EClass getAlcoholContent();

	/**
	 * Returns the meta object for the attribute '{@link polet.AlcoholContent#getPercent <em>Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent</em>'.
	 * @see polet.AlcoholContent#getPercent()
	 * @see #getAlcoholContent()
	 * @generated
	 */
	EAttribute getAlcoholContent_Percent();

	/**
	 * Returns the meta object for class '{@link polet.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see polet.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the attribute '{@link polet.Country#getCountryId <em>Country Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Id</em>'.
	 * @see polet.Country#getCountryId()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_CountryId();

	/**
	 * Returns the meta object for the attribute '{@link polet.Country#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see polet.Country#getCountry()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Country();

	/**
	 * Returns the meta object for the containment reference list '{@link polet.Country#getRegions <em>Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regions</em>'.
	 * @see polet.Country#getRegions()
	 * @see #getCountry()
	 * @generated
	 */
	EReference getCountry_Regions();

	/**
	 * Returns the meta object for class '{@link polet.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see polet.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the attribute '{@link polet.Region#getRegionId <em>Region Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Id</em>'.
	 * @see polet.Region#getRegionId()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_RegionId();

	/**
	 * Returns the meta object for the attribute '{@link polet.Region#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see polet.Region#getRegion()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_Region();

	/**
	 * Returns the meta object for the container reference '{@link polet.Region#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Country</em>'.
	 * @see polet.Region#getCountry()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Country();

	/**
	 * Returns the meta object for the reference list '{@link polet.Region#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Produces</em>'.
	 * @see polet.Region#getProduces()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Produces();

	/**
	 * Returns the meta object for class '{@link polet.ProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Type</em>'.
	 * @see polet.ProductType
	 * @generated
	 */
	EClass getProductType();

	/**
	 * Returns the meta object for the attribute '{@link polet.ProductType#getProductTypeId <em>Product Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Type Id</em>'.
	 * @see polet.ProductType#getProductTypeId()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_ProductTypeId();

	/**
	 * Returns the meta object for the attribute '{@link polet.ProductType#getProductTypeName <em>Product Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Type Name</em>'.
	 * @see polet.ProductType#getProductTypeName()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_ProductTypeName();

	/**
	 * Returns the meta object for the reference list '{@link polet.ProductType#getProducedIn <em>Produced In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Produced In</em>'.
	 * @see polet.ProductType#getProducedIn()
	 * @see #getProductType()
	 * @generated
	 */
	EReference getProductType_ProducedIn();

	/**
	 * Returns the meta object for the reference list '{@link polet.ProductType#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Products</em>'.
	 * @see polet.ProductType#getProducts()
	 * @see #getProductType()
	 * @generated
	 */
	EReference getProductType_Products();

	/**
	 * Returns the meta object for class '{@link polet.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume</em>'.
	 * @see polet.Volume
	 * @generated
	 */
	EClass getVolume();

	/**
	 * Returns the meta object for the attribute '{@link polet.Volume#getLiters <em>Liters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Liters</em>'.
	 * @see polet.Volume#getLiters()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Liters();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PoletFactory getPoletFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link polet.impl.CategoriesImpl <em>Categories</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polet.impl.CategoriesImpl
		 * @see polet.impl.PoletPackageImpl#getCategories()
		 * @generated
		 */
		EClass CATEGORIES = eINSTANCE.getCategories();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIES__PRODUCTS = eINSTANCE.getCategories_Products();

		/**
		 * The meta object literal for the '<em><b>Alcohol Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIES__ALCOHOL_CONTENTS = eINSTANCE.getCategories_AlcoholContents();

		/**
		 * The meta object literal for the '<em><b>Countries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIES__COUNTRIES = eINSTANCE.getCategories_Countries();

		/**
		 * The meta object literal for the '<em><b>Prices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIES__PRICES = eINSTANCE.getCategories_Prices();

		/**
		 * The meta object literal for the '<em><b>Product Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIES__PRODUCT_TYPES = eINSTANCE.getCategories_ProductTypes();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIES__VOLUMES = eINSTANCE.getCategories_Volumes();

		/**
		 * The meta object literal for the '{@link polet.impl.PriceImpl <em>Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polet.impl.PriceImpl
		 * @see polet.impl.PoletPackageImpl#getPrice()
		 * @generated
		 */
		EClass PRICE = eINSTANCE.getPrice();

		/**
		 * The meta object literal for the '<em><b>Sales Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICE__SALES_PRICE = eINSTANCE.getPrice_SalesPrice();

		/**
		 * The meta object literal for the '{@link polet.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polet.impl.ProductImpl
		 * @see polet.impl.PoletPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRODUCT_ID = eINSTANCE.getProduct_ProductId();

		/**
		 * The meta object literal for the '<em><b>Alcohol Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__ALCOHOL_CONTENT = eINSTANCE.getProduct_AlcoholContent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRICE = eINSTANCE.getProduct_Price();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__COUNTRY = eINSTANCE.getProduct_Country();

		/**
		 * The meta object literal for the '<em><b>Product Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRODUCT_TYPE = eINSTANCE.getProduct_ProductType();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__VOLUME = eINSTANCE.getProduct_Volume();

		/**
		 * The meta object literal for the '<em><b>Alcohol Per Krone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__ALCOHOL_PER_KRONE = eINSTANCE.getProduct_AlcoholPerKrone();

		/**
		 * The meta object literal for the '<em><b>Krone Per Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__KRONE_PER_VOLUME = eINSTANCE.getProduct_KronePerVolume();

		/**
		 * The meta object literal for the '{@link polet.impl.AlcoholContentImpl <em>Alcohol Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polet.impl.AlcoholContentImpl
		 * @see polet.impl.PoletPackageImpl#getAlcoholContent()
		 * @generated
		 */
		EClass ALCOHOL_CONTENT = eINSTANCE.getAlcoholContent();

		/**
		 * The meta object literal for the '<em><b>Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALCOHOL_CONTENT__PERCENT = eINSTANCE.getAlcoholContent_Percent();

		/**
		 * The meta object literal for the '{@link polet.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polet.impl.CountryImpl
		 * @see polet.impl.PoletPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em><b>Country Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__COUNTRY_ID = eINSTANCE.getCountry_CountryId();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__COUNTRY = eINSTANCE.getCountry_Country();

		/**
		 * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY__REGIONS = eINSTANCE.getCountry_Regions();

		/**
		 * The meta object literal for the '{@link polet.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polet.impl.RegionImpl
		 * @see polet.impl.PoletPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Region Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__REGION_ID = eINSTANCE.getRegion_RegionId();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__REGION = eINSTANCE.getRegion_Region();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__COUNTRY = eINSTANCE.getRegion_Country();

		/**
		 * The meta object literal for the '<em><b>Produces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__PRODUCES = eINSTANCE.getRegion_Produces();

		/**
		 * The meta object literal for the '{@link polet.impl.ProductTypeImpl <em>Product Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polet.impl.ProductTypeImpl
		 * @see polet.impl.PoletPackageImpl#getProductType()
		 * @generated
		 */
		EClass PRODUCT_TYPE = eINSTANCE.getProductType();

		/**
		 * The meta object literal for the '<em><b>Product Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TYPE__PRODUCT_TYPE_ID = eINSTANCE.getProductType_ProductTypeId();

		/**
		 * The meta object literal for the '<em><b>Product Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TYPE__PRODUCT_TYPE_NAME = eINSTANCE.getProductType_ProductTypeName();

		/**
		 * The meta object literal for the '<em><b>Produced In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_TYPE__PRODUCED_IN = eINSTANCE.getProductType_ProducedIn();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_TYPE__PRODUCTS = eINSTANCE.getProductType_Products();

		/**
		 * The meta object literal for the '{@link polet.impl.VolumeImpl <em>Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polet.impl.VolumeImpl
		 * @see polet.impl.PoletPackageImpl#getVolume()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '<em><b>Liters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__LITERS = eINSTANCE.getVolume_Liters();

	}

} //PoletPackage
