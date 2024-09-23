package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAG-PDU-TYPE--SIMPLE")
@XmlEnum
public enum DiagPduTypeSimple {

    
    @XmlEnumValue("DIAG-REQUEST")
    DIAG_REQUEST("DIAG-REQUEST"),;
    
    @XmlEnumValue("DIAG-RESPONSE")
    DIAG_RESPONSE("DIAG-RESPONSE");
    

    private final java.lang.String value;

    DiagPduTypeSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagPduTypeSimple fromValue(java.lang.String v) {
        for (DiagPduTypeSimple c: DiagPduTypeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}