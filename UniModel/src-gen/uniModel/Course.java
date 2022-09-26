/**
 */
package uniModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uniModel.Course#getName <em>Name</em>}</li>
 *   <li>{@link uniModel.Course#getEditions <em>Editions</em>}</li>
 *   <li>{@link uniModel.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link uniModel.Course#getAcademicYear <em>Academic Year</em>}</li>
 * </ul>
 *
 * @see uniModel.UniModelPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uniModel.UniModelPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uniModel.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Editions</b></em>' reference list.
	 * The list contents are of type {@link uniModel.Edition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editions</em>' reference list.
	 * @see uniModel.UniModelPackage#getCourse_Editions()
	 * @model
	 * @generated
	 */
	EList<Edition> getEditions();

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(int)
	 * @see uniModel.UniModelPackage#getCourse_Credits()
	 * @model
	 * @generated
	 */
	int getCredits();

	/**
	 * Sets the value of the '{@link uniModel.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(int value);

	/**
	 * Returns the value of the '<em><b>Academic Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Academic Year</em>' attribute.
	 * @see #setAcademicYear(int)
	 * @see uniModel.UniModelPackage#getCourse_AcademicYear()
	 * @model
	 * @generated
	 */
	int getAcademicYear();

	/**
	 * Sets the value of the '{@link uniModel.Course#getAcademicYear <em>Academic Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Academic Year</em>' attribute.
	 * @see #getAcademicYear()
	 * @generated
	 */
	void setAcademicYear(int value);

} // Course
