package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="N-PDU--SUBTYPES-ENUM")
@XmlEnum
public enum NPduSubtypesEnum {

    
    @XmlEnumValue("N-PDU")
    N_PDU("N-PDU");
    

    private final java.lang.String value;

    NPduSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static NPduSubtypesEnum fromValue(java.lang.String v) {
        for (NPduSubtypesEnum c: NPduSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}