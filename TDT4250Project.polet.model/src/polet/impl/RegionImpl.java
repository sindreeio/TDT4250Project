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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import polet.Country;
import polet.PoletPackage;
import polet.ProductType;
import polet.Region;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link polet.impl.RegionImpl#getRegionId <em>Region Id</em>}</li>
 *   <li>{@link polet.impl.RegionImpl#getName <em>Name</em>}</li>
 *   <li>{@link polet.impl.RegionImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link polet.impl.RegionImpl#getProduces <em>Produces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionImpl extends MinimalEObjectImpl.Container implements Region {
	/**
	 * The default value of the '{@link #getRegionId() <em>Region Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionId()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRegionId() <em>Region Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionId()
	 * @generated
	 * @ordered
	 */
	protected String regionId = REGION_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getProduces() <em>Produces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductType> produces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PoletPackage.Literals.REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegionId() {
		return regionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionId(String newRegionId) {
		String oldRegionId = regionId;
		regionId = newRegionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.REGION__REGION_ID, oldRegionId, regionId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.REGION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country getCountry() {
		if (eContainerFeatureID() != PoletPackage.REGION__COUNTRY) return null;
		return (Country)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountry(Country newCountry, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCountry, PoletPackage.REGION__COUNTRY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(Country newCountry) {
		if (newCountry != eInternalContainer() || (eContainerFeatureID() != PoletPackage.REGION__COUNTRY && newCountry != null)) {
			if (EcoreUtil.isAncestor(this, newCountry))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCountry != null)
				msgs = ((InternalEObject)newCountry).eInverseAdd(this, PoletPackage.COUNTRY__REGIONS, Country.class, msgs);
			msgs = basicSetCountry(newCountry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.REGION__COUNTRY, newCountry, newCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductType> getProduces() {
		if (produces == null) {
			produces = new EObjectWithInverseResolvingEList.ManyInverse<ProductType>(ProductType.class, this, PoletPackage.REGION__PRODUCES, PoletPackage.PRODUCT_TYPE__PRODUCED_IN);
		}
		return produces;
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
			case PoletPackage.REGION__COUNTRY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCountry((Country)otherEnd, msgs);
			case PoletPackage.REGION__PRODUCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProduces()).basicAdd(otherEnd, msgs);
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
			case PoletPackage.REGION__COUNTRY:
				return basicSetCountry(null, msgs);
			case PoletPackage.REGION__PRODUCES:
				return ((InternalEList<?>)getProduces()).basicRemove(otherEnd, msgs);
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
			case PoletPackage.REGION__COUNTRY:
				return eInternalContainer().eInverseRemove(this, PoletPackage.COUNTRY__REGIONS, Country.class, msgs);
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
			case PoletPackage.REGION__REGION_ID:
				return getRegionId();
			case PoletPackage.REGION__NAME:
				return getName();
			case PoletPackage.REGION__COUNTRY:
				return getCountry();
			case PoletPackage.REGION__PRODUCES:
				return getProduces();
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
			case PoletPackage.REGION__REGION_ID:
				setRegionId((String)newValue);
				return;
			case PoletPackage.REGION__NAME:
				setName((String)newValue);
				return;
			case PoletPackage.REGION__COUNTRY:
				setCountry((Country)newValue);
				return;
			case PoletPackage.REGION__PRODUCES:
				getProduces().clear();
				getProduces().addAll((Collection<? extends ProductType>)newValue);
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
			case PoletPackage.REGION__REGION_ID:
				setRegionId(REGION_ID_EDEFAULT);
				return;
			case PoletPackage.REGION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PoletPackage.REGION__COUNTRY:
				setCountry((Country)null);
				return;
			case PoletPackage.REGION__PRODUCES:
				getProduces().clear();
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
			case PoletPackage.REGION__REGION_ID:
				return REGION_ID_EDEFAULT == null ? regionId != null : !REGION_ID_EDEFAULT.equals(regionId);
			case PoletPackage.REGION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PoletPackage.REGION__COUNTRY:
				return getCountry() != null;
			case PoletPackage.REGION__PRODUCES:
				return produces != null && !produces.isEmpty();
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
		result.append(" (regionId: ");
		result.append(regionId);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RegionImpl
