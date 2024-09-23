package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-ENABLE-CONDITION-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticEnableConditionGroupSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-ENABLE-CONDITION-GROUP")
    DIAGNOSTIC_ENABLE_CONDITION_GROUP("DIAGNOSTIC-ENABLE-CONDITION-GROUP");
    

    private final java.lang.String value;

    DiagnosticEnableConditionGroupSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticEnableConditionGroupSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticEnableConditionGroupSubtypesEnum c: DiagnosticEnableConditionGroupSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}