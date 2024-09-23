package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-SECURITY-LEVEL--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticSecurityLevelSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-SECURITY-LEVEL")
    DIAGNOSTIC_SECURITY_LEVEL("DIAGNOSTIC-SECURITY-LEVEL");
    

    private final java.lang.String value;

    DiagnosticSecurityLevelSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticSecurityLevelSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticSecurityLevelSubtypesEnum c: DiagnosticSecurityLevelSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}