/**
 */
package mdn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Packet Headers</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mdn.MdnPackage#getPacketHeaders()
 * @model
 * @generated
 */
public enum PacketHeaders implements Enumerator {
	/**
	 * The '<em><b>IN PORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PORT_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PORT(0, "IN_PORT", "IN_PORT"),

	/**
	 * The '<em><b>ETH SRC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETH_SRC_VALUE
	 * @generated
	 * @ordered
	 */
	ETH_SRC(1, "ETH_SRC", "ETH_SRC"),

	/**
	 * The '<em><b>ETH DST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETH_DST_VALUE
	 * @generated
	 * @ordered
	 */
	ETH_DST(2, "ETH_DST", "ETH_DST"),

	/**
	 * The '<em><b>VLAN ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VLAN_ID_VALUE
	 * @generated
	 * @ordered
	 */
	VLAN_ID(3, "VLAN_ID", "VLAN_ID"),

	/**
	 * The '<em><b>VLAN PRIO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VLAN_PRIO_VALUE
	 * @generated
	 * @ordered
	 */
	VLAN_PRIO(4, "VLAN_PRIO", "VLAN_PRIO"),

	/**
	 * The '<em><b>ETH TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETH_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	ETH_TYPE(5, "ETH_TYPE", "ETH_TYPE"),

	/**
	 * The '<em><b>IPV4 SRC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPV4_SRC_VALUE
	 * @generated
	 * @ordered
	 */
	IPV4_SRC(6, "IPV4_SRC", "IPV4_SRC"),

	/**
	 * The '<em><b>IPV4 DST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPV4_DST_VALUE
	 * @generated
	 * @ordered
	 */
	IPV4_DST(7, "IPV4_DST", "IPV4_DST"),

	/**
	 * The '<em><b>IP TOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP_TOS_VALUE
	 * @generated
	 * @ordered
	 */
	IP_TOS(8, "IP_TOS", "IP_TOS"),

	/**
	 * The '<em><b>IP PORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP_PORT_VALUE
	 * @generated
	 * @ordered
	 */
	IP_PORT(9, "IP_PORT", "IP_PORT"),

	/**
	 * The '<em><b>L4 SPORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L4_SPORT_VALUE
	 * @generated
	 * @ordered
	 */
	L4_SPORT(10, "L4_SPORT", "L4_SPORT"),

	/**
	 * The '<em><b>L4 DPORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #L4_DPORT_VALUE
	 * @generated
	 * @ordered
	 */
	L4_DPORT(11, "L4_DPORT", "L4_DPORT"),

	/**
	 * The '<em><b>IN PHY PORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PHY_PORT_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PHY_PORT(0, "IN_PHY_PORT", "IN_PHY_PORT"),

	/**
	 * The '<em><b>METADATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METADATA_VALUE
	 * @generated
	 * @ordered
	 */
	METADATA(0, "METADATA", "METADATA"),

	/**
	 * The '<em><b>VLAN VID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VLAN_VID_VALUE
	 * @generated
	 * @ordered
	 */
	VLAN_VID(0, "VLAN_VID", "VLAN_VID"),

	/**
	 * The '<em><b>VLAN PCP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VLAN_PCP_VALUE
	 * @generated
	 * @ordered
	 */
	VLAN_PCP(0, "VLAN_PCP", "VLAN_PCP"),

	/**
	 * The '<em><b>IP DSCP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP_DSCP_VALUE
	 * @generated
	 * @ordered
	 */
	IP_DSCP(0, "IP_DSCP", "IP_DSCP"),

	/**
	 * The '<em><b>IP ECN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP_ECN_VALUE
	 * @generated
	 * @ordered
	 */
	IP_ECN(0, "IP_ECN", "IP_ECN"),

	/**
	 * The '<em><b>IP PROTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IP_PROTO_VALUE
	 * @generated
	 * @ordered
	 */
	IP_PROTO(0, "IP_PROTO", "IP_PROTO"),

	/**
	 * The '<em><b>TCP SRC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCP_SRC_VALUE
	 * @generated
	 * @ordered
	 */
	TCP_SRC(0, "TCP_SRC", "TCP_SRC"),

	/**
	 * The '<em><b>TCP DST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCP_DST_VALUE
	 * @generated
	 * @ordered
	 */
	TCP_DST(0, "TCP_DST", "TCP_DST"),

	/**
	 * The '<em><b>UDP SRC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UDP_SRC_VALUE
	 * @generated
	 * @ordered
	 */
	UDP_SRC(0, "UDP_SRC", "UDP_SRC"),

	/**
	 * The '<em><b>UDP DST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UDP_DST_VALUE
	 * @generated
	 * @ordered
	 */
	UDP_DST(0, "UDP_DST", "UDP_DST"),

	/**
	 * The '<em><b>SCTP SRC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCTP_SRC_VALUE
	 * @generated
	 * @ordered
	 */
	SCTP_SRC(0, "SCTP_SRC", "SCTP_SRC"),

	/**
	 * The '<em><b>SCTP DST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCTP_DST_VALUE
	 * @generated
	 * @ordered
	 */
	SCTP_DST(0, "SCTP_DST", "SCTP_DST"),

	/**
	 * The '<em><b>ICMPV4 TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICMPV4_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	ICMPV4_TYPE(0, "ICMPV4_TYPE", "ICMPV4_TYPE"),

	/**
	 * The '<em><b>ICMPV4 CODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICMPV4_CODE_VALUE
	 * @generated
	 * @ordered
	 */
	ICMPV4_CODE(0, "ICMPV4_CODE", "ICMPV4_CODE"),

	/**
	 * The '<em><b>ARP OP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARP_OP_VALUE
	 * @generated
	 * @ordered
	 */
	ARP_OP(0, "ARP_OP", "ARP_OP"),

	/**
	 * The '<em><b>ARP SPA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARP_SPA_VALUE
	 * @generated
	 * @ordered
	 */
	ARP_SPA(0, "ARP_SPA", "ARP_SPA"),

	/**
	 * The '<em><b>ARP TPA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARP_TPA_VALUE
	 * @generated
	 * @ordered
	 */
	ARP_TPA(0, "ARP_TPA", "ARP_TPA"),

	/**
	 * The '<em><b>ARP SHA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARP_SHA_VALUE
	 * @generated
	 * @ordered
	 */
	ARP_SHA(0, "ARP_SHA", "ARP_SHA"),

	/**
	 * The '<em><b>ARP THA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARP_THA_VALUE
	 * @generated
	 * @ordered
	 */
	ARP_THA(0, "ARP_THA", "ARP_THA"),

	/**
	 * The '<em><b>IPV6 SRC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPV6_SRC_VALUE
	 * @generated
	 * @ordered
	 */
	IPV6_SRC(0, "IPV6_SRC", "IPV6_SRC"),

	/**
	 * The '<em><b>IPV6 DST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPV6_DST_VALUE
	 * @generated
	 * @ordered
	 */
	IPV6_DST(0, "IPV6_DST", "IPV6_DST"),

	/**
	 * The '<em><b>IPV6 LABEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPV6_LABEL_VALUE
	 * @generated
	 * @ordered
	 */
	IPV6_LABEL(0, "IPV6_LABEL", "IPV6_LABEL"),

	/**
	 * The '<em><b>ICMPV6 TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICMPV6_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	ICMPV6_TYPE(0, "ICMPV6_TYPE", "ICMPV6_TYPE"),

	/**
	 * The '<em><b>ICMPV6 CODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICMPV6_CODE_VALUE
	 * @generated
	 * @ordered
	 */
	ICMPV6_CODE(0, "ICMPV6_CODE", "ICMPV6_CODE"),

	/**
	 * The '<em><b>IPV6 ND TARGET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPV6_ND_TARGET_VALUE
	 * @generated
	 * @ordered
	 */
	IPV6_ND_TARGET(0, "IPV6_ND_TARGET", "IPV6_ND_TARGET"),

	/**
	 * The '<em><b>IPV6 ND SLL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPV6_ND_SLL_VALUE
	 * @generated
	 * @ordered
	 */
	IPV6_ND_SLL(0, "IPV6_ND_SLL", "IPV6_ND_SLL"),

	/**
	 * The '<em><b>IPV6 ND TLL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPV6_ND_TLL_VALUE
	 * @generated
	 * @ordered
	 */
	IPV6_ND_TLL(0, "IPV6_ND_TLL", "IPV6_ND_TLL"),

	/**
	 * The '<em><b>MPLS LABEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MPLS_LABEL_VALUE
	 * @generated
	 * @ordered
	 */
	MPLS_LABEL(0, "MPLS_LABEL", "MPLS_LABEL"),

	/**
	 * The '<em><b>MPLS TC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MPLS_TC_VALUE
	 * @generated
	 * @ordered
	 */
	MPLS_TC(0, "MPLS_TC", "MPLS_TC"),

	/**
	 * The '<em><b>MPLS BOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MPLS_BOS_VALUE
	 * @generated
	 * @ordered
	 */
	MPLS_BOS(0, "MPLS_BOS", "MPLS_BOS"),

	/**
	 * The '<em><b>PBB ISID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PBB_ISID_VALUE
	 * @generated
	 * @ordered
	 */
	PBB_ISID(0, "PBB_ISID", "PBB_ISID"),

	/**
	 * The '<em><b>TUNNEL ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUNNEL_ID_VALUE
	 * @generated
	 * @ordered
	 */
	TUNNEL_ID(0, "TUNNEL_ID", "TUNNEL_ID"),

	/**
	 * The '<em><b>IPV6 EXTHDR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IPV6_EXTHDR_VALUE
	 * @generated
	 * @ordered
	 */
	IPV6_EXTHDR(0, "IPV6_EXTHDR", "IPV6_EXTHDR");

	/**
	 * The '<em><b>IN PORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IN PORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_PORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_PORT_VALUE = 0;

	/**
	 * The '<em><b>ETH SRC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ETH SRC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ETH_SRC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ETH_SRC_VALUE = 1;

	/**
	 * The '<em><b>ETH DST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ETH DST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ETH_DST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ETH_DST_VALUE = 2;

	/**
	 * The '<em><b>VLAN ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VLAN ID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VLAN_ID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VLAN_ID_VALUE = 3;

	/**
	 * The '<em><b>VLAN PRIO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VLAN PRIO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VLAN_PRIO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VLAN_PRIO_VALUE = 4;

	/**
	 * The '<em><b>ETH TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ETH TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ETH_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ETH_TYPE_VALUE = 5;

	/**
	 * The '<em><b>IPV4 SRC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPV4 SRC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPV4_SRC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPV4_SRC_VALUE = 6;

	/**
	 * The '<em><b>IPV4 DST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPV4 DST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPV4_DST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPV4_DST_VALUE = 7;

	/**
	 * The '<em><b>IP TOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IP TOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IP_TOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IP_TOS_VALUE = 8;

	/**
	 * The '<em><b>IP PORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IP PORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IP_PORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IP_PORT_VALUE = 9;

	/**
	 * The '<em><b>L4 SPORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>L4 SPORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #L4_SPORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int L4_SPORT_VALUE = 10;

	/**
	 * The '<em><b>L4 DPORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>L4 DPORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #L4_DPORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int L4_DPORT_VALUE = 11;

	/**
	 * The '<em><b>IN PHY PORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IN PHY PORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_PHY_PORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_PHY_PORT_VALUE = 0;

	/**
	 * The '<em><b>METADATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METADATA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METADATA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METADATA_VALUE = 0;

	/**
	 * The '<em><b>VLAN VID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VLAN VID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VLAN_VID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VLAN_VID_VALUE = 0;

	/**
	 * The '<em><b>VLAN PCP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VLAN PCP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VLAN_PCP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VLAN_PCP_VALUE = 0;

	/**
	 * The '<em><b>IP DSCP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IP DSCP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IP_DSCP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IP_DSCP_VALUE = 0;

	/**
	 * The '<em><b>IP ECN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IP ECN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IP_ECN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IP_ECN_VALUE = 0;

	/**
	 * The '<em><b>IP PROTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IP PROTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IP_PROTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IP_PROTO_VALUE = 0;

	/**
	 * The '<em><b>TCP SRC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TCP SRC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TCP_SRC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TCP_SRC_VALUE = 0;

	/**
	 * The '<em><b>TCP DST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TCP DST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TCP_DST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TCP_DST_VALUE = 0;

	/**
	 * The '<em><b>UDP SRC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UDP SRC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UDP_SRC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UDP_SRC_VALUE = 0;

	/**
	 * The '<em><b>UDP DST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UDP DST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UDP_DST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UDP_DST_VALUE = 0;

	/**
	 * The '<em><b>SCTP SRC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCTP SRC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCTP_SRC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCTP_SRC_VALUE = 0;

	/**
	 * The '<em><b>SCTP DST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCTP DST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCTP_DST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCTP_DST_VALUE = 0;

	/**
	 * The '<em><b>ICMPV4 TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ICMPV4 TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICMPV4_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICMPV4_TYPE_VALUE = 0;

	/**
	 * The '<em><b>ICMPV4 CODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ICMPV4 CODE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICMPV4_CODE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICMPV4_CODE_VALUE = 0;

	/**
	 * The '<em><b>ARP OP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARP OP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARP_OP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARP_OP_VALUE = 0;

	/**
	 * The '<em><b>ARP SPA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARP SPA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARP_SPA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARP_SPA_VALUE = 0;

	/**
	 * The '<em><b>ARP TPA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARP TPA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARP_TPA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARP_TPA_VALUE = 0;

	/**
	 * The '<em><b>ARP SHA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARP SHA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARP_SHA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARP_SHA_VALUE = 0;

	/**
	 * The '<em><b>ARP THA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARP THA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARP_THA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARP_THA_VALUE = 0;

	/**
	 * The '<em><b>IPV6 SRC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPV6 SRC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPV6_SRC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPV6_SRC_VALUE = 0;

	/**
	 * The '<em><b>IPV6 DST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPV6 DST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPV6_DST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPV6_DST_VALUE = 0;

	/**
	 * The '<em><b>IPV6 LABEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPV6 LABEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPV6_LABEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPV6_LABEL_VALUE = 0;

	/**
	 * The '<em><b>ICMPV6 TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ICMPV6 TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICMPV6_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICMPV6_TYPE_VALUE = 0;

	/**
	 * The '<em><b>ICMPV6 CODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ICMPV6 CODE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICMPV6_CODE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICMPV6_CODE_VALUE = 0;

	/**
	 * The '<em><b>IPV6 ND TARGET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPV6 ND TARGET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPV6_ND_TARGET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPV6_ND_TARGET_VALUE = 0;

	/**
	 * The '<em><b>IPV6 ND SLL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPV6 ND SLL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPV6_ND_SLL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPV6_ND_SLL_VALUE = 0;

	/**
	 * The '<em><b>IPV6 ND TLL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPV6 ND TLL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPV6_ND_TLL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPV6_ND_TLL_VALUE = 0;

	/**
	 * The '<em><b>MPLS LABEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MPLS LABEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MPLS_LABEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MPLS_LABEL_VALUE = 0;

	/**
	 * The '<em><b>MPLS TC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MPLS TC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MPLS_TC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MPLS_TC_VALUE = 0;

	/**
	 * The '<em><b>MPLS BOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MPLS BOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MPLS_BOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MPLS_BOS_VALUE = 0;

	/**
	 * The '<em><b>PBB ISID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PBB ISID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PBB_ISID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PBB_ISID_VALUE = 0;

	/**
	 * The '<em><b>TUNNEL ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TUNNEL ID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TUNNEL_ID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TUNNEL_ID_VALUE = 0;

	/**
	 * The '<em><b>IPV6 EXTHDR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IPV6 EXTHDR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IPV6_EXTHDR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IPV6_EXTHDR_VALUE = 0;

	/**
	 * An array of all the '<em><b>Packet Headers</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PacketHeaders[] VALUES_ARRAY =
		new PacketHeaders[] {
			IN_PORT,
			ETH_SRC,
			ETH_DST,
			VLAN_ID,
			VLAN_PRIO,
			ETH_TYPE,
			IPV4_SRC,
			IPV4_DST,
			IP_TOS,
			IP_PORT,
			L4_SPORT,
			L4_DPORT,
			IN_PHY_PORT,
			METADATA,
			VLAN_VID,
			VLAN_PCP,
			IP_DSCP,
			IP_ECN,
			IP_PROTO,
			TCP_SRC,
			TCP_DST,
			UDP_SRC,
			UDP_DST,
			SCTP_SRC,
			SCTP_DST,
			ICMPV4_TYPE,
			ICMPV4_CODE,
			ARP_OP,
			ARP_SPA,
			ARP_TPA,
			ARP_SHA,
			ARP_THA,
			IPV6_SRC,
			IPV6_DST,
			IPV6_LABEL,
			ICMPV6_TYPE,
			ICMPV6_CODE,
			IPV6_ND_TARGET,
			IPV6_ND_SLL,
			IPV6_ND_TLL,
			MPLS_LABEL,
			MPLS_TC,
			MPLS_BOS,
			PBB_ISID,
			TUNNEL_ID,
			IPV6_EXTHDR,
		};

	/**
	 * A public read-only list of all the '<em><b>Packet Headers</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PacketHeaders> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Packet Headers</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PacketHeaders get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PacketHeaders result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Packet Headers</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PacketHeaders getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PacketHeaders result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Packet Headers</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PacketHeaders get(int value) {
		switch (value) {
			case IN_PORT_VALUE: return IN_PORT;
			case ETH_SRC_VALUE: return ETH_SRC;
			case ETH_DST_VALUE: return ETH_DST;
			case VLAN_ID_VALUE: return VLAN_ID;
			case VLAN_PRIO_VALUE: return VLAN_PRIO;
			case ETH_TYPE_VALUE: return ETH_TYPE;
			case IPV4_SRC_VALUE: return IPV4_SRC;
			case IPV4_DST_VALUE: return IPV4_DST;
			case IP_TOS_VALUE: return IP_TOS;
			case IP_PORT_VALUE: return IP_PORT;
			case L4_SPORT_VALUE: return L4_SPORT;
			case L4_DPORT_VALUE: return L4_DPORT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PacketHeaders(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PacketHeaders
