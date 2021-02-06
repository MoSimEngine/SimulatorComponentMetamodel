/**
 */
package simulatorComponentMetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import simulatorComponentMetamodel.SimulatorComponentMetamodelPackage;
import simulatorComponentMetamodel.SourceFile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simulatorComponentMetamodel.impl.SourceFileImpl#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceFileImpl extends NamedElementImpl implements SourceFile {
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceFile> imports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulatorComponentMetamodelPackage.Literals.SOURCE_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SourceFile> getImports() {
		if (imports == null) {
			imports = new EObjectResolvingEList<SourceFile>(SourceFile.class, this, SimulatorComponentMetamodelPackage.SOURCE_FILE__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimulatorComponentMetamodelPackage.SOURCE_FILE__IMPORTS:
				return getImports();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimulatorComponentMetamodelPackage.SOURCE_FILE__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends SourceFile>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimulatorComponentMetamodelPackage.SOURCE_FILE__IMPORTS:
				getImports().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimulatorComponentMetamodelPackage.SOURCE_FILE__IMPORTS:
				return imports != null && !imports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SourceFileImpl
