package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SHOW-RESOURCE-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum ShowResourceTypeEnumSimple {

    
    @XmlEnumValue("NO-SHOW-TYPE")
    NO_SHOW_TYPE("NO-SHOW-TYPE"),;
    
    @XmlEnumValue("SHOW-TYPE")
    SHOW_TYPE("SHOW-TYPE");
    

    private final java.lang.String value;

    ShowResourceTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ShowResourceTypeEnumSimple fromValue(java.lang.String v) {
        for (ShowResourceTypeEnumSimple c: ShowResourceTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}