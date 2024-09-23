package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="COMMUNICATION-CONNECTOR--SUBTYPES-ENUM")
@XmlEnum
public enum CommunicationConnectorSubtypesEnum {

    
    @XmlEnumValue("ABSTRACT-CAN-COMMUNICATION-CONNECTOR")
    ABSTRACT_CAN_COMMUNICATION_CONNECTOR("ABSTRACT-CAN-COMMUNICATION-CONNECTOR"),;
    
    @XmlEnumValue("CAN-COMMUNICATION-CONNECTOR")
    CAN_COMMUNICATION_CONNECTOR("CAN-COMMUNICATION-CONNECTOR"),;
    
    @XmlEnumValue("COMMUNICATION-CONNECTOR")
    COMMUNICATION_CONNECTOR("COMMUNICATION-CONNECTOR"),;
    
    @XmlEnumValue("ETHERNET-COMMUNICATION-CONNECTOR")
    ETHERNET_COMMUNICATION_CONNECTOR("ETHERNET-COMMUNICATION-CONNECTOR"),;
    
    @XmlEnumValue("FLEXRAY-COMMUNICATION-CONNECTOR")
    FLEXRAY_COMMUNICATION_CONNECTOR("FLEXRAY-COMMUNICATION-CONNECTOR"),;
    
    @XmlEnumValue("LIN-COMMUNICATION-CONNECTOR")
    LIN_COMMUNICATION_CONNECTOR("LIN-COMMUNICATION-CONNECTOR"),;
    
    @XmlEnumValue("TTCAN-COMMUNICATION-CONNECTOR")
    TTCAN_COMMUNICATION_CONNECTOR("TTCAN-COMMUNICATION-CONNECTOR"),;
    
    @XmlEnumValue("USER-DEFINED-COMMUNICATION-CONNECTOR")
    USER_DEFINED_COMMUNICATION_CONNECTOR("USER-DEFINED-COMMUNICATION-CONNECTOR");
    

    private final java.lang.String value;

    CommunicationConnectorSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CommunicationConnectorSubtypesEnum fromValue(java.lang.String v) {
        for (CommunicationConnectorSubtypesEnum c: CommunicationConnectorSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}