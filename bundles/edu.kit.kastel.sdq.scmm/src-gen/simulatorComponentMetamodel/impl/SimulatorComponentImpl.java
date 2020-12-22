/**
 */
package simulatorComponentMetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import simulatorComponentMetamodel.SimulatorComponent;
import simulatorComponentMetamodel.SimulatorComponentMetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulator Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simulatorComponentMetamodel.impl.SimulatorComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link simulatorComponentMetamodel.impl.SimulatorComponentImpl#getId <em>Id</em>}</li>
 *   <li>{@link simulatorComponentMetamodel.impl.SimulatorComponentImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link simulatorComponentMetamodel.impl.SimulatorComponentImpl#getProvides <em>Provides</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulatorComponentImpl extends MinimalEObjectImpl.Container implements SimulatorComponent {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<SimulatorComponent> requires;

	/**
	 * The cached value of the '{@link #getProvides() <em>Provides</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected EList<SimulatorComponent> provides;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulatorComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulatorComponentMetamodelPackage.Literals.SIMULATOR_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimulatorComponent> getRequires() {
		if (requires == null) {
			requires = new EObjectResolvingEList<SimulatorComponent>(SimulatorComponent.class, this,
					SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimulatorComponent> getProvides() {
		if (provides == null) {
			provides = new EObjectResolvingEList<SimulatorComponent>(SimulatorComponent.class, this,
					SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__PROVIDES);
		}
		return provides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__NAME:
			return getName();
		case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__ID:
			return getId();
		case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__REQUIRES:
			return getRequires();
		case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__PROVIDES:
			return getProvides();
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
		case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__NAME:
			setName((String) newValue);
			return;
		case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__ID:
			setId((String) newValue);
			return;
		case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__REQUIRES:
			getRequires().clear();
			getRequires().addAll((Collection<? extends SimulatorComponent>) newValue);
			return;
		case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__PROVIDES:
			getProvides().clear();
			getProvides().addAll((Collection<? extends SimulatorComponent>) newValue);
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
		case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__ID:
			setId(ID_EDEFAULT);
			return;
		case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__REQUIRES:
			getRequires().clear();
			return;
		case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__PROVIDES:
			getProvides().clear();
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
		case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__REQUIRES:
			return requires != null && !requires.isEmpty();
		case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__PROVIDES:
			return provides != null && !provides.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SimulatorComponentImpl
