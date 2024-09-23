package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticClearDiagnosticInformationClassSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION-CLASS")
    DIAGNOSTIC_CLEAR_DIAGNOSTIC_INFORMATION_CLASS("DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION-CLASS");
    

    private final java.lang.String value;

    DiagnosticClearDiagnosticInformationClassSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticClearDiagnosticInformationClassSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticClearDiagnosticInformationClassSubtypesEnum c: DiagnosticClearDiagnosticInformationClassSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}