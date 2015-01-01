/**
 */
package de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl;

import de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.ErnaehrungsplanPackage;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.Gericht;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ernaehrungsplan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanImpl#getEnthaelt <em>Enthaelt</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanImpl#getBestehtAus <em>Besteht Aus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErnaehrungsplanImpl extends MinimalEObjectImpl.Container implements Ernaehrungsplan {
	/**
	 * The cached value of the '{@link #getEnthaelt() <em>Enthaelt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnthaelt()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> enthaelt;

	/**
	 * The cached value of the '{@link #getBestehtAus() <em>Besteht Aus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestehtAus()
	 * @generated
	 * @ordered
	 */
	protected EList<Gericht> bestehtAus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErnaehrungsplanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErnaehrungsplanPackage.Literals.ERNAEHRUNGSPLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getEnthaelt() {
		if (enthaelt == null) {
			enthaelt = new EObjectContainmentEList<Person>(Person.class, this, ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__ENTHAELT);
		}
		return enthaelt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gericht> getBestehtAus() {
		if (bestehtAus == null) {
			bestehtAus = new EObjectContainmentEList<Gericht>(Gericht.class, this, ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__BESTEHT_AUS);
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
			case ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__ENTHAELT:
				return ((InternalEList<?>)getEnthaelt()).basicRemove(otherEnd, msgs);
			case ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__BESTEHT_AUS:
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
			case ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__ENTHAELT:
				return getEnthaelt();
			case ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__BESTEHT_AUS:
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
			case ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__ENTHAELT:
				getEnthaelt().clear();
				getEnthaelt().addAll((Collection<? extends Person>)newValue);
				return;
			case ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__BESTEHT_AUS:
				getBestehtAus().clear();
				getBestehtAus().addAll((Collection<? extends Gericht>)newValue);
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
			case ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__ENTHAELT:
				getEnthaelt().clear();
				return;
			case ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__BESTEHT_AUS:
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
			case ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__ENTHAELT:
				return enthaelt != null && !enthaelt.isEmpty();
			case ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__BESTEHT_AUS:
				return bestehtAus != null && !bestehtAus.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ErnaehrungsplanImpl
