/**
 */
package simulatorComponentMetamodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simulatorComponentMetamodel.IdentifiableElement;
import simulatorComponentMetamodel.NamedElement;
import simulatorComponentMetamodel.Simulator;
import simulatorComponentMetamodel.SimulatorComponent;
import simulatorComponentMetamodel.SimulatorComponentMetamodelFactory;
import simulatorComponentMetamodel.SimulatorComponentMetamodelPackage;
import simulatorComponentMetamodel.SourceFile;
import simulatorComponentMetamodel.SourcePackage;
import simulatorComponentMetamodel.SourceProject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulatorComponentMetamodelPackageImpl extends EPackageImpl implements SimulatorComponentMetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulatorComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourcePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceProjectEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see simulatorComponentMetamodel.SimulatorComponentMetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimulatorComponentMetamodelPackageImpl() {
		super(eNS_URI, SimulatorComponentMetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SimulatorComponentMetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimulatorComponentMetamodelPackage init() {
		if (isInited) return (SimulatorComponentMetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(SimulatorComponentMetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSimulatorComponentMetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SimulatorComponentMetamodelPackageImpl theSimulatorComponentMetamodelPackage = registeredSimulatorComponentMetamodelPackage instanceof SimulatorComponentMetamodelPackageImpl ? (SimulatorComponentMetamodelPackageImpl)registeredSimulatorComponentMetamodelPackage : new SimulatorComponentMetamodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSimulatorComponentMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theSimulatorComponentMetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimulatorComponentMetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimulatorComponentMetamodelPackage.eNS_URI, theSimulatorComponentMetamodelPackage);
		return theSimulatorComponentMetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimulator() {
		return simulatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimulator_Components() {
		return (EReference)simulatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimulatorComponent() {
		return simulatorComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimulatorComponent_Requires() {
		return (EReference)simulatorComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimulatorComponent_Provides() {
		return (EReference)simulatorComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimulatorComponent_Sourceproject() {
		return (EReference)simulatorComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceFile() {
		return sourceFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSourceFile_Imports() {
		return (EReference)sourceFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourcePackage() {
		return sourcePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSourcePackage_Sourcefile() {
		return (EReference)sourcePackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifiableElement() {
		return identifiableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiableElement_Id() {
		return (EAttribute)identifiableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceProject() {
		return sourceProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSourceProject_Sourcepackage() {
		return (EReference)sourceProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimulatorComponentMetamodelFactory getSimulatorComponentMetamodelFactory() {
		return (SimulatorComponentMetamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		simulatorEClass = createEClass(SIMULATOR);
		createEReference(simulatorEClass, SIMULATOR__COMPONENTS);

		simulatorComponentEClass = createEClass(SIMULATOR_COMPONENT);
		createEReference(simulatorComponentEClass, SIMULATOR_COMPONENT__REQUIRES);
		createEReference(simulatorComponentEClass, SIMULATOR_COMPONENT__PROVIDES);
		createEReference(simulatorComponentEClass, SIMULATOR_COMPONENT__SOURCEPROJECT);

		sourceFileEClass = createEClass(SOURCE_FILE);
		createEReference(sourceFileEClass, SOURCE_FILE__IMPORTS);

		sourcePackageEClass = createEClass(SOURCE_PACKAGE);
		createEReference(sourcePackageEClass, SOURCE_PACKAGE__SOURCEFILE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		identifiableElementEClass = createEClass(IDENTIFIABLE_ELEMENT);
		createEAttribute(identifiableElementEClass, IDENTIFIABLE_ELEMENT__ID);

		sourceProjectEClass = createEClass(SOURCE_PROJECT);
		createEReference(sourceProjectEClass, SOURCE_PROJECT__SOURCEPACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simulatorEClass.getESuperTypes().add(this.getNamedElement());
		simulatorEClass.getESuperTypes().add(this.getIdentifiableElement());
		simulatorComponentEClass.getESuperTypes().add(this.getNamedElement());
		simulatorComponentEClass.getESuperTypes().add(this.getIdentifiableElement());
		sourceFileEClass.getESuperTypes().add(this.getNamedElement());
		sourcePackageEClass.getESuperTypes().add(this.getNamedElement());
		sourceProjectEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(simulatorEClass, Simulator.class, "Simulator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimulator_Components(), this.getSimulatorComponent(), null, "components", null, 1, -1, Simulator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simulatorComponentEClass, SimulatorComponent.class, "SimulatorComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimulatorComponent_Requires(), this.getSimulatorComponent(), null, "requires", null, 0, -1, SimulatorComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulatorComponent_Provides(), this.getSimulatorComponent(), null, "provides", null, 0, -1, SimulatorComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulatorComponent_Sourceproject(), this.getSourceProject(), null, "sourceproject", null, 0, -1, SimulatorComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceFileEClass, SourceFile.class, "SourceFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceFile_Imports(), this.getSourceFile(), null, "imports", null, 0, -1, SourceFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourcePackageEClass, SourcePackage.class, "SourcePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourcePackage_Sourcefile(), this.getSourceFile(), null, "sourcefile", null, 0, -1, SourcePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableElementEClass, IdentifiableElement.class, "IdentifiableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiableElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, IdentifiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceProjectEClass, SourceProject.class, "SourceProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceProject_Sourcepackage(), this.getSourcePackage(), null, "sourcepackage", null, 0, -1, SourceProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SimulatorComponentMetamodelPackageImpl
