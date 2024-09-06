package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SHOW-CONTENT-ENUM--SIMPLE")
@XmlEnum
public enum ShowContentEnumSimple {

    
    @XmlEnumValue("NO-SHOW-CONTENT")
    NO_SHOW_CONTENT("NO-SHOW-CONTENT"),;
    
    @XmlEnumValue("SHOW-CONTENT")
    SHOW_CONTENT("SHOW-CONTENT");
    

    private final java.lang.String value;

    ShowContentEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ShowContentEnumSimple fromValue(java.lang.String v) {
        for (ShowContentEnumSimple c: ShowContentEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}