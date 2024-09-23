package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="NM-PDU--SUBTYPES-ENUM")
@XmlEnum
public enum NmPduSubtypesEnum {

    
    @XmlEnumValue("NM-PDU")
    NM_PDU("NM-PDU");
    

    private final java.lang.String value;

    NmPduSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static NmPduSubtypesEnum fromValue(java.lang.String v) {
        for (NmPduSubtypesEnum c: NmPduSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}