/**
 */
package polet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import polet.AlcoholContent;
import polet.Country;
import polet.PoletPackage;
import polet.Price;
import polet.Product;
import polet.ProductType;
import polet.Volume;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link polet.impl.ProductImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getAlcoholContent <em>Alcohol Content</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getProductType <em>Product Type</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getAlcoholPerKrone <em>Alcohol Per Krone</em>}</li>
 *   <li>{@link polet.impl.ProductImpl#getKronePerVolume <em>Krone Per Volume</em>}</li>
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
	 * The cached value of the '{@link #getAlcoholContent() <em>Alcohol Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlcoholContent()
	 * @generated
	 * @ordered
	 */
	protected AlcoholContent alcoholContent;

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
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected Price price;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected Country country;

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
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected Volume volume;

	/**
	 * The default value of the '{@link #getAlcoholPerKrone() <em>Alcohol Per Krone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlcoholPerKrone()
	 * @generated
	 * @ordered
	 */
	protected static final float ALCOHOL_PER_KRONE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAlcoholPerKrone() <em>Alcohol Per Krone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlcoholPerKrone()
	 * @generated
	 * @ordered
	 */
	protected float alcoholPerKrone = ALCOHOL_PER_KRONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKronePerVolume() <em>Krone Per Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKronePerVolume()
	 * @generated
	 * @ordered
	 */
	protected static final float KRONE_PER_VOLUME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getKronePerVolume() <em>Krone Per Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKronePerVolume()
	 * @generated
	 * @ordered
	 */
	protected float kronePerVolume = KRONE_PER_VOLUME_EDEFAULT;

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
	public AlcoholContent getAlcoholContent() {
		if (alcoholContent != null && alcoholContent.eIsProxy()) {
			InternalEObject oldAlcoholContent = (InternalEObject)alcoholContent;
			alcoholContent = (AlcoholContent)eResolveProxy(oldAlcoholContent);
			if (alcoholContent != oldAlcoholContent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PoletPackage.PRODUCT__ALCOHOL_CONTENT, oldAlcoholContent, alcoholContent));
			}
		}
		return alcoholContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlcoholContent basicGetAlcoholContent() {
		return alcoholContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlcoholContent(AlcoholContent newAlcoholContent) {
		AlcoholContent oldAlcoholContent = alcoholContent;
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
	public Price getPrice() {
		if (price != null && price.eIsProxy()) {
			InternalEObject oldPrice = (InternalEObject)price;
			price = (Price)eResolveProxy(oldPrice);
			if (price != oldPrice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PoletPackage.PRODUCT__PRICE, oldPrice, price));
			}
		}
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Price basicGetPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(Price newPrice) {
		Price oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country getCountry() {
		if (country != null && country.eIsProxy()) {
			InternalEObject oldCountry = (InternalEObject)country;
			country = (Country)eResolveProxy(oldCountry);
			if (country != oldCountry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PoletPackage.PRODUCT__COUNTRY, oldCountry, country));
			}
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country basicGetCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(Country newCountry) {
		Country oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT__COUNTRY, oldCountry, country));
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
	public Volume getVolume() {
		if (volume != null && volume.eIsProxy()) {
			InternalEObject oldVolume = (InternalEObject)volume;
			volume = (Volume)eResolveProxy(oldVolume);
			if (volume != oldVolume) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PoletPackage.PRODUCT__VOLUME, oldVolume, volume));
			}
		}
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume basicGetVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(Volume newVolume) {
		Volume oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAlcoholPerKrone() {
		return alcoholPerKrone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlcoholPerKrone(float newAlcoholPerKrone) {
		float oldAlcoholPerKrone = alcoholPerKrone;
		alcoholPerKrone = newAlcoholPerKrone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT__ALCOHOL_PER_KRONE, oldAlcoholPerKrone, alcoholPerKrone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getKronePerVolume() {
		return kronePerVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKronePerVolume(float newKronePerVolume) {
		float oldKronePerVolume = kronePerVolume;
		kronePerVolume = newKronePerVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PoletPackage.PRODUCT__KRONE_PER_VOLUME, oldKronePerVolume, kronePerVolume));
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
			case PoletPackage.PRODUCT__ALCOHOL_CONTENT:
				if (resolve) return getAlcoholContent();
				return basicGetAlcoholContent();
			case PoletPackage.PRODUCT__NAME:
				return getName();
			case PoletPackage.PRODUCT__PRICE:
				if (resolve) return getPrice();
				return basicGetPrice();
			case PoletPackage.PRODUCT__COUNTRY:
				if (resolve) return getCountry();
				return basicGetCountry();
			case PoletPackage.PRODUCT__PRODUCT_TYPE:
				if (resolve) return getProductType();
				return basicGetProductType();
			case PoletPackage.PRODUCT__VOLUME:
				if (resolve) return getVolume();
				return basicGetVolume();
			case PoletPackage.PRODUCT__ALCOHOL_PER_KRONE:
				return getAlcoholPerKrone();
			case PoletPackage.PRODUCT__KRONE_PER_VOLUME:
				return getKronePerVolume();
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
			case PoletPackage.PRODUCT__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case PoletPackage.PRODUCT__ALCOHOL_CONTENT:
				setAlcoholContent((AlcoholContent)newValue);
				return;
			case PoletPackage.PRODUCT__NAME:
				setName((String)newValue);
				return;
			case PoletPackage.PRODUCT__PRICE:
				setPrice((Price)newValue);
				return;
			case PoletPackage.PRODUCT__COUNTRY:
				setCountry((Country)newValue);
				return;
			case PoletPackage.PRODUCT__PRODUCT_TYPE:
				setProductType((ProductType)newValue);
				return;
			case PoletPackage.PRODUCT__VOLUME:
				setVolume((Volume)newValue);
				return;
			case PoletPackage.PRODUCT__ALCOHOL_PER_KRONE:
				setAlcoholPerKrone((Float)newValue);
				return;
			case PoletPackage.PRODUCT__KRONE_PER_VOLUME:
				setKronePerVolume((Float)newValue);
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
			case PoletPackage.PRODUCT__ALCOHOL_CONTENT:
				setAlcoholContent((AlcoholContent)null);
				return;
			case PoletPackage.PRODUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PoletPackage.PRODUCT__PRICE:
				setPrice((Price)null);
				return;
			case PoletPackage.PRODUCT__COUNTRY:
				setCountry((Country)null);
				return;
			case PoletPackage.PRODUCT__PRODUCT_TYPE:
				setProductType((ProductType)null);
				return;
			case PoletPackage.PRODUCT__VOLUME:
				setVolume((Volume)null);
				return;
			case PoletPackage.PRODUCT__ALCOHOL_PER_KRONE:
				setAlcoholPerKrone(ALCOHOL_PER_KRONE_EDEFAULT);
				return;
			case PoletPackage.PRODUCT__KRONE_PER_VOLUME:
				setKronePerVolume(KRONE_PER_VOLUME_EDEFAULT);
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
			case PoletPackage.PRODUCT__ALCOHOL_CONTENT:
				return alcoholContent != null;
			case PoletPackage.PRODUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PoletPackage.PRODUCT__PRICE:
				return price != null;
			case PoletPackage.PRODUCT__COUNTRY:
				return country != null;
			case PoletPackage.PRODUCT__PRODUCT_TYPE:
				return productType != null;
			case PoletPackage.PRODUCT__VOLUME:
				return volume != null;
			case PoletPackage.PRODUCT__ALCOHOL_PER_KRONE:
				return alcoholPerKrone != ALCOHOL_PER_KRONE_EDEFAULT;
			case PoletPackage.PRODUCT__KRONE_PER_VOLUME:
				return kronePerVolume != KRONE_PER_VOLUME_EDEFAULT;
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
		result.append(", alcoholPerKrone: ");
		result.append(alcoholPerKrone);
		result.append(", kronePerVolume: ");
		result.append(kronePerVolume);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
