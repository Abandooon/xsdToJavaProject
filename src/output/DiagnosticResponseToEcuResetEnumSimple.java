package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-RESPONSE-TO-ECU-RESET-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticResponseToEcuResetEnumSimple {

    
    @XmlEnumValue("RESPOND-AFTER-RESET")
    RESPOND_AFTER_RESET("RESPOND-AFTER-RESET"),;
    
    @XmlEnumValue("RESPOND-BEFORE-RESET")
    RESPOND_BEFORE_RESET("RESPOND-BEFORE-RESET");
    

    private final java.lang.String value;

    DiagnosticResponseToEcuResetEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticResponseToEcuResetEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticResponseToEcuResetEnumSimple c: DiagnosticResponseToEcuResetEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}