/**
 */
package mdn.impl;

import mdn.Actions;
import mdn.App;
import mdn.AppMonitor;
import mdn.AppMonitorProtocols;
import mdn.AppMonitorTypes;
import mdn.AppObject;
import mdn.Condition;
import mdn.Conditions;
import mdn.Controller;
import mdn.ControllerTypes;
import mdn.Flow;
import mdn.Group;
import mdn.Host;
import mdn.Instruction;
import mdn.Instructions;
import mdn.MdnFactory;
import mdn.MdnPackage;
import mdn.NetworkNode;
import mdn.OpenFlowSwitch;
import mdn.PacketHeader;
import mdn.PacketHeaders;
import mdn.RelationalOperators;
import mdn.Rule;
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
public class MdnPackageImpl extends EPackageImpl implements MdnPackage {
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
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appEClass = null;

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
	private EClass appObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openFlowSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appMonitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum appMonitorProtocolsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controllerTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instructionsEEnum = null;

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
	private MdnPackageImpl() {
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
	public static MdnPackage init() {
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
	public EClass getSdn() {
		return sdnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSdn_Nodes() {
		return (EReference)sdnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSdn_Apps() {
		return (EReference)sdnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSdn_RuleObjects() {
		return (EReference)sdnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSdn_Groups() {
		return (EReference)sdnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_Type() {
		return (EAttribute)controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHost() {
		return hostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHost_HostSwitch() {
		return (EReference)hostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitch() {
		return switchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitch_Ports() {
		return (EAttribute)switchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_SwitchController() {
		return (EReference)switchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_Switches() {
		return (EReference)switchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitch_Id() {
		return (EAttribute)switchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkNode() {
		return networkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkNode_Name() {
		return (EAttribute)networkNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkNode_Mac() {
		return (EAttribute)networkNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkNode_Ip() {
		return (EAttribute)networkNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_SourceHostRule() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_TargetHostRule() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RuleCondition() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_TargetGroupRule() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Actions() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_FlowRule() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApp() {
		return appEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_ActionPacketHeader() {
		return (EReference)appEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_AppToNetworkNode() {
		return (EReference)appEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_ControllerApp() {
		return (EReference)appEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_AppRule() {
		return (EReference)appEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApp_Name() {
		return (EAttribute)appEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_TargetSwitch() {
		return (EReference)appEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Condition() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_ConditionTime() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_ConditionTraffic() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_ConditionPacket() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraffic() {
		return trafficEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraffic_Operator() {
		return (EAttribute)trafficEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraffic_Unit() {
		return (EAttribute)trafficEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraffic_Value() {
		return (EAttribute)trafficEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Operator() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_BeginDate() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_EndDate() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacketHeader() {
		return packetHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPacketHeader_Operator() {
		return (EAttribute)packetHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPacketHeader_Header() {
		return (EAttribute)packetHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPacketHeader_Value() {
		return (EAttribute)packetHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppObject() {
		return appObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppObject_Name() {
		return (EAttribute)appObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_HostsGroup() {
		return (EReference)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Ip() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Name() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_SwitchesGroup() {
		return (EReference)groupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenFlowSwitch() {
		return openFlowSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenFlowSwitch_TableSpace() {
		return (EAttribute)openFlowSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenFlowSwitch_RequiredHeaders() {
		return (EAttribute)openFlowSwitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenFlowSwitch_Version() {
		return (EAttribute)openFlowSwitchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenFlowSwitch_SupportedProtocols() {
		return (EAttribute)openFlowSwitchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenFlowSwitch_OptionalHeaders() {
		return (EAttribute)openFlowSwitchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenFlowSwitch_AvailableTableSpace() {
		return (EAttribute)openFlowSwitchEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppMonitor() {
		return appMonitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppMonitor_Type() {
		return (EAttribute)appMonitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppMonitor_ServerAddress() {
		return (EAttribute)appMonitorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppMonitor_FlowToMonitor() {
		return (EReference)appMonitorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlow_MatchFields() {
		return (EAttribute)flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlow_MatchValues() {
		return (EAttribute)flowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_FlowSourceHost() {
		return (EReference)flowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_FlowDestinationHost() {
		return (EReference)flowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlow_Priority() {
		return (EAttribute)flowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_Type() {
		return (EAttribute)instructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_TableId() {
		return (EAttribute)instructionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_InstructionSwitch() {
		return (EReference)instructionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_InstructionRules() {
		return (EReference)instructionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPacketHeaders() {
		return packetHeadersEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActions() {
		return actionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditions() {
		return conditionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationalOperators() {
		return relationalOperatorsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAppMonitorProtocols() {
		return appMonitorProtocolsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControllerTypes() {
		return controllerTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInstructions() {
		return instructionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MdnFactory getMdnFactory() {
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sdnEClass = createEClass(SDN);
		createEReference(sdnEClass, SDN__NODES);
		createEReference(sdnEClass, SDN__APPS);
		createEReference(sdnEClass, SDN__RULE_OBJECTS);
		createEReference(sdnEClass, SDN__GROUPS);

		networkNodeEClass = createEClass(NETWORK_NODE);
		createEAttribute(networkNodeEClass, NETWORK_NODE__NAME);
		createEAttribute(networkNodeEClass, NETWORK_NODE__MAC);
		createEAttribute(networkNodeEClass, NETWORK_NODE__IP);

		controllerEClass = createEClass(CONTROLLER);
		createEAttribute(controllerEClass, CONTROLLER__TYPE);

		hostEClass = createEClass(HOST);
		createEReference(hostEClass, HOST__HOST_SWITCH);

		switchEClass = createEClass(SWITCH);
		createEAttribute(switchEClass, SWITCH__PORTS);
		createEReference(switchEClass, SWITCH__SWITCH_CONTROLLER);
		createEReference(switchEClass, SWITCH__SWITCHES);
		createEAttribute(switchEClass, SWITCH__ID);

		openFlowSwitchEClass = createEClass(OPEN_FLOW_SWITCH);
		createEAttribute(openFlowSwitchEClass, OPEN_FLOW_SWITCH__TABLE_SPACE);
		createEAttribute(openFlowSwitchEClass, OPEN_FLOW_SWITCH__REQUIRED_HEADERS);
		createEAttribute(openFlowSwitchEClass, OPEN_FLOW_SWITCH__VERSION);
		createEAttribute(openFlowSwitchEClass, OPEN_FLOW_SWITCH__SUPPORTED_PROTOCOLS);
		createEAttribute(openFlowSwitchEClass, OPEN_FLOW_SWITCH__OPTIONAL_HEADERS);
		createEAttribute(openFlowSwitchEClass, OPEN_FLOW_SWITCH__AVAILABLE_TABLE_SPACE);

		appObjectEClass = createEClass(APP_OBJECT);
		createEAttribute(appObjectEClass, APP_OBJECT__NAME);

		ruleEClass = createEClass(RULE);
		createEReference(ruleEClass, RULE__SOURCE_HOST_RULE);
		createEReference(ruleEClass, RULE__TARGET_HOST_RULE);
		createEReference(ruleEClass, RULE__RULE_CONDITION);
		createEReference(ruleEClass, RULE__TARGET_GROUP_RULE);
		createEAttribute(ruleEClass, RULE__ACTIONS);
		createEReference(ruleEClass, RULE__FLOW_RULE);

		appEClass = createEClass(APP);
		createEReference(appEClass, APP__ACTION_PACKET_HEADER);
		createEReference(appEClass, APP__APP_TO_NETWORK_NODE);
		createEReference(appEClass, APP__CONTROLLER_APP);
		createEReference(appEClass, APP__APP_RULE);
		createEAttribute(appEClass, APP__NAME);
		createEReference(appEClass, APP__TARGET_SWITCH);

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

		appMonitorEClass = createEClass(APP_MONITOR);
		createEAttribute(appMonitorEClass, APP_MONITOR__TYPE);
		createEAttribute(appMonitorEClass, APP_MONITOR__SERVER_ADDRESS);
		createEReference(appMonitorEClass, APP_MONITOR__FLOW_TO_MONITOR);

		flowEClass = createEClass(FLOW);
		createEAttribute(flowEClass, FLOW__MATCH_FIELDS);
		createEAttribute(flowEClass, FLOW__MATCH_VALUES);
		createEReference(flowEClass, FLOW__FLOW_SOURCE_HOST);
		createEReference(flowEClass, FLOW__FLOW_DESTINATION_HOST);
		createEAttribute(flowEClass, FLOW__PRIORITY);

		groupEClass = createEClass(GROUP);
		createEReference(groupEClass, GROUP__HOSTS_GROUP);
		createEAttribute(groupEClass, GROUP__IP);
		createEAttribute(groupEClass, GROUP__NAME);
		createEReference(groupEClass, GROUP__SWITCHES_GROUP);

		instructionEClass = createEClass(INSTRUCTION);
		createEAttribute(instructionEClass, INSTRUCTION__TYPE);
		createEAttribute(instructionEClass, INSTRUCTION__TABLE_ID);
		createEReference(instructionEClass, INSTRUCTION__INSTRUCTION_SWITCH);
		createEReference(instructionEClass, INSTRUCTION__INSTRUCTION_RULES);

		// Create enums
		packetHeadersEEnum = createEEnum(PACKET_HEADERS);
		actionsEEnum = createEEnum(ACTIONS);
		conditionsEEnum = createEEnum(CONDITIONS);
		relationalOperatorsEEnum = createEEnum(RELATIONAL_OPERATORS);
		appMonitorProtocolsEEnum = createEEnum(APP_MONITOR_PROTOCOLS);
		controllerTypesEEnum = createEEnum(CONTROLLER_TYPES);
		instructionsEEnum = createEEnum(INSTRUCTIONS);
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
	public void initializePackageContents() {
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
		openFlowSwitchEClass.getESuperTypes().add(this.getSwitch());
		ruleEClass.getESuperTypes().add(this.getAppObject());
		conditionEClass.getESuperTypes().add(this.getAppObject());
		trafficEClass.getESuperTypes().add(this.getAppObject());
		timeEClass.getESuperTypes().add(this.getAppObject());
		packetHeaderEClass.getESuperTypes().add(this.getAppObject());
		appMonitorEClass.getESuperTypes().add(this.getApp());

		// Initialize classes and features; add operations and parameters
		initEClass(sdnEClass, Sdn.class, "Sdn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSdn_Nodes(), this.getNetworkNode(), null, "nodes", null, 0, -1, Sdn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSdn_Apps(), this.getApp(), null, "apps", null, 0, -1, Sdn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSdn_RuleObjects(), this.getAppObject(), null, "ruleObjects", null, 0, -1, Sdn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSdn_Groups(), this.getGroup(), null, "groups", null, 0, -1, Sdn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkNodeEClass, NetworkNode.class, "NetworkNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, NetworkNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkNode_Mac(), ecorePackage.getEString(), "mac", null, 0, 1, NetworkNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkNode_Ip(), ecorePackage.getEString(), "ip", null, 0, 1, NetworkNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getController_Type(), this.getControllerTypes(), "type", "RYU", 0, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hostEClass, Host.class, "Host", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHost_HostSwitch(), this.getSwitch(), null, "hostSwitch", null, 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwitch_Ports(), ecorePackage.getEInt(), "ports", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitch_SwitchController(), this.getController(), null, "switchController", null, 0, -1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitch_Switches(), this.getSwitch(), null, "switches", null, 0, -1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwitch_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openFlowSwitchEClass, OpenFlowSwitch.class, "OpenFlowSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenFlowSwitch_TableSpace(), ecorePackage.getEFloat(), "tableSpace", null, 0, 1, OpenFlowSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenFlowSwitch_RequiredHeaders(), this.getPacketHeaders(), "requiredHeaders", null, 1, -1, OpenFlowSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenFlowSwitch_Version(), ecorePackage.getEString(), "version", null, 0, 1, OpenFlowSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenFlowSwitch_SupportedProtocols(), ecorePackage.getEString(), "supportedProtocols", null, 0, -1, OpenFlowSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenFlowSwitch_OptionalHeaders(), this.getPacketHeaders(), "optionalHeaders", null, 0, -1, OpenFlowSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenFlowSwitch_AvailableTableSpace(), ecorePackage.getEFloat(), "availableTableSpace", null, 0, 1, OpenFlowSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appObjectEClass, AppObject.class, "AppObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, AppObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRule_SourceHostRule(), this.getHost(), null, "sourceHostRule", null, 0, -1, Rule.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_TargetHostRule(), this.getHost(), null, "targetHostRule", null, 0, -1, Rule.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RuleCondition(), this.getCondition(), null, "ruleCondition", null, 0, -1, Rule.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_TargetGroupRule(), this.getGroup(), null, "targetGroupRule", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Actions(), this.getActions(), "actions", "ADD", 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_FlowRule(), this.getFlow(), null, "flowRule", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appEClass, App.class, "App", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApp_ActionPacketHeader(), this.getPacketHeader(), null, "actionPacketHeader", null, 0, -1, App.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApp_AppToNetworkNode(), this.getNetworkNode(), null, "appToNetworkNode", null, 0, 1, App.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApp_ControllerApp(), this.getController(), null, "controllerApp", null, 0, -1, App.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApp_AppRule(), this.getRule(), null, "appRule", null, 0, -1, App.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApp_Name(), ecorePackage.getEString(), "name", "App", 0, 1, App.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApp_TargetSwitch(), this.getSwitch(), null, "targetSwitch", null, 0, -1, App.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getPacketHeader_Header(), this.getPacketHeaders(), "header", "IPV4_DST", 0, 1, PacketHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPacketHeader_Value(), ecorePackage.getEString(), "value", null, 0, 1, PacketHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appMonitorEClass, AppMonitor.class, "AppMonitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppMonitor_Type(), this.getAppMonitorProtocols(), "type", "NETFLOW", 0, 1, AppMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppMonitor_ServerAddress(), ecorePackage.getEString(), "serverAddress", null, 0, 1, AppMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppMonitor_FlowToMonitor(), this.getFlow(), null, "flowToMonitor", null, 0, -1, AppMonitor.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlow_MatchFields(), this.getPacketHeaders(), "matchFields", null, 0, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlow_MatchValues(), ecorePackage.getEString(), "matchValues", null, 0, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_FlowSourceHost(), this.getHost(), null, "flowSourceHost", null, 0, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_FlowDestinationHost(), this.getHost(), null, "flowDestinationHost", null, 0, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlow_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroup_HostsGroup(), this.getHost(), null, "hostsGroup", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Ip(), ecorePackage.getEString(), "ip", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_SwitchesGroup(), this.getSwitch(), null, "switchesGroup", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstruction_Type(), this.getInstructions(), "type", null, 0, -1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstruction_TableId(), ecorePackage.getEInt(), "tableId", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstruction_InstructionSwitch(), this.getOpenFlowSwitch(), null, "instructionSwitch", null, 0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstruction_InstructionRules(), this.getRule(), null, "instructionRules", null, 0, -1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(packetHeadersEEnum, PacketHeaders.class, "PacketHeaders");
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.IN_PORT);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.ETH_SRC);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.ETH_DST);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.VLAN_ID);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.VLAN_PRIO);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.ETH_TYPE);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.IPV4_SRC);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.IPV4_DST);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.IP_TOS);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.IP_PORT);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.L4_SPORT);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.L4_DPORT);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.IN_PHY_PORT);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.METADATA);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.VLAN_VID);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.VLAN_PCP);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.IP_DSCP);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.IP_ECN);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.IP_PROTO);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.TCP_SRC);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.TCP_DST);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.UDP_SRC);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.UDP_DST);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.SCTP_SRC);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.SCTP_DST);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.ICMPV4_TYPE);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.ICMPV4_CODE);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.ARP_OP);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.ARP_SPA);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.ARP_TPA);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.ARP_SHA);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.ARP_THA);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.IPV6_SRC);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.IPV6_DST);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.IPV6_LABEL);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.ICMPV6_TYPE);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.ICMPV6_CODE);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.IPV6_ND_TARGET);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.IPV6_ND_SLL);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.IPV6_ND_TLL);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.MPLS_LABEL);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.MPLS_TC);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.MPLS_BOS);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.PBB_ISID);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.TUNNEL_ID);
		addEEnumLiteral(packetHeadersEEnum, PacketHeaders.IPV6_EXTHDR);

		initEEnum(actionsEEnum, Actions.class, "Actions");
		addEEnumLiteral(actionsEEnum, Actions.ADD);
		addEEnumLiteral(actionsEEnum, Actions.DELETE);
		addEEnumLiteral(actionsEEnum, Actions.MODIFY);
		addEEnumLiteral(actionsEEnum, Actions.DELETE_STRICT);
		addEEnumLiteral(actionsEEnum, Actions.MODIFY_STRICT);

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

		initEEnum(appMonitorProtocolsEEnum, AppMonitorProtocols.class, "AppMonitorProtocols");
		addEEnumLiteral(appMonitorProtocolsEEnum, AppMonitorProtocols.SFLOW);
		addEEnumLiteral(appMonitorProtocolsEEnum, AppMonitorProtocols.NETFLOW);
		addEEnumLiteral(appMonitorProtocolsEEnum, AppMonitorProtocols.FLOWMETERS);

		initEEnum(controllerTypesEEnum, ControllerTypes.class, "ControllerTypes");
		addEEnumLiteral(controllerTypesEEnum, ControllerTypes.POX);
		addEEnumLiteral(controllerTypesEEnum, ControllerTypes.RYU);
		addEEnumLiteral(controllerTypesEEnum, ControllerTypes.OPENDAYLIGHT);

		initEEnum(instructionsEEnum, Instructions.class, "Instructions");
		addEEnumLiteral(instructionsEEnum, Instructions.WRITE_ACTIONS);
		addEEnumLiteral(instructionsEEnum, Instructions.GOTO_TABLE);

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
		// gmf.compartment
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (sdnEClass, 
		   source, 
		   new String[] {
			 "foo", "bar",
			 "onefile", "true",
			 "rcp", "true",
			 "diagram.extension", "mdn"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (controllerEClass, 
		   source, 
		   new String[] {
			 "figure", "ControllerFigure",
			 "label", "name",
			 "label.icon", "false",
			 "tool.small.bundle", "mdn.edit",
			 "tool.small.path", "/icons/full/obj16/controller.gif",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (hostEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.icon", "false",
			 "tool.small.bundle", "mdn.edit",
			 "tool.small.path", "/icons/full/obj16/host.gif",
			 "figure", "HostFigure",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (switchEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.icon", "false",
			 "tool.small.bundle", "mdn.edit",
			 "tool.small.path", "/icons/full/obj16/switch.gif",
			 "figure", "SwitchFigure",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (openFlowSwitchEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.icon", "false",
			 "tool.small.bundle", "mdn.edit",
			 "tool.small.path", "/icons/full/obj16/openflowswitch.gif",
			 "figure", "OpenFlowSwitchFigure",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (ruleEClass, 
		   source, 
		   new String[] {
			 "figure", "RuleFigure",
			 "label", "name",
			 "label.icon", "false",
			 "tool.small.bundle", "mdn.edit",
			 "tool.small.path", "/icons/full/obj16/policy.gif",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (appEClass, 
		   source, 
		   new String[] {
			 "figure", "ActionFigure",
			 "label", "name",
			 "label.icon", "false",
			 "tool.small.bundle", "mdn.edit",
			 "tool.small.path", "/icons/full/obj16/action.gif",
			 "label.placement", "external"
		   });	
		addAnnotation
		  (conditionEClass, 
		   source, 
		   new String[] {
			 "label", "condition",
			 "label.icon", "false",
			 "tool.small.bundle", "mdn.edit",
			 "tool.small.path", "/icons/full/obj16/condition.gif",
			 "label.placement", "external",
			 "figure", "ConditionFigure"
		   });	
		addAnnotation
		  (trafficEClass, 
		   source, 
		   new String[] {
			 "figure", "TrafficFigure",
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
		   new String[] {
			 "figure", "TimeFigure",
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
		   new String[] {
			 "label.icon", "false",
			 "tool.small.bundle", "mdn.edit",
			 "tool.small.path", "/icons/full/obj16/packetheader.gif",
			 "label.placement", "external",
			 "label", "operator,header,value",
			 "label.pattern", "{0}: [{1}] {2}"
		   });	
		addAnnotation
		  (appMonitorEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (groupEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "label.icon", "false",
			 "tool.small.bundle", "mdn.edit",
			 "label.placement", "external"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (getHost_HostSwitch(), 
		   source, 
		   new String[] {
			 "target.decoration", "none",
			 "source.decoration", "none",
			 "style", "solid",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getSwitch_SwitchController(), 
		   source, 
		   new String[] {
			 "target.decoration", "none",
			 "source.decoration", "none",
			 "style", "solid",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getSwitch_Switches(), 
		   source, 
		   new String[] {
			 "target.decoration", "none",
			 "source.decoration", "none",
			 "style", "solid",
			 "color", "0,0,0",
			 "switches.constraint", "self <> oppositeEnd",
			 "source.constraint", "self <> oppositeEnd"
		   });	
		addAnnotation
		  (getRule_SourceHostRule(), 
		   source, 
		   new String[] {
			 "target.decoration", "none",
			 "source.decoration", "none",
			 "style", "dash",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getRule_TargetHostRule(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "source.decoration", "none",
			 "style", "dash",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getRule_RuleCondition(), 
		   source, 
		   new String[] {
			 "target.decoration", "none",
			 "source.decoration", "none",
			 "style", "dash",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getRule_TargetGroupRule(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "source.decoration", "none",
			 "style", "dash",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getApp_ActionPacketHeader(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "source.decoration", "none",
			 "style", "dash",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getApp_AppToNetworkNode(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "source.decoration", "none",
			 "style", "dash",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getApp_ControllerApp(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "source.decoration", "none",
			 "style", "dash",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getApp_AppRule(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "source.decoration", "none",
			 "style", "dash",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getApp_TargetSwitch(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "source.decoration", "none",
			 "style", "dash",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getCondition_ConditionTime(), 
		   source, 
		   new String[] {
			 "target.decoration", "none",
			 "source.decoration", "none",
			 "style", "dash",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getCondition_ConditionTraffic(), 
		   source, 
		   new String[] {
			 "target.decoration", "none",
			 "source.decoration", "none",
			 "style", "dash",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getCondition_ConditionPacket(), 
		   source, 
		   new String[] {
			 "target.decoration", "none",
			 "source.decoration", "none",
			 "style", "dash",
			 "color", "0,0,0"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getGroup_HostsGroup(), 
		   source, 
		   new String[] {
		   });
	}

} //MdnPackageImpl
