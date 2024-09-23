package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="FRAME--SUBTYPES-ENUM")
@XmlEnum
public enum FrameSubtypesEnum {

    
    @XmlEnumValue("CAN-FRAME")
    CAN_FRAME("CAN-FRAME"),;
    
    @XmlEnumValue("ETHERNET-FRAME")
    ETHERNET_FRAME("ETHERNET-FRAME"),;
    
    @XmlEnumValue("FLEXRAY-FRAME")
    FLEXRAY_FRAME("FLEXRAY-FRAME"),;
    
    @XmlEnumValue("FRAME")
    FRAME("FRAME"),;
    
    @XmlEnumValue("GENERIC-ETHERNET-FRAME")
    GENERIC_ETHERNET_FRAME("GENERIC-ETHERNET-FRAME"),;
    
    @XmlEnumValue("IEEE-1722-TP-ETHERNET-FRAME")
    IEEE_1722_TP_ETHERNET_FRAME("IEEE-1722-TP-ETHERNET-FRAME"),;
    
    @XmlEnumValue("LIN-EVENT-TRIGGERED-FRAME")
    LIN_EVENT_TRIGGERED_FRAME("LIN-EVENT-TRIGGERED-FRAME"),;
    
    @XmlEnumValue("LIN-FRAME")
    LIN_FRAME("LIN-FRAME"),;
    
    @XmlEnumValue("LIN-SPORADIC-FRAME")
    LIN_SPORADIC_FRAME("LIN-SPORADIC-FRAME"),;
    
    @XmlEnumValue("LIN-UNCONDITIONAL-FRAME")
    LIN_UNCONDITIONAL_FRAME("LIN-UNCONDITIONAL-FRAME"),;
    
    @XmlEnumValue("USER-DEFINED-ETHERNET-FRAME")
    USER_DEFINED_ETHERNET_FRAME("USER-DEFINED-ETHERNET-FRAME");
    

    private final java.lang.String value;

    FrameSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FrameSubtypesEnum fromValue(java.lang.String v) {
        for (FrameSubtypesEnum c: FrameSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}