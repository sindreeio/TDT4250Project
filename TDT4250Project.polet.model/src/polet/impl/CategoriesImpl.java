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
import polet.MealType;
import polet.PoletPackage;
import polet.ProductType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Categories</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link polet.impl.CategoriesImpl#getCountries <em>Countries</em>}</li>
 *   <li>{@link polet.impl.CategoriesImpl#getProductTypes <em>Product Types</em>}</li>
 *   <li>{@link polet.impl.CategoriesImpl#getMealTypes <em>Meal Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoriesImpl extends MinimalEObjectImpl.Container implements Categories {
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
	 * The cached value of the '{@link #getMealTypes() <em>Meal Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMealTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MealType> mealTypes;

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
	public EList<MealType> getMealTypes() {
		if (mealTypes == null) {
			mealTypes = new EObjectContainmentEList<MealType>(MealType.class, this, PoletPackage.CATEGORIES__MEAL_TYPES);
		}
		return mealTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PoletPackage.CATEGORIES__COUNTRIES:
				return ((InternalEList<?>)getCountries()).basicRemove(otherEnd, msgs);
			case PoletPackage.CATEGORIES__PRODUCT_TYPES:
				return ((InternalEList<?>)getProductTypes()).basicRemove(otherEnd, msgs);
			case PoletPackage.CATEGORIES__MEAL_TYPES:
				return ((InternalEList<?>)getMealTypes()).basicRemove(otherEnd, msgs);
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
			case PoletPackage.CATEGORIES__COUNTRIES:
				return getCountries();
			case PoletPackage.CATEGORIES__PRODUCT_TYPES:
				return getProductTypes();
			case PoletPackage.CATEGORIES__MEAL_TYPES:
				return getMealTypes();
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
			case PoletPackage.CATEGORIES__COUNTRIES:
				getCountries().clear();
				getCountries().addAll((Collection<? extends Country>)newValue);
				return;
			case PoletPackage.CATEGORIES__PRODUCT_TYPES:
				getProductTypes().clear();
				getProductTypes().addAll((Collection<? extends ProductType>)newValue);
				return;
			case PoletPackage.CATEGORIES__MEAL_TYPES:
				getMealTypes().clear();
				getMealTypes().addAll((Collection<? extends MealType>)newValue);
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
			case PoletPackage.CATEGORIES__COUNTRIES:
				getCountries().clear();
				return;
			case PoletPackage.CATEGORIES__PRODUCT_TYPES:
				getProductTypes().clear();
				return;
			case PoletPackage.CATEGORIES__MEAL_TYPES:
				getMealTypes().clear();
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
			case PoletPackage.CATEGORIES__COUNTRIES:
				return countries != null && !countries.isEmpty();
			case PoletPackage.CATEGORIES__PRODUCT_TYPES:
				return productTypes != null && !productTypes.isEmpty();
			case PoletPackage.CATEGORIES__MEAL_TYPES:
				return mealTypes != null && !mealTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CategoriesImpl
