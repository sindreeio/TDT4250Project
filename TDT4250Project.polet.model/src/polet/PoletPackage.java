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
	 * The feature id for the '<em><b>Countries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES__COUNTRIES = 1;

	/**
	 * The feature id for the '<em><b>Product Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES__PRODUCT_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Krone Per Volumes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES__KRONE_PER_VOLUMES = 3;

	/**
	 * The feature id for the '<em><b>Alcohol Per Krones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES__ALCOHOL_PER_KRONES = 4;

	/**
	 * The number of structural features of the '<em>Categories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Categories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link polet.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polet.impl.ProductImpl
	 * @see polet.impl.PoletPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 1;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__COUNTRY = 2;

	/**
	 * The feature id for the '<em><b>Product Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Krone Per Volume</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__KRONE_PER_VOLUME = 4;

	/**
	 * The feature id for the '<em><b>Alcohol Per Krone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ALCOHOL_PER_KRONE = 5;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRICE = 6;

	/**
	 * The feature id for the '<em><b>Alcohol Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ALCOHOL_CONTENT = 7;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__VOLUME = 8;

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
	 * The meta object id for the '{@link polet.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polet.impl.CountryImpl
	 * @see polet.impl.PoletPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 2;

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
	int REGION = 3;

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
	int PRODUCT_TYPE = 4;

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
	 * The meta object id for the '{@link polet.impl.KronePerVolumeImpl <em>Krone Per Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polet.impl.KronePerVolumeImpl
	 * @see polet.impl.PoletPackageImpl#getKronePerVolume()
	 * @generated
	 */
	int KRONE_PER_VOLUME = 5;

	/**
	 * The feature id for the '<em><b>Derived Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRONE_PER_VOLUME__DERIVED_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRONE_PER_VOLUME__PRODUCTS = 1;

	/**
	 * The number of structural features of the '<em>Krone Per Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRONE_PER_VOLUME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Krone Per Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRONE_PER_VOLUME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link polet.impl.KronePerAlcoholImpl <em>Krone Per Alcohol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polet.impl.KronePerAlcoholImpl
	 * @see polet.impl.PoletPackageImpl#getKronePerAlcohol()
	 * @generated
	 */
	int KRONE_PER_ALCOHOL = 6;

	/**
	 * The feature id for the '<em><b>Derived Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRONE_PER_ALCOHOL__DERIVED_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRONE_PER_ALCOHOL__PRODUCTS = 1;

	/**
	 * The number of structural features of the '<em>Krone Per Alcohol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRONE_PER_ALCOHOL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Krone Per Alcohol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRONE_PER_ALCOHOL_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the containment reference list '{@link polet.Categories#getKronePerVolumes <em>Krone Per Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Krone Per Volumes</em>'.
	 * @see polet.Categories#getKronePerVolumes()
	 * @see #getCategories()
	 * @generated
	 */
	EReference getCategories_KronePerVolumes();

	/**
	 * Returns the meta object for the containment reference list '{@link polet.Categories#getAlcoholPerKrones <em>Alcohol Per Krones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alcohol Per Krones</em>'.
	 * @see polet.Categories#getAlcoholPerKrones()
	 * @see #getCategories()
	 * @generated
	 */
	EReference getCategories_AlcoholPerKrones();

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
	 * Returns the meta object for the attribute '{@link polet.Product#getAlcoholContent <em>Alcohol Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alcohol Content</em>'.
	 * @see polet.Product#getAlcoholContent()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_AlcoholContent();

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
	 * Returns the meta object for the attribute '{@link polet.Product#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see polet.Product#getPrice()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Price();

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
	 * Returns the meta object for the attribute '{@link polet.Product#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see polet.Product#getVolume()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Volume();

	/**
	 * Returns the meta object for the reference '{@link polet.Product#getAlcoholPerKrone <em>Alcohol Per Krone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alcohol Per Krone</em>'.
	 * @see polet.Product#getAlcoholPerKrone()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_AlcoholPerKrone();

	/**
	 * Returns the meta object for the reference '{@link polet.Product#getKronePerVolume <em>Krone Per Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Krone Per Volume</em>'.
	 * @see polet.Product#getKronePerVolume()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_KronePerVolume();

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
	 * Returns the meta object for class '{@link polet.KronePerVolume <em>Krone Per Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Krone Per Volume</em>'.
	 * @see polet.KronePerVolume
	 * @generated
	 */
	EClass getKronePerVolume();

	/**
	 * Returns the meta object for the attribute '{@link polet.KronePerVolume#getDerivedNumber <em>Derived Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived Number</em>'.
	 * @see polet.KronePerVolume#getDerivedNumber()
	 * @see #getKronePerVolume()
	 * @generated
	 */
	EAttribute getKronePerVolume_DerivedNumber();

	/**
	 * Returns the meta object for the reference list '{@link polet.KronePerVolume#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Products</em>'.
	 * @see polet.KronePerVolume#getProducts()
	 * @see #getKronePerVolume()
	 * @generated
	 */
	EReference getKronePerVolume_Products();

	/**
	 * Returns the meta object for class '{@link polet.KronePerAlcohol <em>Krone Per Alcohol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Krone Per Alcohol</em>'.
	 * @see polet.KronePerAlcohol
	 * @generated
	 */
	EClass getKronePerAlcohol();

	/**
	 * Returns the meta object for the attribute '{@link polet.KronePerAlcohol#getDerivedNumber <em>Derived Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived Number</em>'.
	 * @see polet.KronePerAlcohol#getDerivedNumber()
	 * @see #getKronePerAlcohol()
	 * @generated
	 */
	EAttribute getKronePerAlcohol_DerivedNumber();

	/**
	 * Returns the meta object for the reference list '{@link polet.KronePerAlcohol#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Products</em>'.
	 * @see polet.KronePerAlcohol#getProducts()
	 * @see #getKronePerAlcohol()
	 * @generated
	 */
	EReference getKronePerAlcohol_Products();

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
		 * The meta object literal for the '<em><b>Countries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIES__COUNTRIES = eINSTANCE.getCategories_Countries();

		/**
		 * The meta object literal for the '<em><b>Product Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIES__PRODUCT_TYPES = eINSTANCE.getCategories_ProductTypes();

		/**
		 * The meta object literal for the '<em><b>Krone Per Volumes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIES__KRONE_PER_VOLUMES = eINSTANCE.getCategories_KronePerVolumes();

		/**
		 * The meta object literal for the '<em><b>Alcohol Per Krones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIES__ALCOHOL_PER_KRONES = eINSTANCE.getCategories_AlcoholPerKrones();

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
		 * The meta object literal for the '<em><b>Alcohol Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__ALCOHOL_CONTENT = eINSTANCE.getProduct_AlcoholContent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRICE = eINSTANCE.getProduct_Price();

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
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__VOLUME = eINSTANCE.getProduct_Volume();

		/**
		 * The meta object literal for the '<em><b>Alcohol Per Krone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__ALCOHOL_PER_KRONE = eINSTANCE.getProduct_AlcoholPerKrone();

		/**
		 * The meta object literal for the '<em><b>Krone Per Volume</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__KRONE_PER_VOLUME = eINSTANCE.getProduct_KronePerVolume();

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
		 * The meta object literal for the '{@link polet.impl.KronePerVolumeImpl <em>Krone Per Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polet.impl.KronePerVolumeImpl
		 * @see polet.impl.PoletPackageImpl#getKronePerVolume()
		 * @generated
		 */
		EClass KRONE_PER_VOLUME = eINSTANCE.getKronePerVolume();

		/**
		 * The meta object literal for the '<em><b>Derived Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KRONE_PER_VOLUME__DERIVED_NUMBER = eINSTANCE.getKronePerVolume_DerivedNumber();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KRONE_PER_VOLUME__PRODUCTS = eINSTANCE.getKronePerVolume_Products();

		/**
		 * The meta object literal for the '{@link polet.impl.KronePerAlcoholImpl <em>Krone Per Alcohol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polet.impl.KronePerAlcoholImpl
		 * @see polet.impl.PoletPackageImpl#getKronePerAlcohol()
		 * @generated
		 */
		EClass KRONE_PER_ALCOHOL = eINSTANCE.getKronePerAlcohol();

		/**
		 * The meta object literal for the '<em><b>Derived Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KRONE_PER_ALCOHOL__DERIVED_NUMBER = eINSTANCE.getKronePerAlcohol_DerivedNumber();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KRONE_PER_ALCOHOL__PRODUCTS = eINSTANCE.getKronePerAlcohol_Products();

	}

} //PoletPackage
