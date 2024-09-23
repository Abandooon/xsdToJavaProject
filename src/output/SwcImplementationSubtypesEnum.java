package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SWC-IMPLEMENTATION--SUBTYPES-ENUM")
@XmlEnum
public enum SwcImplementationSubtypesEnum {

    
    @XmlEnumValue("SWC-IMPLEMENTATION")
    SWC_IMPLEMENTATION("SWC-IMPLEMENTATION");
    

    private final java.lang.String value;

    SwcImplementationSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SwcImplementationSubtypesEnum fromValue(java.lang.String v) {
        for (SwcImplementationSubtypesEnum c: SwcImplementationSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}