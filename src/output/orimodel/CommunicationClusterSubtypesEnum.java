package stdgui.data.model.orimodel;

@XmlType(name="COMMUNICATION-CLUSTER--SUBTYPES-ENUM")
@XmlEnum
public enum CommunicationClusterSubtypesEnum {

@XmlEnumValue("ABSTRACT-CAN-CLUSTER")
ABSTRACT_CAN_CLUSTER("ABSTRACT-CAN-CLUSTER"),

@XmlEnumValue("CAN-CLUSTER")
CAN_CLUSTER("CAN-CLUSTER"),

@XmlEnumValue("COMMUNICATION-CLUSTER")
COMMUNICATION_CLUSTER("COMMUNICATION-CLUSTER"),

@XmlEnumValue("ETHERNET-CLUSTER")
ETHERNET_CLUSTER("ETHERNET-CLUSTER"),

@XmlEnumValue("FLEXRAY-CLUSTER")
FLEXRAY_CLUSTER("FLEXRAY-CLUSTER"),

@XmlEnumValue("J-1939-CLUSTER")
J_1939_CLUSTER("J-1939-CLUSTER"),

@XmlEnumValue("LIN-CLUSTER")
LIN_CLUSTER("LIN-CLUSTER"),

@XmlEnumValue("TTCAN-CLUSTER")
TTCAN_CLUSTER("TTCAN-CLUSTER"),

@XmlEnumValue("USER-DEFINED-CLUSTER")
USER_DEFINED_CLUSTER("USER-DEFINED-CLUSTER");


    private final java.lang.String value;

    CommunicationClusterSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CommunicationClusterSubtypesEnum fromValue(java.lang.String v) {
        for (CommunicationClusterSubtypesEnum c: CommunicationClusterSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}