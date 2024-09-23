package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-EXTENDED-DATA-RECORD--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticExtendedDataRecordSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-EXTENDED-DATA-RECORD")
    DIAGNOSTIC_EXTENDED_DATA_RECORD("DIAGNOSTIC-EXTENDED-DATA-RECORD");
    

    private final java.lang.String value;

    DiagnosticExtendedDataRecordSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticExtendedDataRecordSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticExtendedDataRecordSubtypesEnum c: DiagnosticExtendedDataRecordSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}