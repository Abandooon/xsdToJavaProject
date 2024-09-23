package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="PHYSICAL-DIMENSION--SUBTYPES-ENUM")
@XmlEnum
public enum PhysicalDimensionSubtypesEnum {

    
    @XmlEnumValue("PHYSICAL-DIMENSION")
    PHYSICAL_DIMENSION("PHYSICAL-DIMENSION");
    

    private final java.lang.String value;

    PhysicalDimensionSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static PhysicalDimensionSubtypesEnum fromValue(java.lang.String v) {
        for (PhysicalDimensionSubtypesEnum c: PhysicalDimensionSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}