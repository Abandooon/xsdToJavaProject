package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-TRANSFER-EXIT-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticTransferExitClassSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-TRANSFER-EXIT-CLASS")
    DIAGNOSTIC_TRANSFER_EXIT_CLASS("DIAGNOSTIC-TRANSFER-EXIT-CLASS");
    

    private final java.lang.String value;

    DiagnosticTransferExitClassSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticTransferExitClassSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticTransferExitClassSubtypesEnum c: DiagnosticTransferExitClassSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}