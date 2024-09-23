package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-TROUBLE-CODE--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticTroubleCodeSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE")
    DIAGNOSTIC_TROUBLE_CODE("DIAGNOSTIC-TROUBLE-CODE"),;
    
    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE-J-1939")
    DIAGNOSTIC_TROUBLE_CODE_J_1939("DIAGNOSTIC-TROUBLE-CODE-J-1939"),;
    
    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE-OBD")
    DIAGNOSTIC_TROUBLE_CODE_OBD("DIAGNOSTIC-TROUBLE-CODE-OBD"),;
    
    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE-UDS")
    DIAGNOSTIC_TROUBLE_CODE_UDS("DIAGNOSTIC-TROUBLE-CODE-UDS");
    

    private final java.lang.String value;

    DiagnosticTroubleCodeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticTroubleCodeSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticTroubleCodeSubtypesEnum c: DiagnosticTroubleCodeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}