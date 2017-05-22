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
public interface MdnPackage extends EPackage {
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
	 * The feature id for the '<em><b>Apps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SDN__APPS = 1;

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
	int NETWORK_NODE = 1;

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
	int CONTROLLER = 2;

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
	int HOST = 3;

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
	int SWITCH = 4;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__ID = NETWORK_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = NETWORK_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link mdn.impl.AppObjectImpl <em>App Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdn.impl.AppObjectImpl
	 * @see mdn.impl.MdnPackageImpl#getAppObject()
	 * @generated
	 */
	int APP_OBJECT = 6;

	/**
	 * The meta object id for the '{@link mdn.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdn.impl.RuleImpl
	 * @see mdn.impl.MdnPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 7;

	/**
	 * The meta object id for the '{@link mdn.impl.AppImpl <em>App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdn.impl.AppImpl
	 * @see mdn.impl.MdnPackageImpl#getApp()
	 * @generated
	 */
	int APP = 8;

	/**
	 * The meta object id for the '{@link mdn.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdn.impl.ConditionImpl
	 * @see mdn.impl.MdnPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 9;

	/**
	 * The meta object id for the '{@link mdn.impl.TrafficImpl <em>Traffic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdn.impl.TrafficImpl
	 * @see mdn.impl.MdnPackageImpl#getTraffic()
	 * @generated
	 */
	int TRAFFIC = 10;

	/**
	 * The meta object id for the '{@link mdn.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdn.impl.TimeImpl
	 * @see mdn.impl.MdnPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 11;

	/**
	 * The meta object id for the '{@link mdn.impl.PacketHeaderImpl <em>Packet Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdn.impl.PacketHeaderImpl
	 * @see mdn.impl.MdnPackageImpl#getPacketHeader()
	 * @generated
	 */
	int PACKET_HEADER = 12;

	/**
	 * The meta object id for the '{@link mdn.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdn.impl.GroupImpl
	 * @see mdn.impl.MdnPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 15;

	/**
	 * The meta object id for the '{@link mdn.impl.OpenFlowSwitchImpl <em>Open Flow Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdn.impl.OpenFlowSwitchImpl
	 * @see mdn.impl.MdnPackageImpl#getOpenFlowSwitch()
	 * @generated
	 */
	int OPEN_FLOW_SWITCH = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FLOW_SWITCH__NAME = SWITCH__NAME;

	/**
	 * The feature id for the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FLOW_SWITCH__MAC = SWITCH__MAC;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FLOW_SWITCH__IP = SWITCH__IP;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FLOW_SWITCH__PORTS = SWITCH__PORTS;

	/**
	 * The feature id for the '<em><b>Switch Controller</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FLOW_SWITCH__SWITCH_CONTROLLER = SWITCH__SWITCH_CONTROLLER;

	/**
	 * The feature id for the '<em><b>Switches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FLOW_SWITCH__SWITCHES = SWITCH__SWITCHES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FLOW_SWITCH__ID = SWITCH__ID;

	/**
	 * The feature id for the '<em><b>Table Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FLOW_SWITCH__TABLE_SPACE = SWITCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Headers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FLOW_SWITCH__REQUIRED_HEADERS = SWITCH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FLOW_SWITCH__VERSION = SWITCH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supported Protocols</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FLOW_SWITCH__SUPPORTED_PROTOCOLS = SWITCH_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Optional Headers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FLOW_SWITCH__OPTIONAL_HEADERS = SWITCH_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Available Table Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FLOW_SWITCH__AVAILABLE_TABLE_SPACE = SWITCH_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Open Flow Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FLOW_SWITCH_FEATURE_COUNT = SWITCH_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_OBJECT__NAME = 0;

	/**
	 * The number of structural features of the '<em>App Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = APP_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Source Host Rule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__SOURCE_HOST_RULE = APP_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Host Rule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TARGET_HOST_RULE = APP_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rule Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE_CONDITION = APP_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Group Rule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TARGET_GROUP_RULE = APP_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ACTIONS = APP_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Flow Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__FLOW_RULE = APP_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = APP_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Action Packet Header</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__ACTION_PACKET_HEADER = 0;

	/**
	 * The feature id for the '<em><b>App To Network Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__APP_TO_NETWORK_NODE = 1;

	/**
	 * The feature id for the '<em><b>Controller App</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__CONTROLLER_APP = 2;

	/**
	 * The feature id for the '<em><b>App Rule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__APP_RULE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__NAME = 4;

	/**
	 * The feature id for the '<em><b>Target Switch</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__TARGET_SWITCH = 5;

	/**
	 * The number of structural features of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_FEATURE_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = APP_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION = APP_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION_TIME = APP_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition Traffic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION_TRAFFIC = APP_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Condition Packet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION_PACKET = APP_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = APP_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC__NAME = APP_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC__OPERATOR = APP_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC__UNIT = APP_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC__VALUE = APP_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Traffic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAFFIC_FEATURE_COUNT = APP_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__NAME = APP_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__OPERATOR = APP_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__BEGIN_DATE = APP_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__END_DATE = APP_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = APP_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_HEADER__NAME = APP_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_HEADER__OPERATOR = APP_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_HEADER__HEADER = APP_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_HEADER__VALUE = APP_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Packet Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_HEADER_FEATURE_COUNT = APP_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mdn.impl.AppMonitorImpl <em>App Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdn.impl.AppMonitorImpl
	 * @see mdn.impl.MdnPackageImpl#getAppMonitor()
	 * @generated
	 */
	int APP_MONITOR = 13;

	/**
	 * The feature id for the '<em><b>Action Packet Header</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MONITOR__ACTION_PACKET_HEADER = APP__ACTION_PACKET_HEADER;

	/**
	 * The feature id for the '<em><b>App To Network Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MONITOR__APP_TO_NETWORK_NODE = APP__APP_TO_NETWORK_NODE;

	/**
	 * The feature id for the '<em><b>Controller App</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MONITOR__CONTROLLER_APP = APP__CONTROLLER_APP;

	/**
	 * The feature id for the '<em><b>App Rule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MONITOR__APP_RULE = APP__APP_RULE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MONITOR__NAME = APP__NAME;

	/**
	 * The feature id for the '<em><b>Target Switch</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MONITOR__TARGET_SWITCH = APP__TARGET_SWITCH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MONITOR__TYPE = APP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Server Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MONITOR__SERVER_ADDRESS = APP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Flow To Monitor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MONITOR__FLOW_TO_MONITOR = APP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>App Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_MONITOR_FEATURE_COUNT = APP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mdn.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdn.impl.FlowImpl
	 * @see mdn.impl.MdnPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 14;

	/**
	 * The feature id for the '<em><b>Match Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__MATCH_FIELDS = 0;

	/**
	 * The feature id for the '<em><b>Match Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__MATCH_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Flow Source Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__FLOW_SOURCE_HOST = 2;

	/**
	 * The feature id for the '<em><b>Flow Destination Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__FLOW_DESTINATION_HOST = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__PRIORITY = 4;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = 5;

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
	 * The feature id for the '<em><b>Switches Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SWITCHES_GROUP = 3;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link mdn.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdn.impl.InstructionImpl
	 * @see mdn.impl.MdnPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Table Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__TABLE_ID = 1;

	/**
	 * The feature id for the '<em><b>Instruction Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__INSTRUCTION_SWITCH = 2;

	/**
	 * The feature id for the '<em><b>Instruction Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__INSTRUCTION_RULES = 3;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link mdn.PacketHeaders <em>Packet Headers</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdn.PacketHeaders
	 * @see mdn.impl.MdnPackageImpl#getPacketHeaders()
	 * @generated
	 */
	int PACKET_HEADERS = 17;

	/**
	 * The meta object id for the '{@link mdn.Actions <em>Actions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdn.Actions
	 * @see mdn.impl.MdnPackageImpl#getActions()
	 * @generated
	 */
	int ACTIONS = 18;

	/**
	 * The meta object id for the '{@link mdn.Conditions <em>Conditions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdn.Conditions
	 * @see mdn.impl.MdnPackageImpl#getConditions()
	 * @generated
	 */
	int CONDITIONS = 19;

	/**
	 * The meta object id for the '{@link mdn.RelationalOperators <em>Relational Operators</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdn.RelationalOperators
	 * @see mdn.impl.MdnPackageImpl#getRelationalOperators()
	 * @generated
	 */
	int RELATIONAL_OPERATORS = 20;

	/**
	 * The meta object id for the '{@link mdn.AppMonitorProtocols <em>App Monitor Protocols</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdn.AppMonitorProtocols
	 * @see mdn.impl.MdnPackageImpl#getAppMonitorProtocols()
	 * @generated
	 */
	int APP_MONITOR_PROTOCOLS = 21;

	/**
	 * The meta object id for the '{@link mdn.ControllerTypes <em>Controller Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdn.ControllerTypes
	 * @see mdn.impl.MdnPackageImpl#getControllerTypes()
	 * @generated
	 */
	int CONTROLLER_TYPES = 22;

	/**
	 * The meta object id for the '{@link mdn.Instructions <em>Instructions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdn.Instructions
	 * @see mdn.impl.MdnPackageImpl#getInstructions()
	 * @generated
	 */
	int INSTRUCTIONS = 23;


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
	 * Returns the meta object for the containment reference list '{@link mdn.Sdn#getApps <em>Apps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apps</em>'.
	 * @see mdn.Sdn#getApps()
	 * @see #getSdn()
	 * @generated
	 */
	EReference getSdn_Apps();

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
	 * Returns the meta object for the attribute '{@link mdn.Switch#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mdn.Switch#getId()
	 * @see #getSwitch()
	 * @generated
	 */
	EAttribute getSwitch_Id();

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
	 * Returns the meta object for the reference list '{@link mdn.Rule#getRuleCondition <em>Rule Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rule Condition</em>'.
	 * @see mdn.Rule#getRuleCondition()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RuleCondition();

	/**
	 * Returns the meta object for the reference list '{@link mdn.Rule#getTargetGroupRule <em>Target Group Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Group Rule</em>'.
	 * @see mdn.Rule#getTargetGroupRule()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_TargetGroupRule();

	/**
	 * Returns the meta object for the attribute '{@link mdn.Rule#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actions</em>'.
	 * @see mdn.Rule#getActions()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Actions();

	/**
	 * Returns the meta object for the reference '{@link mdn.Rule#getFlowRule <em>Flow Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flow Rule</em>'.
	 * @see mdn.Rule#getFlowRule()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_FlowRule();

	/**
	 * Returns the meta object for class '{@link mdn.App <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App</em>'.
	 * @see mdn.App
	 * @generated
	 */
	EClass getApp();

	/**
	 * Returns the meta object for the reference list '{@link mdn.App#getActionPacketHeader <em>Action Packet Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action Packet Header</em>'.
	 * @see mdn.App#getActionPacketHeader()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_ActionPacketHeader();

	/**
	 * Returns the meta object for the reference '{@link mdn.App#getAppToNetworkNode <em>App To Network Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App To Network Node</em>'.
	 * @see mdn.App#getAppToNetworkNode()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_AppToNetworkNode();

	/**
	 * Returns the meta object for the reference list '{@link mdn.App#getControllerApp <em>Controller App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controller App</em>'.
	 * @see mdn.App#getControllerApp()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_ControllerApp();

	/**
	 * Returns the meta object for the reference list '{@link mdn.App#getAppRule <em>App Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>App Rule</em>'.
	 * @see mdn.App#getAppRule()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_AppRule();

	/**
	 * Returns the meta object for the attribute '{@link mdn.App#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mdn.App#getName()
	 * @see #getApp()
	 * @generated
	 */
	EAttribute getApp_Name();

	/**
	 * Returns the meta object for the reference list '{@link mdn.App#getTargetSwitch <em>Target Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Switch</em>'.
	 * @see mdn.App#getTargetSwitch()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_TargetSwitch();

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
	 * Returns the meta object for class '{@link mdn.AppObject <em>App Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Object</em>'.
	 * @see mdn.AppObject
	 * @generated
	 */
	EClass getAppObject();

	/**
	 * Returns the meta object for the attribute '{@link mdn.AppObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mdn.AppObject#getName()
	 * @see #getAppObject()
	 * @generated
	 */
	EAttribute getAppObject_Name();

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
	 * Returns the meta object for the containment reference list '{@link mdn.Group#getSwitchesGroup <em>Switches Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Switches Group</em>'.
	 * @see mdn.Group#getSwitchesGroup()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_SwitchesGroup();

	/**
	 * Returns the meta object for class '{@link mdn.OpenFlowSwitch <em>Open Flow Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Flow Switch</em>'.
	 * @see mdn.OpenFlowSwitch
	 * @generated
	 */
	EClass getOpenFlowSwitch();

	/**
	 * Returns the meta object for the attribute '{@link mdn.OpenFlowSwitch#getTableSpace <em>Table Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Space</em>'.
	 * @see mdn.OpenFlowSwitch#getTableSpace()
	 * @see #getOpenFlowSwitch()
	 * @generated
	 */
	EAttribute getOpenFlowSwitch_TableSpace();

	/**
	 * Returns the meta object for the attribute list '{@link mdn.OpenFlowSwitch#getRequiredHeaders <em>Required Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required Headers</em>'.
	 * @see mdn.OpenFlowSwitch#getRequiredHeaders()
	 * @see #getOpenFlowSwitch()
	 * @generated
	 */
	EAttribute getOpenFlowSwitch_RequiredHeaders();

	/**
	 * Returns the meta object for the attribute '{@link mdn.OpenFlowSwitch#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see mdn.OpenFlowSwitch#getVersion()
	 * @see #getOpenFlowSwitch()
	 * @generated
	 */
	EAttribute getOpenFlowSwitch_Version();

	/**
	 * Returns the meta object for the attribute list '{@link mdn.OpenFlowSwitch#getSupportedProtocols <em>Supported Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Protocols</em>'.
	 * @see mdn.OpenFlowSwitch#getSupportedProtocols()
	 * @see #getOpenFlowSwitch()
	 * @generated
	 */
	EAttribute getOpenFlowSwitch_SupportedProtocols();

	/**
	 * Returns the meta object for the attribute list '{@link mdn.OpenFlowSwitch#getOptionalHeaders <em>Optional Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Optional Headers</em>'.
	 * @see mdn.OpenFlowSwitch#getOptionalHeaders()
	 * @see #getOpenFlowSwitch()
	 * @generated
	 */
	EAttribute getOpenFlowSwitch_OptionalHeaders();

	/**
	 * Returns the meta object for the attribute '{@link mdn.OpenFlowSwitch#getAvailableTableSpace <em>Available Table Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Table Space</em>'.
	 * @see mdn.OpenFlowSwitch#getAvailableTableSpace()
	 * @see #getOpenFlowSwitch()
	 * @generated
	 */
	EAttribute getOpenFlowSwitch_AvailableTableSpace();

	/**
	 * Returns the meta object for class '{@link mdn.AppMonitor <em>App Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Monitor</em>'.
	 * @see mdn.AppMonitor
	 * @generated
	 */
	EClass getAppMonitor();

	/**
	 * Returns the meta object for the attribute '{@link mdn.AppMonitor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mdn.AppMonitor#getType()
	 * @see #getAppMonitor()
	 * @generated
	 */
	EAttribute getAppMonitor_Type();

	/**
	 * Returns the meta object for the attribute '{@link mdn.AppMonitor#getServerAddress <em>Server Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Address</em>'.
	 * @see mdn.AppMonitor#getServerAddress()
	 * @see #getAppMonitor()
	 * @generated
	 */
	EAttribute getAppMonitor_ServerAddress();

	/**
	 * Returns the meta object for the reference list '{@link mdn.AppMonitor#getFlowToMonitor <em>Flow To Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flow To Monitor</em>'.
	 * @see mdn.AppMonitor#getFlowToMonitor()
	 * @see #getAppMonitor()
	 * @generated
	 */
	EReference getAppMonitor_FlowToMonitor();

	/**
	 * Returns the meta object for class '{@link mdn.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see mdn.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the attribute '{@link mdn.Flow#getMatchFields <em>Match Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match Fields</em>'.
	 * @see mdn.Flow#getMatchFields()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_MatchFields();

	/**
	 * Returns the meta object for the attribute '{@link mdn.Flow#getMatchValues <em>Match Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match Values</em>'.
	 * @see mdn.Flow#getMatchValues()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_MatchValues();

	/**
	 * Returns the meta object for the reference '{@link mdn.Flow#getFlowSourceHost <em>Flow Source Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flow Source Host</em>'.
	 * @see mdn.Flow#getFlowSourceHost()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_FlowSourceHost();

	/**
	 * Returns the meta object for the reference '{@link mdn.Flow#getFlowDestinationHost <em>Flow Destination Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flow Destination Host</em>'.
	 * @see mdn.Flow#getFlowDestinationHost()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_FlowDestinationHost();

	/**
	 * Returns the meta object for the attribute '{@link mdn.Flow#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see mdn.Flow#getPriority()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_Priority();

	/**
	 * Returns the meta object for class '{@link mdn.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see mdn.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the attribute list '{@link mdn.Instruction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see mdn.Instruction#getType()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_Type();

	/**
	 * Returns the meta object for the attribute '{@link mdn.Instruction#getTableId <em>Table Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Id</em>'.
	 * @see mdn.Instruction#getTableId()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_TableId();

	/**
	 * Returns the meta object for the reference '{@link mdn.Instruction#getInstructionSwitch <em>Instruction Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instruction Switch</em>'.
	 * @see mdn.Instruction#getInstructionSwitch()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_InstructionSwitch();

	/**
	 * Returns the meta object for the reference list '{@link mdn.Instruction#getInstructionRules <em>Instruction Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instruction Rules</em>'.
	 * @see mdn.Instruction#getInstructionRules()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_InstructionRules();

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
	 * Returns the meta object for enum '{@link mdn.AppMonitorProtocols <em>App Monitor Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>App Monitor Protocols</em>'.
	 * @see mdn.AppMonitorProtocols
	 * @generated
	 */
	EEnum getAppMonitorProtocols();

	/**
	 * Returns the meta object for enum '{@link mdn.ControllerTypes <em>Controller Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Controller Types</em>'.
	 * @see mdn.ControllerTypes
	 * @generated
	 */
	EEnum getControllerTypes();

	/**
	 * Returns the meta object for enum '{@link mdn.Instructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instructions</em>'.
	 * @see mdn.Instructions
	 * @generated
	 */
	EEnum getInstructions();

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
	interface Literals {
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
		 * The meta object literal for the '<em><b>Apps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SDN__APPS = eINSTANCE.getSdn_Apps();

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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH__ID = eINSTANCE.getSwitch_Id();

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
		 * The meta object literal for the '<em><b>Rule Condition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RULE_CONDITION = eINSTANCE.getRule_RuleCondition();

		/**
		 * The meta object literal for the '<em><b>Target Group Rule</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__TARGET_GROUP_RULE = eINSTANCE.getRule_TargetGroupRule();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__ACTIONS = eINSTANCE.getRule_Actions();

		/**
		 * The meta object literal for the '<em><b>Flow Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__FLOW_RULE = eINSTANCE.getRule_FlowRule();

		/**
		 * The meta object literal for the '{@link mdn.impl.AppImpl <em>App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdn.impl.AppImpl
		 * @see mdn.impl.MdnPackageImpl#getApp()
		 * @generated
		 */
		EClass APP = eINSTANCE.getApp();

		/**
		 * The meta object literal for the '<em><b>Action Packet Header</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__ACTION_PACKET_HEADER = eINSTANCE.getApp_ActionPacketHeader();

		/**
		 * The meta object literal for the '<em><b>App To Network Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__APP_TO_NETWORK_NODE = eINSTANCE.getApp_AppToNetworkNode();

		/**
		 * The meta object literal for the '<em><b>Controller App</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__CONTROLLER_APP = eINSTANCE.getApp_ControllerApp();

		/**
		 * The meta object literal for the '<em><b>App Rule</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__APP_RULE = eINSTANCE.getApp_AppRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP__NAME = eINSTANCE.getApp_Name();

		/**
		 * The meta object literal for the '<em><b>Target Switch</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__TARGET_SWITCH = eINSTANCE.getApp_TargetSwitch();

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
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__OPERATOR = eINSTANCE.getTime_Operator();

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
		 * The meta object literal for the '{@link mdn.impl.AppObjectImpl <em>App Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdn.impl.AppObjectImpl
		 * @see mdn.impl.MdnPackageImpl#getAppObject()
		 * @generated
		 */
		EClass APP_OBJECT = eINSTANCE.getAppObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_OBJECT__NAME = eINSTANCE.getAppObject_Name();

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
		 * The meta object literal for the '<em><b>Switches Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__SWITCHES_GROUP = eINSTANCE.getGroup_SwitchesGroup();

		/**
		 * The meta object literal for the '{@link mdn.impl.OpenFlowSwitchImpl <em>Open Flow Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdn.impl.OpenFlowSwitchImpl
		 * @see mdn.impl.MdnPackageImpl#getOpenFlowSwitch()
		 * @generated
		 */
		EClass OPEN_FLOW_SWITCH = eINSTANCE.getOpenFlowSwitch();

		/**
		 * The meta object literal for the '<em><b>Table Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_FLOW_SWITCH__TABLE_SPACE = eINSTANCE.getOpenFlowSwitch_TableSpace();

		/**
		 * The meta object literal for the '<em><b>Required Headers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_FLOW_SWITCH__REQUIRED_HEADERS = eINSTANCE.getOpenFlowSwitch_RequiredHeaders();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_FLOW_SWITCH__VERSION = eINSTANCE.getOpenFlowSwitch_Version();

		/**
		 * The meta object literal for the '<em><b>Supported Protocols</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_FLOW_SWITCH__SUPPORTED_PROTOCOLS = eINSTANCE.getOpenFlowSwitch_SupportedProtocols();

		/**
		 * The meta object literal for the '<em><b>Optional Headers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_FLOW_SWITCH__OPTIONAL_HEADERS = eINSTANCE.getOpenFlowSwitch_OptionalHeaders();

		/**
		 * The meta object literal for the '<em><b>Available Table Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_FLOW_SWITCH__AVAILABLE_TABLE_SPACE = eINSTANCE.getOpenFlowSwitch_AvailableTableSpace();

		/**
		 * The meta object literal for the '{@link mdn.impl.AppMonitorImpl <em>App Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdn.impl.AppMonitorImpl
		 * @see mdn.impl.MdnPackageImpl#getAppMonitor()
		 * @generated
		 */
		EClass APP_MONITOR = eINSTANCE.getAppMonitor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MONITOR__TYPE = eINSTANCE.getAppMonitor_Type();

		/**
		 * The meta object literal for the '<em><b>Server Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_MONITOR__SERVER_ADDRESS = eINSTANCE.getAppMonitor_ServerAddress();

		/**
		 * The meta object literal for the '<em><b>Flow To Monitor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_MONITOR__FLOW_TO_MONITOR = eINSTANCE.getAppMonitor_FlowToMonitor();

		/**
		 * The meta object literal for the '{@link mdn.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdn.impl.FlowImpl
		 * @see mdn.impl.MdnPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Match Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__MATCH_FIELDS = eINSTANCE.getFlow_MatchFields();

		/**
		 * The meta object literal for the '<em><b>Match Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__MATCH_VALUES = eINSTANCE.getFlow_MatchValues();

		/**
		 * The meta object literal for the '<em><b>Flow Source Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__FLOW_SOURCE_HOST = eINSTANCE.getFlow_FlowSourceHost();

		/**
		 * The meta object literal for the '<em><b>Flow Destination Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__FLOW_DESTINATION_HOST = eINSTANCE.getFlow_FlowDestinationHost();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__PRIORITY = eINSTANCE.getFlow_Priority();

		/**
		 * The meta object literal for the '{@link mdn.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdn.impl.InstructionImpl
		 * @see mdn.impl.MdnPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__TYPE = eINSTANCE.getInstruction_Type();

		/**
		 * The meta object literal for the '<em><b>Table Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__TABLE_ID = eINSTANCE.getInstruction_TableId();

		/**
		 * The meta object literal for the '<em><b>Instruction Switch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__INSTRUCTION_SWITCH = eINSTANCE.getInstruction_InstructionSwitch();

		/**
		 * The meta object literal for the '<em><b>Instruction Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__INSTRUCTION_RULES = eINSTANCE.getInstruction_InstructionRules();

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

		/**
		 * The meta object literal for the '{@link mdn.AppMonitorProtocols <em>App Monitor Protocols</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdn.AppMonitorProtocols
		 * @see mdn.impl.MdnPackageImpl#getAppMonitorProtocols()
		 * @generated
		 */
		EEnum APP_MONITOR_PROTOCOLS = eINSTANCE.getAppMonitorProtocols();

		/**
		 * The meta object literal for the '{@link mdn.ControllerTypes <em>Controller Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdn.ControllerTypes
		 * @see mdn.impl.MdnPackageImpl#getControllerTypes()
		 * @generated
		 */
		EEnum CONTROLLER_TYPES = eINSTANCE.getControllerTypes();

		/**
		 * The meta object literal for the '{@link mdn.Instructions <em>Instructions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdn.Instructions
		 * @see mdn.impl.MdnPackageImpl#getInstructions()
		 * @generated
		 */
		EEnum INSTRUCTIONS = eINSTANCE.getInstructions();

	}

} //MdnPackage
