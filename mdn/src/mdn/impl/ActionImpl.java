/**
 */
package mdn.impl;

import mdn.Action;
import mdn.Actions;
import mdn.MdnPackage;
import mdn.NetworkNode;
import mdn.PacketHeader;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mdn.impl.ActionImpl#getType <em>Type</em>}</li>
 *   <li>{@link mdn.impl.ActionImpl#getActionPacketHeader <em>Action Packet Header</em>}</li>
 *   <li>{@link mdn.impl.ActionImpl#getActionForwardToNode <em>Action Forward To Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends PolicyObjectImpl implements Action
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final Actions TYPE_EDEFAULT = Actions.FORWARD;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Actions type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getActionPacketHeader() <em>Action Packet Header</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionPacketHeader()
   * @generated
   * @ordered
   */
  protected PacketHeader actionPacketHeader;

  /**
   * The cached value of the '{@link #getActionForwardToNode() <em>Action Forward To Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionForwardToNode()
   * @generated
   * @ordered
   */
  protected NetworkNode actionForwardToNode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MdnPackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actions getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Actions newType)
  {
    Actions oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.ACTION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PacketHeader getActionPacketHeader()
  {
    if (actionPacketHeader != null && actionPacketHeader.eIsProxy())
    {
      InternalEObject oldActionPacketHeader = (InternalEObject)actionPacketHeader;
      actionPacketHeader = (PacketHeader)eResolveProxy(oldActionPacketHeader);
      if (actionPacketHeader != oldActionPacketHeader)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MdnPackage.ACTION__ACTION_PACKET_HEADER, oldActionPacketHeader, actionPacketHeader));
      }
    }
    return actionPacketHeader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PacketHeader basicGetActionPacketHeader()
  {
    return actionPacketHeader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionPacketHeader(PacketHeader newActionPacketHeader)
  {
    PacketHeader oldActionPacketHeader = actionPacketHeader;
    actionPacketHeader = newActionPacketHeader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.ACTION__ACTION_PACKET_HEADER, oldActionPacketHeader, actionPacketHeader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetworkNode getActionForwardToNode()
  {
    if (actionForwardToNode != null && actionForwardToNode.eIsProxy())
    {
      InternalEObject oldActionForwardToNode = (InternalEObject)actionForwardToNode;
      actionForwardToNode = (NetworkNode)eResolveProxy(oldActionForwardToNode);
      if (actionForwardToNode != oldActionForwardToNode)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MdnPackage.ACTION__ACTION_FORWARD_TO_NODE, oldActionForwardToNode, actionForwardToNode));
      }
    }
    return actionForwardToNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetworkNode basicGetActionForwardToNode()
  {
    return actionForwardToNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionForwardToNode(NetworkNode newActionForwardToNode)
  {
    NetworkNode oldActionForwardToNode = actionForwardToNode;
    actionForwardToNode = newActionForwardToNode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MdnPackage.ACTION__ACTION_FORWARD_TO_NODE, oldActionForwardToNode, actionForwardToNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MdnPackage.ACTION__TYPE:
        return getType();
      case MdnPackage.ACTION__ACTION_PACKET_HEADER:
        if (resolve) return getActionPacketHeader();
        return basicGetActionPacketHeader();
      case MdnPackage.ACTION__ACTION_FORWARD_TO_NODE:
        if (resolve) return getActionForwardToNode();
        return basicGetActionForwardToNode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MdnPackage.ACTION__TYPE:
        setType((Actions)newValue);
        return;
      case MdnPackage.ACTION__ACTION_PACKET_HEADER:
        setActionPacketHeader((PacketHeader)newValue);
        return;
      case MdnPackage.ACTION__ACTION_FORWARD_TO_NODE:
        setActionForwardToNode((NetworkNode)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MdnPackage.ACTION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case MdnPackage.ACTION__ACTION_PACKET_HEADER:
        setActionPacketHeader((PacketHeader)null);
        return;
      case MdnPackage.ACTION__ACTION_FORWARD_TO_NODE:
        setActionForwardToNode((NetworkNode)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MdnPackage.ACTION__TYPE:
        return type != TYPE_EDEFAULT;
      case MdnPackage.ACTION__ACTION_PACKET_HEADER:
        return actionPacketHeader != null;
      case MdnPackage.ACTION__ACTION_FORWARD_TO_NODE:
        return actionForwardToNode != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //ActionImpl
