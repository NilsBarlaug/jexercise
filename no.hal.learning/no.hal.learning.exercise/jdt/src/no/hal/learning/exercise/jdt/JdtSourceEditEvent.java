/**
 */
package no.hal.learning.exercise.jdt;

import no.hal.learning.exercise.TaskEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.JdtSourceEditEvent#getSourceCode <em>Source Code</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.JdtSourceEditEvent#getSizeMeasure <em>Size Measure</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.JdtSourceEditEvent#getErrorCount <em>Error Count</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.JdtSourceEditEvent#getWarningCount <em>Warning Count</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtSourceEditEvent()
 * @model
 * @generated
 */
public interface JdtSourceEditEvent extends TaskEvent {
	/**
	 * Returns the value of the '<em><b>Source Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Code</em>' attribute.
	 * @see #setSourceCode(String)
	 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtSourceEditEvent_SourceCode()
	 * @model
	 * @generated
	 */
	String getSourceCode();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.JdtSourceEditEvent#getSourceCode <em>Source Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Code</em>' attribute.
	 * @see #getSourceCode()
	 * @generated
	 */
	void setSourceCode(String value);

	/**
	 * Returns the value of the '<em><b>Size Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Measure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Measure</em>' attribute.
	 * @see #setSizeMeasure(int)
	 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtSourceEditEvent_SizeMeasure()
	 * @model annotation="no.hal.learning.exercise.views.ExerciseView dashes='_ '"
	 * @generated
	 */
	int getSizeMeasure();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.JdtSourceEditEvent#getSizeMeasure <em>Size Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Measure</em>' attribute.
	 * @see #getSizeMeasure()
	 * @generated
	 */
	void setSizeMeasure(int value);

	/**
	 * Returns the value of the '<em><b>Error Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Count</em>' attribute.
	 * @see #setErrorCount(int)
	 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtSourceEditEvent_ErrorCount()
	 * @model annotation="no.hal.learning.exercise.views.ExerciseView dashes='_ - '"
	 * @generated
	 */
	int getErrorCount();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.JdtSourceEditEvent#getErrorCount <em>Error Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Count</em>' attribute.
	 * @see #getErrorCount()
	 * @generated
	 */
	void setErrorCount(int value);

	/**
	 * Returns the value of the '<em><b>Warning Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warning Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning Count</em>' attribute.
	 * @see #setWarningCount(int)
	 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtSourceEditEvent_WarningCount()
	 * @model annotation="no.hal.learning.exercise.views.ExerciseView dashes='_ . '"
	 * @generated
	 */
	int getWarningCount();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.JdtSourceEditEvent#getWarningCount <em>Warning Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning Count</em>' attribute.
	 * @see #getWarningCount()
	 * @generated
	 */
	void setWarningCount(int value);

} // JdtClassEvent
