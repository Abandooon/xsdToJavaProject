package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ARRAY-SIZE-SEMANTICS-ENUM--SIMPLE")
@XmlEnum
public enum ArraySizeSemanticsEnumSimple {

    
    @XmlEnumValue("FIXED-SIZE")
    FIXED_SIZE("FIXED-SIZE"),;
    
    @XmlEnumValue("VARIABLE-SIZE")
    VARIABLE_SIZE("VARIABLE-SIZE");
    

    private final java.lang.String value;

    ArraySizeSemanticsEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ArraySizeSemanticsEnumSimple fromValue(java.lang.String v) {
        for (ArraySizeSemanticsEnumSimple c: ArraySizeSemanticsEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}