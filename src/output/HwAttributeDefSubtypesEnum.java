package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="HW-ATTRIBUTE-DEF--SUBTYPES-ENUM")
@XmlEnum
public enum HwAttributeDefSubtypesEnum {

    
    @XmlEnumValue("HW-ATTRIBUTE-DEF")
    HW_ATTRIBUTE_DEF("HW-ATTRIBUTE-DEF");
    

    private final java.lang.String value;

    HwAttributeDefSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static HwAttributeDefSubtypesEnum fromValue(java.lang.String v) {
        for (HwAttributeDefSubtypesEnum c: HwAttributeDefSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}