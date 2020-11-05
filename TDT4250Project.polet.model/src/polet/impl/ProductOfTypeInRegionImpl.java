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

import polet.PoletPackage;
import polet.Product;
import polet.ProductOfTypeInRegion;
import polet.ProductType;
import polet.Region;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Of Type In Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link polet.impl.ProductOfTypeInRegionImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link polet.impl.ProductOfTypeInRegionImpl#getProductType <em>Product Type</em>}</li>
 *   <li>{@link polet.impl.ProductOfTypeInRegionImpl#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductOfTypeInRegionImpl extends MinimalEObjectImpl.Container implements ProductOfTypeInRegion {
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
	 * The cached value of the '{@link #getProductType() <em>Product Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductType()
	 * @generated
	 * @ordered
	 */
	protected ProductType productType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductOfTypeInRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PoletPackage.Literals.PRODUCT_OF_TYPE_IN_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectWithInverseResolvingEList<Product>(Product.class, this, PoletPackage.PRODUCT_OF_TYPE_IN_REGION__PRODUCTS, PoletPackage.PRODUCT__REGION);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductType getProductType() {
		if (productType != null && productType.eIsProxy()) {
			InternalEObject oldProductType = (InternalEObject)productType;
			productType = (ProductType)eResolveProxy(oldProductType);
			if (productType != oldProductType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PoletPackage.PRODUCT_OF_TYPE_IN_REGION__PRODUCT_TYPE, oldProductType, productType));
			}
		}
		return productType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductType basicGetProductType() {
		return productType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductType(ProductType newProductType, NotificationChain msgs) {
		ProductType oldProductType = productType;
		productType = newProductType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT_OF_TYPE_IN_REGION__PRODUCT_TYPE, oldProductType, newProductType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductType(ProductType newProductType) {
		if (newProductType != productType) {
			NotificationChain msgs = null;
			if (productType != null)
				msgs = ((InternalEObject)productType).eInverseRemove(this, PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_IN_REGION, ProductType.class, msgs);
			if (newProductType != null)
				msgs = ((InternalEObject)newProductType).eInverseAdd(this, PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_IN_REGION, ProductType.class, msgs);
			msgs = basicSetProductType(newProductType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT_OF_TYPE_IN_REGION__PRODUCT_TYPE, newProductType, newProductType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getRegion() {
		if (eContainerFeatureID() != PoletPackage.PRODUCT_OF_TYPE_IN_REGION__REGION) return null;
		return (Region)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegion(Region newRegion, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRegion, PoletPackage.PRODUCT_OF_TYPE_IN_REGION__REGION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(Region newRegion) {
		if (newRegion != eInternalContainer() || (eContainerFeatureID() != PoletPackage.PRODUCT_OF_TYPE_IN_REGION__REGION && newRegion != null)) {
			if (EcoreUtil.isAncestor(this, newRegion))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRegion != null)
				msgs = ((InternalEObject)newRegion).eInverseAdd(this, PoletPackage.REGION__PRODUCTS, Region.class, msgs);
			msgs = basicSetRegion(newRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT_OF_TYPE_IN_REGION__REGION, newRegion, newRegion));
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
			case PoletPackage.PRODUCT_OF_TYPE_IN_REGION__PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducts()).basicAdd(otherEnd, msgs);
			case PoletPackage.PRODUCT_OF_TYPE_IN_REGION__PRODUCT_TYPE:
				if (productType != null)
					msgs = ((InternalEObject)productType).eInverseRemove(this, PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_IN_REGION, ProductType.class, msgs);
				return basicSetProductType((ProductType)otherEnd, msgs);
			case PoletPackage.PRODUCT_OF_TYPE_IN_REGION__REGION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRegion((Region)otherEnd, msgs);
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
			case PoletPackage.PRODUCT_OF_TYPE_IN_REGION__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
			case PoletPackage.PRODUCT_OF_TYPE_IN_REGION__PRODUCT_TYPE:
				return basicSetProductType(null, msgs);
			case PoletPackage.PRODUCT_OF_TYPE_IN_REGION__REGION:
				return basicSetRegion(null, msgs);
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
			case PoletPackage.PRODUCT_OF_TYPE_IN_REGION__REGION:
				return eInternalContainer().eInverseRemove(this, PoletPackage.REGION__PRODUCTS, Region.class, msgs);
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
			case PoletPackage.PRODUCT_OF_TYPE_IN_REGION__PRODUCTS:
				return getProducts();
			case PoletPackage.PRODUCT_OF_TYPE_IN_REGION__PRODUCT_TYPE:
				if (resolve) return getProductType();
				return basicGetProductType();
			case PoletPackage.PRODUCT_OF_TYPE_IN_REGION__REGION:
				return getRegion();
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
			case PoletPackage.PRODUCT_OF_TYPE_IN_REGION__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case PoletPackage.PRODUCT_OF_TYPE_IN_REGION__PRODUCT_TYPE:
				setProductType((ProductType)newValue);
				return;
			case PoletPackage.PRODUCT_OF_TYPE_IN_REGION__REGION:
				setRegion((Region)newValue);
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
			case PoletPackage.PRODUCT_OF_TYPE_IN_REGION__PRODUCTS:
				getProducts().clear();
				return;
			case PoletPackage.PRODUCT_OF_TYPE_IN_REGION__PRODUCT_TYPE:
				setProductType((ProductType)null);
				return;
			case PoletPackage.PRODUCT_OF_TYPE_IN_REGION__REGION:
				setRegion((Region)null);
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
			case PoletPackage.PRODUCT_OF_TYPE_IN_REGION__PRODUCTS:
				return products != null && !products.isEmpty();
			case PoletPackage.PRODUCT_OF_TYPE_IN_REGION__PRODUCT_TYPE:
				return productType != null;
			case PoletPackage.PRODUCT_OF_TYPE_IN_REGION__REGION:
				return getRegion() != null;
		}
		return super.eIsSet(featureID);
	}

} //ProductOfTypeInRegionImpl
