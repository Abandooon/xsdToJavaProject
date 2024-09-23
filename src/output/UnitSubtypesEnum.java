package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="UNIT--SUBTYPES-ENUM")
@XmlEnum
public enum UnitSubtypesEnum {

    
    @XmlEnumValue("UNIT")
    UNIT("UNIT");
    

    private final java.lang.String value;

    UnitSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static UnitSubtypesEnum fromValue(java.lang.String v) {
        for (UnitSubtypesEnum c: UnitSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}