package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="LIST-ENUM--SIMPLE")
@XmlEnum
public enum ListEnumSimple {

    
    @XmlEnumValue("NUMBER")
    NUMBER("NUMBER"),;
    
    @XmlEnumValue("UNNUMBER")
    UNNUMBER("UNNUMBER");
    

    private final java.lang.String value;

    ListEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ListEnumSimple fromValue(java.lang.String v) {
        for (ListEnumSimple c: ListEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}