/**
 */
package polet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	 * The feature id for the '<em><b>Countries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES__COUNTRIES = 0;

	/**
	 * The feature id for the '<em><b>Product Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES__PRODUCT_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Meal Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES__MEAL_TYPES = 2;

	/**
	 * The number of structural features of the '<em>Categories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Product Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRICE = 3;

	/**
	 * The feature id for the '<em><b>Alcohol Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ALCOHOL_CONTENT = 4;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__VOLUME = 5;

	/**
	 * The feature id for the '<em><b>Meal Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__MEAL_TYPES = 6;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__REGION = 7;

	/**
	 * The feature id for the '<em><b>Price Per Alcohol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRICE_PER_ALCOHOL = 8;

	/**
	 * The feature id for the '<em><b>Price Per Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRICE_PER_VOLUME = 9;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 10;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = 1;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Country</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__COUNTRY = 2;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__PRODUCTS = 3;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__PRODUCTS = 2;

	/**
	 * The feature id for the '<em><b>Product Type In Meal Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__PRODUCT_TYPE_IN_MEAL_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Product Type In Region</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__PRODUCT_TYPE_IN_REGION = 4;

	/**
	 * The number of structural features of the '<em>Product Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Product Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link polet.impl.MealTypeImpl <em>Meal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polet.impl.MealTypeImpl
	 * @see polet.impl.PoletPackageImpl#getMealType()
	 * @generated
	 */
	int MEAL_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Recipies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL_TYPE__RECIPIES = 1;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL_TYPE__PRODUCTS = 2;

	/**
	 * The number of structural features of the '<em>Meal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Meal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link polet.impl.RecipeImpl <em>Recipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polet.impl.RecipeImpl
	 * @see polet.impl.PoletPackageImpl#getRecipe()
	 * @generated
	 */
	int RECIPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Recepie Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__RECEPIE_ID = 1;

	/**
	 * The feature id for the '<em><b>Meal Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__MEAL_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE__LINK = 3;

	/**
	 * The number of structural features of the '<em>Recipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Recipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link polet.impl.ProductOfTypeInMealTypeImpl <em>Product Of Type In Meal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polet.impl.ProductOfTypeInMealTypeImpl
	 * @see polet.impl.PoletPackageImpl#getProductOfTypeInMealType()
	 * @generated
	 */
	int PRODUCT_OF_TYPE_IN_MEAL_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Meal Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OF_TYPE_IN_MEAL_TYPE__MEAL_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OF_TYPE_IN_MEAL_TYPE__PRODUCTS = 1;

	/**
	 * The feature id for the '<em><b>Product Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OF_TYPE_IN_MEAL_TYPE__PRODUCT_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Product Of Type In Meal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OF_TYPE_IN_MEAL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Product Of Type In Meal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OF_TYPE_IN_MEAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link polet.impl.ProductOfTypeInRegionImpl <em>Product Of Type In Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see polet.impl.ProductOfTypeInRegionImpl
	 * @see polet.impl.PoletPackageImpl#getProductOfTypeInRegion()
	 * @generated
	 */
	int PRODUCT_OF_TYPE_IN_REGION = 8;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OF_TYPE_IN_REGION__PRODUCTS = 0;

	/**
	 * The feature id for the '<em><b>Product Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OF_TYPE_IN_REGION__PRODUCT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Region</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OF_TYPE_IN_REGION__REGION = 2;

	/**
	 * The number of structural features of the '<em>Product Of Type In Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OF_TYPE_IN_REGION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Product Of Type In Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OF_TYPE_IN_REGION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Meal Types</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see polet.impl.PoletPackageImpl#getMealTypes()
	 * @generated
	 */
	int MEAL_TYPES = 9;

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
	 * Returns the meta object for the containment reference list '{@link polet.Categories#getMealTypes <em>Meal Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Meal Types</em>'.
	 * @see polet.Categories#getMealTypes()
	 * @see #getCategories()
	 * @generated
	 */
	EReference getCategories_MealTypes();

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
	 * Returns the meta object for the reference '{@link polet.Product#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region</em>'.
	 * @see polet.Product#getRegion()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Region();

	/**
	 * Returns the meta object for the attribute '{@link polet.Product#getPricePerAlcohol <em>Price Per Alcohol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Per Alcohol</em>'.
	 * @see polet.Product#getPricePerAlcohol()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_PricePerAlcohol();

	/**
	 * Returns the meta object for the attribute '{@link polet.Product#getPricePerVolume <em>Price Per Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Per Volume</em>'.
	 * @see polet.Product#getPricePerVolume()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_PricePerVolume();

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
	 * Returns the meta object for the container reference '{@link polet.Product#getProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Product Type</em>'.
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
	 * Returns the meta object for the reference list '{@link polet.Product#getMealTypes <em>Meal Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meal Types</em>'.
	 * @see polet.Product#getMealTypes()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_MealTypes();

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
	 * Returns the meta object for the attribute '{@link polet.Country#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see polet.Country#getName()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Name();

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
	 * Returns the meta object for the attribute '{@link polet.Region#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see polet.Region#getName()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_Name();

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
	 * Returns the meta object for the containment reference list '{@link polet.Region#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see polet.Region#getProducts()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Products();

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
	 * Returns the meta object for the attribute '{@link polet.ProductType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see polet.ProductType#getName()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link polet.ProductType#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see polet.ProductType#getProducts()
	 * @see #getProductType()
	 * @generated
	 */
	EReference getProductType_Products();

	/**
	 * Returns the meta object for the reference list '{@link polet.ProductType#getProductTypeInMealType <em>Product Type In Meal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Type In Meal Type</em>'.
	 * @see polet.ProductType#getProductTypeInMealType()
	 * @see #getProductType()
	 * @generated
	 */
	EReference getProductType_ProductTypeInMealType();

	/**
	 * Returns the meta object for the reference list '{@link polet.ProductType#getProductTypeInRegion <em>Product Type In Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Type In Region</em>'.
	 * @see polet.ProductType#getProductTypeInRegion()
	 * @see #getProductType()
	 * @generated
	 */
	EReference getProductType_ProductTypeInRegion();

	/**
	 * Returns the meta object for class '{@link polet.MealType <em>Meal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meal Type</em>'.
	 * @see polet.MealType
	 * @generated
	 */
	EClass getMealType();

	/**
	 * Returns the meta object for the attribute '{@link polet.MealType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see polet.MealType#getName()
	 * @see #getMealType()
	 * @generated
	 */
	EAttribute getMealType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link polet.MealType#getRecipies <em>Recipies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recipies</em>'.
	 * @see polet.MealType#getRecipies()
	 * @see #getMealType()
	 * @generated
	 */
	EReference getMealType_Recipies();

	/**
	 * Returns the meta object for the containment reference list '{@link polet.MealType#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see polet.MealType#getProducts()
	 * @see #getMealType()
	 * @generated
	 */
	EReference getMealType_Products();

	/**
	 * Returns the meta object for class '{@link polet.Recipe <em>Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recipe</em>'.
	 * @see polet.Recipe
	 * @generated
	 */
	EClass getRecipe();

	/**
	 * Returns the meta object for the attribute '{@link polet.Recipe#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see polet.Recipe#getName()
	 * @see #getRecipe()
	 * @generated
	 */
	EAttribute getRecipe_Name();

	/**
	 * Returns the meta object for the attribute '{@link polet.Recipe#getRecepieId <em>Recepie Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recepie Id</em>'.
	 * @see polet.Recipe#getRecepieId()
	 * @see #getRecipe()
	 * @generated
	 */
	EAttribute getRecipe_RecepieId();

	/**
	 * Returns the meta object for the container reference '{@link polet.Recipe#getMealType <em>Meal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Meal Type</em>'.
	 * @see polet.Recipe#getMealType()
	 * @see #getRecipe()
	 * @generated
	 */
	EReference getRecipe_MealType();

	/**
	 * Returns the meta object for the attribute '{@link polet.Recipe#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see polet.Recipe#getLink()
	 * @see #getRecipe()
	 * @generated
	 */
	EAttribute getRecipe_Link();

	/**
	 * Returns the meta object for class '{@link polet.ProductOfTypeInMealType <em>Product Of Type In Meal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Of Type In Meal Type</em>'.
	 * @see polet.ProductOfTypeInMealType
	 * @generated
	 */
	EClass getProductOfTypeInMealType();

	/**
	 * Returns the meta object for the container reference '{@link polet.ProductOfTypeInMealType#getMealType <em>Meal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Meal Type</em>'.
	 * @see polet.ProductOfTypeInMealType#getMealType()
	 * @see #getProductOfTypeInMealType()
	 * @generated
	 */
	EReference getProductOfTypeInMealType_MealType();

	/**
	 * Returns the meta object for the reference list '{@link polet.ProductOfTypeInMealType#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Products</em>'.
	 * @see polet.ProductOfTypeInMealType#getProducts()
	 * @see #getProductOfTypeInMealType()
	 * @generated
	 */
	EReference getProductOfTypeInMealType_Products();

	/**
	 * Returns the meta object for the reference '{@link polet.ProductOfTypeInMealType#getProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Type</em>'.
	 * @see polet.ProductOfTypeInMealType#getProductType()
	 * @see #getProductOfTypeInMealType()
	 * @generated
	 */
	EReference getProductOfTypeInMealType_ProductType();

	/**
	 * Returns the meta object for class '{@link polet.ProductOfTypeInRegion <em>Product Of Type In Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Of Type In Region</em>'.
	 * @see polet.ProductOfTypeInRegion
	 * @generated
	 */
	EClass getProductOfTypeInRegion();

	/**
	 * Returns the meta object for the reference list '{@link polet.ProductOfTypeInRegion#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Products</em>'.
	 * @see polet.ProductOfTypeInRegion#getProducts()
	 * @see #getProductOfTypeInRegion()
	 * @generated
	 */
	EReference getProductOfTypeInRegion_Products();

	/**
	 * Returns the meta object for the reference '{@link polet.ProductOfTypeInRegion#getProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Type</em>'.
	 * @see polet.ProductOfTypeInRegion#getProductType()
	 * @see #getProductOfTypeInRegion()
	 * @generated
	 */
	EReference getProductOfTypeInRegion_ProductType();

	/**
	 * Returns the meta object for the container reference '{@link polet.ProductOfTypeInRegion#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Region</em>'.
	 * @see polet.ProductOfTypeInRegion#getRegion()
	 * @see #getProductOfTypeInRegion()
	 * @generated
	 */
	EReference getProductOfTypeInRegion_Region();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Meal Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Meal Types</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="enumeration='Ost Skalldyr Storvilt Lyst%20kj\370tt Sm\345vilt%20og%20fugl Dessert,%20kake,%20frukt Svinekj\370tt Fisk Storfe Aperitiff/avec Gr\370nnsaker Lam%20og%20sau'"
	 * @generated
	 */
	EDataType getMealTypes();

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
		 * The meta object literal for the '<em><b>Meal Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIES__MEAL_TYPES = eINSTANCE.getCategories_MealTypes();

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
		 * The meta object literal for the '<em><b>Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__REGION = eINSTANCE.getProduct_Region();

		/**
		 * The meta object literal for the '<em><b>Price Per Alcohol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRICE_PER_ALCOHOL = eINSTANCE.getProduct_PricePerAlcohol();

		/**
		 * The meta object literal for the '<em><b>Price Per Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRICE_PER_VOLUME = eINSTANCE.getProduct_PricePerVolume();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRICE = eINSTANCE.getProduct_Price();

		/**
		 * The meta object literal for the '<em><b>Product Type</b></em>' container reference feature.
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
		 * The meta object literal for the '<em><b>Meal Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__MEAL_TYPES = eINSTANCE.getProduct_MealTypes();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__NAME = eINSTANCE.getCountry_Name();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__NAME = eINSTANCE.getRegion_Name();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__COUNTRY = eINSTANCE.getRegion_Country();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__PRODUCTS = eINSTANCE.getRegion_Products();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TYPE__NAME = eINSTANCE.getProductType_Name();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_TYPE__PRODUCTS = eINSTANCE.getProductType_Products();

		/**
		 * The meta object literal for the '<em><b>Product Type In Meal Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_TYPE__PRODUCT_TYPE_IN_MEAL_TYPE = eINSTANCE.getProductType_ProductTypeInMealType();

		/**
		 * The meta object literal for the '<em><b>Product Type In Region</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_TYPE__PRODUCT_TYPE_IN_REGION = eINSTANCE.getProductType_ProductTypeInRegion();

		/**
		 * The meta object literal for the '{@link polet.impl.MealTypeImpl <em>Meal Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polet.impl.MealTypeImpl
		 * @see polet.impl.PoletPackageImpl#getMealType()
		 * @generated
		 */
		EClass MEAL_TYPE = eINSTANCE.getMealType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEAL_TYPE__NAME = eINSTANCE.getMealType_Name();

		/**
		 * The meta object literal for the '<em><b>Recipies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEAL_TYPE__RECIPIES = eINSTANCE.getMealType_Recipies();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEAL_TYPE__PRODUCTS = eINSTANCE.getMealType_Products();

		/**
		 * The meta object literal for the '{@link polet.impl.RecipeImpl <em>Recipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polet.impl.RecipeImpl
		 * @see polet.impl.PoletPackageImpl#getRecipe()
		 * @generated
		 */
		EClass RECIPE = eINSTANCE.getRecipe();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE__NAME = eINSTANCE.getRecipe_Name();

		/**
		 * The meta object literal for the '<em><b>Recepie Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE__RECEPIE_ID = eINSTANCE.getRecipe_RecepieId();

		/**
		 * The meta object literal for the '<em><b>Meal Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPE__MEAL_TYPE = eINSTANCE.getRecipe_MealType();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECIPE__LINK = eINSTANCE.getRecipe_Link();

		/**
		 * The meta object literal for the '{@link polet.impl.ProductOfTypeInMealTypeImpl <em>Product Of Type In Meal Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polet.impl.ProductOfTypeInMealTypeImpl
		 * @see polet.impl.PoletPackageImpl#getProductOfTypeInMealType()
		 * @generated
		 */
		EClass PRODUCT_OF_TYPE_IN_MEAL_TYPE = eINSTANCE.getProductOfTypeInMealType();

		/**
		 * The meta object literal for the '<em><b>Meal Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_OF_TYPE_IN_MEAL_TYPE__MEAL_TYPE = eINSTANCE.getProductOfTypeInMealType_MealType();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_OF_TYPE_IN_MEAL_TYPE__PRODUCTS = eINSTANCE.getProductOfTypeInMealType_Products();

		/**
		 * The meta object literal for the '<em><b>Product Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_OF_TYPE_IN_MEAL_TYPE__PRODUCT_TYPE = eINSTANCE.getProductOfTypeInMealType_ProductType();

		/**
		 * The meta object literal for the '{@link polet.impl.ProductOfTypeInRegionImpl <em>Product Of Type In Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see polet.impl.ProductOfTypeInRegionImpl
		 * @see polet.impl.PoletPackageImpl#getProductOfTypeInRegion()
		 * @generated
		 */
		EClass PRODUCT_OF_TYPE_IN_REGION = eINSTANCE.getProductOfTypeInRegion();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_OF_TYPE_IN_REGION__PRODUCTS = eINSTANCE.getProductOfTypeInRegion_Products();

		/**
		 * The meta object literal for the '<em><b>Product Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_OF_TYPE_IN_REGION__PRODUCT_TYPE = eINSTANCE.getProductOfTypeInRegion_ProductType();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_OF_TYPE_IN_REGION__REGION = eINSTANCE.getProductOfTypeInRegion_Region();

		/**
		 * The meta object literal for the '<em>Meal Types</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see polet.impl.PoletPackageImpl#getMealTypes()
		 * @generated
		 */
		EDataType MEAL_TYPES = eINSTANCE.getMealTypes();

	}

} //PoletPackage
