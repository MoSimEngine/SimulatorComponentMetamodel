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
			case SimulatorComponentMetamodelPackage.SOURCE_FILE: return createSourceFile();
			case SimulatorComponentMetamodelPackage.SOURCE_PACKAGE: return createSourcePackage();
			case SimulatorComponentMetamodelPackage.SOURCE_PROJECT: return createSourceProject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Simulator createSimulator() {
		SimulatorImpl simulator = new SimulatorImpl();
		return simulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimulatorComponent createSimulatorComponent() {
		SimulatorComponentImpl simulatorComponent = new SimulatorComponentImpl();
		return simulatorComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceFile createSourceFile() {
		SourceFileImpl sourceFile = new SourceFileImpl();
		return sourceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourcePackage createSourcePackage() {
		SourcePackageImpl sourcePackage = new SourcePackageImpl();
		return sourcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceProject createSourceProject() {
		SourceProjectImpl sourceProject = new SourceProjectImpl();
		return sourceProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
