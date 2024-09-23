package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SW-SYSTEMCONSTANT-VALUE-SET--SUBTYPES-ENUM")
@XmlEnum
public enum SwSystemconstantValueSetSubtypesEnum {

    
    @XmlEnumValue("SW-SYSTEMCONSTANT-VALUE-SET")
    SW_SYSTEMCONSTANT_VALUE_SET("SW-SYSTEMCONSTANT-VALUE-SET");
    

    private final java.lang.String value;

    SwSystemconstantValueSetSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SwSystemconstantValueSetSubtypesEnum fromValue(java.lang.String v) {
        for (SwSystemconstantValueSetSubtypesEnum c: SwSystemconstantValueSetSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}