package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-REQUEST-FILE-TRANSFER-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticRequestFileTransferClassSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-REQUEST-FILE-TRANSFER-CLASS")
    DIAGNOSTIC_REQUEST_FILE_TRANSFER_CLASS("DIAGNOSTIC-REQUEST-FILE-TRANSFER-CLASS");
    

    private final java.lang.String value;

    DiagnosticRequestFileTransferClassSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticRequestFileTransferClassSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticRequestFileTransferClassSubtypesEnum c: DiagnosticRequestFileTransferClassSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}