/**
 */
package simulatorComponentMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulator Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simulatorComponentMetamodel.SimulatorComponent#getRequires <em>Requires</em>}</li>
 *   <li>{@link simulatorComponentMetamodel.SimulatorComponent#getProvides <em>Provides</em>}</li>
 *   <li>{@link simulatorComponentMetamodel.SimulatorComponent#getSourceproject <em>Sourceproject</em>}</li>
 * </ul>
 *
 * @see simulatorComponentMetamodel.SimulatorComponentMetamodelPackage#getSimulatorComponent()
 * @model
 * @generated
 */
public interface SimulatorComponent extends NamedElement, IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Requires</b></em>' reference list.
	 * The list contents are of type {@link simulatorComponentMetamodel.SimulatorComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' reference list.
	 * @see simulatorComponentMetamodel.SimulatorComponentMetamodelPackage#getSimulatorComponent_Requires()
	 * @model
	 * @generated
	 */
	EList<SimulatorComponent> getRequires();

	/**
	 * Returns the value of the '<em><b>Provides</b></em>' reference list.
	 * The list contents are of type {@link simulatorComponentMetamodel.SimulatorComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' reference list.
	 * @see simulatorComponentMetamodel.SimulatorComponentMetamodelPackage#getSimulatorComponent_Provides()
	 * @model
	 * @generated
	 */
	EList<SimulatorComponent> getProvides();

	/**
	 * Returns the value of the '<em><b>Sourceproject</b></em>' containment reference list.
	 * The list contents are of type {@link simulatorComponentMetamodel.SourceProject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourceproject</em>' containment reference list.
	 * @see simulatorComponentMetamodel.SimulatorComponentMetamodelPackage#getSimulatorComponent_Sourceproject()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceProject> getSourceproject();

} // SimulatorComponent
