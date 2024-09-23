package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-ROUTINE--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticRoutineSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-ROUTINE")
    DIAGNOSTIC_ROUTINE("DIAGNOSTIC-ROUTINE");
    

    private final java.lang.String value;

    DiagnosticRoutineSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticRoutineSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticRoutineSubtypesEnum c: DiagnosticRoutineSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}