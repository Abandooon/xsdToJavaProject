package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ARRAY-SIZE-HANDLING-ENUM--SIMPLE")
@XmlEnum
public enum ArraySizeHandlingEnumSimple {

    
    @XmlEnumValue("ALL-INDICES-DIFFERENT-ARRAY-SIZE")
    ALL_INDICES_DIFFERENT_ARRAY_SIZE("ALL-INDICES-DIFFERENT-ARRAY-SIZE"),;
    
    @XmlEnumValue("ALL-INDICES-SAME-ARRAY-SIZE")
    ALL_INDICES_SAME_ARRAY_SIZE("ALL-INDICES-SAME-ARRAY-SIZE"),;
    
    @XmlEnumValue("INHERITED-FROM-ARRAY-ELEMENT-TYPE-SIZE")
    INHERITED_FROM_ARRAY_ELEMENT_TYPE_SIZE("INHERITED-FROM-ARRAY-ELEMENT-TYPE-SIZE");
    

    private final java.lang.String value;

    ArraySizeHandlingEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ArraySizeHandlingEnumSimple fromValue(java.lang.String v) {
        for (ArraySizeHandlingEnumSimple c: ArraySizeHandlingEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}