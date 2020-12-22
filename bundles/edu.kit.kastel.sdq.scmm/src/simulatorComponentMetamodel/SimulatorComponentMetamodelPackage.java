/**
 */
package simulatorComponentMetamodel;

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
 * @see simulatorComponentMetamodel.SimulatorComponentMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface SimulatorComponentMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simulatorComponentMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/simulatorComponentMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simulatorComponentMetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimulatorComponentMetamodelPackage eINSTANCE = simulatorComponentMetamodel.impl.SimulatorComponentMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link simulatorComponentMetamodel.impl.SimulatorImpl <em>Simulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulatorComponentMetamodel.impl.SimulatorImpl
	 * @see simulatorComponentMetamodel.impl.SimulatorComponentMetamodelPackageImpl#getSimulator()
	 * @generated
	 */
	int SIMULATOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR__ID = 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR__COMPONENTS = 2;

	/**
	 * The number of structural features of the '<em>Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simulatorComponentMetamodel.impl.SimulatorComponentImpl <em>Simulator Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulatorComponentMetamodel.impl.SimulatorComponentImpl
	 * @see simulatorComponentMetamodel.impl.SimulatorComponentMetamodelPackageImpl#getSimulatorComponent()
	 * @generated
	 */
	int SIMULATOR_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_COMPONENT__ID = 1;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_COMPONENT__REQUIRES = 2;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_COMPONENT__PROVIDES = 3;

	/**
	 * The number of structural features of the '<em>Simulator Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_COMPONENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Simulator Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_COMPONENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link simulatorComponentMetamodel.Simulator <em>Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulator</em>'.
	 * @see simulatorComponentMetamodel.Simulator
	 * @generated
	 */
	EClass getSimulator();

	/**
	 * Returns the meta object for the attribute '{@link simulatorComponentMetamodel.Simulator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simulatorComponentMetamodel.Simulator#getName()
	 * @see #getSimulator()
	 * @generated
	 */
	EAttribute getSimulator_Name();

	/**
	 * Returns the meta object for the attribute '{@link simulatorComponentMetamodel.Simulator#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see simulatorComponentMetamodel.Simulator#getId()
	 * @see #getSimulator()
	 * @generated
	 */
	EAttribute getSimulator_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link simulatorComponentMetamodel.Simulator#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see simulatorComponentMetamodel.Simulator#getComponents()
	 * @see #getSimulator()
	 * @generated
	 */
	EReference getSimulator_Components();

	/**
	 * Returns the meta object for class '{@link simulatorComponentMetamodel.SimulatorComponent <em>Simulator Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulator Component</em>'.
	 * @see simulatorComponentMetamodel.SimulatorComponent
	 * @generated
	 */
	EClass getSimulatorComponent();

	/**
	 * Returns the meta object for the attribute '{@link simulatorComponentMetamodel.SimulatorComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simulatorComponentMetamodel.SimulatorComponent#getName()
	 * @see #getSimulatorComponent()
	 * @generated
	 */
	EAttribute getSimulatorComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link simulatorComponentMetamodel.SimulatorComponent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see simulatorComponentMetamodel.SimulatorComponent#getId()
	 * @see #getSimulatorComponent()
	 * @generated
	 */
	EAttribute getSimulatorComponent_Id();

	/**
	 * Returns the meta object for the reference list '{@link simulatorComponentMetamodel.SimulatorComponent#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see simulatorComponentMetamodel.SimulatorComponent#getRequires()
	 * @see #getSimulatorComponent()
	 * @generated
	 */
	EReference getSimulatorComponent_Requires();

	/**
	 * Returns the meta object for the reference list '{@link simulatorComponentMetamodel.SimulatorComponent#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provides</em>'.
	 * @see simulatorComponentMetamodel.SimulatorComponent#getProvides()
	 * @see #getSimulatorComponent()
	 * @generated
	 */
	EReference getSimulatorComponent_Provides();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimulatorComponentMetamodelFactory getSimulatorComponentMetamodelFactory();

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
		 * The meta object literal for the '{@link simulatorComponentMetamodel.impl.SimulatorImpl <em>Simulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulatorComponentMetamodel.impl.SimulatorImpl
		 * @see simulatorComponentMetamodel.impl.SimulatorComponentMetamodelPackageImpl#getSimulator()
		 * @generated
		 */
		EClass SIMULATOR = eINSTANCE.getSimulator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATOR__NAME = eINSTANCE.getSimulator_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATOR__ID = eINSTANCE.getSimulator_Id();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATOR__COMPONENTS = eINSTANCE.getSimulator_Components();

		/**
		 * The meta object literal for the '{@link simulatorComponentMetamodel.impl.SimulatorComponentImpl <em>Simulator Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulatorComponentMetamodel.impl.SimulatorComponentImpl
		 * @see simulatorComponentMetamodel.impl.SimulatorComponentMetamodelPackageImpl#getSimulatorComponent()
		 * @generated
		 */
		EClass SIMULATOR_COMPONENT = eINSTANCE.getSimulatorComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATOR_COMPONENT__NAME = eINSTANCE.getSimulatorComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATOR_COMPONENT__ID = eINSTANCE.getSimulatorComponent_Id();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATOR_COMPONENT__REQUIRES = eINSTANCE.getSimulatorComponent_Requires();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATOR_COMPONENT__PROVIDES = eINSTANCE.getSimulatorComponent_Provides();

	}

} //SimulatorComponentMetamodelPackage
