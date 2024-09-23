package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="HANDLE-TIMEOUT-ENUM--SIMPLE")
@XmlEnum
public enum HandleTimeoutEnumSimple {

    
    @XmlEnumValue("NONE")
    NONE("NONE"),;
    
    @XmlEnumValue("REPLACE")
    REPLACE("REPLACE");
    

    private final java.lang.String value;

    HandleTimeoutEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static HandleTimeoutEnumSimple fromValue(java.lang.String v) {
        for (HandleTimeoutEnumSimple c: HandleTimeoutEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}