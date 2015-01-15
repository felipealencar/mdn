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
public enum PacketHeaders implements Enumerator
{
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
   * The '<em><b>MAC SRC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAC_SRC_VALUE
   * @generated
   * @ordered
   */
  MAC_SRC(1, "MAC_SRC", "MAC_SRC"),

  /**
   * The '<em><b>MAC DST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAC_DST_VALUE
   * @generated
   * @ordered
   */
  MAC_DST(2, "MAC_DST", "MAC_DST"),

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
   * The '<em><b>IP SRC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IP_SRC_VALUE
   * @generated
   * @ordered
   */
  IP_SRC(6, "IP_SRC", "IP_SRC"),

  /**
   * The '<em><b>IP DST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IP_DST_VALUE
   * @generated
   * @ordered
   */
  IP_DST(7, "IP_DST", "IP_DST"),

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
  L4_DPORT(11, "L4_DPORT", "L4_DPORT");

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
   * The '<em><b>MAC SRC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MAC SRC</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAC_SRC
   * @model
   * @generated
   * @ordered
   */
  public static final int MAC_SRC_VALUE = 1;

  /**
   * The '<em><b>MAC DST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MAC DST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAC_DST
   * @model
   * @generated
   * @ordered
   */
  public static final int MAC_DST_VALUE = 2;

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
   * The '<em><b>IP SRC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>IP SRC</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IP_SRC
   * @model
   * @generated
   * @ordered
   */
  public static final int IP_SRC_VALUE = 6;

  /**
   * The '<em><b>IP DST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>IP DST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IP_DST
   * @model
   * @generated
   * @ordered
   */
  public static final int IP_DST_VALUE = 7;

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
   * An array of all the '<em><b>Packet Headers</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PacketHeaders[] VALUES_ARRAY =
    new PacketHeaders[]
    {
      IN_PORT,
      MAC_SRC,
      MAC_DST,
      VLAN_ID,
      VLAN_PRIO,
      ETH_TYPE,
      IP_SRC,
      IP_DST,
      IP_TOS,
      IP_PORT,
      L4_SPORT,
      L4_DPORT,
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
  public static PacketHeaders get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PacketHeaders result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
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
  public static PacketHeaders getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PacketHeaders result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
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
  public static PacketHeaders get(int value)
  {
    switch (value)
    {
      case IN_PORT_VALUE: return IN_PORT;
      case MAC_SRC_VALUE: return MAC_SRC;
      case MAC_DST_VALUE: return MAC_DST;
      case VLAN_ID_VALUE: return VLAN_ID;
      case VLAN_PRIO_VALUE: return VLAN_PRIO;
      case ETH_TYPE_VALUE: return ETH_TYPE;
      case IP_SRC_VALUE: return IP_SRC;
      case IP_DST_VALUE: return IP_DST;
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
  private PacketHeaders(int value, String name, String literal)
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
  
} //PacketHeaders
