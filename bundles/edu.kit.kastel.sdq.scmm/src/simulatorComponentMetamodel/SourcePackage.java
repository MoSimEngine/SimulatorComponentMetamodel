/**
 */
package simulatorComponentMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simulatorComponentMetamodel.SourcePackage#getSourcefile <em>Sourcefile</em>}</li>
 * </ul>
 *
 * @see simulatorComponentMetamodel.SimulatorComponentMetamodelPackage#getSourcePackage()
 * @model
 * @generated
 */
public interface SourcePackage extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sourcefile</b></em>' containment reference list.
	 * The list contents are of type {@link simulatorComponentMetamodel.SourceFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourcefile</em>' containment reference list.
	 * @see simulatorComponentMetamodel.SimulatorComponentMetamodelPackage#getSourcePackage_Sourcefile()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceFile> getSourcefile();

} // SourcePackage
