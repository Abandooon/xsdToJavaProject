package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SW-SYSTEMCONST--SUBTYPES-ENUM")
@XmlEnum
public enum SwSystemconstSubtypesEnum {

    
    @XmlEnumValue("SW-SYSTEMCONST")
    SW_SYSTEMCONST("SW-SYSTEMCONST");
    

    private final java.lang.String value;

    SwSystemconstSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SwSystemconstSubtypesEnum fromValue(java.lang.String v) {
        for (SwSystemconstSubtypesEnum c: SwSystemconstSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}