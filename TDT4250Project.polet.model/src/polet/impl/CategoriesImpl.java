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

import polet.AlcoholContent;
import polet.Categories;
import polet.Country;
import polet.PoletPackage;
import polet.Price;
import polet.Product;
import polet.ProductType;
import polet.Volume;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Categories</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link polet.impl.CategoriesImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link polet.impl.CategoriesImpl#getAlcoholContents <em>Alcohol Contents</em>}</li>
 *   <li>{@link polet.impl.CategoriesImpl#getCountries <em>Countries</em>}</li>
 *   <li>{@link polet.impl.CategoriesImpl#getPrices <em>Prices</em>}</li>
 *   <li>{@link polet.impl.CategoriesImpl#getProductTypes <em>Product Types</em>}</li>
 *   <li>{@link polet.impl.CategoriesImpl#getVolumes <em>Volumes</em>}</li>
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
	 * The cached value of the '{@link #getAlcoholContents() <em>Alcohol Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlcoholContents()
	 * @generated
	 * @ordered
	 */
	protected EList<AlcoholContent> alcoholContents;

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
	 * The cached value of the '{@link #getPrices() <em>Prices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrices()
	 * @generated
	 * @ordered
	 */
	protected EList<Price> prices;

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
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected EList<Volume> volumes;

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
	public EList<AlcoholContent> getAlcoholContents() {
		if (alcoholContents == null) {
			alcoholContents = new EObjectContainmentEList<AlcoholContent>(AlcoholContent.class, this, PoletPackage.CATEGORIES__ALCOHOL_CONTENTS);
		}
		return alcoholContents;
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
	public EList<Price> getPrices() {
		if (prices == null) {
			prices = new EObjectContainmentEList<Price>(Price.class, this, PoletPackage.CATEGORIES__PRICES);
		}
		return prices;
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
	public EList<Volume> getVolumes() {
		if (volumes == null) {
			volumes = new EObjectContainmentEList<Volume>(Volume.class, this, PoletPackage.CATEGORIES__VOLUMES);
		}
		return volumes;
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
			case PoletPackage.CATEGORIES__ALCOHOL_CONTENTS:
				return ((InternalEList<?>)getAlcoholContents()).basicRemove(otherEnd, msgs);
			case PoletPackage.CATEGORIES__COUNTRIES:
				return ((InternalEList<?>)getCountries()).basicRemove(otherEnd, msgs);
			case PoletPackage.CATEGORIES__PRICES:
				return ((InternalEList<?>)getPrices()).basicRemove(otherEnd, msgs);
			case PoletPackage.CATEGORIES__PRODUCT_TYPES:
				return ((InternalEList<?>)getProductTypes()).basicRemove(otherEnd, msgs);
			case PoletPackage.CATEGORIES__VOLUMES:
				return ((InternalEList<?>)getVolumes()).basicRemove(otherEnd, msgs);
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
			case PoletPackage.CATEGORIES__ALCOHOL_CONTENTS:
				return getAlcoholContents();
			case PoletPackage.CATEGORIES__COUNTRIES:
				return getCountries();
			case PoletPackage.CATEGORIES__PRICES:
				return getPrices();
			case PoletPackage.CATEGORIES__PRODUCT_TYPES:
				return getProductTypes();
			case PoletPackage.CATEGORIES__VOLUMES:
				return getVolumes();
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
			case PoletPackage.CATEGORIES__ALCOHOL_CONTENTS:
				getAlcoholContents().clear();
				getAlcoholContents().addAll((Collection<? extends AlcoholContent>)newValue);
				return;
			case PoletPackage.CATEGORIES__COUNTRIES:
				getCountries().clear();
				getCountries().addAll((Collection<? extends Country>)newValue);
				return;
			case PoletPackage.CATEGORIES__PRICES:
				getPrices().clear();
				getPrices().addAll((Collection<? extends Price>)newValue);
				return;
			case PoletPackage.CATEGORIES__PRODUCT_TYPES:
				getProductTypes().clear();
				getProductTypes().addAll((Collection<? extends ProductType>)newValue);
				return;
			case PoletPackage.CATEGORIES__VOLUMES:
				getVolumes().clear();
				getVolumes().addAll((Collection<? extends Volume>)newValue);
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
			case PoletPackage.CATEGORIES__ALCOHOL_CONTENTS:
				getAlcoholContents().clear();
				return;
			case PoletPackage.CATEGORIES__COUNTRIES:
				getCountries().clear();
				return;
			case PoletPackage.CATEGORIES__PRICES:
				getPrices().clear();
				return;
			case PoletPackage.CATEGORIES__PRODUCT_TYPES:
				getProductTypes().clear();
				return;
			case PoletPackage.CATEGORIES__VOLUMES:
				getVolumes().clear();
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
			case PoletPackage.CATEGORIES__ALCOHOL_CONTENTS:
				return alcoholContents != null && !alcoholContents.isEmpty();
			case PoletPackage.CATEGORIES__COUNTRIES:
				return countries != null && !countries.isEmpty();
			case PoletPackage.CATEGORIES__PRICES:
				return prices != null && !prices.isEmpty();
			case PoletPackage.CATEGORIES__PRODUCT_TYPES:
				return productTypes != null && !productTypes.isEmpty();
			case PoletPackage.CATEGORIES__VOLUMES:
				return volumes != null && !volumes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CategoriesImpl
