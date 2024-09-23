package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="MODE-ACTIVATION-KIND--SIMPLE")
@XmlEnum
public enum ModeActivationKindSimple {

    
    @XmlEnumValue("ON-ENTRY")
    ON_ENTRY("ON-ENTRY"),;
    
    @XmlEnumValue("ON-EXIT")
    ON_EXIT("ON-EXIT"),;
    
    @XmlEnumValue("ON-TRANSITION")
    ON_TRANSITION("ON-TRANSITION");
    

    private final java.lang.String value;

    ModeActivationKindSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ModeActivationKindSimple fromValue(java.lang.String v) {
        for (ModeActivationKindSimple c: ModeActivationKindSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}