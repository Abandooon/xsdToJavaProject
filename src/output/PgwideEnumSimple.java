package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="PGWIDE-ENUM--SIMPLE")
@XmlEnum
public enum PgwideEnumSimple {

    
    @XmlEnumValue("NO-PGWIDE")
    NO_PGWIDE("NO-PGWIDE"),;
    
    @XmlEnumValue("PGWIDE")
    PGWIDE("PGWIDE");
    

    private final java.lang.String value;

    PgwideEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static PgwideEnumSimple fromValue(java.lang.String v) {
        for (PgwideEnumSimple c: PgwideEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}