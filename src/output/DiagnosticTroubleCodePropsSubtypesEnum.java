package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-TROUBLE-CODE-PROPS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticTroubleCodePropsSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE-PROPS")
    DIAGNOSTIC_TROUBLE_CODE_PROPS("DIAGNOSTIC-TROUBLE-CODE-PROPS");
    

    private final java.lang.String value;

    DiagnosticTroubleCodePropsSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticTroubleCodePropsSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticTroubleCodePropsSubtypesEnum c: DiagnosticTroubleCodePropsSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}