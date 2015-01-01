/**
 */
package de.tu_bs.cs.isf.mbse.ernaehrungsplan;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.ErnaehrungsplanFactory
 * @model kind="package"
 * @generated
 */
public interface ErnaehrungsplanPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ernaehrungsplan";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ernaehrungsplan";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ernaehrungsplan";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ErnaehrungsplanPackage eINSTANCE = de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanImpl <em>Ernaehrungsplan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanImpl
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getErnaehrungsplan()
	 * @generated
	 */
	int ERNAEHRUNGSPLAN = 0;

	/**
	 * The feature id for the '<em><b>Enthaelt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERNAEHRUNGSPLAN__ENTHAELT = 0;

	/**
	 * The feature id for the '<em><b>Besteht Aus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERNAEHRUNGSPLAN__BESTEHT_AUS = 1;

	/**
	 * The number of structural features of the '<em>Ernaehrungsplan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERNAEHRUNGSPLAN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ernaehrungsplan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERNAEHRUNGSPLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.PersonImpl
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Kcal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__KCAL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.GerichtImpl <em>Gericht</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.GerichtImpl
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getGericht()
	 * @generated
	 */
	int GERICHT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERICHT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kommentar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERICHT__KOMMENTAR = 1;

	/**
	 * The feature id for the '<em><b>Besteht Aus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERICHT__BESTEHT_AUS = 2;

	/**
	 * The number of structural features of the '<em>Gericht</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERICHT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Gericht</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GERICHT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ZutatImpl <em>Zutat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ZutatImpl
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getZutat()
	 * @generated
	 */
	int ZUTAT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUTAT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kcal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUTAT__KCAL = 1;

	/**
	 * The number of structural features of the '<em>Zutat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUTAT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Zutat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUTAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.HauptbestandteilImpl <em>Hauptbestandteil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.HauptbestandteilImpl
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getHauptbestandteil()
	 * @generated
	 */
	int HAUPTBESTANDTEIL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUPTBESTANDTEIL__NAME = ZUTAT__NAME;

	/**
	 * The feature id for the '<em><b>Kcal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUPTBESTANDTEIL__KCAL = ZUTAT__KCAL;

	/**
	 * The number of structural features of the '<em>Hauptbestandteil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUPTBESTANDTEIL_FEATURE_COUNT = ZUTAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hauptbestandteil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUPTBESTANDTEIL_OPERATION_COUNT = ZUTAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.BeilageImpl <em>Beilage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.BeilageImpl
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getBeilage()
	 * @generated
	 */
	int BEILAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEILAGE__NAME = ZUTAT__NAME;

	/**
	 * The feature id for the '<em><b>Kcal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEILAGE__KCAL = ZUTAT__KCAL;

	/**
	 * The number of structural features of the '<em>Beilage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEILAGE_FEATURE_COUNT = ZUTAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Beilage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEILAGE_OPERATION_COUNT = ZUTAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.SosseImpl <em>Sosse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.SosseImpl
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getSosse()
	 * @generated
	 */
	int SOSSE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOSSE__NAME = ZUTAT__NAME;

	/**
	 * The feature id for the '<em><b>Kcal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOSSE__KCAL = ZUTAT__KCAL;

	/**
	 * The number of structural features of the '<em>Sosse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOSSE_FEATURE_COUNT = ZUTAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sosse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOSSE_OPERATION_COUNT = ZUTAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.SalatImpl <em>Salat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.SalatImpl
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getSalat()
	 * @generated
	 */
	int SALAT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALAT__NAME = ZUTAT__NAME;

	/**
	 * The feature id for the '<em><b>Kcal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALAT__KCAL = ZUTAT__KCAL;

	/**
	 * The number of structural features of the '<em>Salat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALAT_FEATURE_COUNT = ZUTAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Salat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALAT_OPERATION_COUNT = ZUTAT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan <em>Ernaehrungsplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ernaehrungsplan</em>'.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan
	 * @generated
	 */
	EClass getErnaehrungsplan();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan#getEnthaelt <em>Enthaelt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enthaelt</em>'.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan#getEnthaelt()
	 * @see #getErnaehrungsplan()
	 * @generated
	 */
	EReference getErnaehrungsplan_Enthaelt();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan#getBestehtAus <em>Besteht Aus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Besteht Aus</em>'.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan#getBestehtAus()
	 * @see #getErnaehrungsplan()
	 * @generated
	 */
	EReference getErnaehrungsplan_BestehtAus();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Person#getKcal <em>Kcal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kcal</em>'.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Person#getKcal()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Kcal();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Gericht <em>Gericht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gericht</em>'.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Gericht
	 * @generated
	 */
	EClass getGericht();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Gericht#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Gericht#getName()
	 * @see #getGericht()
	 * @generated
	 */
	EAttribute getGericht_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Gericht#getKommentar <em>Kommentar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kommentar</em>'.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Gericht#getKommentar()
	 * @see #getGericht()
	 * @generated
	 */
	EAttribute getGericht_Kommentar();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Gericht#getBestehtAus <em>Besteht Aus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Besteht Aus</em>'.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Gericht#getBestehtAus()
	 * @see #getGericht()
	 * @generated
	 */
	EReference getGericht_BestehtAus();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Hauptbestandteil <em>Hauptbestandteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hauptbestandteil</em>'.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Hauptbestandteil
	 * @generated
	 */
	EClass getHauptbestandteil();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Beilage <em>Beilage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beilage</em>'.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Beilage
	 * @generated
	 */
	EClass getBeilage();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Sosse <em>Sosse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sosse</em>'.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Sosse
	 * @generated
	 */
	EClass getSosse();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Salat <em>Salat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salat</em>'.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Salat
	 * @generated
	 */
	EClass getSalat();

	/**
	 * Returns the meta object for class '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Zutat <em>Zutat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zutat</em>'.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Zutat
	 * @generated
	 */
	EClass getZutat();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Zutat#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Zutat#getName()
	 * @see #getZutat()
	 * @generated
	 */
	EAttribute getZutat_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.Zutat#getKcal <em>Kcal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kcal</em>'.
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Zutat#getKcal()
	 * @see #getZutat()
	 * @generated
	 */
	EAttribute getZutat_Kcal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ErnaehrungsplanFactory getErnaehrungsplanFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanImpl <em>Ernaehrungsplan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanImpl
		 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getErnaehrungsplan()
		 * @generated
		 */
		EClass ERNAEHRUNGSPLAN = eINSTANCE.getErnaehrungsplan();

		/**
		 * The meta object literal for the '<em><b>Enthaelt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERNAEHRUNGSPLAN__ENTHAELT = eINSTANCE.getErnaehrungsplan_Enthaelt();

		/**
		 * The meta object literal for the '<em><b>Besteht Aus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERNAEHRUNGSPLAN__BESTEHT_AUS = eINSTANCE.getErnaehrungsplan_BestehtAus();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.PersonImpl
		 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Kcal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__KCAL = eINSTANCE.getPerson_Kcal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.GerichtImpl <em>Gericht</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.GerichtImpl
		 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getGericht()
		 * @generated
		 */
		EClass GERICHT = eINSTANCE.getGericht();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GERICHT__NAME = eINSTANCE.getGericht_Name();

		/**
		 * The meta object literal for the '<em><b>Kommentar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GERICHT__KOMMENTAR = eINSTANCE.getGericht_Kommentar();

		/**
		 * The meta object literal for the '<em><b>Besteht Aus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GERICHT__BESTEHT_AUS = eINSTANCE.getGericht_BestehtAus();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.HauptbestandteilImpl <em>Hauptbestandteil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.HauptbestandteilImpl
		 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getHauptbestandteil()
		 * @generated
		 */
		EClass HAUPTBESTANDTEIL = eINSTANCE.getHauptbestandteil();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.BeilageImpl <em>Beilage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.BeilageImpl
		 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getBeilage()
		 * @generated
		 */
		EClass BEILAGE = eINSTANCE.getBeilage();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.SosseImpl <em>Sosse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.SosseImpl
		 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getSosse()
		 * @generated
		 */
		EClass SOSSE = eINSTANCE.getSosse();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.SalatImpl <em>Salat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.SalatImpl
		 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getSalat()
		 * @generated
		 */
		EClass SALAT = eINSTANCE.getSalat();

		/**
		 * The meta object literal for the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ZutatImpl <em>Zutat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ZutatImpl
		 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.impl.ErnaehrungsplanPackageImpl#getZutat()
		 * @generated
		 */
		EClass ZUTAT = eINSTANCE.getZutat();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUTAT__NAME = eINSTANCE.getZutat_Name();

		/**
		 * The meta object literal for the '<em><b>Kcal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUTAT__KCAL = eINSTANCE.getZutat_Kcal();

	}

} //ErnaehrungsplanPackage
