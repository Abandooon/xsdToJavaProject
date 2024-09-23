package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SOMEIP-MESSAGE-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum SomeipMessageTypeEnumSimple {

    
    @XmlEnumValue("ERROR")
    ERROR("ERROR"),;
    
    @XmlEnumValue("NOTIFICATION")
    NOTIFICATION("NOTIFICATION"),;
    
    @XmlEnumValue("REQUEST")
    REQUEST("REQUEST"),;
    
    @XmlEnumValue("REQUEST-NO-RETURN")
    REQUEST_NO_RETURN("REQUEST-NO-RETURN"),;
    
    @XmlEnumValue("RESPONSE")
    RESPONSE("RESPONSE");
    

    private final java.lang.String value;

    SomeipMessageTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SomeipMessageTypeEnumSimple fromValue(java.lang.String v) {
        for (SomeipMessageTypeEnumSimple c: SomeipMessageTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}