/**
 */
package uniModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enrollment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uniModel.Enrollment#getGrade <em>Grade</em>}</li>
 *   <li>{@link uniModel.Enrollment#getEdition <em>Edition</em>}</li>
 *   <li>{@link uniModel.Enrollment#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see uniModel.UniModelPackage#getEnrollment()
 * @model
 * @generated
 */
public interface Enrollment extends EObject {
	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see #setGrade(int)
	 * @see uniModel.UniModelPackage#getEnrollment_Grade()
	 * @model
	 * @generated
	 */
	int getGrade();

	/**
	 * Sets the value of the '{@link uniModel.Enrollment#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(int value);

	/**
	 * Returns the value of the '<em><b>Edition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edition</em>' reference.
	 * @see #setEdition(Edition)
	 * @see uniModel.UniModelPackage#getEnrollment_Edition()
	 * @model
	 * @generated
	 */
	Edition getEdition();

	/**
	 * Sets the value of the '{@link uniModel.Enrollment#getEdition <em>Edition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition</em>' reference.
	 * @see #getEdition()
	 * @generated
	 */
	void setEdition(Edition value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see uniModel.UniModelPackage#getEnrollment_Course()
	 * @model
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link uniModel.Enrollment#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

} // Enrollment
