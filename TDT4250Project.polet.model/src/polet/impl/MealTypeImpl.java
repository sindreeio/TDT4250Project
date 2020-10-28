/**
 */
package polet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import polet.MealType;
import polet.PoletPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meal Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link polet.impl.MealTypeImpl#getMealTypes <em>Meal Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MealTypeImpl extends MinimalEObjectImpl.Container implements MealType {
	/**
	 * The default value of the '{@link #getMealTypes() <em>Meal Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMealTypes()
	 * @generated
	 * @ordered
	 */
	protected static final String MEAL_TYPES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMealTypes() <em>Meal Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMealTypes()
	 * @generated
	 * @ordered
	 */
	protected String mealTypes = MEAL_TYPES_EDEFAULT;

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
	public String getMealTypes() {
		return mealTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMealTypes(String newMealTypes) {
		String oldMealTypes = mealTypes;
		mealTypes = newMealTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.MEAL_TYPE__MEAL_TYPES, oldMealTypes, mealTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PoletPackage.MEAL_TYPE__MEAL_TYPES:
				return getMealTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PoletPackage.MEAL_TYPE__MEAL_TYPES:
				setMealTypes((String)newValue);
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
			case PoletPackage.MEAL_TYPE__MEAL_TYPES:
				setMealTypes(MEAL_TYPES_EDEFAULT);
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
			case PoletPackage.MEAL_TYPE__MEAL_TYPES:
				return MEAL_TYPES_EDEFAULT == null ? mealTypes != null : !MEAL_TYPES_EDEFAULT.equals(mealTypes);
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
		result.append(" (mealTypes: ");
		result.append(mealTypes);
		result.append(')');
		return result.toString();
	}

} //MealTypeImpl
