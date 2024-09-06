package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SHOW-RESOURCE-LONG-NAME-ENUM--SIMPLE")
@XmlEnum
public enum ShowResourceLongNameEnumSimple {

    
    @XmlEnumValue("NO-SHOW-LONG-NAME")
    NO_SHOW_LONG_NAME("NO-SHOW-LONG-NAME"),;
    
    @XmlEnumValue("SHOW-LONG-NAME")
    SHOW_LONG_NAME("SHOW-LONG-NAME");
    

    private final java.lang.String value;

    ShowResourceLongNameEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ShowResourceLongNameEnumSimple fromValue(java.lang.String v) {
        for (ShowResourceLongNameEnumSimple c: ShowResourceLongNameEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}