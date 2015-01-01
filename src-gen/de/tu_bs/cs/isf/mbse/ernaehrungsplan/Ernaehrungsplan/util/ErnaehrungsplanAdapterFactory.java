/**
 */
package de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.util;

import de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.ErnaehrungsplanPackage
 * @generated
 */
public class ErnaehrungsplanAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ErnaehrungsplanPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErnaehrungsplanAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ErnaehrungsplanPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErnaehrungsplanSwitch<Adapter> modelSwitch =
		new ErnaehrungsplanSwitch<Adapter>() {
			@Override
			public Adapter caseErnaehrungsplan(Ernaehrungsplan object) {
				return createErnaehrungsplanAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseGericht(Gericht object) {
				return createGerichtAdapter();
			}
			@Override
			public Adapter caseHauptbestandteil(Hauptbestandteil object) {
				return createHauptbestandteilAdapter();
			}
			@Override
			public Adapter caseBeilage(Beilage object) {
				return createBeilageAdapter();
			}
			@Override
			public Adapter caseSosse(Sosse object) {
				return createSosseAdapter();
			}
			@Override
			public Adapter caseSalat(Salat object) {
				return createSalatAdapter();
			}
			@Override
			public Adapter caseZutat(Zutat object) {
				return createZutatAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Ernaehrungsplan <em>Ernaehrungsplan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Ernaehrungsplan
	 * @generated
	 */
	public Adapter createErnaehrungsplanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Gericht <em>Gericht</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Gericht
	 * @generated
	 */
	public Adapter createGerichtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Hauptbestandteil <em>Hauptbestandteil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Hauptbestandteil
	 * @generated
	 */
	public Adapter createHauptbestandteilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Beilage <em>Beilage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Beilage
	 * @generated
	 */
	public Adapter createBeilageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Sosse <em>Sosse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Sosse
	 * @generated
	 */
	public Adapter createSosseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Salat <em>Salat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Salat
	 * @generated
	 */
	public Adapter createSalatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Zutat <em>Zutat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Zutat
	 * @generated
	 */
	public Adapter createZutatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ErnaehrungsplanAdapterFactory
