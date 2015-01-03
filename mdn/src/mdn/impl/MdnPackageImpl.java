/**
 */
package mdn.impl;

import mdn.Controller;
import mdn.Host;
import mdn.MdnFactory;
import mdn.MdnPackage;
import mdn.NetworkLink;
import mdn.NetworkNode;
import mdn.PacketHeader;
import mdn.Sdn;
import mdn.Switch;

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
  private EClass networkLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum packetHeaderEEnum = null;

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
  public EReference getSdn_Links()
  {
    return (EReference)sdnEClass.getEStructuralFeatures().get(1);
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
  public EReference getController_ControllerSwitch()
  {
    return (EReference)controllerEClass.getEStructuralFeatures().get(1);
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
  public EClass getNetworkLink()
  {
    return networkLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPacketHeader()
  {
    return packetHeaderEEnum;
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
    createEReference(sdnEClass, SDN__LINKS);

    controllerEClass = createEClass(CONTROLLER);
    createEAttribute(controllerEClass, CONTROLLER__TYPE);
    createEReference(controllerEClass, CONTROLLER__CONTROLLER_SWITCH);

    hostEClass = createEClass(HOST);
    createEReference(hostEClass, HOST__HOST_SWITCH);

    switchEClass = createEClass(SWITCH);
    createEAttribute(switchEClass, SWITCH__PORTS);
    createEReference(switchEClass, SWITCH__SWITCH_CONTROLLER);

    networkNodeEClass = createEClass(NETWORK_NODE);
    createEAttribute(networkNodeEClass, NETWORK_NODE__NAME);
    createEAttribute(networkNodeEClass, NETWORK_NODE__MAC);
    createEAttribute(networkNodeEClass, NETWORK_NODE__IP);

    networkLinkEClass = createEClass(NETWORK_LINK);

    // Create enums
    packetHeaderEEnum = createEEnum(PACKET_HEADER);
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

    // Initialize classes and features; add operations and parameters
    initEClass(sdnEClass, Sdn.class, "Sdn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSdn_Nodes(), this.getNetworkNode(), null, "nodes", null, 0, -1, Sdn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSdn_Links(), this.getNetworkLink(), null, "links", null, 0, -1, Sdn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getController_Type(), ecorePackage.getEString(), "type", null, 0, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getController_ControllerSwitch(), this.getSwitch(), null, "controllerSwitch", null, 0, -1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hostEClass, Host.class, "Host", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHost_HostSwitch(), this.getSwitch(), null, "hostSwitch", null, 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSwitch_Ports(), ecorePackage.getEInt(), "ports", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitch_SwitchController(), this.getController(), null, "switchController", null, 0, -1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(networkNodeEClass, NetworkNode.class, "NetworkNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNetworkNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, NetworkNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNetworkNode_Mac(), ecorePackage.getEString(), "mac", null, 0, 1, NetworkNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNetworkNode_Ip(), ecorePackage.getEString(), "ip", null, 0, 1, NetworkNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(networkLinkEClass, NetworkLink.class, "NetworkLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(packetHeaderEEnum, PacketHeader.class, "PacketHeader");
    addEEnumLiteral(packetHeaderEEnum, PacketHeader.ETH);
    addEEnumLiteral(packetHeaderEEnum, PacketHeader.ARP);
    addEEnumLiteral(packetHeaderEEnum, PacketHeader.IPV4);
    addEEnumLiteral(packetHeaderEEnum, PacketHeader.ICMP);
    addEEnumLiteral(packetHeaderEEnum, PacketHeader.TCP);
    addEEnumLiteral(packetHeaderEEnum, PacketHeader.UDP);
    addEEnumLiteral(packetHeaderEEnum, PacketHeader.DHCP);
    addEEnumLiteral(packetHeaderEEnum, PacketHeader.DNS);
    addEEnumLiteral(packetHeaderEEnum, PacketHeader.LLDP);
    addEEnumLiteral(packetHeaderEEnum, PacketHeader.VLAN);

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
      (getController_ControllerSwitch(), 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "source.decoration", "none",
       "style", "dash",
       "color", "0,0,0"
       });			
    addAnnotation
      (getHost_HostSwitch(), 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "source.decoration", "none",
       "style", "dash",
       "color", "0,0,0"
       });			
    addAnnotation
      (getSwitch_SwitchController(), 
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
