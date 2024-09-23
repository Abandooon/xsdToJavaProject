package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-TROUBLE-CODE-UDS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticTroubleCodeUdsSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE-UDS")
    DIAGNOSTIC_TROUBLE_CODE_UDS("DIAGNOSTIC-TROUBLE-CODE-UDS");
    

    private final java.lang.String value;

    DiagnosticTroubleCodeUdsSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticTroubleCodeUdsSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticTroubleCodeUdsSubtypesEnum c: DiagnosticTroubleCodeUdsSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}