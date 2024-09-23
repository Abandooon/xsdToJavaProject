package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="REMOTING-TECHNOLOGY-ENUM--SIMPLE")
@XmlEnum
public enum RemotingTechnologyEnumSimple {

    
    @XmlEnumValue("AR--CLIENT--SERVER")
    AR__CLIENT__SERVER("AR--CLIENT--SERVER"),;
    
    @XmlEnumValue("SOMEIP")
    SOMEIP("SOMEIP");
    

    private final java.lang.String value;

    RemotingTechnologyEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static RemotingTechnologyEnumSimple fromValue(java.lang.String v) {
        for (RemotingTechnologyEnumSimple c: RemotingTechnologyEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}