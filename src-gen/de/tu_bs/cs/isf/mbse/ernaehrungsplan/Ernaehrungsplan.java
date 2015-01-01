/**
 */
package de.tu_bs.cs.isf.mbse.ernaehrungsplan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ernaehrungsplan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan#getEnthaelt <em>Enthaelt</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan#getBestehtAus <em>Besteht Aus</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.ErnaehrungsplanPackage#getErnaehrungsplan()
 * @model
 * @generated
 */
public interface Ernaehrungsplan extends EObject {
	/**
	 * Returns the value of the '<em><b>Enthaelt</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enthaelt</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enthaelt</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.ErnaehrungsplanPackage#getErnaehrungsplan_Enthaelt()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Person> getEnthaelt();

	/**
	 * Returns the value of the '<em><b>Besteht Aus</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Gericht}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Besteht Aus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Besteht Aus</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.ErnaehrungsplanPackage#getErnaehrungsplan_BestehtAus()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gericht> getBestehtAus();

} // Ernaehrungsplan
