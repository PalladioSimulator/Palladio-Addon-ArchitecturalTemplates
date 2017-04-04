/**
 */
package org.palladiosimulator.architecturaltemplates;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>PCM File
 * Extensions</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 * @see org.palladiosimulator.architecturaltemplates.ArchitecturaltemplatesPackage#getPCMFileExtensions()
 * @model
 * @generated
 */
public enum PCMFileExtensions implements Enumerator {
	/**
	 * The '<em><b>SYSTEM</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM(0, "SYSTEM", "system"),

	/**
	 * The '<em><b>ALLOCATION</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see #ALLOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	ALLOCATION(1, "ALLOCATION", "allocation"),

	/**
	 * The '<em><b>RESOURCEENVIRONMENT</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #RESOURCEENVIRONMENT_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCEENVIRONMENT(2, "RESOURCEENVIRONMENT", "resourceenvironment"),

	/**
	 * The '<em><b>REPOSITORY</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see #REPOSITORY_VALUE
	 * @generated
	 * @ordered
	 */
	REPOSITORY(3, "REPOSITORY", "repository"),

	/**
	 * The '<em><b>USAGEMODEL</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see #USAGEMODEL_VALUE
	 * @generated
	 * @ordered
	 */
	USAGEMODEL(4, "USAGEMODEL", "usagemodel"),

	/**
	 * The '<em><b>RESOURCETYPE</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see #RESOURCETYPE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCETYPE(5, "RESOURCETYPE", "resourcetype"),

	/**
	 * The '<em><b>MONITORREPOSITORY</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #MONITORREPOSITORY_VALUE
	 * @generated
	 * @ordered
	 */
	MONITORREPOSITORY(6, "MONITORREPOSITORY", "monitorrepository"),

	/**
	 * The '<em><b>PCMMEASURINGPOINT</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #PCMMEASURINGPOINT_VALUE
	 * @generated
	 * @ordered
	 */
	PCMMEASURINGPOINT(7, "PCMMEASURINGPOINT", "pcmmeasuringpoint"),

	/**
	 * The '<em><b>SERVICELEVELOBJECTIVE</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #SERVICELEVELOBJECTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICELEVELOBJECTIVE(8, "SERVICELEVELOBJECTIVE", "slo");

	/**
	 * The '<em><b>SYSTEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYSTEM</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSTEM
	 * @model literal="system"
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_VALUE = 0;

	/**
	 * The '<em><b>ALLOCATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALLOCATION</b></em>' literal object isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALLOCATION
	 * @model literal="allocation"
	 * @generated
	 * @ordered
	 */
	public static final int ALLOCATION_VALUE = 1;

	/**
	 * The '<em><b>RESOURCEENVIRONMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESOURCEENVIRONMENT</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCEENVIRONMENT
	 * @model literal="resourceenvironment"
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCEENVIRONMENT_VALUE = 2;

	/**
	 * The '<em><b>REPOSITORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REPOSITORY</b></em>' literal object isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPOSITORY
	 * @model literal="repository"
	 * @generated
	 * @ordered
	 */
	public static final int REPOSITORY_VALUE = 3;

	/**
	 * The '<em><b>USAGEMODEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USAGEMODEL</b></em>' literal object isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USAGEMODEL
	 * @model literal="usagemodel"
	 * @generated
	 * @ordered
	 */
	public static final int USAGEMODEL_VALUE = 4;

	/**
	 * The '<em><b>RESOURCETYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESOURCETYPE</b></em>' literal object isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCETYPE
	 * @model literal="resourcetype"
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCETYPE_VALUE = 5;

	/**
	 * The '<em><b>MONITORREPOSITORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MONITORREPOSITORY</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONITORREPOSITORY
	 * @model literal="monitorrepository"
	 * @generated
	 * @ordered
	 */
	public static final int MONITORREPOSITORY_VALUE = 6;

	/**
	 * The '<em><b>PCMMEASURINGPOINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PCMMEASURINGPOINT</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PCMMEASURINGPOINT
	 * @model literal="pcmmeasuringpoint"
	 * @generated
	 * @ordered
	 */
	public static final int PCMMEASURINGPOINT_VALUE = 7;

	/**
	 * The '<em><b>SERVICELEVELOBJECTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SERVICELEVELOBJECTIVE</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICELEVELOBJECTIVE
	 * @model literal="slo"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICELEVELOBJECTIVE_VALUE = 8;

	/**
	 * An array of all the '<em><b>PCM File Extensions</b></em>' enumerators.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	private static final PCMFileExtensions[] VALUES_ARRAY = new PCMFileExtensions[] { SYSTEM, ALLOCATION,
			RESOURCEENVIRONMENT, REPOSITORY, USAGEMODEL, RESOURCETYPE, MONITORREPOSITORY, PCMMEASURINGPOINT,
			SERVICELEVELOBJECTIVE, };

	/**
	 * A public read-only list of all the '<em><b>PCM File Extensions</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final List<PCMFileExtensions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>PCM File Extensions</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PCMFileExtensions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PCMFileExtensions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PCM File Extensions</b></em>' literal with the specified name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param name
	 *            the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PCMFileExtensions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PCMFileExtensions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PCM File Extensions</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PCMFileExtensions get(int value) {
		switch (value) {
		case SYSTEM_VALUE:
			return SYSTEM;
		case ALLOCATION_VALUE:
			return ALLOCATION;
		case RESOURCEENVIRONMENT_VALUE:
			return RESOURCEENVIRONMENT;
		case REPOSITORY_VALUE:
			return REPOSITORY;
		case USAGEMODEL_VALUE:
			return USAGEMODEL;
		case RESOURCETYPE_VALUE:
			return RESOURCETYPE;
		case MONITORREPOSITORY_VALUE:
			return MONITORREPOSITORY;
		case PCMMEASURINGPOINT_VALUE:
			return PCMMEASURINGPOINT;
		case SERVICELEVELOBJECTIVE_VALUE:
			return SERVICELEVELOBJECTIVE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private PCMFileExtensions(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // PCMFileExtensions
