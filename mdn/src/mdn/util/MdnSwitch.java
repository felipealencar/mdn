/**
 */
package mdn.util;

import mdn.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mdn.MdnPackage
 * @generated
 */
public class MdnSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MdnPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdnSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MdnPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MdnPackage.SDN:
      {
        Sdn sdn = (Sdn)theEObject;
        T result = caseSdn(sdn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MdnPackage.CONTROLLER:
      {
        Controller controller = (Controller)theEObject;
        T result = caseController(controller);
        if (result == null) result = caseNetworkNode(controller);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MdnPackage.HOST:
      {
        Host host = (Host)theEObject;
        T result = caseHost(host);
        if (result == null) result = caseNetworkNode(host);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MdnPackage.SWITCH:
      {
        mdn.Switch switch_ = (mdn.Switch)theEObject;
        T result = caseSwitch(switch_);
        if (result == null) result = caseNetworkNode(switch_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MdnPackage.NETWORK_NODE:
      {
        NetworkNode networkNode = (NetworkNode)theEObject;
        T result = caseNetworkNode(networkNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MdnPackage.POLICY:
      {
        Policy policy = (Policy)theEObject;
        T result = casePolicy(policy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MdnPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MdnPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = casePolicyObject(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MdnPackage.TRAFFIC:
      {
        Traffic traffic = (Traffic)theEObject;
        T result = caseTraffic(traffic);
        if (result == null) result = casePolicyObject(traffic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MdnPackage.TIME:
      {
        Time time = (Time)theEObject;
        T result = caseTime(time);
        if (result == null) result = casePolicyObject(time);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MdnPackage.PACKET_HEADER:
      {
        PacketHeader packetHeader = (PacketHeader)theEObject;
        T result = casePacketHeader(packetHeader);
        if (result == null) result = casePolicyObject(packetHeader);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MdnPackage.POLICY_OBJECT:
      {
        PolicyObject policyObject = (PolicyObject)theEObject;
        T result = casePolicyObject(policyObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sdn</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sdn</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSdn(Sdn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseController(Controller object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Host</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Host</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHost(Host object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitch(mdn.Switch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Network Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Network Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNetworkNode(NetworkNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Policy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Policy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePolicy(Policy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Traffic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Traffic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTraffic(Traffic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTime(Time object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Packet Header</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Packet Header</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePacketHeader(PacketHeader object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Policy Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Policy Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePolicyObject(PolicyObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MdnSwitch
