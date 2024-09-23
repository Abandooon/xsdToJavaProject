package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="TRIGGER-MODE--SIMPLE")
@XmlEnum
public enum TriggerModeSimple {

    
    @XmlEnumValue("DYNAMIC-PART-TRIGGER")
    DYNAMIC_PART_TRIGGER("DYNAMIC-PART-TRIGGER"),;
    
    @XmlEnumValue("NONE")
    NONE("NONE"),;
    
    @XmlEnumValue("STATIC-OR-DYNAMIC-PART-TRIGGER")
    STATIC_OR_DYNAMIC_PART_TRIGGER("STATIC-OR-DYNAMIC-PART-TRIGGER"),;
    
    @XmlEnumValue("STATIC-PART-TRIGGER")
    STATIC_PART_TRIGGER("STATIC-PART-TRIGGER");
    

    private final java.lang.String value;

    TriggerModeSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TriggerModeSimple fromValue(java.lang.String v) {
        for (TriggerModeSimple c: TriggerModeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}