package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="FLAT-MAP--SUBTYPES-ENUM")
@XmlEnum
public enum FlatMapSubtypesEnum {

    
    @XmlEnumValue("FLAT-MAP")
    FLAT_MAP("FLAT-MAP");
    

    private final java.lang.String value;

    FlatMapSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FlatMapSubtypesEnum fromValue(java.lang.String v) {
        for (FlatMapSubtypesEnum c: FlatMapSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}