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
import simulatorComponentMetamodel.SourcePackage;
import simulatorComponentMetamodel.SourceProject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simulatorComponentMetamodel.impl.SourceProjectImpl#getSourcepackage <em>Sourcepackage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceProjectImpl extends NamedElementImpl implements SourceProject {
	/**
	 * The cached value of the '{@link #getSourcepackage() <em>Sourcepackage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcepackage()
	 * @generated
	 * @ordered
	 */
	protected EList<SourcePackage> sourcepackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulatorComponentMetamodelPackage.Literals.SOURCE_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SourcePackage> getSourcepackage() {
		if (sourcepackage == null) {
			sourcepackage = new EObjectContainmentEList<SourcePackage>(SourcePackage.class, this, SimulatorComponentMetamodelPackage.SOURCE_PROJECT__SOURCEPACKAGE);
		}
		return sourcepackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimulatorComponentMetamodelPackage.SOURCE_PROJECT__SOURCEPACKAGE:
				return ((InternalEList<?>)getSourcepackage()).basicRemove(otherEnd, msgs);
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
			case SimulatorComponentMetamodelPackage.SOURCE_PROJECT__SOURCEPACKAGE:
				return getSourcepackage();
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
			case SimulatorComponentMetamodelPackage.SOURCE_PROJECT__SOURCEPACKAGE:
				getSourcepackage().clear();
				getSourcepackage().addAll((Collection<? extends SourcePackage>)newValue);
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
			case SimulatorComponentMetamodelPackage.SOURCE_PROJECT__SOURCEPACKAGE:
				getSourcepackage().clear();
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
			case SimulatorComponentMetamodelPackage.SOURCE_PROJECT__SOURCEPACKAGE:
				return sourcepackage != null && !sourcepackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SourceProjectImpl
