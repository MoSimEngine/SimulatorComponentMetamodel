/**
 */
package simulatorComponentMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simulatorComponentMetamodel.SourceFile#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see simulatorComponentMetamodel.SimulatorComponentMetamodelPackage#getSourceFile()
 * @model
 * @generated
 */
public interface SourceFile extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' reference list.
	 * The list contents are of type {@link simulatorComponentMetamodel.SourceFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' reference list.
	 * @see simulatorComponentMetamodel.SimulatorComponentMetamodelPackage#getSourceFile_Imports()
	 * @model
	 * @generated
	 */
	EList<SourceFile> getImports();

} // SourceFile
