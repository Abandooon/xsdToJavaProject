package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="NOTE-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum NoteTypeEnumSimple {

    
    @XmlEnumValue("CAUTION")
    CAUTION("CAUTION"),;
    
    @XmlEnumValue("EXAMPLE")
    EXAMPLE("EXAMPLE"),;
    
    @XmlEnumValue("EXERCISE")
    EXERCISE("EXERCISE"),;
    
    @XmlEnumValue("HINT")
    HINT("HINT"),;
    
    @XmlEnumValue("INSTRUCTION")
    INSTRUCTION("INSTRUCTION"),;
    
    @XmlEnumValue("OTHER")
    OTHER("OTHER"),;
    
    @XmlEnumValue("TIP")
    TIP("TIP");
    

    private final java.lang.String value;

    NoteTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static NoteTypeEnumSimple fromValue(java.lang.String v) {
        for (NoteTypeEnumSimple c: NoteTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}