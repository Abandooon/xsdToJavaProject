package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="FR-AR-TP-ACK-TYPE--SIMPLE")
@XmlEnum
public enum FrArTpAckTypeSimple {

    
    @XmlEnumValue("ACK-WITH-RT")
    ACK_WITH_RT("ACK-WITH-RT"),;
    
    @XmlEnumValue("ACK-WITHOUT-RT")
    ACK_WITHOUT_RT("ACK-WITHOUT-RT"),;
    
    @XmlEnumValue("NO-ACK")
    NO_ACK("NO-ACK");
    

    private final java.lang.String value;

    FrArTpAckTypeSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FrArTpAckTypeSimple fromValue(java.lang.String v) {
        for (FrArTpAckTypeSimple c: FrArTpAckTypeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}