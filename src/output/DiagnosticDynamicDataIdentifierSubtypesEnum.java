package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-DYNAMIC-DATA-IDENTIFIER--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticDynamicDataIdentifierSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-DYNAMIC-DATA-IDENTIFIER")
    DIAGNOSTIC_DYNAMIC_DATA_IDENTIFIER("DIAGNOSTIC-DYNAMIC-DATA-IDENTIFIER");
    

    private final java.lang.String value;

    DiagnosticDynamicDataIdentifierSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticDynamicDataIdentifierSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticDynamicDataIdentifierSubtypesEnum c: DiagnosticDynamicDataIdentifierSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}