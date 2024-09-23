package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-SERVICE-TABLE--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticServiceTableSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-SERVICE-TABLE")
    DIAGNOSTIC_SERVICE_TABLE("DIAGNOSTIC-SERVICE-TABLE");
    

    private final java.lang.String value;

    DiagnosticServiceTableSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticServiceTableSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticServiceTableSubtypesEnum c: DiagnosticServiceTableSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}