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
import uniModel.Faculty;
import uniModel.Professor;
import uniModel.Programme;
import uniModel.UniModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Faculty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uniModel.impl.FacultyImpl#getName <em>Name</em>}</li>
 *   <li>{@link uniModel.impl.FacultyImpl#getProgrammes <em>Programmes</em>}</li>
 *   <li>{@link uniModel.impl.FacultyImpl#getProfessors <em>Professors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacultyImpl extends MinimalEObjectImpl.Container implements Faculty {
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
	 * The cached value of the '{@link #getProgrammes() <em>Programmes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammes()
	 * @generated
	 * @ordered
	 */
	protected EList<Programme> programmes;

	/**
	 * The cached value of the '{@link #getProfessors() <em>Professors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Professor> professors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacultyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniModelPackage.Literals.FACULTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UniModelPackage.FACULTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Programme> getProgrammes() {
		if (programmes == null) {
			programmes = new EObjectResolvingEList<Programme>(Programme.class, this,
					UniModelPackage.FACULTY__PROGRAMMES);
		}
		return programmes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Professor> getProfessors() {
		if (professors == null) {
			professors = new EObjectResolvingEList<Professor>(Professor.class, this,
					UniModelPackage.FACULTY__PROFESSORS);
		}
		return professors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UniModelPackage.FACULTY__NAME:
			return getName();
		case UniModelPackage.FACULTY__PROGRAMMES:
			return getProgrammes();
		case UniModelPackage.FACULTY__PROFESSORS:
			return getProfessors();
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
		case UniModelPackage.FACULTY__NAME:
			setName((String) newValue);
			return;
		case UniModelPackage.FACULTY__PROGRAMMES:
			getProgrammes().clear();
			getProgrammes().addAll((Collection<? extends Programme>) newValue);
			return;
		case UniModelPackage.FACULTY__PROFESSORS:
			getProfessors().clear();
			getProfessors().addAll((Collection<? extends Professor>) newValue);
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
		case UniModelPackage.FACULTY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case UniModelPackage.FACULTY__PROGRAMMES:
			getProgrammes().clear();
			return;
		case UniModelPackage.FACULTY__PROFESSORS:
			getProfessors().clear();
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
		case UniModelPackage.FACULTY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case UniModelPackage.FACULTY__PROGRAMMES:
			return programmes != null && !programmes.isEmpty();
		case UniModelPackage.FACULTY__PROFESSORS:
			return professors != null && !professors.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //FacultyImpl
