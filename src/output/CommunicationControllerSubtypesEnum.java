package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="COMMUNICATION-CONTROLLER--SUBTYPES-ENUM")
@XmlEnum
public enum CommunicationControllerSubtypesEnum {

    
    @XmlEnumValue("ABSTRACT-CAN-COMMUNICATION-CONTROLLER")
    ABSTRACT_CAN_COMMUNICATION_CONTROLLER("ABSTRACT-CAN-COMMUNICATION-CONTROLLER"),;
    
    @XmlEnumValue("CAN-COMMUNICATION-CONTROLLER")
    CAN_COMMUNICATION_CONTROLLER("CAN-COMMUNICATION-CONTROLLER"),;
    
    @XmlEnumValue("COMMUNICATION-CONTROLLER")
    COMMUNICATION_CONTROLLER("COMMUNICATION-CONTROLLER"),;
    
    @XmlEnumValue("ETHERNET-COMMUNICATION-CONTROLLER")
    ETHERNET_COMMUNICATION_CONTROLLER("ETHERNET-COMMUNICATION-CONTROLLER"),;
    
    @XmlEnumValue("FLEXRAY-COMMUNICATION-CONTROLLER")
    FLEXRAY_COMMUNICATION_CONTROLLER("FLEXRAY-COMMUNICATION-CONTROLLER"),;
    
    @XmlEnumValue("LIN-COMMUNICATION-CONTROLLER")
    LIN_COMMUNICATION_CONTROLLER("LIN-COMMUNICATION-CONTROLLER"),;
    
    @XmlEnumValue("LIN-MASTER")
    LIN_MASTER("LIN-MASTER"),;
    
    @XmlEnumValue("LIN-SLAVE")
    LIN_SLAVE("LIN-SLAVE"),;
    
    @XmlEnumValue("TTCAN-COMMUNICATION-CONTROLLER")
    TTCAN_COMMUNICATION_CONTROLLER("TTCAN-COMMUNICATION-CONTROLLER"),;
    
    @XmlEnumValue("USER-DEFINED-COMMUNICATION-CONTROLLER")
    USER_DEFINED_COMMUNICATION_CONTROLLER("USER-DEFINED-COMMUNICATION-CONTROLLER");
    

    private final java.lang.String value;

    CommunicationControllerSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CommunicationControllerSubtypesEnum fromValue(java.lang.String v) {
        for (CommunicationControllerSubtypesEnum c: CommunicationControllerSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}