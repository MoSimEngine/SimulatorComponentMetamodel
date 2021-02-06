/**
 */
package simulatorComponentMetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simulatorComponentMetamodel.IdentifiableElement;
import simulatorComponentMetamodel.SimulatorComponent;
import simulatorComponentMetamodel.SimulatorComponentMetamodelPackage;
import simulatorComponentMetamodel.SourceProject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulator Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simulatorComponentMetamodel.impl.SimulatorComponentImpl#getId <em>Id</em>}</li>
 *   <li>{@link simulatorComponentMetamodel.impl.SimulatorComponentImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link simulatorComponentMetamodel.impl.SimulatorComponentImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link simulatorComponentMetamodel.impl.SimulatorComponentImpl#getSourceproject <em>Sourceproject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulatorComponentImpl extends NamedElementImpl implements SimulatorComponent {
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
	 * The cached value of the '{@link #getSourceproject() <em>Sourceproject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceproject()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceProject> sourceproject;

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
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimulatorComponent> getRequires() {
		if (requires == null) {
			requires = new EObjectResolvingEList<SimulatorComponent>(SimulatorComponent.class, this, SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimulatorComponent> getProvides() {
		if (provides == null) {
			provides = new EObjectResolvingEList<SimulatorComponent>(SimulatorComponent.class, this, SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__PROVIDES);
		}
		return provides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SourceProject> getSourceproject() {
		if (sourceproject == null) {
			sourceproject = new EObjectContainmentEList<SourceProject>(SourceProject.class, this, SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__SOURCEPROJECT);
		}
		return sourceproject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__SOURCEPROJECT:
				return ((InternalEList<?>)getSourceproject()).basicRemove(otherEnd, msgs);
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
			case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__ID:
				return getId();
			case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__REQUIRES:
				return getRequires();
			case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__PROVIDES:
				return getProvides();
			case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__SOURCEPROJECT:
				return getSourceproject();
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
			case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__ID:
				setId((String)newValue);
				return;
			case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends SimulatorComponent>)newValue);
				return;
			case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__PROVIDES:
				getProvides().clear();
				getProvides().addAll((Collection<? extends SimulatorComponent>)newValue);
				return;
			case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__SOURCEPROJECT:
				getSourceproject().clear();
				getSourceproject().addAll((Collection<? extends SourceProject>)newValue);
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
			case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__ID:
				setId(ID_EDEFAULT);
				return;
			case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__REQUIRES:
				getRequires().clear();
				return;
			case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__PROVIDES:
				getProvides().clear();
				return;
			case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__SOURCEPROJECT:
				getSourceproject().clear();
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
			case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__REQUIRES:
				return requires != null && !requires.isEmpty();
			case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__PROVIDES:
				return provides != null && !provides.isEmpty();
			case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__SOURCEPROJECT:
				return sourceproject != null && !sourceproject.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IdentifiableElement.class) {
			switch (derivedFeatureID) {
				case SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__ID: return SimulatorComponentMetamodelPackage.IDENTIFIABLE_ELEMENT__ID;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IdentifiableElement.class) {
			switch (baseFeatureID) {
				case SimulatorComponentMetamodelPackage.IDENTIFIABLE_ELEMENT__ID: return SimulatorComponentMetamodelPackage.SIMULATOR_COMPONENT__ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SimulatorComponentImpl
