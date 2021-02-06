/**
 */
package simulatorComponentMetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simulatorComponentMetamodel.SimulatorComponentMetamodelPackage;
import simulatorComponentMetamodel.SourceFile;
import simulatorComponentMetamodel.SourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simulatorComponentMetamodel.impl.SourcePackageImpl#getSourcefile <em>Sourcefile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourcePackageImpl extends NamedElementImpl implements SourcePackage {
	/**
	 * The cached value of the '{@link #getSourcefile() <em>Sourcefile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcefile()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceFile> sourcefile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourcePackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulatorComponentMetamodelPackage.Literals.SOURCE_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SourceFile> getSourcefile() {
		if (sourcefile == null) {
			sourcefile = new EObjectContainmentEList<SourceFile>(SourceFile.class, this, SimulatorComponentMetamodelPackage.SOURCE_PACKAGE__SOURCEFILE);
		}
		return sourcefile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimulatorComponentMetamodelPackage.SOURCE_PACKAGE__SOURCEFILE:
				return ((InternalEList<?>)getSourcefile()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimulatorComponentMetamodelPackage.SOURCE_PACKAGE__SOURCEFILE:
				return getSourcefile();
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
			case SimulatorComponentMetamodelPackage.SOURCE_PACKAGE__SOURCEFILE:
				getSourcefile().clear();
				getSourcefile().addAll((Collection<? extends SourceFile>)newValue);
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
			case SimulatorComponentMetamodelPackage.SOURCE_PACKAGE__SOURCEFILE:
				getSourcefile().clear();
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
			case SimulatorComponentMetamodelPackage.SOURCE_PACKAGE__SOURCEFILE:
				return sourcefile != null && !sourcefile.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SourcePackageImpl
