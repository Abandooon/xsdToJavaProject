package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-SESSION-CONTROL-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticSessionControlClassSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-SESSION-CONTROL-CLASS")
    DIAGNOSTIC_SESSION_CONTROL_CLASS("DIAGNOSTIC-SESSION-CONTROL-CLASS");
    

    private final java.lang.String value;

    DiagnosticSessionControlClassSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticSessionControlClassSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticSessionControlClassSubtypesEnum c: DiagnosticSessionControlClassSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}