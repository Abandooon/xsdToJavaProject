package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-CLEAR-DTC-LIMITATION-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticClearDtcLimitationEnumSimple {

    
    @XmlEnumValue("ALL-SUPPORTED-DTCS")
    ALL_SUPPORTED_DTCS("ALL-SUPPORTED-DTCS"),;
    
    @XmlEnumValue("CLEAR-ALL-DTCS")
    CLEAR_ALL_DTCS("CLEAR-ALL-DTCS");
    

    private final java.lang.String value;

    DiagnosticClearDtcLimitationEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticClearDtcLimitationEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticClearDtcLimitationEnumSimple c: DiagnosticClearDtcLimitationEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}