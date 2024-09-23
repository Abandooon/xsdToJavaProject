package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-TYPE-OF-FREEZE-FRAME-RECORD-NUMERATION-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticTypeOfFreezeFrameRecordNumerationEnumSimple {

    
    @XmlEnumValue("CALCULATED")
    CALCULATED("CALCULATED"),;
    
    @XmlEnumValue("CONFIGURED")
    CONFIGURED("CONFIGURED");
    

    private final java.lang.String value;

    DiagnosticTypeOfFreezeFrameRecordNumerationEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticTypeOfFreezeFrameRecordNumerationEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticTypeOfFreezeFrameRecordNumerationEnumSimple c: DiagnosticTypeOfFreezeFrameRecordNumerationEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}