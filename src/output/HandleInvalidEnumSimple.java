package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="HANDLE-INVALID-ENUM--SIMPLE")
@XmlEnum
public enum HandleInvalidEnumSimple {

    
    @XmlEnumValue("DONT-INVALIDATE")
    DONT_INVALIDATE("DONT-INVALIDATE"),;
    
    @XmlEnumValue("EXTERNAL-REPLACEMENT")
    EXTERNAL_REPLACEMENT("EXTERNAL-REPLACEMENT"),;
    
    @XmlEnumValue("KEEP")
    KEEP("KEEP"),;
    
    @XmlEnumValue("REPLACE")
    REPLACE("REPLACE");
    

    private final java.lang.String value;

    HandleInvalidEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static HandleInvalidEnumSimple fromValue(java.lang.String v) {
        for (HandleInvalidEnumSimple c: HandleInvalidEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}