package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="PDUR-I-PDU-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum PdurIPduGroupSubtypesEnum {

    
    @XmlEnumValue("PDUR-I-PDU-GROUP")
    PDUR_I_PDU_GROUP("PDUR-I-PDU-GROUP");
    

    private final java.lang.String value;

    PdurIPduGroupSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static PdurIPduGroupSubtypesEnum fromValue(java.lang.String v) {
        for (PdurIPduGroupSubtypesEnum c: PdurIPduGroupSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}