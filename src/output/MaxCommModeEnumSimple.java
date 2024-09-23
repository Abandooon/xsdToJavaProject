package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="MAX-COMM-MODE-ENUM--SIMPLE")
@XmlEnum
public enum MaxCommModeEnumSimple {

    
    @XmlEnumValue("FULL")
    FULL("FULL"),;
    
    @XmlEnumValue("NONE")
    NONE("NONE"),;
    
    @XmlEnumValue("SILENT")
    SILENT("SILENT");
    

    private final java.lang.String value;

    MaxCommModeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static MaxCommModeEnumSimple fromValue(java.lang.String v) {
        for (MaxCommModeEnumSimple c: MaxCommModeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}