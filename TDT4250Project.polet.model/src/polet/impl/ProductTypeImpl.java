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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import polet.PoletPackage;
import polet.Product;
import polet.ProductOfTypeInMealType;
import polet.ProductOfTypeInRegion;
import polet.ProductType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link polet.impl.ProductTypeImpl#getProductTypeId <em>Product Type Id</em>}</li>
 *   <li>{@link polet.impl.ProductTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link polet.impl.ProductTypeImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link polet.impl.ProductTypeImpl#getProductTypeInMealType <em>Product Type In Meal Type</em>}</li>
 *   <li>{@link polet.impl.ProductTypeImpl#getProductTypeInRegion <em>Product Type In Region</em>}</li>
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
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> products;

	/**
	 * The cached value of the '{@link #getProductTypeInMealType() <em>Product Type In Meal Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductTypeInMealType()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductOfTypeInMealType> productTypeInMealType;

	/**
	 * The cached value of the '{@link #getProductTypeInRegion() <em>Product Type In Region</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductTypeInRegion()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductOfTypeInRegion> productTypeInRegion;

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
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectContainmentWithInverseEList<Product>(Product.class, this, PoletPackage.PRODUCT_TYPE__PRODUCTS, PoletPackage.PRODUCT__PRODUCT_TYPE);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductOfTypeInMealType> getProductTypeInMealType() {
		if (productTypeInMealType == null) {
			productTypeInMealType = new EObjectWithInverseResolvingEList<ProductOfTypeInMealType>(ProductOfTypeInMealType.class, this, PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_IN_MEAL_TYPE, PoletPackage.PRODUCT_OF_TYPE_IN_MEAL_TYPE__PRODUCT_TYPE);
		}
		return productTypeInMealType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductOfTypeInRegion> getProductTypeInRegion() {
		if (productTypeInRegion == null) {
			productTypeInRegion = new EObjectWithInverseResolvingEList<ProductOfTypeInRegion>(ProductOfTypeInRegion.class, this, PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_IN_REGION, PoletPackage.PRODUCT_OF_TYPE_IN_REGION__PRODUCT_TYPE);
		}
		return productTypeInRegion;
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
			case PoletPackage.PRODUCT_TYPE__PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducts()).basicAdd(otherEnd, msgs);
			case PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_IN_MEAL_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProductTypeInMealType()).basicAdd(otherEnd, msgs);
			case PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_IN_REGION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProductTypeInRegion()).basicAdd(otherEnd, msgs);
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
			case PoletPackage.PRODUCT_TYPE__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
			case PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_IN_MEAL_TYPE:
				return ((InternalEList<?>)getProductTypeInMealType()).basicRemove(otherEnd, msgs);
			case PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_IN_REGION:
				return ((InternalEList<?>)getProductTypeInRegion()).basicRemove(otherEnd, msgs);
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
			case PoletPackage.PRODUCT_TYPE__NAME:
				return getName();
			case PoletPackage.PRODUCT_TYPE__PRODUCTS:
				return getProducts();
			case PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_IN_MEAL_TYPE:
				return getProductTypeInMealType();
			case PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_IN_REGION:
				return getProductTypeInRegion();
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
			case PoletPackage.PRODUCT_TYPE__NAME:
				setName((String)newValue);
				return;
			case PoletPackage.PRODUCT_TYPE__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_IN_MEAL_TYPE:
				getProductTypeInMealType().clear();
				getProductTypeInMealType().addAll((Collection<? extends ProductOfTypeInMealType>)newValue);
				return;
			case PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_IN_REGION:
				getProductTypeInRegion().clear();
				getProductTypeInRegion().addAll((Collection<? extends ProductOfTypeInRegion>)newValue);
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
			case PoletPackage.PRODUCT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PoletPackage.PRODUCT_TYPE__PRODUCTS:
				getProducts().clear();
				return;
			case PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_IN_MEAL_TYPE:
				getProductTypeInMealType().clear();
				return;
			case PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_IN_REGION:
				getProductTypeInRegion().clear();
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
			case PoletPackage.PRODUCT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PoletPackage.PRODUCT_TYPE__PRODUCTS:
				return products != null && !products.isEmpty();
			case PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_IN_MEAL_TYPE:
				return productTypeInMealType != null && !productTypeInMealType.isEmpty();
			case PoletPackage.PRODUCT_TYPE__PRODUCT_TYPE_IN_REGION:
				return productTypeInRegion != null && !productTypeInRegion.isEmpty();
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProductTypeImpl
