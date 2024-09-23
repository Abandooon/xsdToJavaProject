package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="KEEP-WITH-PREVIOUS-ENUM--SIMPLE")
@XmlEnum
public enum KeepWithPreviousEnumSimple {

    
    @XmlEnumValue("KEEP")
    KEEP("KEEP"),;
    
    @XmlEnumValue("NO-KEEP")
    NO_KEEP("NO-KEEP");
    

    private final java.lang.String value;

    KeepWithPreviousEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static KeepWithPreviousEnumSimple fromValue(java.lang.String v) {
        for (KeepWithPreviousEnumSimple c: KeepWithPreviousEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}