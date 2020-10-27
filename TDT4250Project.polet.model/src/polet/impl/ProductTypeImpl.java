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

import polet.PoletPackage;
import polet.Product;
import polet.ProductType;
import polet.Region;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link polet.impl.ProductTypeImpl#getProductTypeId <em>Product Type Id</em>}</li>
 *   <li>{@link polet.impl.ProductTypeImpl#getProductTypeName <em>Product Type Name</em>}</li>
 *   <li>{@link polet.impl.ProductTypeImpl#getProducedIn <em>Produced In</em>}</li>
 *   <li>{@link polet.impl.ProductTypeImpl#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductTypeImpl extends MinimalEObjectImpl.Container implements ProductType {
	/**
	 * The default value of the '{@link #getProductTypeId() <em>Product Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductTypeId() <em>Product Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductTypeId()
	 * @generated
	 * @ordered
	 */
	protected String productTypeId = PRODUCT_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductTypeName() <em>Product Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductTypeName() <em>Product Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductTypeName()
	 * @generated
	 * @ordered
	 */
	protected String productTypeName = PRODUCT_TYPE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProducedIn() <em>Produced In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> producedIn;

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
	protected ProductTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PoletPackage.Literals.PRODUCT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductTypeId() {
		return productTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductTypeId(String newProductTypeId) {
		String oldProductTypeId = productTypeId;
		productTypeId = newProductTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_ID, oldProductTypeId, productTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductTypeName() {
		return productTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductTypeName(String newProductTypeName) {
		String oldProductTypeName = productTypeName;
		productTypeName = newProductTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_NAME, oldProductTypeName, productTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getProducedIn() {
		if (producedIn == null) {
			producedIn = new EObjectWithInverseResolvingEList.ManyInverse<Region>(Region.class, this, PoletPackage.PRODUCT_TYPE__PRODUCED_IN, PoletPackage.REGION__PRODUCES);
		}
		return producedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectWithInverseResolvingEList<Product>(Product.class, this, PoletPackage.PRODUCT_TYPE__PRODUCTS, PoletPackage.PRODUCT__PRODUCT_TYPE);
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
			case PoletPackage.PRODUCT_TYPE__PRODUCED_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducedIn()).basicAdd(otherEnd, msgs);
			case PoletPackage.PRODUCT_TYPE__PRODUCTS:
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
			case PoletPackage.PRODUCT_TYPE__PRODUCED_IN:
				return ((InternalEList<?>)getProducedIn()).basicRemove(otherEnd, msgs);
			case PoletPackage.PRODUCT_TYPE__PRODUCTS:
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
			case PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_ID:
				return getProductTypeId();
			case PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_NAME:
				return getProductTypeName();
			case PoletPackage.PRODUCT_TYPE__PRODUCED_IN:
				return getProducedIn();
			case PoletPackage.PRODUCT_TYPE__PRODUCTS:
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
			case PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_ID:
				setProductTypeId((String)newValue);
				return;
			case PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_NAME:
				setProductTypeName((String)newValue);
				return;
			case PoletPackage.PRODUCT_TYPE__PRODUCED_IN:
				getProducedIn().clear();
				getProducedIn().addAll((Collection<? extends Region>)newValue);
				return;
			case PoletPackage.PRODUCT_TYPE__PRODUCTS:
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
			case PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_ID:
				setProductTypeId(PRODUCT_TYPE_ID_EDEFAULT);
				return;
			case PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_NAME:
				setProductTypeName(PRODUCT_TYPE_NAME_EDEFAULT);
				return;
			case PoletPackage.PRODUCT_TYPE__PRODUCED_IN:
				getProducedIn().clear();
				return;
			case PoletPackage.PRODUCT_TYPE__PRODUCTS:
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
			case PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_ID:
				return PRODUCT_TYPE_ID_EDEFAULT == null ? productTypeId != null : !PRODUCT_TYPE_ID_EDEFAULT.equals(productTypeId);
			case PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_NAME:
				return PRODUCT_TYPE_NAME_EDEFAULT == null ? productTypeName != null : !PRODUCT_TYPE_NAME_EDEFAULT.equals(productTypeName);
			case PoletPackage.PRODUCT_TYPE__PRODUCED_IN:
				return producedIn != null && !producedIn.isEmpty();
			case PoletPackage.PRODUCT_TYPE__PRODUCTS:
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
		result.append(" (productTypeId: ");
		result.append(productTypeId);
		result.append(", productTypeName: ");
		result.append(productTypeName);
		result.append(')');
		return result.toString();
	}

} //ProductTypeImpl
