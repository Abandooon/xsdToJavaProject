package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="FIBEX-ELEMENT--SUBTYPES-ENUM")
@XmlEnum
public enum FibexElementSubtypesEnum {

    
    @XmlEnumValue("ABSTRACT-CAN-CLUSTER")
    ABSTRACT_CAN_CLUSTER("ABSTRACT-CAN-CLUSTER"),;
    
    @XmlEnumValue("CAN-CLUSTER")
    CAN_CLUSTER("CAN-CLUSTER"),;
    
    @XmlEnumValue("CAN-FRAME")
    CAN_FRAME("CAN-FRAME"),;
    
    @XmlEnumValue("CAN-TP-CONFIG")
    CAN_TP_CONFIG("CAN-TP-CONFIG"),;
    
    @XmlEnumValue("COMMUNICATION-CLUSTER")
    COMMUNICATION_CLUSTER("COMMUNICATION-CLUSTER"),;
    
    @XmlEnumValue("CONTAINER-I-PDU")
    CONTAINER_I_PDU("CONTAINER-I-PDU"),;
    
    @XmlEnumValue("COUPLING-ELEMENT")
    COUPLING_ELEMENT("COUPLING-ELEMENT"),;
    
    @XmlEnumValue("DCM-I-PDU")
    DCM_I_PDU("DCM-I-PDU"),;
    
    @XmlEnumValue("DO-IP-TP-CONFIG")
    DO_IP_TP_CONFIG("DO-IP-TP-CONFIG"),;
    
    @XmlEnumValue("ECU-INSTANCE")
    ECU_INSTANCE("ECU-INSTANCE"),;
    
    @XmlEnumValue("ETHERNET-CLUSTER")
    ETHERNET_CLUSTER("ETHERNET-CLUSTER"),;
    
    @XmlEnumValue("ETHERNET-FRAME")
    ETHERNET_FRAME("ETHERNET-FRAME"),;
    
    @XmlEnumValue("FIBEX-ELEMENT")
    FIBEX_ELEMENT("FIBEX-ELEMENT"),;
    
    @XmlEnumValue("FLEXRAY-AR-TP-CONFIG")
    FLEXRAY_AR_TP_CONFIG("FLEXRAY-AR-TP-CONFIG"),;
    
    @XmlEnumValue("FLEXRAY-CLUSTER")
    FLEXRAY_CLUSTER("FLEXRAY-CLUSTER"),;
    
    @XmlEnumValue("FLEXRAY-FRAME")
    FLEXRAY_FRAME("FLEXRAY-FRAME"),;
    
    @XmlEnumValue("FLEXRAY-TP-CONFIG")
    FLEXRAY_TP_CONFIG("FLEXRAY-TP-CONFIG"),;
    
    @XmlEnumValue("FRAME")
    FRAME("FRAME"),;
    
    @XmlEnumValue("GATEWAY")
    GATEWAY("GATEWAY"),;
    
    @XmlEnumValue("GENERAL-PURPOSE-I-PDU")
    GENERAL_PURPOSE_I_PDU("GENERAL-PURPOSE-I-PDU"),;
    
    @XmlEnumValue("GENERAL-PURPOSE-PDU")
    GENERAL_PURPOSE_PDU("GENERAL-PURPOSE-PDU"),;
    
    @XmlEnumValue("GENERIC-ETHERNET-FRAME")
    GENERIC_ETHERNET_FRAME("GENERIC-ETHERNET-FRAME"),;
    
    @XmlEnumValue("GLOBAL-TIME-DOMAIN")
    GLOBAL_TIME_DOMAIN("GLOBAL-TIME-DOMAIN"),;
    
    @XmlEnumValue("I-PDU")
    I_PDU("I-PDU"),;
    
    @XmlEnumValue("I-SIGNAL")
    I_SIGNAL("I-SIGNAL"),;
    
    @XmlEnumValue("I-SIGNAL-GROUP")
    I_SIGNAL_GROUP("I-SIGNAL-GROUP"),;
    
    @XmlEnumValue("I-SIGNAL-I-PDU")
    I_SIGNAL_I_PDU("I-SIGNAL-I-PDU"),;
    
    @XmlEnumValue("I-SIGNAL-I-PDU-GROUP")
    I_SIGNAL_I_PDU_GROUP("I-SIGNAL-I-PDU-GROUP"),;
    
    @XmlEnumValue("IEEE-1722-TP-ETHERNET-FRAME")
    IEEE_1722_TP_ETHERNET_FRAME("IEEE-1722-TP-ETHERNET-FRAME"),;
    
    @XmlEnumValue("J-1939-CLUSTER")
    J_1939_CLUSTER("J-1939-CLUSTER"),;
    
    @XmlEnumValue("J-1939-DCM-I-PDU")
    J_1939_DCM_I_PDU("J-1939-DCM-I-PDU"),;
    
    @XmlEnumValue("J-1939-TP-CONFIG")
    J_1939_TP_CONFIG("J-1939-TP-CONFIG"),;
    
    @XmlEnumValue("LIN-CLUSTER")
    LIN_CLUSTER("LIN-CLUSTER"),;
    
    @XmlEnumValue("LIN-EVENT-TRIGGERED-FRAME")
    LIN_EVENT_TRIGGERED_FRAME("LIN-EVENT-TRIGGERED-FRAME"),;
    
    @XmlEnumValue("LIN-FRAME")
    LIN_FRAME("LIN-FRAME"),;
    
    @XmlEnumValue("LIN-SPORADIC-FRAME")
    LIN_SPORADIC_FRAME("LIN-SPORADIC-FRAME"),;
    
    @XmlEnumValue("LIN-TP-CONFIG")
    LIN_TP_CONFIG("LIN-TP-CONFIG"),;
    
    @XmlEnumValue("LIN-UNCONDITIONAL-FRAME")
    LIN_UNCONDITIONAL_FRAME("LIN-UNCONDITIONAL-FRAME"),;
    
    @XmlEnumValue("MULTIPLEXED-I-PDU")
    MULTIPLEXED_I_PDU("MULTIPLEXED-I-PDU"),;
    
    @XmlEnumValue("N-PDU")
    N_PDU("N-PDU"),;
    
    @XmlEnumValue("NM-CONFIG")
    NM_CONFIG("NM-CONFIG"),;
    
    @XmlEnumValue("NM-PDU")
    NM_PDU("NM-PDU"),;
    
    @XmlEnumValue("PDU")
    PDU("PDU"),;
    
    @XmlEnumValue("PDUR-I-PDU-GROUP")
    PDUR_I_PDU_GROUP("PDUR-I-PDU-GROUP"),;
    
    @XmlEnumValue("SECURED-I-PDU")
    SECURED_I_PDU("SECURED-I-PDU"),;
    
    @XmlEnumValue("SO-AD-ROUTING-GROUP")
    SO_AD_ROUTING_GROUP("SO-AD-ROUTING-GROUP"),;
    
    @XmlEnumValue("TP-CONFIG")
    TP_CONFIG("TP-CONFIG"),;
    
    @XmlEnumValue("TTCAN-CLUSTER")
    TTCAN_CLUSTER("TTCAN-CLUSTER"),;
    
    @XmlEnumValue("USER-DEFINED-CLUSTER")
    USER_DEFINED_CLUSTER("USER-DEFINED-CLUSTER"),;
    
    @XmlEnumValue("USER-DEFINED-ETHERNET-FRAME")
    USER_DEFINED_ETHERNET_FRAME("USER-DEFINED-ETHERNET-FRAME"),;
    
    @XmlEnumValue("USER-DEFINED-I-PDU")
    USER_DEFINED_I_PDU("USER-DEFINED-I-PDU"),;
    
    @XmlEnumValue("USER-DEFINED-PDU")
    USER_DEFINED_PDU("USER-DEFINED-PDU"),;
    
    @XmlEnumValue("XCP-PDU")
    XCP_PDU("XCP-PDU");
    

    private final java.lang.String value;

    FibexElementSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FibexElementSubtypesEnum fromValue(java.lang.String v) {
        for (FibexElementSubtypesEnum c: FibexElementSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}