/**
 */
package metamodel;

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
 *   <li>{@link metamodel.Ernaehrungsplan#getPersonen <em>Personen</em>}</li>
 *   <li>{@link metamodel.Ernaehrungsplan#getGerichte <em>Gerichte</em>}</li>
 *   <li>{@link metamodel.Ernaehrungsplan#getZutaten <em>Zutaten</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.MetamodelPackage#getErnaehrungsplan()
 * @model
 * @generated
 */
public interface Ernaehrungsplan extends EObject {
	/**
	 * Returns the value of the '<em><b>Personen</b></em>' reference list.
	 * The list contents are of type {@link metamodel.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personen</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personen</em>' reference list.
	 * @see metamodel.MetamodelPackage#getErnaehrungsplan_Personen()
	 * @model required="true"
	 * @generated
	 */
	EList<Person> getPersonen();

	/**
	 * Returns the value of the '<em><b>Gerichte</b></em>' reference list.
	 * The list contents are of type {@link metamodel.Gericht}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gerichte</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gerichte</em>' reference list.
	 * @see metamodel.MetamodelPackage#getErnaehrungsplan_Gerichte()
	 * @model required="true"
	 * @generated
	 */
	EList<Gericht> getGerichte();

	/**
	 * Returns the value of the '<em><b>Zutaten</b></em>' reference list.
	 * The list contents are of type {@link metamodel.Zutat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zutaten</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zutaten</em>' reference list.
	 * @see metamodel.MetamodelPackage#getErnaehrungsplan_Zutaten()
	 * @model required="true"
	 * @generated
	 */
	EList<Zutat> getZutaten();

} // Ernaehrungsplan
