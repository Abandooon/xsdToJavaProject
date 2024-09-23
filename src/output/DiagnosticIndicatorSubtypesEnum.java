package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-INDICATOR--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticIndicatorSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-INDICATOR")
    DIAGNOSTIC_INDICATOR("DIAGNOSTIC-INDICATOR");
    

    private final java.lang.String value;

    DiagnosticIndicatorSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticIndicatorSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticIndicatorSubtypesEnum c: DiagnosticIndicatorSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}