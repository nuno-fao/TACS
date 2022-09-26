/**
 */
package uniModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Faculty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uniModel.Faculty#getName <em>Name</em>}</li>
 *   <li>{@link uniModel.Faculty#getProgrammes <em>Programmes</em>}</li>
 *   <li>{@link uniModel.Faculty#getProfessors <em>Professors</em>}</li>
 * </ul>
 *
 * @see uniModel.UniModelPackage#getFaculty()
 * @model
 * @generated
 */
public interface Faculty extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uniModel.UniModelPackage#getFaculty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uniModel.Faculty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Programmes</b></em>' reference list.
	 * The list contents are of type {@link uniModel.Programme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programmes</em>' reference list.
	 * @see uniModel.UniModelPackage#getFaculty_Programmes()
	 * @model
	 * @generated
	 */
	EList<Programme> getProgrammes();

	/**
	 * Returns the value of the '<em><b>Professors</b></em>' reference list.
	 * The list contents are of type {@link uniModel.Professor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professors</em>' reference list.
	 * @see uniModel.UniModelPackage#getFaculty_Professors()
	 * @model
	 * @generated
	 */
	EList<Professor> getProfessors();

} // Faculty
