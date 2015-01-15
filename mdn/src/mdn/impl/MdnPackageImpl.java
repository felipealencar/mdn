/**
 */
package mdn.impl;

import mdn.Action;
import mdn.Actions;
import mdn.Condition;
import mdn.Conditions;
import mdn.Controller;
import mdn.Host;
import mdn.MdnFactory;
import mdn.MdnPackage;
import mdn.NetworkNode;
import mdn.PacketHeader;
import mdn.PacketHeaders;
import mdn.Policy;
import mdn.PolicyObject;
import mdn.RelationalOperators;
import mdn.Sdn;
import mdn.Switch;
import mdn.Time;
import mdn.Traffic;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MdnPackageImpl extends EPackageImpl implements MdnPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sdnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controllerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hostEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass networkNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass policyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass trafficEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packetHeaderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass policyObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum packetHeadersEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum actionsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum conditionsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum relationalOperatorsEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see mdn.MdnPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MdnPackageImpl()
  {
    super(eNS_URI, MdnFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MdnPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MdnPackage init()
  {
    if (isInited) return (MdnPackage)EPackage.Registry.INSTANCE.getEPackage(MdnPackage.eNS_URI);

    // Obtain or create and register package
    MdnPackageImpl theMdnPackage = (MdnPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MdnPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MdnPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMdnPackage.createPackageContents();

    // Initialize created meta-data
    theMdnPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMdnPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MdnPackage.eNS_URI, theMdnPackage);
    return theMdnPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSdn()
  {
    return sdnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSdn_Nodes()
  {
    return (EReference)sdnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSdn_Policies()
  {
    return (EReference)sdnEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSdn_PolicyObjects()
  {
    return (EReference)sdnEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getController()
  {
    return controllerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getController_Type()
  {
    return (EAttribute)controllerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHost()
  {
    return hostEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHost_HostSwitch()
  {
    return (EReference)hostEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHost_SourceHostPolicy()
  {
    return (EReference)hostEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitch()
  {
    return switchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwitch_Ports()
  {
    return (EAttribute)switchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitch_SwitchController()
  {
    return (EReference)switchEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitch_Switch()
  {
    return (EReference)switchEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNetworkNode()
  {
    return networkNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNetworkNode_Name()
  {
    return (EAttribute)networkNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNetworkNode_Mac()
  {
    return (EAttribute)networkNodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNetworkNode_Ip()
  {
    return (EAttribute)networkNodeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPolicy()
  {
    return policyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolicy_TargetHostPolicy()
  {
    return (EReference)policyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPolicy_Name()
  {
    return (EAttribute)policyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolicy_PolicyCondition()
  {
    return (EReference)policyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPolicy_PolicyAction()
  {
    return (EReference)policyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAction_Type()
  {
    return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_ActionPacketHeader()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_ActionForwardToNode()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondition()
  {
    return conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCondition_Condition()
  {
    return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_ConditionTime()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_ConditionTraffic()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_ConditionPacket()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTraffic()
  {
    return trafficEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTraffic_Operator()
  {
    return (EAttribute)trafficEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTraffic_Unit()
  {
    return (EAttribute)trafficEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTraffic_Value()
  {
    return (EAttribute)trafficEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTime()
  {
    return timeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTime_BeginDate()
  {
    return (EAttribute)timeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTime_EndDate()
  {
    return (EAttribute)timeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTime_Operator()
  {
    return (EAttribute)timeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPacketHeader()
  {
    return packetHeaderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPacketHeader_Operator()
  {
    return (EAttribute)packetHeaderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPacketHeader_Header()
  {
    return (EAttribute)packetHeaderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPacketHeader_Value()
  {
    return (EAttribute)packetHeaderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPolicyObject()
  {
    return policyObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPacketHeaders()
  {
    return packetHeadersEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getActions()
  {
    return actionsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getConditions()
  {
    return conditionsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRelationalOperators()
  {
    return relationalOperatorsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdnFactory getMdnFactory()
  {
    return (MdnFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    sdnEClass = createEClass(SDN);
    createEReference(sdnEClass, SDN__NODES);
    createEReference(sdnEClass, SDN__POLICIES);
    createEReference(sdnEClass, SDN__POLICY_OBJECTS);

    controllerEClass = createEClass(CONTROLLER);
    createEAttribute(controllerEClass, CONTROLLER__TYPE);

    hostEClass = createEClass(HOST);
    createEReference(hostEClass, HOST__HOST_SWITCH);
    createEReference(hostEClass, HOST__SOURCE_HOST_POLICY);

    switchEClass = createEClass(SWITCH);
    createEAttribute(switchEClass, SWITCH__PORTS);
    createEReference(switchEClass, SWITCH__SWITCH_CONTROLLER);
    createEReference(switchEClass, SWITCH__SWITCH);

    networkNodeEClass = createEClass(NETWORK_NODE);
    createEAttribute(networkNodeEClass, NETWORK_NODE__NAME);
    createEAttribute(networkNodeEClass, NETWORK_NODE__MAC);
    createEAttribute(networkNodeEClass, NETWORK_NODE__IP);

    policyEClass = createEClass(POLICY);
    createEReference(policyEClass, POLICY__TARGET_HOST_POLICY);
    createEAttribute(policyEClass, POLICY__NAME);
    createEReference(policyEClass, POLICY__POLICY_CONDITION);
    createEReference(policyEClass, POLICY__POLICY_ACTION);

    actionEClass = createEClass(ACTION);
    createEAttribute(actionEClass, ACTION__TYPE);
    createEReference(actionEClass, ACTION__ACTION_PACKET_HEADER);
    createEReference(actionEClass, ACTION__ACTION_FORWARD_TO_NODE);

    conditionEClass = createEClass(CONDITION);
    createEAttribute(conditionEClass, CONDITION__CONDITION);
    createEReference(conditionEClass, CONDITION__CONDITION_TIME);
    createEReference(conditionEClass, CONDITION__CONDITION_TRAFFIC);
    createEReference(conditionEClass, CONDITION__CONDITION_PACKET);

    trafficEClass = createEClass(TRAFFIC);
    createEAttribute(trafficEClass, TRAFFIC__OPERATOR);
    createEAttribute(trafficEClass, TRAFFIC__UNIT);
    createEAttribute(trafficEClass, TRAFFIC__VALUE);

    timeEClass = createEClass(TIME);
    createEAttribute(timeEClass, TIME__OPERATOR);
    createEAttribute(timeEClass, TIME__BEGIN_DATE);
    createEAttribute(timeEClass, TIME__END_DATE);

    packetHeaderEClass = createEClass(PACKET_HEADER);
    createEAttribute(packetHeaderEClass, PACKET_HEADER__OPERATOR);
    createEAttribute(packetHeaderEClass, PACKET_HEADER__HEADER);
    createEAttribute(packetHeaderEClass, PACKET_HEADER__VALUE);

    policyObjectEClass = createEClass(POLICY_OBJECT);

    // Create enums
    packetHeadersEEnum = createEEnum(PACKET_HEADERS);
    actionsEEnum = createEEnum(ACTIONS);
    conditionsEEnum = createEEnum(CONDITIONS);
    relationalOperatorsEEnum = createEEnum(RELATIONAL_OPERATORS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    controllerEClass.getESuperTypes().add(this.getNetworkNode());
    hostEClass.getESuperTypes().add(this.getNetworkNode());
    switchEClass.getESuperTypes().add(this.getNetworkNode());
    conditionEClass.getESuperTypes().add(this.getPolicyObject());
    trafficEClass.getESuperTypes().add(this.getPolicyObject());
    timeEClass.getESuperTypes().add(this.getPolicyObject());
    packetHeaderEClass.getESuperTypes().add(this.getPolicyObject());

    // Initialize classes and features; add operations and parameters
    initEClass(sdnEClass, Sdn.class, "Sdn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSdn_Nodes(), this.getNetworkNode(), null, "nodes", null, 0, -1, Sdn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSdn_Policies(), this.getPolicy(), null, "policies", null, 0, -1, Sdn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSdn_PolicyObjects(), this.getPolicyObject(), null, "policyObjects", null, 0, -1, Sdn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getController_Type(), ecorePackage.getEString(), "type", null, 0, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hostEClass, Host.class, "Host", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHost_HostSwitch(), this.getSwitch(), null, "hostSwitch", null, 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHost_SourceHostPolicy(), this.getPolicy(), null, "sourceHostPolicy", null, 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSwitch_Ports(), ecorePackage.getEInt(), "ports", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitch_SwitchController(), this.getController(), null, "switchController", null, 0, -1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitch_Switch(), this.getSwitch(), null, "switch", null, 0, -1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(networkNodeEClass, NetworkNode.class, "NetworkNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNetworkNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, NetworkNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNetworkNode_Mac(), ecorePackage.getEString(), "mac", null, 0, 1, NetworkNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNetworkNode_Ip(), ecorePackage.getEString(), "ip", null, 0, 1, NetworkNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(policyEClass, Policy.class, "Policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPolicy_TargetHostPolicy(), this.getHost(), null, "targetHostPolicy", null, 0, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPolicy_Name(), ecorePackage.getEString(), "name", null, 0, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPolicy_PolicyCondition(), this.getCondition(), null, "policyCondition", null, 0, 1, Policy.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPolicy_PolicyAction(), this.getAction(), null, "policyAction", null, 0, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAction_Type(), this.getActions(), "type", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAction_ActionPacketHeader(), this.getPacketHeader(), null, "actionPacketHeader", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAction_ActionForwardToNode(), this.getNetworkNode(), null, "actionForwardToNode", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCondition_Condition(), this.getConditions(), "condition", "WHERE", 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_ConditionTime(), this.getTime(), null, "conditionTime", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_ConditionTraffic(), this.getTraffic(), null, "conditionTraffic", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_ConditionPacket(), this.getPacketHeader(), null, "conditionPacket", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(trafficEClass, Traffic.class, "Traffic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTraffic_Operator(), this.getRelationalOperators(), "operator", null, 0, 1, Traffic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTraffic_Unit(), ecorePackage.getEString(), "unit", "MB", 0, 1, Traffic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTraffic_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Traffic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTime_Operator(), this.getRelationalOperators(), "operator", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTime_BeginDate(), ecorePackage.getEDate(), "beginDate", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTime_EndDate(), ecorePackage.getEDate(), "endDate", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packetHeaderEClass, PacketHeader.class, "PacketHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPacketHeader_Operator(), this.getRelationalOperators(), "operator", null, 0, 1, PacketHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPacketHeader_Header(), this.getPacketHeaders(), "header", "", 0, 1, PacketHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPacketHeader_Value(), ecorePackage.getEString(), "value", null, 0, 1, PacketHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(policyObjectEClass, PolicyObject.class, "PolicyObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(packetHeadersEEnum, PacketHeaders.class, "PacketHeaders");
    addEEnumLiteral(packetHeadersEEnum, PacketHeaders.IN_PORT);
    addEEnumLiteral(packetHeadersEEnum, PacketHeaders.MAC_SRC);
    addEEnumLiteral(packetHeadersEEnum, PacketHeaders.MAC_DST);
    addEEnumLiteral(packetHeadersEEnum, PacketHeaders.VLAN_ID);
    addEEnumLiteral(packetHeadersEEnum, PacketHeaders.VLAN_PRIO);
    addEEnumLiteral(packetHeadersEEnum, PacketHeaders.ETH_TYPE);
    addEEnumLiteral(packetHeadersEEnum, PacketHeaders.IP_SRC);
    addEEnumLiteral(packetHeadersEEnum, PacketHeaders.IP_DST);
    addEEnumLiteral(packetHeadersEEnum, PacketHeaders.IP_TOS);
    addEEnumLiteral(packetHeadersEEnum, PacketHeaders.IP_PORT);
    addEEnumLiteral(packetHeadersEEnum, PacketHeaders.L4_SPORT);
    addEEnumLiteral(packetHeadersEEnum, PacketHeaders.L4_DPORT);

    initEEnum(actionsEEnum, Actions.class, "Actions");
    addEEnumLiteral(actionsEEnum, Actions.FORWARD);
    addEEnumLiteral(actionsEEnum, Actions.DROP);
    addEEnumLiteral(actionsEEnum, Actions.MODIFY);

    initEEnum(conditionsEEnum, Conditions.class, "Conditions");
    addEEnumLiteral(conditionsEEnum, Conditions.WHEN);
    addEEnumLiteral(conditionsEEnum, Conditions.WHERE);

    initEEnum(relationalOperatorsEEnum, RelationalOperators.class, "RelationalOperators");
    addEEnumLiteral(relationalOperatorsEEnum, RelationalOperators.EQUAL_TO);
    addEEnumLiteral(relationalOperatorsEEnum, RelationalOperators.NOT_EQUAL_TO);
    addEEnumLiteral(relationalOperatorsEEnum, RelationalOperators.GREATER_THAN);
    addEEnumLiteral(relationalOperatorsEEnum, RelationalOperators.LESS_THAN);
    addEEnumLiteral(relationalOperatorsEEnum, RelationalOperators.IN);
    addEEnumLiteral(relationalOperatorsEEnum, RelationalOperators.OUT);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // gmf
    createGmfAnnotations();
    // gmf.diagram
    createGmf_1Annotations();
    // gmf.node
    createGmf_2Annotations();
    // gmf.link
    createGmf_3Annotations();
  }

  /**
   * Initializes the annotations for <b>gmf</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmfAnnotations()
  {
    String source = "gmf";		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       });																			
  }

  /**
   * Initializes the annotations for <b>gmf.diagram</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.diagram";			
    addAnnotation
      (sdnEClass, 
       source, 
       new String[] 
       {
       });																		
  }

  /**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_2Annotations()
  {
    String source = "gmf.node";				
    addAnnotation
      (controllerEClass, 
       source, 
       new String[] 
       {
       "figure", "figures.ControllerFigure",
       "label", "name",
       "label.icon", "false",
       "tool.small.bundle", "mdn.edit",
       "tool.small.path", "/icons/full/obj16/controller.gif",
       "label.placement", "external"
       });		
    addAnnotation
      (hostEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "label.icon", "false",
       "tool.small.bundle", "mdn.edit",
       "tool.small.path", "/icons/full/obj16/host.gif",
       "figure", "figures.HostFigure",
       "label.placement", "external"
       });				
    addAnnotation
      (switchEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "label.icon", "false",
       "tool.small.bundle", "mdn.edit",
       "tool.small.path", "/icons/full/obj16/switch.gif",
       "figure", "figures.SwitchFigure",
       "label.placement", "external"
       });				
    addAnnotation
      (policyEClass, 
       source, 
       new String[] 
       {
       "figure", "figures.PolicyFigure",
       "label", "name",
       "label.icon", "false",
       "tool.small.bundle", "mdn.edit",
       "tool.small.path", "/icons/full/obj16/policy.gif",
       "label.placement", "external"
       });					
    addAnnotation
      (actionEClass, 
       source, 
       new String[] 
       {
       "figure", "figures.ActionFigure",
       "label", "type",
       "label.icon", "false",
       "tool.small.bundle", "mdn.edit",
       "tool.small.path", "/icons/full/obj16/action.gif",
       "label.placement", "external"
       });				
    addAnnotation
      (conditionEClass, 
       source, 
       new String[] 
       {
       "label", "condition",
       "label.icon", "false",
       "tool.small.bundle", "mdn.edit",
       "tool.small.path", "/icons/full/obj16/condition.gif",
       "label.placement", "external",
       "figure", "figures.ConditionFigure"
       });		
    addAnnotation
      (trafficEClass, 
       source, 
       new String[] 
       {
       "figure", "figures.TrafficFigure",
       "label", "operator,value,unit",
       "label.pattern", "{0}: {2}{1}",
       "label.icon", "false",
       "tool.small.bundle", "mdn.edit",
       "tool.small.path", "/icons/full/obj16/traffic.gif",
       "label.placement", "external"
       });		
    addAnnotation
      (timeEClass, 
       source, 
       new String[] 
       {
       "figure", "figures.TimeFigure",
       "label.icon", "false",
       "tool.small.bundle", "mdn.edit",
       "tool.small.path", "/icons/full/obj16/time.gif",
       "label.placement", "external",
       "label", "operator,beginDate,endDate",
       "label.pattern", "{0}: {1} - {2}"
       });		
    addAnnotation
      (packetHeaderEClass, 
       source, 
       new String[] 
       {
       "figure", "figures.PacketHeaderFigure",
       "label.icon", "false",
       "tool.small.bundle", "mdn.edit",
       "tool.small.path", "/icons/full/obj16/packetheader.gif",
       "label.placement", "external",
       "label", "operator,header,value",
       "label.pattern", "{0}: [{1}]{2}"
       });
  }

  /**
   * Initializes the annotations for <b>gmf.link</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_3Annotations()
  {
    String source = "gmf.link";						
    addAnnotation
      (getHost_HostSwitch(), 
       source, 
       new String[] 
       {
       "target.decoration", "none",
       "source.decoration", "none",
       "style", "solid",
       "color", "0,0,0"
       });		
    addAnnotation
      (getHost_SourceHostPolicy(), 
       source, 
       new String[] 
       {
       "target.decoration", "none",
       "source.decoration", "none",
       "style", "dash",
       "color", "0,0,0"
       });			
    addAnnotation
      (getSwitch_SwitchController(), 
       source, 
       new String[] 
       {
       "target.decoration", "none",
       "source.decoration", "none",
       "style", "solid",
       "color", "0,0,0"
       });		
    addAnnotation
      (getSwitch_Switch(), 
       source, 
       new String[] 
       {
       "target.decoration", "none",
       "source.decoration", "none",
       "style", "solid",
       "color", "0,0,0"
       });			
    addAnnotation
      (getPolicy_TargetHostPolicy(), 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "source.decoration", "none",
       "style", "dash",
       "color", "0,0,0"
       });		
    addAnnotation
      (getPolicy_PolicyCondition(), 
       source, 
       new String[] 
       {
       "target.decoration", "none",
       "source.decoration", "none",
       "style", "dash",
       "color", "0,0,0"
       });		
    addAnnotation
      (getPolicy_PolicyAction(), 
       source, 
       new String[] 
       {
       "target.decoration", "none",
       "source.decoration", "none",
       "style", "dash",
       "color", "0,0,0"
       });			
    addAnnotation
      (getAction_ActionPacketHeader(), 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "source.decoration", "none",
       "style", "dash",
       "color", "0,0,0"
       });		
    addAnnotation
      (getAction_ActionForwardToNode(), 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "source.decoration", "none",
       "style", "dash",
       "color", "0,0,0"
       });				
  }

} //MdnPackageImpl
