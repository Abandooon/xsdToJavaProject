package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="HW-TYPE--SUBTYPES-ENUM")
@XmlEnum
public enum HwTypeSubtypesEnum {

    
    @XmlEnumValue("HW-TYPE")
    HW_TYPE("HW-TYPE");
    

    private final java.lang.String value;

    HwTypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static HwTypeSubtypesEnum fromValue(java.lang.String v) {
        for (HwTypeSubtypesEnum c: HwTypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}