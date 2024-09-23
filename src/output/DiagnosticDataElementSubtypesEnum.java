package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-DATA-ELEMENT--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticDataElementSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-DATA-ELEMENT")
    DIAGNOSTIC_DATA_ELEMENT("DIAGNOSTIC-DATA-ELEMENT");
    

    private final java.lang.String value;

    DiagnosticDataElementSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticDataElementSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticDataElementSubtypesEnum c: DiagnosticDataElementSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}