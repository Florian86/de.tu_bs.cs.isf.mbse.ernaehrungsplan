/**
 */
package de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.impl;

import de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.ErnaehrungsplanPackage;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Gericht;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Zutat;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gericht</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.impl.GerichtImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.impl.GerichtImpl#getKommentar <em>Kommentar</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.impl.GerichtImpl#getBestehtAus <em>Besteht Aus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GerichtImpl extends MinimalEObjectImpl.Container implements Gericht {
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
	 * The default value of the '{@link #getKommentar() <em>Kommentar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKommentar()
	 * @generated
	 * @ordered
	 */
	protected static final String KOMMENTAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKommentar() <em>Kommentar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKommentar()
	 * @generated
	 * @ordered
	 */
	protected String kommentar = KOMMENTAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBestehtAus() <em>Besteht Aus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestehtAus()
	 * @generated
	 * @ordered
	 */
	protected EList<Zutat> bestehtAus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GerichtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErnaehrungsplanPackage.Literals.GERICHT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ErnaehrungsplanPackage.GERICHT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKommentar() {
		return kommentar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKommentar(String newKommentar) {
		String oldKommentar = kommentar;
		kommentar = newKommentar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErnaehrungsplanPackage.GERICHT__KOMMENTAR, oldKommentar, kommentar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Zutat> getBestehtAus() {
		if (bestehtAus == null) {
			bestehtAus = new EObjectContainmentEList<Zutat>(Zutat.class, this, ErnaehrungsplanPackage.GERICHT__BESTEHT_AUS);
		}
		return bestehtAus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErnaehrungsplanPackage.GERICHT__BESTEHT_AUS:
				return ((InternalEList<?>)getBestehtAus()).basicRemove(otherEnd, msgs);
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
			case ErnaehrungsplanPackage.GERICHT__NAME:
				return getName();
			case ErnaehrungsplanPackage.GERICHT__KOMMENTAR:
				return getKommentar();
			case ErnaehrungsplanPackage.GERICHT__BESTEHT_AUS:
				return getBestehtAus();
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
			case ErnaehrungsplanPackage.GERICHT__NAME:
				setName((String)newValue);
				return;
			case ErnaehrungsplanPackage.GERICHT__KOMMENTAR:
				setKommentar((String)newValue);
				return;
			case ErnaehrungsplanPackage.GERICHT__BESTEHT_AUS:
				getBestehtAus().clear();
				getBestehtAus().addAll((Collection<? extends Zutat>)newValue);
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
			case ErnaehrungsplanPackage.GERICHT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ErnaehrungsplanPackage.GERICHT__KOMMENTAR:
				setKommentar(KOMMENTAR_EDEFAULT);
				return;
			case ErnaehrungsplanPackage.GERICHT__BESTEHT_AUS:
				getBestehtAus().clear();
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
			case ErnaehrungsplanPackage.GERICHT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ErnaehrungsplanPackage.GERICHT__KOMMENTAR:
				return KOMMENTAR_EDEFAULT == null ? kommentar != null : !KOMMENTAR_EDEFAULT.equals(kommentar);
			case ErnaehrungsplanPackage.GERICHT__BESTEHT_AUS:
				return bestehtAus != null && !bestehtAus.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", kommentar: ");
		result.append(kommentar);
		result.append(')');
		return result.toString();
	}

} //GerichtImpl
