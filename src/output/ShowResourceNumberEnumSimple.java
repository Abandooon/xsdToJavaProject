package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SHOW-RESOURCE-NUMBER-ENUM--SIMPLE")
@XmlEnum
public enum ShowResourceNumberEnumSimple {

    
    @XmlEnumValue("NO-SHOW-NUMBER")
    NO_SHOW_NUMBER("NO-SHOW-NUMBER"),;
    
    @XmlEnumValue("SHOW-NUMBER")
    SHOW_NUMBER("SHOW-NUMBER");
    

    private final java.lang.String value;

    ShowResourceNumberEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ShowResourceNumberEnumSimple fromValue(java.lang.String v) {
        for (ShowResourceNumberEnumSimple c: ShowResourceNumberEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}