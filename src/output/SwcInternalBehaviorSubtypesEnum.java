package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SWC-INTERNAL-BEHAVIOR--SUBTYPES-ENUM")
@XmlEnum
public enum SwcInternalBehaviorSubtypesEnum {

    
    @XmlEnumValue("SWC-INTERNAL-BEHAVIOR")
    SWC_INTERNAL_BEHAVIOR("SWC-INTERNAL-BEHAVIOR");
    

    private final java.lang.String value;

    SwcInternalBehaviorSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SwcInternalBehaviorSubtypesEnum fromValue(java.lang.String v) {
        for (SwcInternalBehaviorSubtypesEnum c: SwcInternalBehaviorSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}