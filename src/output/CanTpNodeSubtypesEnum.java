package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="CAN-TP-NODE--SUBTYPES-ENUM")
@XmlEnum
public enum CanTpNodeSubtypesEnum {

    
    @XmlEnumValue("CAN-TP-NODE")
    CAN_TP_NODE("CAN-TP-NODE");
    

    private final java.lang.String value;

    CanTpNodeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CanTpNodeSubtypesEnum fromValue(java.lang.String v) {
        for (CanTpNodeSubtypesEnum c: CanTpNodeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}