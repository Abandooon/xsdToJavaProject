package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="PROGRAMMINGLANGUAGE-ENUM--SIMPLE")
@XmlEnum
public enum ProgramminglanguageEnumSimple {

    
    @XmlEnumValue("C")
    C("C"),;
    
    @XmlEnumValue("CPP")
    CPP("CPP"),;
    
    @XmlEnumValue("JAVA")
    JAVA("JAVA");
    

    private final java.lang.String value;

    ProgramminglanguageEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ProgramminglanguageEnumSimple fromValue(java.lang.String v) {
        for (ProgramminglanguageEnumSimple c: ProgramminglanguageEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}