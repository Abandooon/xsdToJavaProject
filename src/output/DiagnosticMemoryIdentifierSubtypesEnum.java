package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-MEMORY-IDENTIFIER--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticMemoryIdentifierSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-MEMORY-IDENTIFIER")
    DIAGNOSTIC_MEMORY_IDENTIFIER("DIAGNOSTIC-MEMORY-IDENTIFIER");
    

    private final java.lang.String value;

    DiagnosticMemoryIdentifierSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticMemoryIdentifierSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticMemoryIdentifierSubtypesEnum c: DiagnosticMemoryIdentifierSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}