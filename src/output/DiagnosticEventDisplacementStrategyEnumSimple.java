package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-EVENT-DISPLACEMENT-STRATEGY-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticEventDisplacementStrategyEnumSimple {

    
    @XmlEnumValue("FULL")
    FULL("FULL"),;
    
    @XmlEnumValue("NONE")
    NONE("NONE"),;
    
    @XmlEnumValue("PRIO-OCC")
    PRIO_OCC("PRIO-OCC");
    

    private final java.lang.String value;

    DiagnosticEventDisplacementStrategyEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticEventDisplacementStrategyEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticEventDisplacementStrategyEnumSimple c: DiagnosticEventDisplacementStrategyEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}