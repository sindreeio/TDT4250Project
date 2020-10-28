/**
 */
package polet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import polet.MealType;
import polet.PoletPackage;
import polet.Recepie;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recepie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link polet.impl.RecepieImpl#getName <em>Name</em>}</li>
 *   <li>{@link polet.impl.RecepieImpl#getRecepieId <em>Recepie Id</em>}</li>
 *   <li>{@link polet.impl.RecepieImpl#getMealType <em>Meal Type</em>}</li>
 *   <li>{@link polet.impl.RecepieImpl#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecepieImpl extends MinimalEObjectImpl.Container implements Recepie {
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
	 * The default value of the '{@link #getRecepieId() <em>Recepie Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecepieId()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEPIE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecepieId() <em>Recepie Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecepieId()
	 * @generated
	 * @ordered
	 */
	protected String recepieId = RECEPIE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMealType() <em>Meal Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMealType()
	 * @generated
	 * @ordered
	 */
	protected MealType mealType;

	/**
	 * The default value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected String link = LINK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecepieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PoletPackage.Literals.RECEPIE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.RECEPIE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecepieId() {
		return recepieId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecepieId(String newRecepieId) {
		String oldRecepieId = recepieId;
		recepieId = newRecepieId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.RECEPIE__RECEPIE_ID, oldRecepieId, recepieId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MealType getMealType() {
		if (mealType != null && mealType.eIsProxy()) {
			InternalEObject oldMealType = (InternalEObject)mealType;
			mealType = (MealType)eResolveProxy(oldMealType);
			if (mealType != oldMealType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PoletPackage.RECEPIE__MEAL_TYPE, oldMealType, mealType));
			}
		}
		return mealType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MealType basicGetMealType() {
		return mealType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMealType(MealType newMealType) {
		MealType oldMealType = mealType;
		mealType = newMealType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.RECEPIE__MEAL_TYPE, oldMealType, mealType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(String newLink) {
		String oldLink = link;
		link = newLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.RECEPIE__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PoletPackage.RECEPIE__NAME:
				return getName();
			case PoletPackage.RECEPIE__RECEPIE_ID:
				return getRecepieId();
			case PoletPackage.RECEPIE__MEAL_TYPE:
				if (resolve) return getMealType();
				return basicGetMealType();
			case PoletPackage.RECEPIE__LINK:
				return getLink();
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
			case PoletPackage.RECEPIE__NAME:
				setName((String)newValue);
				return;
			case PoletPackage.RECEPIE__RECEPIE_ID:
				setRecepieId((String)newValue);
				return;
			case PoletPackage.RECEPIE__MEAL_TYPE:
				setMealType((MealType)newValue);
				return;
			case PoletPackage.RECEPIE__LINK:
				setLink((String)newValue);
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
			case PoletPackage.RECEPIE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PoletPackage.RECEPIE__RECEPIE_ID:
				setRecepieId(RECEPIE_ID_EDEFAULT);
				return;
			case PoletPackage.RECEPIE__MEAL_TYPE:
				setMealType((MealType)null);
				return;
			case PoletPackage.RECEPIE__LINK:
				setLink(LINK_EDEFAULT);
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
			case PoletPackage.RECEPIE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PoletPackage.RECEPIE__RECEPIE_ID:
				return RECEPIE_ID_EDEFAULT == null ? recepieId != null : !RECEPIE_ID_EDEFAULT.equals(recepieId);
			case PoletPackage.RECEPIE__MEAL_TYPE:
				return mealType != null;
			case PoletPackage.RECEPIE__LINK:
				return LINK_EDEFAULT == null ? link != null : !LINK_EDEFAULT.equals(link);
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
		result.append(", recepieId: ");
		result.append(recepieId);
		result.append(", link: ");
		result.append(link);
		result.append(')');
		return result.toString();
	}

} //RecepieImpl
