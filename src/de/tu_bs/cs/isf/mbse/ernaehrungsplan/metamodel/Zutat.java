/**
 */
package de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zutat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Zutat#getName <em>Name</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Zutat#getKcal <em>Kcal</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.MetamodelPackage#getZutat()
 * @model abstract="true"
 * @generated
 */
public interface Zutat extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.MetamodelPackage#getZutat_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Zutat#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Kcal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kcal</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kcal</em>' attribute.
     * @see #setKcal(int)
     * @see de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.MetamodelPackage#getZutat_Kcal()
     * @model
     * @generated
     */
    int getKcal();

    /**
     * Sets the value of the '{@link de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Zutat#getKcal <em>Kcal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kcal</em>' attribute.
     * @see #getKcal()
     * @generated
     */
    void setKcal(int value);

} // Zutat
