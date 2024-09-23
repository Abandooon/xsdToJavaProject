package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="MODIFICATION-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum ModificationTypeEnumSimple {

    
    @XmlEnumValue("CONTENT-RELATED")
    CONTENT_RELATED("CONTENT-RELATED"),;
    
    @XmlEnumValue("DOC-RELATED")
    DOC_RELATED("DOC-RELATED");
    

    private final java.lang.String value;

    ModificationTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ModificationTypeEnumSimple fromValue(java.lang.String v) {
        for (ModificationTypeEnumSimple c: ModificationTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}