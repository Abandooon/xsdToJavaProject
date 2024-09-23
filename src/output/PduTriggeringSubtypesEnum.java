package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="PDU-TRIGGERING--SUBTYPES-ENUM")
@XmlEnum
public enum PduTriggeringSubtypesEnum {

    
    @XmlEnumValue("PDU-TRIGGERING")
    PDU_TRIGGERING("PDU-TRIGGERING");
    

    private final java.lang.String value;

    PduTriggeringSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static PduTriggeringSubtypesEnum fromValue(java.lang.String v) {
        for (PduTriggeringSubtypesEnum c: PduTriggeringSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}