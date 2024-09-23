package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-DATA-IDENTIFIER-SET--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticDataIdentifierSetSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-DATA-IDENTIFIER-SET")
    DIAGNOSTIC_DATA_IDENTIFIER_SET("DIAGNOSTIC-DATA-IDENTIFIER-SET");
    

    private final java.lang.String value;

    DiagnosticDataIdentifierSetSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticDataIdentifierSetSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticDataIdentifierSetSubtypesEnum c: DiagnosticDataIdentifierSetSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}