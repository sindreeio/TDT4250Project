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
import polet.ProductOfTypeInMealType;
import polet.ProductOfTypeInRegion;
import polet.ProductType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link polet.impl.ProductImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getProductType <em>Product Type</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getAlcoholContent <em>Alcohol Content</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getMealTypes <em>Meal Types</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getPricePerAlcohol <em>Price Per Alcohol</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getPricePerVolume <em>Price Per Volume</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends MinimalEObjectImpl.Container implements Product {
	/**
	 * The default value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected String productId = PRODUCT_ID_EDEFAULT;

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
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlcoholContent() <em>Alcohol Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlcoholContent()
	 * @generated
	 * @ordered
	 */
	protected static final float ALCOHOL_CONTENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAlcoholContent() <em>Alcohol Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlcoholContent()
	 * @generated
	 * @ordered
	 */
	protected float alcoholContent = ALCOHOL_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLUME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected float volume = VOLUME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMealTypes() <em>Meal Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMealTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductOfTypeInMealType> mealTypes;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected ProductOfTypeInRegion region;

	/**
	 * The default value of the '{@link #getPricePerAlcohol() <em>Price Per Alcohol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricePerAlcohol()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_PER_ALCOHOL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPricePerAlcohol() <em>Price Per Alcohol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricePerAlcohol()
	 * @generated
	 * @ordered
	 */
	protected float pricePerAlcohol = PRICE_PER_ALCOHOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPricePerVolume() <em>Price Per Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricePerVolume()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_PER_VOLUME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPricePerVolume() <em>Price Per Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricePerVolume()
	 * @generated
	 * @ordered
	 */
	protected float pricePerVolume = PRICE_PER_VOLUME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PoletPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductId(String newProductId) {
		String oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAlcoholContent() {
		return alcoholContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlcoholContent(float newAlcoholContent) {
		float oldAlcoholContent = alcoholContent;
		alcoholContent = newAlcoholContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT__ALCOHOL_CONTENT, oldAlcoholContent, alcoholContent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductOfTypeInRegion getRegion() {
		if (region != null && region.eIsProxy()) {
			InternalEObject oldRegion = (InternalEObject)region;
			region = (ProductOfTypeInRegion)eResolveProxy(oldRegion);
			if (region != oldRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PoletPackage.PRODUCT__REGION, oldRegion, region));
			}
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductOfTypeInRegion basicGetRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegion(ProductOfTypeInRegion newRegion, NotificationChain msgs) {
		ProductOfTypeInRegion oldRegion = region;
		region = newRegion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT__REGION, oldRegion, newRegion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(ProductOfTypeInRegion newRegion) {
		if (newRegion != region) {
			NotificationChain msgs = null;
			if (region != null)
				msgs = ((InternalEObject)region).eInverseRemove(this, PoletPackage.PRODUCT_OF_TYPE_IN_REGION__PRODUCTS, ProductOfTypeInRegion.class, msgs);
			if (newRegion != null)
				msgs = ((InternalEObject)newRegion).eInverseAdd(this, PoletPackage.PRODUCT_OF_TYPE_IN_REGION__PRODUCTS, ProductOfTypeInRegion.class, msgs);
			msgs = basicSetRegion(newRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT__REGION, newRegion, newRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public float getPricePerAlcohol() {
		return pricePerAlcohol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPricePerAlcohol(float newPricePerAlcohol) {
		float oldPricePerAlcohol = pricePerAlcohol;
		pricePerAlcohol = newPricePerAlcohol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT__PRICE_PER_ALCOHOL, oldPricePerAlcohol, pricePerAlcohol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public float getPricePerVolume() {
		float pPerVol = price/volume;
		return pPerVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPricePerVolume(float newPricePerVolume) {
		float oldPricePerVolume = pricePerVolume;
		pricePerVolume = newPricePerVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT__PRICE_PER_VOLUME, oldPricePerVolume, pricePerVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(float newPrice) {
		float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductType getProductType() {
		if (eContainerFeatureID() != PoletPackage.PRODUCT__PRODUCT_TYPE) return null;
		return (ProductType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductType(ProductType newProductType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProductType, PoletPackage.PRODUCT__PRODUCT_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductType(ProductType newProductType) {
		if (newProductType != eInternalContainer() || (eContainerFeatureID() != PoletPackage.PRODUCT__PRODUCT_TYPE && newProductType != null)) {
			if (EcoreUtil.isAncestor(this, newProductType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProductType != null)
				msgs = ((InternalEObject)newProductType).eInverseAdd(this, PoletPackage.PRODUCT_TYPE__PRODUCTS, ProductType.class, msgs);
			msgs = basicSetProductType(newProductType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT__PRODUCT_TYPE, newProductType, newProductType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(float newVolume) {
		float oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductOfTypeInMealType> getMealTypes() {
		if (mealTypes == null) {
			mealTypes = new EObjectWithInverseResolvingEList.ManyInverse<ProductOfTypeInMealType>(ProductOfTypeInMealType.class, this, PoletPackage.PRODUCT__MEAL_TYPES, PoletPackage.PRODUCT_OF_TYPE_IN_MEAL_TYPE__PRODUCTS);
		}
		return mealTypes;
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
			case PoletPackage.PRODUCT__PRODUCT_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProductType((ProductType)otherEnd, msgs);
			case PoletPackage.PRODUCT__MEAL_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMealTypes()).basicAdd(otherEnd, msgs);
			case PoletPackage.PRODUCT__REGION:
				if (region != null)
					msgs = ((InternalEObject)region).eInverseRemove(this, PoletPackage.PRODUCT_OF_TYPE_IN_REGION__PRODUCTS, ProductOfTypeInRegion.class, msgs);
				return basicSetRegion((ProductOfTypeInRegion)otherEnd, msgs);
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
			case PoletPackage.PRODUCT__PRODUCT_TYPE:
				return basicSetProductType(null, msgs);
			case PoletPackage.PRODUCT__MEAL_TYPES:
				return ((InternalEList<?>)getMealTypes()).basicRemove(otherEnd, msgs);
			case PoletPackage.PRODUCT__REGION:
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
			case PoletPackage.PRODUCT__PRODUCT_TYPE:
				return eInternalContainer().eInverseRemove(this, PoletPackage.PRODUCT_TYPE__PRODUCTS, ProductType.class, msgs);
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
			case PoletPackage.PRODUCT__PRODUCT_ID:
				return getProductId();
			case PoletPackage.PRODUCT__NAME:
				return getName();
			case PoletPackage.PRODUCT__PRODUCT_TYPE:
				return getProductType();
			case PoletPackage.PRODUCT__PRICE:
				return getPrice();
			case PoletPackage.PRODUCT__ALCOHOL_CONTENT:
				return getAlcoholContent();
			case PoletPackage.PRODUCT__VOLUME:
				return getVolume();
			case PoletPackage.PRODUCT__MEAL_TYPES:
				return getMealTypes();
			case PoletPackage.PRODUCT__REGION:
				if (resolve) return getRegion();
				return basicGetRegion();
			case PoletPackage.PRODUCT__PRICE_PER_ALCOHOL:
				return getPricePerAlcohol();
			case PoletPackage.PRODUCT__PRICE_PER_VOLUME:
				return getPricePerVolume();
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
			case PoletPackage.PRODUCT__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case PoletPackage.PRODUCT__NAME:
				setName((String)newValue);
				return;
			case PoletPackage.PRODUCT__PRODUCT_TYPE:
				setProductType((ProductType)newValue);
				return;
			case PoletPackage.PRODUCT__PRICE:
				setPrice((Float)newValue);
				return;
			case PoletPackage.PRODUCT__ALCOHOL_CONTENT:
				setAlcoholContent((Float)newValue);
				return;
			case PoletPackage.PRODUCT__VOLUME:
				setVolume((Float)newValue);
				return;
			case PoletPackage.PRODUCT__MEAL_TYPES:
				getMealTypes().clear();
				getMealTypes().addAll((Collection<? extends ProductOfTypeInMealType>)newValue);
				return;
			case PoletPackage.PRODUCT__REGION:
				setRegion((ProductOfTypeInRegion)newValue);
				return;
			case PoletPackage.PRODUCT__PRICE_PER_ALCOHOL:
				setPricePerAlcohol((Float)newValue);
				return;
			case PoletPackage.PRODUCT__PRICE_PER_VOLUME:
				setPricePerVolume((Float)newValue);
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
			case PoletPackage.PRODUCT__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case PoletPackage.PRODUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PoletPackage.PRODUCT__PRODUCT_TYPE:
				setProductType((ProductType)null);
				return;
			case PoletPackage.PRODUCT__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case PoletPackage.PRODUCT__ALCOHOL_CONTENT:
				setAlcoholContent(ALCOHOL_CONTENT_EDEFAULT);
				return;
			case PoletPackage.PRODUCT__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case PoletPackage.PRODUCT__MEAL_TYPES:
				getMealTypes().clear();
				return;
			case PoletPackage.PRODUCT__REGION:
				setRegion((ProductOfTypeInRegion)null);
				return;
			case PoletPackage.PRODUCT__PRICE_PER_ALCOHOL:
				setPricePerAlcohol(PRICE_PER_ALCOHOL_EDEFAULT);
				return;
			case PoletPackage.PRODUCT__PRICE_PER_VOLUME:
				setPricePerVolume(PRICE_PER_VOLUME_EDEFAULT);
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
			case PoletPackage.PRODUCT__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case PoletPackage.PRODUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PoletPackage.PRODUCT__PRODUCT_TYPE:
				return getProductType() != null;
			case PoletPackage.PRODUCT__PRICE:
				return price != PRICE_EDEFAULT;
			case PoletPackage.PRODUCT__ALCOHOL_CONTENT:
				return alcoholContent != ALCOHOL_CONTENT_EDEFAULT;
			case PoletPackage.PRODUCT__VOLUME:
				return volume != VOLUME_EDEFAULT;
			case PoletPackage.PRODUCT__MEAL_TYPES:
				return mealTypes != null && !mealTypes.isEmpty();
			case PoletPackage.PRODUCT__REGION:
				return region != null;
			case PoletPackage.PRODUCT__PRICE_PER_ALCOHOL:
				return pricePerAlcohol != PRICE_PER_ALCOHOL_EDEFAULT;
			case PoletPackage.PRODUCT__PRICE_PER_VOLUME:
				return pricePerVolume != PRICE_PER_VOLUME_EDEFAULT;
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
		result.append(" (productId: ");
		result.append(productId);
		result.append(", name: ");
		result.append(name);
		result.append(", price: ");
		result.append(price);
		result.append(", alcoholContent: ");
		result.append(alcoholContent);
		result.append(", Volume: ");
		result.append(volume);
		result.append(", pricePerAlcohol: ");
		result.append(pricePerAlcohol);
		result.append(", pricePerVolume: ");
		result.append(pricePerVolume);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
