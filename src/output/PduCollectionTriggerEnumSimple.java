package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="PDU-COLLECTION-TRIGGER-ENUM--SIMPLE")
@XmlEnum
public enum PduCollectionTriggerEnumSimple {

    
    @XmlEnumValue("ALWAYS")
    ALWAYS("ALWAYS"),;
    
    @XmlEnumValue("NEVER")
    NEVER("NEVER");
    

    private final java.lang.String value;

    PduCollectionTriggerEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static PduCollectionTriggerEnumSimple fromValue(java.lang.String v) {
        for (PduCollectionTriggerEnumSimple c: PduCollectionTriggerEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}