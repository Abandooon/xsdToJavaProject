package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="FLOAT-ENUM--SIMPLE")
@XmlEnum
public enum FloatEnumSimple {

    
    @XmlEnumValue("FLOAT")
    FLOAT("FLOAT"),;
    
    @XmlEnumValue("NO-FLOAT")
    NO_FLOAT("NO-FLOAT");
    

    private final java.lang.String value;

    FloatEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FloatEnumSimple fromValue(java.lang.String v) {
        for (FloatEnumSimple c: FloatEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}