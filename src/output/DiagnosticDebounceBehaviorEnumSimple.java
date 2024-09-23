package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-DEBOUNCE-BEHAVIOR-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticDebounceBehaviorEnumSimple {

    
    @XmlEnumValue("FREEZE")
    FREEZE("FREEZE"),;
    
    @XmlEnumValue("RESET")
    RESET("RESET");
    

    private final java.lang.String value;

    DiagnosticDebounceBehaviorEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticDebounceBehaviorEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticDebounceBehaviorEnumSimple c: DiagnosticDebounceBehaviorEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}