package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-FREEZE-FRAME--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticFreezeFrameSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-FREEZE-FRAME")
    DIAGNOSTIC_FREEZE_FRAME("DIAGNOSTIC-FREEZE-FRAME");
    

    private final java.lang.String value;

    DiagnosticFreezeFrameSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticFreezeFrameSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticFreezeFrameSubtypesEnum c: DiagnosticFreezeFrameSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}