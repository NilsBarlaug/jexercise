/**
 */
package no.hal.jex.jextest.jexTest;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.Parameter#isVararg <em>Vararg</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.Parameter#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.hal.jex.jextest.jexTest.JexTestPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(JvmTypeReference)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getParameter_Type()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getType();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.Parameter#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Vararg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vararg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vararg</em>' attribute.
   * @see #setVararg(boolean)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getParameter_Vararg()
   * @model
   * @generated
   */
  boolean isVararg();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.Parameter#isVararg <em>Vararg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vararg</em>' attribute.
   * @see #isVararg()
   * @generated
   */
  void setVararg(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.Parameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Parameter
