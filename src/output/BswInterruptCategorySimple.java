package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="BSW-INTERRUPT-CATEGORY--SIMPLE")
@XmlEnum
public enum BswInterruptCategorySimple {

    
    @XmlEnumValue("CAT-1")
    CAT_1("CAT-1"),;
    
    @XmlEnumValue("CAT-2")
    CAT_2("CAT-2");
    

    private final java.lang.String value;

    BswInterruptCategorySimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BswInterruptCategorySimple fromValue(java.lang.String v) {
        for (BswInterruptCategorySimple c: BswInterruptCategorySimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}