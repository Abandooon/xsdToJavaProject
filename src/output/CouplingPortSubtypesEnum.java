package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="COUPLING-PORT--SUBTYPES-ENUM")
@XmlEnum
public enum CouplingPortSubtypesEnum {

    
    @XmlEnumValue("COUPLING-PORT")
    COUPLING_PORT("COUPLING-PORT");
    

    private final java.lang.String value;

    CouplingPortSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CouplingPortSubtypesEnum fromValue(java.lang.String v) {
        for (CouplingPortSubtypesEnum c: CouplingPortSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}