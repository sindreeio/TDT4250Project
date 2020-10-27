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
import org.eclipse.emf.ecore.util.InternalEList;

import polet.KronePerAlcohol;
import polet.PoletPackage;
import polet.Product;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Krone Per Alcohol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link polet.impl.KronePerAlcoholImpl#getDerivedNumber <em>Derived Number</em>}</li>
 *   <li>{@link polet.impl.KronePerAlcoholImpl#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KronePerAlcoholImpl extends MinimalEObjectImpl.Container implements KronePerAlcohol {
	/**
	 * The default value of the '{@link #getDerivedNumber() <em>Derived Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedNumber()
	 * @generated
	 * @ordered
	 */
	protected static final float DERIVED_NUMBER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDerivedNumber() <em>Derived Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedNumber()
	 * @generated
	 * @ordered
	 */
	protected float derivedNumber = DERIVED_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> products;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KronePerAlcoholImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PoletPackage.Literals.KRONE_PER_ALCOHOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDerivedNumber() {
		return derivedNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedNumber(float newDerivedNumber) {
		float oldDerivedNumber = derivedNumber;
		derivedNumber = newDerivedNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.KRONE_PER_ALCOHOL__DERIVED_NUMBER, oldDerivedNumber, derivedNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectWithInverseResolvingEList<Product>(Product.class, this, PoletPackage.KRONE_PER_ALCOHOL__PRODUCTS, PoletPackage.PRODUCT__ALCOHOL_PER_KRONE);
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
			case PoletPackage.KRONE_PER_ALCOHOL__PRODUCTS:
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
			case PoletPackage.KRONE_PER_ALCOHOL__PRODUCTS:
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
			case PoletPackage.KRONE_PER_ALCOHOL__DERIVED_NUMBER:
				return getDerivedNumber();
			case PoletPackage.KRONE_PER_ALCOHOL__PRODUCTS:
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
			case PoletPackage.KRONE_PER_ALCOHOL__DERIVED_NUMBER:
				setDerivedNumber((Float)newValue);
				return;
			case PoletPackage.KRONE_PER_ALCOHOL__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends Product>)newValue);
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
			case PoletPackage.KRONE_PER_ALCOHOL__DERIVED_NUMBER:
				setDerivedNumber(DERIVED_NUMBER_EDEFAULT);
				return;
			case PoletPackage.KRONE_PER_ALCOHOL__PRODUCTS:
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
			case PoletPackage.KRONE_PER_ALCOHOL__DERIVED_NUMBER:
				return derivedNumber != DERIVED_NUMBER_EDEFAULT;
			case PoletPackage.KRONE_PER_ALCOHOL__PRODUCTS:
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
		result.append(" (derivedNumber: ");
		result.append(derivedNumber);
		result.append(')');
		return result.toString();
	}

} //KronePerAlcoholImpl
