package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SHOW-RESOURCE-PAGE-ENUM--SIMPLE")
@XmlEnum
public enum ShowResourcePageEnumSimple {

    
    @XmlEnumValue("NO-SHOW-PAGE")
    NO_SHOW_PAGE("NO-SHOW-PAGE"),;
    
    @XmlEnumValue("SHOW-PAGE")
    SHOW_PAGE("SHOW-PAGE");
    

    private final java.lang.String value;

    ShowResourcePageEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ShowResourcePageEnumSimple fromValue(java.lang.String v) {
        for (ShowResourcePageEnumSimple c: ShowResourcePageEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}