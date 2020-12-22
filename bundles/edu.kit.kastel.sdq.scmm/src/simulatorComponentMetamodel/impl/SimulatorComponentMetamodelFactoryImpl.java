/**
 */
package simulatorComponentMetamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simulatorComponentMetamodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulatorComponentMetamodelFactoryImpl extends EFactoryImpl implements SimulatorComponentMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimulatorComponentMetamodelFactory init() {
		try {
			SimulatorComponentMetamodelFactory theSimulatorComponentMetamodelFactory = (SimulatorComponentMetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(SimulatorComponentMetamodelPackage.eNS_URI);
			if (theSimulatorComponentMetamodelFactory != null) {
				return theSimulatorComponentMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimulatorComponentMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulatorComponentMetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimulatorComponentMetamodelPackage.SIMULATOR: return createSimulator();
			case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT: return createSimulatorComponent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simulator createSimulator() {
		SimulatorImpl simulator = new SimulatorImpl();
		return simulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulatorComponent createSimulatorComponent() {
		SimulatorComponentImpl simulatorComponent = new SimulatorComponentImpl();
		return simulatorComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulatorComponentMetamodelPackage getSimulatorComponentMetamodelPackage() {
		return (SimulatorComponentMetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimulatorComponentMetamodelPackage getPackage() {
		return SimulatorComponentMetamodelPackage.eINSTANCE;
	}

} //SimulatorComponentMetamodelFactoryImpl
