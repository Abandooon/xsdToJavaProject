package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="CAN-TP-CHANNEL--SUBTYPES-ENUM")
@XmlEnum
public enum CanTpChannelSubtypesEnum {

    
    @XmlEnumValue("CAN-TP-CHANNEL")
    CAN_TP_CHANNEL("CAN-TP-CHANNEL");
    

    private final java.lang.String value;

    CanTpChannelSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CanTpChannelSubtypesEnum fromValue(java.lang.String v) {
        for (CanTpChannelSubtypesEnum c: CanTpChannelSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}