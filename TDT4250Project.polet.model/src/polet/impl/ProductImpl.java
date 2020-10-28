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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import polet.KronePerAlcohol;
import polet.KronePerVolume;
import polet.MealType;
import polet.PoletPackage;
import polet.Product;
import polet.ProductType;
import polet.Region;

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
 *   <li>{@link polet.impl.ProductImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getProductType <em>Product Type</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getKronePerVolume <em>Krone Per Volume</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getAlcoholPerKrone <em>Alcohol Per Krone</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getAlcoholContent <em>Alcohol Content</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getSutibleFor <em>Sutible For</em>}</li>
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
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected Region region;

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
	 * The cached value of the '{@link #getKronePerVolume() <em>Krone Per Volume</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKronePerVolume()
	 * @generated
	 * @ordered
	 */
	protected KronePerVolume kronePerVolume;

	/**
	 * The cached value of the '{@link #getAlcoholPerKrone() <em>Alcohol Per Krone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlcoholPerKrone()
	 * @generated
	 * @ordered
	 */
	protected KronePerAlcohol alcoholPerKrone;

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
	 * The cached value of the '{@link #getSutibleFor() <em>Sutible For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSutibleFor()
	 * @generated
	 * @ordered
	 */
	protected EList<MealType> sutibleFor;

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
	public Region getRegion() {
		if (region != null && region.eIsProxy()) {
			InternalEObject oldRegion = (InternalEObject)region;
			region = (Region)eResolveProxy(oldRegion);
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
	public Region basicGetRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(Region newRegion) {
		Region oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT__REGION, oldRegion, region));
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
		if (productType != null && productType.eIsProxy()) {
			InternalEObject oldProductType = (InternalEObject)productType;
			productType = (ProductType)eResolveProxy(oldProductType);
			if (productType != oldProductType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PoletPackage.PRODUCT__PRODUCT_TYPE, oldProductType, productType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT__PRODUCT_TYPE, oldProductType, newProductType);
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
				msgs = ((InternalEObject)productType).eInverseRemove(this, PoletPackage.PRODUCT_TYPE__PRODUCTS, ProductType.class, msgs);
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
	public EList<MealType> getSutibleFor() {
		if (sutibleFor == null) {
			sutibleFor = new EObjectResolvingEList<MealType>(MealType.class, this, PoletPackage.PRODUCT__SUTIBLE_FOR);
		}
		return sutibleFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KronePerAlcohol getAlcoholPerKrone() {
		if (alcoholPerKrone != null && alcoholPerKrone.eIsProxy()) {
			InternalEObject oldAlcoholPerKrone = (InternalEObject)alcoholPerKrone;
			alcoholPerKrone = (KronePerAlcohol)eResolveProxy(oldAlcoholPerKrone);
			if (alcoholPerKrone != oldAlcoholPerKrone) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PoletPackage.PRODUCT__ALCOHOL_PER_KRONE, oldAlcoholPerKrone, alcoholPerKrone));
			}
		}
		return alcoholPerKrone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KronePerAlcohol basicGetAlcoholPerKrone() {
		return alcoholPerKrone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlcoholPerKrone(KronePerAlcohol newAlcoholPerKrone, NotificationChain msgs) {
		KronePerAlcohol oldAlcoholPerKrone = alcoholPerKrone;
		alcoholPerKrone = newAlcoholPerKrone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT__ALCOHOL_PER_KRONE, oldAlcoholPerKrone, newAlcoholPerKrone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlcoholPerKrone(KronePerAlcohol newAlcoholPerKrone) {
		if (newAlcoholPerKrone != alcoholPerKrone) {
			NotificationChain msgs = null;
			if (alcoholPerKrone != null)
				msgs = ((InternalEObject)alcoholPerKrone).eInverseRemove(this, PoletPackage.KRONE_PER_ALCOHOL__PRODUCTS, KronePerAlcohol.class, msgs);
			if (newAlcoholPerKrone != null)
				msgs = ((InternalEObject)newAlcoholPerKrone).eInverseAdd(this, PoletPackage.KRONE_PER_ALCOHOL__PRODUCTS, KronePerAlcohol.class, msgs);
			msgs = basicSetAlcoholPerKrone(newAlcoholPerKrone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT__ALCOHOL_PER_KRONE, newAlcoholPerKrone, newAlcoholPerKrone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KronePerVolume getKronePerVolume() {
		if (kronePerVolume != null && kronePerVolume.eIsProxy()) {
			InternalEObject oldKronePerVolume = (InternalEObject)kronePerVolume;
			kronePerVolume = (KronePerVolume)eResolveProxy(oldKronePerVolume);
			if (kronePerVolume != oldKronePerVolume) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PoletPackage.PRODUCT__KRONE_PER_VOLUME, oldKronePerVolume, kronePerVolume));
			}
		}
		return kronePerVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KronePerVolume basicGetKronePerVolume() {
		return kronePerVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKronePerVolume(KronePerVolume newKronePerVolume, NotificationChain msgs) {
		KronePerVolume oldKronePerVolume = kronePerVolume;
		kronePerVolume = newKronePerVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT__KRONE_PER_VOLUME, oldKronePerVolume, newKronePerVolume);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKronePerVolume(KronePerVolume newKronePerVolume) {
		if (newKronePerVolume != kronePerVolume) {
			NotificationChain msgs = null;
			if (kronePerVolume != null)
				msgs = ((InternalEObject)kronePerVolume).eInverseRemove(this, PoletPackage.KRONE_PER_VOLUME__PRODUCTS, KronePerVolume.class, msgs);
			if (newKronePerVolume != null)
				msgs = ((InternalEObject)newKronePerVolume).eInverseAdd(this, PoletPackage.KRONE_PER_VOLUME__PRODUCTS, KronePerVolume.class, msgs);
			msgs = basicSetKronePerVolume(newKronePerVolume, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT__KRONE_PER_VOLUME, newKronePerVolume, newKronePerVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PoletPackage.PRODUCT__PRODUCT_TYPE:
				if (productType != null)
					msgs = ((InternalEObject)productType).eInverseRemove(this, PoletPackage.PRODUCT_TYPE__PRODUCTS, ProductType.class, msgs);
				return basicSetProductType((ProductType)otherEnd, msgs);
			case PoletPackage.PRODUCT__KRONE_PER_VOLUME:
				if (kronePerVolume != null)
					msgs = ((InternalEObject)kronePerVolume).eInverseRemove(this, PoletPackage.KRONE_PER_VOLUME__PRODUCTS, KronePerVolume.class, msgs);
				return basicSetKronePerVolume((KronePerVolume)otherEnd, msgs);
			case PoletPackage.PRODUCT__ALCOHOL_PER_KRONE:
				if (alcoholPerKrone != null)
					msgs = ((InternalEObject)alcoholPerKrone).eInverseRemove(this, PoletPackage.KRONE_PER_ALCOHOL__PRODUCTS, KronePerAlcohol.class, msgs);
				return basicSetAlcoholPerKrone((KronePerAlcohol)otherEnd, msgs);
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
			case PoletPackage.PRODUCT__KRONE_PER_VOLUME:
				return basicSetKronePerVolume(null, msgs);
			case PoletPackage.PRODUCT__ALCOHOL_PER_KRONE:
				return basicSetAlcoholPerKrone(null, msgs);
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
			case PoletPackage.PRODUCT__PRODUCT_ID:
				return getProductId();
			case PoletPackage.PRODUCT__NAME:
				return getName();
			case PoletPackage.PRODUCT__REGION:
				if (resolve) return getRegion();
				return basicGetRegion();
			case PoletPackage.PRODUCT__PRODUCT_TYPE:
				if (resolve) return getProductType();
				return basicGetProductType();
			case PoletPackage.PRODUCT__KRONE_PER_VOLUME:
				if (resolve) return getKronePerVolume();
				return basicGetKronePerVolume();
			case PoletPackage.PRODUCT__ALCOHOL_PER_KRONE:
				if (resolve) return getAlcoholPerKrone();
				return basicGetAlcoholPerKrone();
			case PoletPackage.PRODUCT__PRICE:
				return getPrice();
			case PoletPackage.PRODUCT__ALCOHOL_CONTENT:
				return getAlcoholContent();
			case PoletPackage.PRODUCT__VOLUME:
				return getVolume();
			case PoletPackage.PRODUCT__SUTIBLE_FOR:
				return getSutibleFor();
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
			case PoletPackage.PRODUCT__REGION:
				setRegion((Region)newValue);
				return;
			case PoletPackage.PRODUCT__PRODUCT_TYPE:
				setProductType((ProductType)newValue);
				return;
			case PoletPackage.PRODUCT__KRONE_PER_VOLUME:
				setKronePerVolume((KronePerVolume)newValue);
				return;
			case PoletPackage.PRODUCT__ALCOHOL_PER_KRONE:
				setAlcoholPerKrone((KronePerAlcohol)newValue);
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
			case PoletPackage.PRODUCT__SUTIBLE_FOR:
				getSutibleFor().clear();
				getSutibleFor().addAll((Collection<? extends MealType>)newValue);
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
			case PoletPackage.PRODUCT__REGION:
				setRegion((Region)null);
				return;
			case PoletPackage.PRODUCT__PRODUCT_TYPE:
				setProductType((ProductType)null);
				return;
			case PoletPackage.PRODUCT__KRONE_PER_VOLUME:
				setKronePerVolume((KronePerVolume)null);
				return;
			case PoletPackage.PRODUCT__ALCOHOL_PER_KRONE:
				setAlcoholPerKrone((KronePerAlcohol)null);
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
			case PoletPackage.PRODUCT__SUTIBLE_FOR:
				getSutibleFor().clear();
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
			case PoletPackage.PRODUCT__REGION:
				return region != null;
			case PoletPackage.PRODUCT__PRODUCT_TYPE:
				return productType != null;
			case PoletPackage.PRODUCT__KRONE_PER_VOLUME:
				return kronePerVolume != null;
			case PoletPackage.PRODUCT__ALCOHOL_PER_KRONE:
				return alcoholPerKrone != null;
			case PoletPackage.PRODUCT__PRICE:
				return price != PRICE_EDEFAULT;
			case PoletPackage.PRODUCT__ALCOHOL_CONTENT:
				return alcoholContent != ALCOHOL_CONTENT_EDEFAULT;
			case PoletPackage.PRODUCT__VOLUME:
				return volume != VOLUME_EDEFAULT;
			case PoletPackage.PRODUCT__SUTIBLE_FOR:
				return sutibleFor != null && !sutibleFor.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ProductImpl
