package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="RX-ACCEPT-CONTAINED-I-PDU-ENUM--SIMPLE")
@XmlEnum
public enum RxAcceptContainedIPduEnumSimple {

    
    @XmlEnumValue("ACCEPT-ALL")
    ACCEPT_ALL("ACCEPT-ALL"),;
    
    @XmlEnumValue("ACCEPT-CONFIGURED")
    ACCEPT_CONFIGURED("ACCEPT-CONFIGURED");
    

    private final java.lang.String value;

    RxAcceptContainedIPduEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static RxAcceptContainedIPduEnumSimple fromValue(java.lang.String v) {
        for (RxAcceptContainedIPduEnumSimple c: RxAcceptContainedIPduEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}