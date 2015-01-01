/**
 */
package de.tu_bs.cs.isf.mbse.ernaehrungsplan;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.ErnaehrungsplanPackage
 * @generated
 */
public interface ErnaehrungsplanFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ErnaehrungsplanFactory eINSTANCE = de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ernaehrungsplan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ernaehrungsplan</em>'.
	 * @generated
	 */
	Ernaehrungsplan createErnaehrungsplan();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Gericht</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gericht</em>'.
	 * @generated
	 */
	Gericht createGericht();

	/**
	 * Returns a new object of class '<em>Hauptbestandteil</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hauptbestandteil</em>'.
	 * @generated
	 */
	Hauptbestandteil createHauptbestandteil();

	/**
	 * Returns a new object of class '<em>Beilage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Beilage</em>'.
	 * @generated
	 */
	Beilage createBeilage();

	/**
	 * Returns a new object of class '<em>Sosse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sosse</em>'.
	 * @generated
	 */
	Sosse createSosse();

	/**
	 * Returns a new object of class '<em>Salat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Salat</em>'.
	 * @generated
	 */
	Salat createSalat();

	/**
	 * Returns a new object of class '<em>Zutat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zutat</em>'.
	 * @generated
	 */
	Zutat createZutat();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ErnaehrungsplanPackage getErnaehrungsplanPackage();

} //ErnaehrungsplanFactory
