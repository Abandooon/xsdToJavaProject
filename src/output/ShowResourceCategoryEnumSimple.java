package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SHOW-RESOURCE-CATEGORY-ENUM--SIMPLE")
@XmlEnum
public enum ShowResourceCategoryEnumSimple {

    
    @XmlEnumValue("NO-SHOW-CATEGORY")
    NO_SHOW_CATEGORY("NO-SHOW-CATEGORY"),;
    
    @XmlEnumValue("SHOW-CATEGORY")
    SHOW_CATEGORY("SHOW-CATEGORY");
    

    private final java.lang.String value;

    ShowResourceCategoryEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ShowResourceCategoryEnumSimple fromValue(java.lang.String v) {
        for (ShowResourceCategoryEnumSimple c: ShowResourceCategoryEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}