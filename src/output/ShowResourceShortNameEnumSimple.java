package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SHOW-RESOURCE-SHORT-NAME-ENUM--SIMPLE")
@XmlEnum
public enum ShowResourceShortNameEnumSimple {

    
    @XmlEnumValue("NO-SHOW-SHORT-NAME")
    NO_SHOW_SHORT_NAME("NO-SHOW-SHORT-NAME"),;
    
    @XmlEnumValue("SHOW-SHORT-NAME")
    SHOW_SHORT_NAME("SHOW-SHORT-NAME");
    

    private final java.lang.String value;

    ShowResourceShortNameEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ShowResourceShortNameEnumSimple fromValue(java.lang.String v) {
        for (ShowResourceShortNameEnumSimple c: ShowResourceShortNameEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}