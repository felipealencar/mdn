/**
 */
package mdn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Packet Header</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mdn.MdnPackage#getPacketHeader()
 * @model
 * @generated
 */
public enum PacketHeader implements Enumerator
{
  /**
   * The '<em><b>ETH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ETH_VALUE
   * @generated
   * @ordered
   */
  ETH(0, "ETH", "ETH"),

  /**
   * The '<em><b>ARP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ARP_VALUE
   * @generated
   * @ordered
   */
  ARP(0, "ARP", "ARP"),

  /**
   * The '<em><b>IPv4</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IPV4_VALUE
   * @generated
   * @ordered
   */
  IPV4(0, "IPv4", "IPv4"),

  /**
   * The '<em><b>ICMP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ICMP_VALUE
   * @generated
   * @ordered
   */
  ICMP(0, "ICMP", "ICMP"),

  /**
   * The '<em><b>TCP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TCP_VALUE
   * @generated
   * @ordered
   */
  TCP(0, "TCP", "TCP"),

  /**
   * The '<em><b>UDP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UDP_VALUE
   * @generated
   * @ordered
   */
  UDP(0, "UDP", "UDP"),

  /**
   * The '<em><b>DHCP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DHCP_VALUE
   * @generated
   * @ordered
   */
  DHCP(0, "DHCP", "DHCP"),

  /**
   * The '<em><b>DNS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DNS_VALUE
   * @generated
   * @ordered
   */
  DNS(0, "DNS", "DNS"),

  /**
   * The '<em><b>LLDP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LLDP_VALUE
   * @generated
   * @ordered
   */
  LLDP(0, "LLDP", "LLDP"),

  /**
   * The '<em><b>VLAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VLAN_VALUE
   * @generated
   * @ordered
   */
  VLAN(0, "VLAN", "VLAN");

  /**
   * The '<em><b>ETH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ETH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ETH
   * @model
   * @generated
   * @ordered
   */
  public static final int ETH_VALUE = 0;

  /**
   * The '<em><b>ARP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ARP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ARP
   * @model
   * @generated
   * @ordered
   */
  public static final int ARP_VALUE = 0;

  /**
   * The '<em><b>IPv4</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>IPv4</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IPV4
   * @model name="IPv4"
   * @generated
   * @ordered
   */
  public static final int IPV4_VALUE = 0;

  /**
   * The '<em><b>ICMP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ICMP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ICMP
   * @model
   * @generated
   * @ordered
   */
  public static final int ICMP_VALUE = 0;

  /**
   * The '<em><b>TCP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TCP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TCP
   * @model
   * @generated
   * @ordered
   */
  public static final int TCP_VALUE = 0;

  /**
   * The '<em><b>UDP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UDP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UDP
   * @model
   * @generated
   * @ordered
   */
  public static final int UDP_VALUE = 0;

  /**
   * The '<em><b>DHCP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DHCP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DHCP
   * @model
   * @generated
   * @ordered
   */
  public static final int DHCP_VALUE = 0;

  /**
   * The '<em><b>DNS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DNS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DNS
   * @model
   * @generated
   * @ordered
   */
  public static final int DNS_VALUE = 0;

  /**
   * The '<em><b>LLDP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LLDP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LLDP
   * @model
   * @generated
   * @ordered
   */
  public static final int LLDP_VALUE = 0;

  /**
   * The '<em><b>VLAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VLAN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VLAN
   * @model
   * @generated
   * @ordered
   */
  public static final int VLAN_VALUE = 0;

  /**
   * An array of all the '<em><b>Packet Header</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PacketHeader[] VALUES_ARRAY =
    new PacketHeader[]
    {
      ETH,
      ARP,
      IPV4,
      ICMP,
      TCP,
      UDP,
      DHCP,
      DNS,
      LLDP,
      VLAN,
    };

  /**
   * A public read-only list of all the '<em><b>Packet Header</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PacketHeader> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Packet Header</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PacketHeader get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PacketHeader result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Packet Header</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PacketHeader getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PacketHeader result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Packet Header</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PacketHeader get(int value)
  {
    switch (value)
    {
      case ETH_VALUE: return ETH;
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
  private PacketHeader(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //PacketHeader
