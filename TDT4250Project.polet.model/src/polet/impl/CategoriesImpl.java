/**
 */
package polet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import polet.Categories;
import polet.Country;
import polet.KronePerAlcohol;
import polet.KronePerVolume;
import polet.PoletPackage;
import polet.Product;
import polet.ProductType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Categories</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link polet.impl.CategoriesImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link polet.impl.CategoriesImpl#getCountries <em>Countries</em>}</li>
 *   <li>{@link polet.impl.CategoriesImpl#getProductTypes <em>Product Types</em>}</li>
 *   <li>{@link polet.impl.CategoriesImpl#getKronePerVolumes <em>Krone Per Volumes</em>}</li>
 *   <li>{@link polet.impl.CategoriesImpl#getAlcoholPerKrones <em>Alcohol Per Krones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoriesImpl extends MinimalEObjectImpl.Container implements Categories {
	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> products;

	/**
	 * The cached value of the '{@link #getCountries() <em>Countries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountries()
	 * @generated
	 * @ordered
	 */
	protected EList<Country> countries;

	/**
	 * The cached value of the '{@link #getProductTypes() <em>Product Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductType> productTypes;

	/**
	 * The cached value of the '{@link #getKronePerVolumes() <em>Krone Per Volumes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKronePerVolumes()
	 * @generated
	 * @ordered
	 */
	protected EList<KronePerVolume> kronePerVolumes;

	/**
	 * The cached value of the '{@link #getAlcoholPerKrones() <em>Alcohol Per Krones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlcoholPerKrones()
	 * @generated
	 * @ordered
	 */
	protected EList<KronePerAlcohol> alcoholPerKrones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PoletPackage.Literals.CATEGORIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectContainmentEList<Product>(Product.class, this, PoletPackage.CATEGORIES__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Country> getCountries() {
		if (countries == null) {
			countries = new EObjectContainmentEList<Country>(Country.class, this, PoletPackage.CATEGORIES__COUNTRIES);
		}
		return countries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductType> getProductTypes() {
		if (productTypes == null) {
			productTypes = new EObjectContainmentEList<ProductType>(ProductType.class, this, PoletPackage.CATEGORIES__PRODUCT_TYPES);
		}
		return productTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KronePerVolume> getKronePerVolumes() {
		if (kronePerVolumes == null) {
			kronePerVolumes = new EObjectContainmentEList<KronePerVolume>(KronePerVolume.class, this, PoletPackage.CATEGORIES__KRONE_PER_VOLUMES);
		}
		return kronePerVolumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KronePerAlcohol> getAlcoholPerKrones() {
		if (alcoholPerKrones == null) {
			alcoholPerKrones = new EObjectContainmentEList<KronePerAlcohol>(KronePerAlcohol.class, this, PoletPackage.CATEGORIES__ALCOHOL_PER_KRONES);
		}
		return alcoholPerKrones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PoletPackage.CATEGORIES__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
			case PoletPackage.CATEGORIES__COUNTRIES:
				return ((InternalEList<?>)getCountries()).basicRemove(otherEnd, msgs);
			case PoletPackage.CATEGORIES__PRODUCT_TYPES:
				return ((InternalEList<?>)getProductTypes()).basicRemove(otherEnd, msgs);
			case PoletPackage.CATEGORIES__KRONE_PER_VOLUMES:
				return ((InternalEList<?>)getKronePerVolumes()).basicRemove(otherEnd, msgs);
			case PoletPackage.CATEGORIES__ALCOHOL_PER_KRONES:
				return ((InternalEList<?>)getAlcoholPerKrones()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PoletPackage.CATEGORIES__PRODUCTS:
				return getProducts();
			case PoletPackage.CATEGORIES__COUNTRIES:
				return getCountries();
			case PoletPackage.CATEGORIES__PRODUCT_TYPES:
				return getProductTypes();
			case PoletPackage.CATEGORIES__KRONE_PER_VOLUMES:
				return getKronePerVolumes();
			case PoletPackage.CATEGORIES__ALCOHOL_PER_KRONES:
				return getAlcoholPerKrones();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PoletPackage.CATEGORIES__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case PoletPackage.CATEGORIES__COUNTRIES:
				getCountries().clear();
				getCountries().addAll((Collection<? extends Country>)newValue);
				return;
			case PoletPackage.CATEGORIES__PRODUCT_TYPES:
				getProductTypes().clear();
				getProductTypes().addAll((Collection<? extends ProductType>)newValue);
				return;
			case PoletPackage.CATEGORIES__KRONE_PER_VOLUMES:
				getKronePerVolumes().clear();
				getKronePerVolumes().addAll((Collection<? extends KronePerVolume>)newValue);
				return;
			case PoletPackage.CATEGORIES__ALCOHOL_PER_KRONES:
				getAlcoholPerKrones().clear();
				getAlcoholPerKrones().addAll((Collection<? extends KronePerAlcohol>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PoletPackage.CATEGORIES__PRODUCTS:
				getProducts().clear();
				return;
			case PoletPackage.CATEGORIES__COUNTRIES:
				getCountries().clear();
				return;
			case PoletPackage.CATEGORIES__PRODUCT_TYPES:
				getProductTypes().clear();
				return;
			case PoletPackage.CATEGORIES__KRONE_PER_VOLUMES:
				getKronePerVolumes().clear();
				return;
			case PoletPackage.CATEGORIES__ALCOHOL_PER_KRONES:
				getAlcoholPerKrones().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PoletPackage.CATEGORIES__PRODUCTS:
				return products != null && !products.isEmpty();
			case PoletPackage.CATEGORIES__COUNTRIES:
				return countries != null && !countries.isEmpty();
			case PoletPackage.CATEGORIES__PRODUCT_TYPES:
				return productTypes != null && !productTypes.isEmpty();
			case PoletPackage.CATEGORIES__KRONE_PER_VOLUMES:
				return kronePerVolumes != null && !kronePerVolumes.isEmpty();
			case PoletPackage.CATEGORIES__ALCOHOL_PER_KRONES:
				return alcoholPerKrones != null && !alcoholPerKrones.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CategoriesImpl
