package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="HW-PIN--SUBTYPES-ENUM")
@XmlEnum
public enum HwPinSubtypesEnum {

    
    @XmlEnumValue("HW-PIN")
    HW_PIN("HW-PIN");
    

    private final java.lang.String value;

    HwPinSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static HwPinSubtypesEnum fromValue(java.lang.String v) {
        for (HwPinSubtypesEnum c: HwPinSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}