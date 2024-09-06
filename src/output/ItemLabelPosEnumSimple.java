package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ITEM-LABEL-POS-ENUM--SIMPLE")
@XmlEnum
public enum ItemLabelPosEnumSimple {

    
    @XmlEnumValue("NEWLINE")
    NEWLINE("NEWLINE"),;
    
    @XmlEnumValue("NEWLINE-IF-NECESSARY")
    NEWLINE_IF_NECESSARY("NEWLINE-IF-NECESSARY"),;
    
    @XmlEnumValue("NO-NEWLINE")
    NO_NEWLINE("NO-NEWLINE");
    

    private final java.lang.String value;

    ItemLabelPosEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ItemLabelPosEnumSimple fromValue(java.lang.String v) {
        for (ItemLabelPosEnumSimple c: ItemLabelPosEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}