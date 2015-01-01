/**
 */
package de.tu_bs.cs.isf.mbse.ernaehrungsplan.util;

import de.tu_bs.cs.isf.mbse.ernaehrungsplan.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.ErnaehrungsplanPackage
 * @generated
 */
public class ErnaehrungsplanSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ErnaehrungsplanPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErnaehrungsplanSwitch() {
		if (modelPackage == null) {
			modelPackage = ErnaehrungsplanPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ErnaehrungsplanPackage.ERNAEHRUNGSPLAN: {
				Ernaehrungsplan ernaehrungsplan = (Ernaehrungsplan)theEObject;
				T result = caseErnaehrungsplan(ernaehrungsplan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErnaehrungsplanPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErnaehrungsplanPackage.GERICHT: {
				Gericht gericht = (Gericht)theEObject;
				T result = caseGericht(gericht);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErnaehrungsplanPackage.HAUPTBESTANDTEIL: {
				Hauptbestandteil hauptbestandteil = (Hauptbestandteil)theEObject;
				T result = caseHauptbestandteil(hauptbestandteil);
				if (result == null) result = caseZutat(hauptbestandteil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErnaehrungsplanPackage.BEILAGE: {
				Beilage beilage = (Beilage)theEObject;
				T result = caseBeilage(beilage);
				if (result == null) result = caseZutat(beilage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErnaehrungsplanPackage.SOSSE: {
				Sosse sosse = (Sosse)theEObject;
				T result = caseSosse(sosse);
				if (result == null) result = caseZutat(sosse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErnaehrungsplanPackage.SALAT: {
				Salat salat = (Salat)theEObject;
				T result = caseSalat(salat);
				if (result == null) result = caseZutat(salat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErnaehrungsplanPackage.ZUTAT: {
				Zutat zutat = (Zutat)theEObject;
				T result = caseZutat(zutat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ernaehrungsplan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ernaehrungsplan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErnaehrungsplan(Ernaehrungsplan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gericht</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gericht</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGericht(Gericht object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hauptbestandteil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hauptbestandteil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHauptbestandteil(Hauptbestandteil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Beilage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Beilage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBeilage(Beilage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sosse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sosse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSosse(Sosse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Salat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Salat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSalat(Salat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zutat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zutat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZutat(Zutat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ErnaehrungsplanSwitch
