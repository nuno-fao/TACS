/**
 */
package uniModel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import uniModel.Course;
import uniModel.Edition;
import uniModel.UniModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uniModel.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link uniModel.impl.CourseImpl#getEditions <em>Editions</em>}</li>
 *   <li>{@link uniModel.impl.CourseImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link uniModel.impl.CourseImpl#getAcademicYear <em>Academic Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
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
	 * The cached value of the '{@link #getEditions() <em>Editions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Edition> editions;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final int CREDITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected int credits = CREDITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcademicYear() <em>Academic Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcademicYear()
	 * @generated
	 * @ordered
	 */
	protected static final int ACADEMIC_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAcademicYear() <em>Academic Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcademicYear()
	 * @generated
	 * @ordered
	 */
	protected int academicYear = ACADEMIC_YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniModelPackage.Literals.COURSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UniModelPackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edition> getEditions() {
		if (editions == null) {
			editions = new EObjectResolvingEList<Edition>(Edition.class, this, UniModelPackage.COURSE__EDITIONS);
		}
		return editions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredits(int newCredits) {
		int oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniModelPackage.COURSE__CREDITS, oldCredits,
					credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAcademicYear() {
		return academicYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcademicYear(int newAcademicYear) {
		int oldAcademicYear = academicYear;
		academicYear = newAcademicYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniModelPackage.COURSE__ACADEMIC_YEAR,
					oldAcademicYear, academicYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UniModelPackage.COURSE__NAME:
			return getName();
		case UniModelPackage.COURSE__EDITIONS:
			return getEditions();
		case UniModelPackage.COURSE__CREDITS:
			return getCredits();
		case UniModelPackage.COURSE__ACADEMIC_YEAR:
			return getAcademicYear();
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
		case UniModelPackage.COURSE__NAME:
			setName((String) newValue);
			return;
		case UniModelPackage.COURSE__EDITIONS:
			getEditions().clear();
			getEditions().addAll((Collection<? extends Edition>) newValue);
			return;
		case UniModelPackage.COURSE__CREDITS:
			setCredits((Integer) newValue);
			return;
		case UniModelPackage.COURSE__ACADEMIC_YEAR:
			setAcademicYear((Integer) newValue);
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
		case UniModelPackage.COURSE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case UniModelPackage.COURSE__EDITIONS:
			getEditions().clear();
			return;
		case UniModelPackage.COURSE__CREDITS:
			setCredits(CREDITS_EDEFAULT);
			return;
		case UniModelPackage.COURSE__ACADEMIC_YEAR:
			setAcademicYear(ACADEMIC_YEAR_EDEFAULT);
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
		case UniModelPackage.COURSE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case UniModelPackage.COURSE__EDITIONS:
			return editions != null && !editions.isEmpty();
		case UniModelPackage.COURSE__CREDITS:
			return credits != CREDITS_EDEFAULT;
		case UniModelPackage.COURSE__ACADEMIC_YEAR:
			return academicYear != ACADEMIC_YEAR_EDEFAULT;
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
		result.append(", credits: ");
		result.append(credits);
		result.append(", academicYear: ");
		result.append(academicYear);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
