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
   * The feature id for the '<em><b>Policies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SDN__POLICIES = 1;

  /**
   * The feature id for the '<em><b>Rule Objects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SDN__RULE_OBJECTS = 2;

  /**
   * The feature id for the '<em><b>Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SDN__GROUPS = 3;

  /**
   * The number of structural features of the '<em>Sdn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SDN_FEATURE_COUNT = 4;

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
   * The number of structural features of the '<em>Controller</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER_FEATURE_COUNT = NETWORK_NODE_FEATURE_COUNT + 1;

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
   * The feature id for the '<em><b>Switches</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__SWITCHES = NETWORK_NODE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_FEATURE_COUNT = NETWORK_NODE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link mdn.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdn.impl.RuleImpl
   * @see mdn.impl.MdnPackageImpl#getRule()
   * @generated
   */
  int RULE = 5;

  /**
   * The feature id for the '<em><b>Source Host Rule</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__SOURCE_HOST_RULE = 0;

  /**
   * The feature id for the '<em><b>Target Host Rule</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__TARGET_HOST_RULE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__NAME = 2;

  /**
   * The feature id for the '<em><b>Rule Condition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__RULE_CONDITION = 3;

  /**
   * The feature id for the '<em><b>Rule Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__RULE_ACTION = 4;

  /**
   * The feature id for the '<em><b>Target Group Rule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__TARGET_GROUP_RULE = 5;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link mdn.impl.RuleObjectImpl <em>Rule Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdn.impl.RuleObjectImpl
   * @see mdn.impl.MdnPackageImpl#getRuleObject()
   * @generated
   */
  int RULE_OBJECT = 11;

  /**
   * The number of structural features of the '<em>Rule Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_OBJECT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link mdn.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdn.impl.ActionImpl
   * @see mdn.impl.MdnPackageImpl#getAction()
   * @generated
   */
  int ACTION = 6;

  /**
   * The meta object id for the '{@link mdn.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdn.impl.ConditionImpl
   * @see mdn.impl.MdnPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__TYPE = RULE_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Action Packet Header</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__ACTION_PACKET_HEADER = RULE_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Action Forward To Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__ACTION_FORWARD_TO_NODE = RULE_OBJECT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = RULE_OBJECT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__CONDITION = RULE_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition Time</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__CONDITION_TIME = RULE_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Condition Traffic</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__CONDITION_TRAFFIC = RULE_OBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Condition Packet</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__CONDITION_PACKET = RULE_OBJECT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = RULE_OBJECT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link mdn.impl.TrafficImpl <em>Traffic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdn.impl.TrafficImpl
   * @see mdn.impl.MdnPackageImpl#getTraffic()
   * @generated
   */
  int TRAFFIC = 8;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAFFIC__OPERATOR = RULE_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAFFIC__UNIT = RULE_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAFFIC__VALUE = RULE_OBJECT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Traffic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAFFIC_FEATURE_COUNT = RULE_OBJECT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link mdn.impl.TimeImpl <em>Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdn.impl.TimeImpl
   * @see mdn.impl.MdnPackageImpl#getTime()
   * @generated
   */
  int TIME = 9;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME__OPERATOR = RULE_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Begin Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME__BEGIN_DATE = RULE_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>End Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME__END_DATE = RULE_OBJECT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_FEATURE_COUNT = RULE_OBJECT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link mdn.impl.PacketHeaderImpl <em>Packet Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdn.impl.PacketHeaderImpl
   * @see mdn.impl.MdnPackageImpl#getPacketHeader()
   * @generated
   */
  int PACKET_HEADER = 10;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKET_HEADER__OPERATOR = RULE_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Header</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKET_HEADER__HEADER = RULE_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKET_HEADER__VALUE = RULE_OBJECT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Packet Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKET_HEADER_FEATURE_COUNT = RULE_OBJECT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link mdn.impl.GroupImpl <em>Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdn.impl.GroupImpl
   * @see mdn.impl.MdnPackageImpl#getGroup()
   * @generated
   */
  int GROUP = 12;

  /**
   * The feature id for the '<em><b>Hosts Group</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__HOSTS_GROUP = 0;

  /**
   * The feature id for the '<em><b>Ip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__IP = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__NAME = 2;

  /**
   * The number of structural features of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link mdn.PacketHeaders <em>Packet Headers</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdn.PacketHeaders
   * @see mdn.impl.MdnPackageImpl#getPacketHeaders()
   * @generated
   */
  int PACKET_HEADERS = 13;

  /**
   * The meta object id for the '{@link mdn.Actions <em>Actions</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdn.Actions
   * @see mdn.impl.MdnPackageImpl#getActions()
   * @generated
   */
  int ACTIONS = 14;

  /**
   * The meta object id for the '{@link mdn.Conditions <em>Conditions</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdn.Conditions
   * @see mdn.impl.MdnPackageImpl#getConditions()
   * @generated
   */
  int CONDITIONS = 15;

  /**
   * The meta object id for the '{@link mdn.RelationalOperators <em>Relational Operators</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdn.RelationalOperators
   * @see mdn.impl.MdnPackageImpl#getRelationalOperators()
   * @generated
   */
  int RELATIONAL_OPERATORS = 16;


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
   * Returns the meta object for the containment reference list '{@link mdn.Sdn#getPolicies <em>Policies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Policies</em>'.
   * @see mdn.Sdn#getPolicies()
   * @see #getSdn()
   * @generated
   */
  EReference getSdn_Policies();

  /**
   * Returns the meta object for the containment reference list '{@link mdn.Sdn#getRuleObjects <em>Rule Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rule Objects</em>'.
   * @see mdn.Sdn#getRuleObjects()
   * @see #getSdn()
   * @generated
   */
  EReference getSdn_RuleObjects();

  /**
   * Returns the meta object for the containment reference list '{@link mdn.Sdn#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Groups</em>'.
   * @see mdn.Sdn#getGroups()
   * @see #getSdn()
   * @generated
   */
  EReference getSdn_Groups();

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
   * Returns the meta object for the reference list '{@link mdn.Switch#getSwitches <em>Switches</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Switches</em>'.
   * @see mdn.Switch#getSwitches()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_Switches();

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
   * Returns the meta object for class '{@link mdn.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see mdn.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the reference list '{@link mdn.Rule#getSourceHostRule <em>Source Host Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Source Host Rule</em>'.
   * @see mdn.Rule#getSourceHostRule()
   * @see #getRule()
   * @generated
   */
  EReference getRule_SourceHostRule();

  /**
   * Returns the meta object for the reference list '{@link mdn.Rule#getTargetHostRule <em>Target Host Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Target Host Rule</em>'.
   * @see mdn.Rule#getTargetHostRule()
   * @see #getRule()
   * @generated
   */
  EReference getRule_TargetHostRule();

  /**
   * Returns the meta object for the attribute '{@link mdn.Rule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see mdn.Rule#getName()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Name();

  /**
   * Returns the meta object for the reference '{@link mdn.Rule#getRuleCondition <em>Rule Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rule Condition</em>'.
   * @see mdn.Rule#getRuleCondition()
   * @see #getRule()
   * @generated
   */
  EReference getRule_RuleCondition();

  /**
   * Returns the meta object for the reference '{@link mdn.Rule#getRuleAction <em>Rule Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rule Action</em>'.
   * @see mdn.Rule#getRuleAction()
   * @see #getRule()
   * @generated
   */
  EReference getRule_RuleAction();

  /**
   * Returns the meta object for the reference '{@link mdn.Rule#getTargetGroupRule <em>Target Group Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Group Rule</em>'.
   * @see mdn.Rule#getTargetGroupRule()
   * @see #getRule()
   * @generated
   */
  EReference getRule_TargetGroupRule();

  /**
   * Returns the meta object for class '{@link mdn.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see mdn.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link mdn.Action#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see mdn.Action#getType()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Type();

  /**
   * Returns the meta object for the reference '{@link mdn.Action#getActionPacketHeader <em>Action Packet Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Action Packet Header</em>'.
   * @see mdn.Action#getActionPacketHeader()
   * @see #getAction()
   * @generated
   */
  EReference getAction_ActionPacketHeader();

  /**
   * Returns the meta object for the reference '{@link mdn.Action#getActionForwardToNode <em>Action Forward To Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Action Forward To Node</em>'.
   * @see mdn.Action#getActionForwardToNode()
   * @see #getAction()
   * @generated
   */
  EReference getAction_ActionForwardToNode();

  /**
   * Returns the meta object for class '{@link mdn.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see mdn.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the attribute '{@link mdn.Condition#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see mdn.Condition#getCondition()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Condition();

  /**
   * Returns the meta object for the reference '{@link mdn.Condition#getConditionTime <em>Condition Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Condition Time</em>'.
   * @see mdn.Condition#getConditionTime()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_ConditionTime();

  /**
   * Returns the meta object for the reference '{@link mdn.Condition#getConditionTraffic <em>Condition Traffic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Condition Traffic</em>'.
   * @see mdn.Condition#getConditionTraffic()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_ConditionTraffic();

  /**
   * Returns the meta object for the reference '{@link mdn.Condition#getConditionPacket <em>Condition Packet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Condition Packet</em>'.
   * @see mdn.Condition#getConditionPacket()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_ConditionPacket();

  /**
   * Returns the meta object for class '{@link mdn.Traffic <em>Traffic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Traffic</em>'.
   * @see mdn.Traffic
   * @generated
   */
  EClass getTraffic();

  /**
   * Returns the meta object for the attribute '{@link mdn.Traffic#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see mdn.Traffic#getOperator()
   * @see #getTraffic()
   * @generated
   */
  EAttribute getTraffic_Operator();

  /**
   * Returns the meta object for the attribute '{@link mdn.Traffic#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see mdn.Traffic#getUnit()
   * @see #getTraffic()
   * @generated
   */
  EAttribute getTraffic_Unit();

  /**
   * Returns the meta object for the attribute '{@link mdn.Traffic#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see mdn.Traffic#getValue()
   * @see #getTraffic()
   * @generated
   */
  EAttribute getTraffic_Value();

  /**
   * Returns the meta object for class '{@link mdn.Time <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time</em>'.
   * @see mdn.Time
   * @generated
   */
  EClass getTime();

  /**
   * Returns the meta object for the attribute '{@link mdn.Time#getBeginDate <em>Begin Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Begin Date</em>'.
   * @see mdn.Time#getBeginDate()
   * @see #getTime()
   * @generated
   */
  EAttribute getTime_BeginDate();

  /**
   * Returns the meta object for the attribute '{@link mdn.Time#getEndDate <em>End Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Date</em>'.
   * @see mdn.Time#getEndDate()
   * @see #getTime()
   * @generated
   */
  EAttribute getTime_EndDate();

  /**
   * Returns the meta object for the attribute '{@link mdn.Time#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see mdn.Time#getOperator()
   * @see #getTime()
   * @generated
   */
  EAttribute getTime_Operator();

  /**
   * Returns the meta object for class '{@link mdn.PacketHeader <em>Packet Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Packet Header</em>'.
   * @see mdn.PacketHeader
   * @generated
   */
  EClass getPacketHeader();

  /**
   * Returns the meta object for the attribute '{@link mdn.PacketHeader#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see mdn.PacketHeader#getOperator()
   * @see #getPacketHeader()
   * @generated
   */
  EAttribute getPacketHeader_Operator();

  /**
   * Returns the meta object for the attribute '{@link mdn.PacketHeader#getHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Header</em>'.
   * @see mdn.PacketHeader#getHeader()
   * @see #getPacketHeader()
   * @generated
   */
  EAttribute getPacketHeader_Header();

  /**
   * Returns the meta object for the attribute '{@link mdn.PacketHeader#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see mdn.PacketHeader#getValue()
   * @see #getPacketHeader()
   * @generated
   */
  EAttribute getPacketHeader_Value();

  /**
   * Returns the meta object for class '{@link mdn.RuleObject <em>Rule Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Object</em>'.
   * @see mdn.RuleObject
   * @generated
   */
  EClass getRuleObject();

  /**
   * Returns the meta object for class '{@link mdn.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group</em>'.
   * @see mdn.Group
   * @generated
   */
  EClass getGroup();

  /**
   * Returns the meta object for the containment reference list '{@link mdn.Group#getHostsGroup <em>Hosts Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hosts Group</em>'.
   * @see mdn.Group#getHostsGroup()
   * @see #getGroup()
   * @generated
   */
  EReference getGroup_HostsGroup();

  /**
   * Returns the meta object for the attribute '{@link mdn.Group#getIp <em>Ip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ip</em>'.
   * @see mdn.Group#getIp()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_Ip();

  /**
   * Returns the meta object for the attribute '{@link mdn.Group#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see mdn.Group#getName()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_Name();

  /**
   * Returns the meta object for enum '{@link mdn.PacketHeaders <em>Packet Headers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Packet Headers</em>'.
   * @see mdn.PacketHeaders
   * @generated
   */
  EEnum getPacketHeaders();

  /**
   * Returns the meta object for enum '{@link mdn.Actions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Actions</em>'.
   * @see mdn.Actions
   * @generated
   */
  EEnum getActions();

  /**
   * Returns the meta object for enum '{@link mdn.Conditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Conditions</em>'.
   * @see mdn.Conditions
   * @generated
   */
  EEnum getConditions();

  /**
   * Returns the meta object for enum '{@link mdn.RelationalOperators <em>Relational Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Relational Operators</em>'.
   * @see mdn.RelationalOperators
   * @generated
   */
  EEnum getRelationalOperators();

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
     * The meta object literal for the '<em><b>Policies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SDN__POLICIES = eINSTANCE.getSdn_Policies();

    /**
     * The meta object literal for the '<em><b>Rule Objects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SDN__RULE_OBJECTS = eINSTANCE.getSdn_RuleObjects();

    /**
     * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SDN__GROUPS = eINSTANCE.getSdn_Groups();

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
     * The meta object literal for the '<em><b>Switches</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__SWITCHES = eINSTANCE.getSwitch_Switches();

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
     * The meta object literal for the '{@link mdn.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdn.impl.RuleImpl
     * @see mdn.impl.MdnPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Source Host Rule</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__SOURCE_HOST_RULE = eINSTANCE.getRule_SourceHostRule();

    /**
     * The meta object literal for the '<em><b>Target Host Rule</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__TARGET_HOST_RULE = eINSTANCE.getRule_TargetHostRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__NAME = eINSTANCE.getRule_Name();

    /**
     * The meta object literal for the '<em><b>Rule Condition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__RULE_CONDITION = eINSTANCE.getRule_RuleCondition();

    /**
     * The meta object literal for the '<em><b>Rule Action</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__RULE_ACTION = eINSTANCE.getRule_RuleAction();

    /**
     * The meta object literal for the '<em><b>Target Group Rule</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__TARGET_GROUP_RULE = eINSTANCE.getRule_TargetGroupRule();

    /**
     * The meta object literal for the '{@link mdn.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdn.impl.ActionImpl
     * @see mdn.impl.MdnPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__TYPE = eINSTANCE.getAction_Type();

    /**
     * The meta object literal for the '<em><b>Action Packet Header</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__ACTION_PACKET_HEADER = eINSTANCE.getAction_ActionPacketHeader();

    /**
     * The meta object literal for the '<em><b>Action Forward To Node</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__ACTION_FORWARD_TO_NODE = eINSTANCE.getAction_ActionForwardToNode();

    /**
     * The meta object literal for the '{@link mdn.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdn.impl.ConditionImpl
     * @see mdn.impl.MdnPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__CONDITION = eINSTANCE.getCondition_Condition();

    /**
     * The meta object literal for the '<em><b>Condition Time</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__CONDITION_TIME = eINSTANCE.getCondition_ConditionTime();

    /**
     * The meta object literal for the '<em><b>Condition Traffic</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__CONDITION_TRAFFIC = eINSTANCE.getCondition_ConditionTraffic();

    /**
     * The meta object literal for the '<em><b>Condition Packet</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__CONDITION_PACKET = eINSTANCE.getCondition_ConditionPacket();

    /**
     * The meta object literal for the '{@link mdn.impl.TrafficImpl <em>Traffic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdn.impl.TrafficImpl
     * @see mdn.impl.MdnPackageImpl#getTraffic()
     * @generated
     */
    EClass TRAFFIC = eINSTANCE.getTraffic();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRAFFIC__OPERATOR = eINSTANCE.getTraffic_Operator();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRAFFIC__UNIT = eINSTANCE.getTraffic_Unit();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRAFFIC__VALUE = eINSTANCE.getTraffic_Value();

    /**
     * The meta object literal for the '{@link mdn.impl.TimeImpl <em>Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdn.impl.TimeImpl
     * @see mdn.impl.MdnPackageImpl#getTime()
     * @generated
     */
    EClass TIME = eINSTANCE.getTime();

    /**
     * The meta object literal for the '<em><b>Begin Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME__BEGIN_DATE = eINSTANCE.getTime_BeginDate();

    /**
     * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME__END_DATE = eINSTANCE.getTime_EndDate();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME__OPERATOR = eINSTANCE.getTime_Operator();

    /**
     * The meta object literal for the '{@link mdn.impl.PacketHeaderImpl <em>Packet Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdn.impl.PacketHeaderImpl
     * @see mdn.impl.MdnPackageImpl#getPacketHeader()
     * @generated
     */
    EClass PACKET_HEADER = eINSTANCE.getPacketHeader();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKET_HEADER__OPERATOR = eINSTANCE.getPacketHeader_Operator();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKET_HEADER__HEADER = eINSTANCE.getPacketHeader_Header();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKET_HEADER__VALUE = eINSTANCE.getPacketHeader_Value();

    /**
     * The meta object literal for the '{@link mdn.impl.RuleObjectImpl <em>Rule Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdn.impl.RuleObjectImpl
     * @see mdn.impl.MdnPackageImpl#getRuleObject()
     * @generated
     */
    EClass RULE_OBJECT = eINSTANCE.getRuleObject();

    /**
     * The meta object literal for the '{@link mdn.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdn.impl.GroupImpl
     * @see mdn.impl.MdnPackageImpl#getGroup()
     * @generated
     */
    EClass GROUP = eINSTANCE.getGroup();

    /**
     * The meta object literal for the '<em><b>Hosts Group</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP__HOSTS_GROUP = eINSTANCE.getGroup_HostsGroup();

    /**
     * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__IP = eINSTANCE.getGroup_Ip();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

    /**
     * The meta object literal for the '{@link mdn.PacketHeaders <em>Packet Headers</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdn.PacketHeaders
     * @see mdn.impl.MdnPackageImpl#getPacketHeaders()
     * @generated
     */
    EEnum PACKET_HEADERS = eINSTANCE.getPacketHeaders();

    /**
     * The meta object literal for the '{@link mdn.Actions <em>Actions</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdn.Actions
     * @see mdn.impl.MdnPackageImpl#getActions()
     * @generated
     */
    EEnum ACTIONS = eINSTANCE.getActions();

    /**
     * The meta object literal for the '{@link mdn.Conditions <em>Conditions</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdn.Conditions
     * @see mdn.impl.MdnPackageImpl#getConditions()
     * @generated
     */
    EEnum CONDITIONS = eINSTANCE.getConditions();

    /**
     * The meta object literal for the '{@link mdn.RelationalOperators <em>Relational Operators</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdn.RelationalOperators
     * @see mdn.impl.MdnPackageImpl#getRelationalOperators()
     * @generated
     */
    EEnum RELATIONAL_OPERATORS = eINSTANCE.getRelationalOperators();

  }

} //MdnPackage
