/**
 */
package simulatorComponentMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simulatorComponentMetamodel.SourceProject#getSourcepackage <em>Sourcepackage</em>}</li>
 * </ul>
 *
 * @see simulatorComponentMetamodel.SimulatorComponentMetamodelPackage#getSourceProject()
 * @model
 * @generated
 */
public interface SourceProject extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sourcepackage</b></em>' containment reference list.
	 * The list contents are of type {@link simulatorComponentMetamodel.SourcePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourcepackage</em>' containment reference list.
	 * @see simulatorComponentMetamodel.SimulatorComponentMetamodelPackage#getSourceProject_Sourcepackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourcePackage> getSourcepackage();

} // SourceProject
