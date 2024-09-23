package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-READ-DATA-BY-IDENTIFIER-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticReadDataByIdentifierClassSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-READ-DATA-BY-IDENTIFIER-CLASS")
    DIAGNOSTIC_READ_DATA_BY_IDENTIFIER_CLASS("DIAGNOSTIC-READ-DATA-BY-IDENTIFIER-CLASS");
    

    private final java.lang.String value;

    DiagnosticReadDataByIdentifierClassSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticReadDataByIdentifierClassSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticReadDataByIdentifierClassSubtypesEnum c: DiagnosticReadDataByIdentifierClassSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}