package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="I-PDU-PORT--SUBTYPES-ENUM")
@XmlEnum
public enum IPduPortSubtypesEnum {

    
    @XmlEnumValue("I-PDU-PORT")
    I_PDU_PORT("I-PDU-PORT");
    

    private final java.lang.String value;

    IPduPortSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static IPduPortSubtypesEnum fromValue(java.lang.String v) {
        for (IPduPortSubtypesEnum c: IPduPortSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}