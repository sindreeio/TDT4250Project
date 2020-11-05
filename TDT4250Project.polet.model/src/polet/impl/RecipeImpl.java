/**
 */
package polet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import polet.MealType;
import polet.PoletPackage;
import polet.Recipe;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link polet.impl.RecipeImpl#getName <em>Name</em>}</li>
 *   <li>{@link polet.impl.RecipeImpl#getRecepieId <em>Recepie Id</em>}</li>
 *   <li>{@link polet.impl.RecipeImpl#getMealType <em>Meal Type</em>}</li>
 *   <li>{@link polet.impl.RecipeImpl#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecipeImpl extends MinimalEObjectImpl.Container implements Recipe {
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
	protected RecipeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PoletPackage.Literals.RECIPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.RECIPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.RECIPE__RECEPIE_ID, oldRecepieId, recepieId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MealType getMealType() {
		if (eContainerFeatureID() != PoletPackage.RECIPE__MEAL_TYPE) return null;
		return (MealType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMealType(MealType newMealType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMealType, PoletPackage.RECIPE__MEAL_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMealType(MealType newMealType) {
		if (newMealType != eInternalContainer() || (eContainerFeatureID() != PoletPackage.RECIPE__MEAL_TYPE && newMealType != null)) {
			if (EcoreUtil.isAncestor(this, newMealType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMealType != null)
				msgs = ((InternalEObject)newMealType).eInverseAdd(this, PoletPackage.MEAL_TYPE__RECIPIES, MealType.class, msgs);
			msgs = basicSetMealType(newMealType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.RECIPE__MEAL_TYPE, newMealType, newMealType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.RECIPE__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PoletPackage.RECIPE__MEAL_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMealType((MealType)otherEnd, msgs);
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
			case PoletPackage.RECIPE__MEAL_TYPE:
				return basicSetMealType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PoletPackage.RECIPE__MEAL_TYPE:
				return eInternalContainer().eInverseRemove(this, PoletPackage.MEAL_TYPE__RECIPIES, MealType.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PoletPackage.RECIPE__NAME:
				return getName();
			case PoletPackage.RECIPE__RECEPIE_ID:
				return getRecepieId();
			case PoletPackage.RECIPE__MEAL_TYPE:
				return getMealType();
			case PoletPackage.RECIPE__LINK:
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
			case PoletPackage.RECIPE__NAME:
				setName((String)newValue);
				return;
			case PoletPackage.RECIPE__RECEPIE_ID:
				setRecepieId((String)newValue);
				return;
			case PoletPackage.RECIPE__MEAL_TYPE:
				setMealType((MealType)newValue);
				return;
			case PoletPackage.RECIPE__LINK:
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
			case PoletPackage.RECIPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PoletPackage.RECIPE__RECEPIE_ID:
				setRecepieId(RECEPIE_ID_EDEFAULT);
				return;
			case PoletPackage.RECIPE__MEAL_TYPE:
				setMealType((MealType)null);
				return;
			case PoletPackage.RECIPE__LINK:
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
			case PoletPackage.RECIPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PoletPackage.RECIPE__RECEPIE_ID:
				return RECEPIE_ID_EDEFAULT == null ? recepieId != null : !RECEPIE_ID_EDEFAULT.equals(recepieId);
			case PoletPackage.RECIPE__MEAL_TYPE:
				return getMealType() != null;
			case PoletPackage.RECIPE__LINK:
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

} //RecipeImpl
