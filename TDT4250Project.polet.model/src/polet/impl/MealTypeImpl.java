/**
 */
package polet.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import polet.MealType;
import polet.PoletPackage;
import polet.ProductOfTypeInMealType;
import polet.Recipe;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meal Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link polet.impl.MealTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link polet.impl.MealTypeImpl#getRecipies <em>Recipies</em>}</li>
 *   <li>{@link polet.impl.MealTypeImpl#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MealTypeImpl extends MinimalEObjectImpl.Container implements MealType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecipies() <em>Recipies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipies()
	 * @generated
	 * @ordered
	 */
	protected EList<Recipe> recipies;

	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductOfTypeInMealType> products;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MealTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PoletPackage.Literals.MEAL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.MEAL_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Recipe> getRecipies() {
		if (recipies == null) {
			recipies = new EObjectContainmentWithInverseEList<Recipe>(Recipe.class, this, PoletPackage.MEAL_TYPE__RECIPIES, PoletPackage.RECIPE__MEAL_TYPE);
		}
		return recipies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductOfTypeInMealType> getProducts() {
		if (products == null) {
			products = new EObjectContainmentWithInverseEList<ProductOfTypeInMealType>(ProductOfTypeInMealType.class, this, PoletPackage.MEAL_TYPE__PRODUCTS, PoletPackage.PRODUCT_OF_TYPE_IN_MEAL_TYPE__MEAL_TYPE);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PoletPackage.MEAL_TYPE__RECIPIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRecipies()).basicAdd(otherEnd, msgs);
			case PoletPackage.MEAL_TYPE__PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducts()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PoletPackage.MEAL_TYPE__RECIPIES:
				return ((InternalEList<?>)getRecipies()).basicRemove(otherEnd, msgs);
			case PoletPackage.MEAL_TYPE__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
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
			case PoletPackage.MEAL_TYPE__NAME:
				return getName();
			case PoletPackage.MEAL_TYPE__RECIPIES:
				return getRecipies();
			case PoletPackage.MEAL_TYPE__PRODUCTS:
				return getProducts();
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
			case PoletPackage.MEAL_TYPE__NAME:
				setName((String)newValue);
				return;
			case PoletPackage.MEAL_TYPE__RECIPIES:
				getRecipies().clear();
				getRecipies().addAll((Collection<? extends Recipe>)newValue);
				return;
			case PoletPackage.MEAL_TYPE__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends ProductOfTypeInMealType>)newValue);
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
			case PoletPackage.MEAL_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PoletPackage.MEAL_TYPE__RECIPIES:
				getRecipies().clear();
				return;
			case PoletPackage.MEAL_TYPE__PRODUCTS:
				getProducts().clear();
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
			case PoletPackage.MEAL_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PoletPackage.MEAL_TYPE__RECIPIES:
				return recipies != null && !recipies.isEmpty();
			case PoletPackage.MEAL_TYPE__PRODUCTS:
				return products != null && !products.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MealTypeImpl
