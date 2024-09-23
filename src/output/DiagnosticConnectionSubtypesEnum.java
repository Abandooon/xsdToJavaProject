package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-CONNECTION--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticConnectionSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-CONNECTION")
    DIAGNOSTIC_CONNECTION("DIAGNOSTIC-CONNECTION");
    

    private final java.lang.String value;

    DiagnosticConnectionSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticConnectionSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticConnectionSubtypesEnum c: DiagnosticConnectionSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}