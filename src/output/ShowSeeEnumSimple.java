package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SHOW-SEE-ENUM--SIMPLE")
@XmlEnum
public enum ShowSeeEnumSimple {

    
    @XmlEnumValue("NO-SHOW-SEE")
    NO_SHOW_SEE("NO-SHOW-SEE"),;
    
    @XmlEnumValue("SHOW-SEE")
    SHOW_SEE("SHOW-SEE");
    

    private final java.lang.String value;

    ShowSeeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ShowSeeEnumSimple fromValue(java.lang.String v) {
        for (ShowSeeEnumSimple c: ShowSeeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}