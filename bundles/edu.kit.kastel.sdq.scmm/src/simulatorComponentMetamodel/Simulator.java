/**
 */
package simulatorComponentMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simulatorComponentMetamodel.Simulator#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see simulatorComponentMetamodel.SimulatorComponentMetamodelPackage#getSimulator()
 * @model
 * @generated
 */
public interface Simulator extends NamedElement, IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link simulatorComponentMetamodel.SimulatorComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see simulatorComponentMetamodel.SimulatorComponentMetamodelPackage#getSimulator_Components()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SimulatorComponent> getComponents();

} // Simulator
