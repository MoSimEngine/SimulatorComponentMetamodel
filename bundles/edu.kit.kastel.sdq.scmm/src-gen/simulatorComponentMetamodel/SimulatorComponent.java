/**
 */
package simulatorComponentMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulator Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simulatorComponentMetamodel.SimulatorComponent#getName <em>Name</em>}</li>
 *   <li>{@link simulatorComponentMetamodel.SimulatorComponent#getId <em>Id</em>}</li>
 *   <li>{@link simulatorComponentMetamodel.SimulatorComponent#getRequires <em>Requires</em>}</li>
 *   <li>{@link simulatorComponentMetamodel.SimulatorComponent#getProvides <em>Provides</em>}</li>
 * </ul>
 *
 * @see simulatorComponentMetamodel.SimulatorComponentMetamodelPackage#getSimulatorComponent()
 * @model
 * @generated
 */
public interface SimulatorComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simulatorComponentMetamodel.SimulatorComponentMetamodelPackage#getSimulatorComponent_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simulatorComponentMetamodel.SimulatorComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see simulatorComponentMetamodel.SimulatorComponentMetamodelPackage#getSimulatorComponent_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link simulatorComponentMetamodel.SimulatorComponent#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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

} // SimulatorComponent
