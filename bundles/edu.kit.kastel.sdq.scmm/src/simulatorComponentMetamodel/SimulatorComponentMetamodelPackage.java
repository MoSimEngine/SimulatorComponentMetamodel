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
	 * The meta object id for the '{@link simulatorComponentMetamodel.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulatorComponentMetamodel.impl.NamedElementImpl
	 * @see simulatorComponentMetamodel.impl.SimulatorComponentMetamodelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

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
	int SIMULATOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR__COMPONENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

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
	int SIMULATOR_COMPONENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_COMPONENT__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_COMPONENT__REQUIRES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_COMPONENT__PROVIDES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sourceproject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_COMPONENT__SOURCEPROJECT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Simulator Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_COMPONENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Simulator Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_COMPONENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulatorComponentMetamodel.impl.SourceFileImpl <em>Source File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulatorComponentMetamodel.impl.SourceFileImpl
	 * @see simulatorComponentMetamodel.impl.SimulatorComponentMetamodelPackageImpl#getSourceFile()
	 * @generated
	 */
	int SOURCE_FILE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE__IMPORTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Source File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulatorComponentMetamodel.impl.SourcePackageImpl <em>Source Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulatorComponentMetamodel.impl.SourcePackageImpl
	 * @see simulatorComponentMetamodel.impl.SimulatorComponentMetamodelPackageImpl#getSourcePackage()
	 * @generated
	 */
	int SOURCE_PACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PACKAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sourcefile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PACKAGE__SOURCEFILE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Source Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PACKAGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simulatorComponentMetamodel.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulatorComponentMetamodel.impl.IdentifiableElementImpl
	 * @see simulatorComponentMetamodel.impl.SimulatorComponentMetamodelPackageImpl#getIdentifiableElement()
	 * @generated
	 */
	int IDENTIFIABLE_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Identifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Identifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simulatorComponentMetamodel.impl.SourceProjectImpl <em>Source Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simulatorComponentMetamodel.impl.SourceProjectImpl
	 * @see simulatorComponentMetamodel.impl.SimulatorComponentMetamodelPackageImpl#getSourceProject()
	 * @generated
	 */
	int SOURCE_PROJECT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PROJECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sourcepackage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PROJECT__SOURCEPACKAGE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PROJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Source Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PROJECT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the containment reference list '{@link simulatorComponentMetamodel.SimulatorComponent#getSourceproject <em>Sourceproject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sourceproject</em>'.
	 * @see simulatorComponentMetamodel.SimulatorComponent#getSourceproject()
	 * @see #getSimulatorComponent()
	 * @generated
	 */
	EReference getSimulatorComponent_Sourceproject();

	/**
	 * Returns the meta object for class '{@link simulatorComponentMetamodel.SourceFile <em>Source File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source File</em>'.
	 * @see simulatorComponentMetamodel.SourceFile
	 * @generated
	 */
	EClass getSourceFile();

	/**
	 * Returns the meta object for the reference list '{@link simulatorComponentMetamodel.SourceFile#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see simulatorComponentMetamodel.SourceFile#getImports()
	 * @see #getSourceFile()
	 * @generated
	 */
	EReference getSourceFile_Imports();

	/**
	 * Returns the meta object for class '{@link simulatorComponentMetamodel.SourcePackage <em>Source Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Package</em>'.
	 * @see simulatorComponentMetamodel.SourcePackage
	 * @generated
	 */
	EClass getSourcePackage();

	/**
	 * Returns the meta object for the containment reference list '{@link simulatorComponentMetamodel.SourcePackage#getSourcefile <em>Sourcefile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sourcefile</em>'.
	 * @see simulatorComponentMetamodel.SourcePackage#getSourcefile()
	 * @see #getSourcePackage()
	 * @generated
	 */
	EReference getSourcePackage_Sourcefile();

	/**
	 * Returns the meta object for class '{@link simulatorComponentMetamodel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see simulatorComponentMetamodel.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link simulatorComponentMetamodel.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simulatorComponentMetamodel.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link simulatorComponentMetamodel.IdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable Element</em>'.
	 * @see simulatorComponentMetamodel.IdentifiableElement
	 * @generated
	 */
	EClass getIdentifiableElement();

	/**
	 * Returns the meta object for the attribute '{@link simulatorComponentMetamodel.IdentifiableElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see simulatorComponentMetamodel.IdentifiableElement#getId()
	 * @see #getIdentifiableElement()
	 * @generated
	 */
	EAttribute getIdentifiableElement_Id();

	/**
	 * Returns the meta object for class '{@link simulatorComponentMetamodel.SourceProject <em>Source Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Project</em>'.
	 * @see simulatorComponentMetamodel.SourceProject
	 * @generated
	 */
	EClass getSourceProject();

	/**
	 * Returns the meta object for the containment reference list '{@link simulatorComponentMetamodel.SourceProject#getSourcepackage <em>Sourcepackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sourcepackage</em>'.
	 * @see simulatorComponentMetamodel.SourceProject#getSourcepackage()
	 * @see #getSourceProject()
	 * @generated
	 */
	EReference getSourceProject_Sourcepackage();

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

		/**
		 * The meta object literal for the '<em><b>Sourceproject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATOR_COMPONENT__SOURCEPROJECT = eINSTANCE.getSimulatorComponent_Sourceproject();

		/**
		 * The meta object literal for the '{@link simulatorComponentMetamodel.impl.SourceFileImpl <em>Source File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulatorComponentMetamodel.impl.SourceFileImpl
		 * @see simulatorComponentMetamodel.impl.SimulatorComponentMetamodelPackageImpl#getSourceFile()
		 * @generated
		 */
		EClass SOURCE_FILE = eINSTANCE.getSourceFile();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_FILE__IMPORTS = eINSTANCE.getSourceFile_Imports();

		/**
		 * The meta object literal for the '{@link simulatorComponentMetamodel.impl.SourcePackageImpl <em>Source Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulatorComponentMetamodel.impl.SourcePackageImpl
		 * @see simulatorComponentMetamodel.impl.SimulatorComponentMetamodelPackageImpl#getSourcePackage()
		 * @generated
		 */
		EClass SOURCE_PACKAGE = eINSTANCE.getSourcePackage();

		/**
		 * The meta object literal for the '<em><b>Sourcefile</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_PACKAGE__SOURCEFILE = eINSTANCE.getSourcePackage_Sourcefile();

		/**
		 * The meta object literal for the '{@link simulatorComponentMetamodel.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulatorComponentMetamodel.impl.NamedElementImpl
		 * @see simulatorComponentMetamodel.impl.SimulatorComponentMetamodelPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link simulatorComponentMetamodel.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulatorComponentMetamodel.impl.IdentifiableElementImpl
		 * @see simulatorComponentMetamodel.impl.SimulatorComponentMetamodelPackageImpl#getIdentifiableElement()
		 * @generated
		 */
		EClass IDENTIFIABLE_ELEMENT = eINSTANCE.getIdentifiableElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE_ELEMENT__ID = eINSTANCE.getIdentifiableElement_Id();

		/**
		 * The meta object literal for the '{@link simulatorComponentMetamodel.impl.SourceProjectImpl <em>Source Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simulatorComponentMetamodel.impl.SourceProjectImpl
		 * @see simulatorComponentMetamodel.impl.SimulatorComponentMetamodelPackageImpl#getSourceProject()
		 * @generated
		 */
		EClass SOURCE_PROJECT = eINSTANCE.getSourceProject();

		/**
		 * The meta object literal for the '<em><b>Sourcepackage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_PROJECT__SOURCEPACKAGE = eINSTANCE.getSourceProject_Sourcepackage();

	}

} //SimulatorComponentMetamodelPackage
