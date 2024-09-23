package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-OPERATION-CYCLE--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticOperationCycleSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-OPERATION-CYCLE")
    DIAGNOSTIC_OPERATION_CYCLE("DIAGNOSTIC-OPERATION-CYCLE");
    

    private final java.lang.String value;

    DiagnosticOperationCycleSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticOperationCycleSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticOperationCycleSubtypesEnum c: DiagnosticOperationCycleSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}