/**
 */
package simulatorComponentMetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see simulatorComponentMetamodel.SimulatorComponentMetamodelPackage
 * @generated
 */
public interface SimulatorComponentMetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimulatorComponentMetamodelFactory eINSTANCE = simulatorComponentMetamodel.impl.SimulatorComponentMetamodelFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Simulator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulator</em>'.
	 * @generated
	 */
	Simulator createSimulator();

	/**
	 * Returns a new object of class '<em>Simulator Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulator Component</em>'.
	 * @generated
	 */
	SimulatorComponent createSimulatorComponent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimulatorComponentMetamodelPackage getSimulatorComponentMetamodelPackage();

} //SimulatorComponentMetamodelFactory
