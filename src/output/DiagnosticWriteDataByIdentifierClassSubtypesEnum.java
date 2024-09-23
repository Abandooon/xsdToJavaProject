package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticWriteDataByIdentifierClassSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER-CLASS")
    DIAGNOSTIC_WRITE_DATA_BY_IDENTIFIER_CLASS("DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER-CLASS");
    

    private final java.lang.String value;

    DiagnosticWriteDataByIdentifierClassSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticWriteDataByIdentifierClassSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticWriteDataByIdentifierClassSubtypesEnum c: DiagnosticWriteDataByIdentifierClassSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}