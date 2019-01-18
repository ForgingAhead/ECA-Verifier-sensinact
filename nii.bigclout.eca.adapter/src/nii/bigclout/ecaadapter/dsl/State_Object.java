/**
 * generated by Xtext 2.13.0.RC1
 */
package nii.bigclout.ecaadapter.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nii.bigclout.ecaadapter.dsl.State_Object#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see nii.bigclout.ecaadapter.dsl.DslPackage#getState_Object()
 * @model
 * @generated
 */
public interface State_Object extends Element
{
  /**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(State)
	 * @see nii.bigclout.ecaadapter.dsl.DslPackage#getState_Object_Value()
	 * @model containment="true"
	 * @generated
	 */
  State getValue();

  /**
	 * Sets the value of the '{@link nii.bigclout.ecaadapter.dsl.State_Object#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
  void setValue(State value);

} // State_Object
