/**
 */
package mdn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mdn.MdnFactory
 * @model kind="package"
 * @generated
 */
public interface MdnPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mdn";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "mdn";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MdnPackage eINSTANCE = mdn.impl.MdnPackageImpl.init();

  /**
   * The meta object id for the '{@link mdn.impl.SdnImpl <em>Sdn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdn.impl.SdnImpl
   * @see mdn.impl.MdnPackageImpl#getSdn()
   * @generated
   */
  int SDN = 0;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SDN__NODES = 0;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SDN__LINKS = 1;

  /**
   * The number of structural features of the '<em>Sdn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SDN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link mdn.impl.NetworkNodeImpl <em>Network Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdn.impl.NetworkNodeImpl
   * @see mdn.impl.MdnPackageImpl#getNetworkNode()
   * @generated
   */
  int NETWORK_NODE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NETWORK_NODE__NAME = 0;

  /**
   * The feature id for the '<em><b>Mac</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NETWORK_NODE__MAC = 1;

  /**
   * The feature id for the '<em><b>Ip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NETWORK_NODE__IP = 2;

  /**
   * The number of structural features of the '<em>Network Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NETWORK_NODE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link mdn.impl.ControllerImpl <em>Controller</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdn.impl.ControllerImpl
   * @see mdn.impl.MdnPackageImpl#getController()
   * @generated
   */
  int CONTROLLER = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER__NAME = NETWORK_NODE__NAME;

  /**
   * The feature id for the '<em><b>Mac</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER__MAC = NETWORK_NODE__MAC;

  /**
   * The feature id for the '<em><b>Ip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER__IP = NETWORK_NODE__IP;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER__TYPE = NETWORK_NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Controller Switch</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER__CONTROLLER_SWITCH = NETWORK_NODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Controller</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER_FEATURE_COUNT = NETWORK_NODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link mdn.impl.HostImpl <em>Host</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdn.impl.HostImpl
   * @see mdn.impl.MdnPackageImpl#getHost()
   * @generated
   */
  int HOST = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOST__NAME = NETWORK_NODE__NAME;

  /**
   * The feature id for the '<em><b>Mac</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOST__MAC = NETWORK_NODE__MAC;

  /**
   * The feature id for the '<em><b>Ip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOST__IP = NETWORK_NODE__IP;

  /**
   * The feature id for the '<em><b>Host Switch</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOST__HOST_SWITCH = NETWORK_NODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Host</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOST_FEATURE_COUNT = NETWORK_NODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link mdn.impl.SwitchImpl <em>Switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdn.impl.SwitchImpl
   * @see mdn.impl.MdnPackageImpl#getSwitch()
   * @generated
   */
  int SWITCH = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__NAME = NETWORK_NODE__NAME;

  /**
   * The feature id for the '<em><b>Mac</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__MAC = NETWORK_NODE__MAC;

  /**
   * The feature id for the '<em><b>Ip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__IP = NETWORK_NODE__IP;

  /**
   * The feature id for the '<em><b>Ports</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__PORTS = NETWORK_NODE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Switch Controller</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__SWITCH_CONTROLLER = NETWORK_NODE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_FEATURE_COUNT = NETWORK_NODE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link mdn.impl.NetworkLinkImpl <em>Network Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdn.impl.NetworkLinkImpl
   * @see mdn.impl.MdnPackageImpl#getNetworkLink()
   * @generated
   */
  int NETWORK_LINK = 5;

  /**
   * The number of structural features of the '<em>Network Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NETWORK_LINK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link mdn.PacketHeader <em>Packet Header</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdn.PacketHeader
   * @see mdn.impl.MdnPackageImpl#getPacketHeader()
   * @generated
   */
  int PACKET_HEADER = 6;


  /**
   * Returns the meta object for class '{@link mdn.Sdn <em>Sdn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sdn</em>'.
   * @see mdn.Sdn
   * @generated
   */
  EClass getSdn();

  /**
   * Returns the meta object for the containment reference list '{@link mdn.Sdn#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see mdn.Sdn#getNodes()
   * @see #getSdn()
   * @generated
   */
  EReference getSdn_Nodes();

  /**
   * Returns the meta object for the containment reference list '{@link mdn.Sdn#getLinks <em>Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Links</em>'.
   * @see mdn.Sdn#getLinks()
   * @see #getSdn()
   * @generated
   */
  EReference getSdn_Links();

  /**
   * Returns the meta object for class '{@link mdn.Controller <em>Controller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Controller</em>'.
   * @see mdn.Controller
   * @generated
   */
  EClass getController();

  /**
   * Returns the meta object for the attribute '{@link mdn.Controller#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see mdn.Controller#getType()
   * @see #getController()
   * @generated
   */
  EAttribute getController_Type();

  /**
   * Returns the meta object for the reference list '{@link mdn.Controller#getControllerSwitch <em>Controller Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Controller Switch</em>'.
   * @see mdn.Controller#getControllerSwitch()
   * @see #getController()
   * @generated
   */
  EReference getController_ControllerSwitch();

  /**
   * Returns the meta object for class '{@link mdn.Host <em>Host</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Host</em>'.
   * @see mdn.Host
   * @generated
   */
  EClass getHost();

  /**
   * Returns the meta object for the reference '{@link mdn.Host#getHostSwitch <em>Host Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Host Switch</em>'.
   * @see mdn.Host#getHostSwitch()
   * @see #getHost()
   * @generated
   */
  EReference getHost_HostSwitch();

  /**
   * Returns the meta object for class '{@link mdn.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch</em>'.
   * @see mdn.Switch
   * @generated
   */
  EClass getSwitch();

  /**
   * Returns the meta object for the attribute '{@link mdn.Switch#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ports</em>'.
   * @see mdn.Switch#getPorts()
   * @see #getSwitch()
   * @generated
   */
  EAttribute getSwitch_Ports();

  /**
   * Returns the meta object for the reference list '{@link mdn.Switch#getSwitchController <em>Switch Controller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Switch Controller</em>'.
   * @see mdn.Switch#getSwitchController()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_SwitchController();

  /**
   * Returns the meta object for class '{@link mdn.NetworkNode <em>Network Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Network Node</em>'.
   * @see mdn.NetworkNode
   * @generated
   */
  EClass getNetworkNode();

  /**
   * Returns the meta object for the attribute '{@link mdn.NetworkNode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see mdn.NetworkNode#getName()
   * @see #getNetworkNode()
   * @generated
   */
  EAttribute getNetworkNode_Name();

  /**
   * Returns the meta object for the attribute '{@link mdn.NetworkNode#getMac <em>Mac</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mac</em>'.
   * @see mdn.NetworkNode#getMac()
   * @see #getNetworkNode()
   * @generated
   */
  EAttribute getNetworkNode_Mac();

  /**
   * Returns the meta object for the attribute '{@link mdn.NetworkNode#getIp <em>Ip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ip</em>'.
   * @see mdn.NetworkNode#getIp()
   * @see #getNetworkNode()
   * @generated
   */
  EAttribute getNetworkNode_Ip();

  /**
   * Returns the meta object for class '{@link mdn.NetworkLink <em>Network Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Network Link</em>'.
   * @see mdn.NetworkLink
   * @generated
   */
  EClass getNetworkLink();

  /**
   * Returns the meta object for enum '{@link mdn.PacketHeader <em>Packet Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Packet Header</em>'.
   * @see mdn.PacketHeader
   * @generated
   */
  EEnum getPacketHeader();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MdnFactory getMdnFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link mdn.impl.SdnImpl <em>Sdn</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdn.impl.SdnImpl
     * @see mdn.impl.MdnPackageImpl#getSdn()
     * @generated
     */
    EClass SDN = eINSTANCE.getSdn();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SDN__NODES = eINSTANCE.getSdn_Nodes();

    /**
     * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SDN__LINKS = eINSTANCE.getSdn_Links();

    /**
     * The meta object literal for the '{@link mdn.impl.ControllerImpl <em>Controller</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdn.impl.ControllerImpl
     * @see mdn.impl.MdnPackageImpl#getController()
     * @generated
     */
    EClass CONTROLLER = eINSTANCE.getController();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROLLER__TYPE = eINSTANCE.getController_Type();

    /**
     * The meta object literal for the '<em><b>Controller Switch</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROLLER__CONTROLLER_SWITCH = eINSTANCE.getController_ControllerSwitch();

    /**
     * The meta object literal for the '{@link mdn.impl.HostImpl <em>Host</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdn.impl.HostImpl
     * @see mdn.impl.MdnPackageImpl#getHost()
     * @generated
     */
    EClass HOST = eINSTANCE.getHost();

    /**
     * The meta object literal for the '<em><b>Host Switch</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HOST__HOST_SWITCH = eINSTANCE.getHost_HostSwitch();

    /**
     * The meta object literal for the '{@link mdn.impl.SwitchImpl <em>Switch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdn.impl.SwitchImpl
     * @see mdn.impl.MdnPackageImpl#getSwitch()
     * @generated
     */
    EClass SWITCH = eINSTANCE.getSwitch();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH__PORTS = eINSTANCE.getSwitch_Ports();

    /**
     * The meta object literal for the '<em><b>Switch Controller</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__SWITCH_CONTROLLER = eINSTANCE.getSwitch_SwitchController();

    /**
     * The meta object literal for the '{@link mdn.impl.NetworkNodeImpl <em>Network Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdn.impl.NetworkNodeImpl
     * @see mdn.impl.MdnPackageImpl#getNetworkNode()
     * @generated
     */
    EClass NETWORK_NODE = eINSTANCE.getNetworkNode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NETWORK_NODE__NAME = eINSTANCE.getNetworkNode_Name();

    /**
     * The meta object literal for the '<em><b>Mac</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NETWORK_NODE__MAC = eINSTANCE.getNetworkNode_Mac();

    /**
     * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NETWORK_NODE__IP = eINSTANCE.getNetworkNode_Ip();

    /**
     * The meta object literal for the '{@link mdn.impl.NetworkLinkImpl <em>Network Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdn.impl.NetworkLinkImpl
     * @see mdn.impl.MdnPackageImpl#getNetworkLink()
     * @generated
     */
    EClass NETWORK_LINK = eINSTANCE.getNetworkLink();

    /**
     * The meta object literal for the '{@link mdn.PacketHeader <em>Packet Header</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdn.PacketHeader
     * @see mdn.impl.MdnPackageImpl#getPacketHeader()
     * @generated
     */
    EEnum PACKET_HEADER = eINSTANCE.getPacketHeader();

  }

} //MdnPackage
