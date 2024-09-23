package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-DEBOUNCE-ALGORITHM-PROPS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticDebounceAlgorithmPropsSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-DEBOUNCE-ALGORITHM-PROPS")
    DIAGNOSTIC_DEBOUNCE_ALGORITHM_PROPS("DIAGNOSTIC-DEBOUNCE-ALGORITHM-PROPS");
    

    private final java.lang.String value;

    DiagnosticDebounceAlgorithmPropsSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticDebounceAlgorithmPropsSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticDebounceAlgorithmPropsSubtypesEnum c: DiagnosticDebounceAlgorithmPropsSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}