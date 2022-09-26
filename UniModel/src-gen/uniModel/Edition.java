/**
 */
package uniModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uniModel.Edition#getYear <em>Year</em>}</li>
 *   <li>{@link uniModel.Edition#getStudents <em>Students</em>}</li>
 *   <li>{@link uniModel.Edition#getProfessors <em>Professors</em>}</li>
 * </ul>
 *
 * @see uniModel.UniModelPackage#getEdition()
 * @model
 * @generated
 */
public interface Edition extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see uniModel.UniModelPackage#getEdition_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link uniModel.Edition#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Students</b></em>' reference list.
	 * The list contents are of type {@link uniModel.Student}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' reference list.
	 * @see uniModel.UniModelPackage#getEdition_Students()
	 * @model
	 * @generated
	 */
	EList<Student> getStudents();

	/**
	 * Returns the value of the '<em><b>Professors</b></em>' reference list.
	 * The list contents are of type {@link uniModel.Professor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professors</em>' reference list.
	 * @see uniModel.UniModelPackage#getEdition_Professors()
	 * @model
	 * @generated
	 */
	EList<Professor> getProfessors();

} // Edition
