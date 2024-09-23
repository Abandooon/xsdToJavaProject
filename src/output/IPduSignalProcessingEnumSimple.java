package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="I-PDU-SIGNAL-PROCESSING-ENUM--SIMPLE")
@XmlEnum
public enum IPduSignalProcessingEnumSimple {

    
    @XmlEnumValue("DEFERRED")
    DEFERRED("DEFERRED"),;
    
    @XmlEnumValue("IMMEDIATE")
    IMMEDIATE("IMMEDIATE");
    

    private final java.lang.String value;

    IPduSignalProcessingEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static IPduSignalProcessingEnumSimple fromValue(java.lang.String v) {
        for (IPduSignalProcessingEnumSimple c: IPduSignalProcessingEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}