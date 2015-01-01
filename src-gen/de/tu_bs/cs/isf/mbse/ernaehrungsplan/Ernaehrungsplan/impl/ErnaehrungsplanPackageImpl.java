/**
 */
package de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.impl;

import de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Beilage;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Ernaehrungsplan;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.ErnaehrungsplanFactory;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.ErnaehrungsplanPackage;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Gericht;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Hauptbestandteil;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Person;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Salat;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Sosse;
import de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.Zutat;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ErnaehrungsplanPackageImpl extends EPackageImpl implements ErnaehrungsplanPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ernaehrungsplanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gerichtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hauptbestandteilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beilageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sosseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zutatEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.Ernaehrungsplan.ErnaehrungsplanPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ErnaehrungsplanPackageImpl() {
		super(eNS_URI, ErnaehrungsplanFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ErnaehrungsplanPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ErnaehrungsplanPackage init() {
		if (isInited) return (ErnaehrungsplanPackage)EPackage.Registry.INSTANCE.getEPackage(ErnaehrungsplanPackage.eNS_URI);

		// Obtain or create and register package
		ErnaehrungsplanPackageImpl theErnaehrungsplanPackage = (ErnaehrungsplanPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ErnaehrungsplanPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ErnaehrungsplanPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theErnaehrungsplanPackage.createPackageContents();

		// Initialize created meta-data
		theErnaehrungsplanPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theErnaehrungsplanPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ErnaehrungsplanPackage.eNS_URI, theErnaehrungsplanPackage);
		return theErnaehrungsplanPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErnaehrungsplan() {
		return ernaehrungsplanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErnaehrungsplan_Enthaelt() {
		return (EReference)ernaehrungsplanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErnaehrungsplan_BestehtAus() {
		return (EReference)ernaehrungsplanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Kcal() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGericht() {
		return gerichtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGericht_Name() {
		return (EAttribute)gerichtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGericht_Kommentar() {
		return (EAttribute)gerichtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGericht_BestehtAus() {
		return (EReference)gerichtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHauptbestandteil() {
		return hauptbestandteilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBeilage() {
		return beilageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSosse() {
		return sosseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalat() {
		return salatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZutat() {
		return zutatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZutat_Name() {
		return (EAttribute)zutatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZutat_Kcal() {
		return (EAttribute)zutatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErnaehrungsplanFactory getErnaehrungsplanFactory() {
		return (ErnaehrungsplanFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ernaehrungsplanEClass = createEClass(ERNAEHRUNGSPLAN);
		createEReference(ernaehrungsplanEClass, ERNAEHRUNGSPLAN__ENTHAELT);
		createEReference(ernaehrungsplanEClass, ERNAEHRUNGSPLAN__BESTEHT_AUS);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__KCAL);
		createEAttribute(personEClass, PERSON__NAME);

		gerichtEClass = createEClass(GERICHT);
		createEAttribute(gerichtEClass, GERICHT__NAME);
		createEAttribute(gerichtEClass, GERICHT__KOMMENTAR);
		createEReference(gerichtEClass, GERICHT__BESTEHT_AUS);

		hauptbestandteilEClass = createEClass(HAUPTBESTANDTEIL);

		beilageEClass = createEClass(BEILAGE);

		sosseEClass = createEClass(SOSSE);

		salatEClass = createEClass(SALAT);

		zutatEClass = createEClass(ZUTAT);
		createEAttribute(zutatEClass, ZUTAT__NAME);
		createEAttribute(zutatEClass, ZUTAT__KCAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hauptbestandteilEClass.getESuperTypes().add(this.getZutat());
		beilageEClass.getESuperTypes().add(this.getZutat());
		sosseEClass.getESuperTypes().add(this.getZutat());
		salatEClass.getESuperTypes().add(this.getZutat());

		// Initialize classes, features, and operations; add parameters
		initEClass(ernaehrungsplanEClass, Ernaehrungsplan.class, "Ernaehrungsplan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErnaehrungsplan_Enthaelt(), this.getPerson(), null, "enthaelt", null, 1, -1, Ernaehrungsplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErnaehrungsplan_BestehtAus(), this.getGericht(), null, "bestehtAus", null, 0, -1, Ernaehrungsplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Kcal(), ecorePackage.getEInt(), "kcal", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gerichtEClass, Gericht.class, "Gericht", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGericht_Name(), ecorePackage.getEString(), "name", null, 0, 1, Gericht.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGericht_Kommentar(), ecorePackage.getEString(), "kommentar", null, 0, 1, Gericht.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGericht_BestehtAus(), this.getZutat(), null, "bestehtAus", null, 1, -1, Gericht.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hauptbestandteilEClass, Hauptbestandteil.class, "Hauptbestandteil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(beilageEClass, Beilage.class, "Beilage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sosseEClass, Sosse.class, "Sosse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(salatEClass, Salat.class, "Salat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(zutatEClass, Zutat.class, "Zutat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZutat_Name(), ecorePackage.getEString(), "name", null, 0, 1, Zutat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZutat_Kcal(), ecorePackage.getEInt(), "kcal", null, 0, 1, Zutat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ErnaehrungsplanPackageImpl
