package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-AGING--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticAgingSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-AGING")
    DIAGNOSTIC_AGING("DIAGNOSTIC-AGING");
    

    private final java.lang.String value;

    DiagnosticAgingSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticAgingSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticAgingSubtypesEnum c: DiagnosticAgingSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}