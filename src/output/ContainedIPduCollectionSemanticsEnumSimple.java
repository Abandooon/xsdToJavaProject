package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="CONTAINED-I-PDU-COLLECTION-SEMANTICS-ENUM--SIMPLE")
@XmlEnum
public enum ContainedIPduCollectionSemanticsEnumSimple {

    
    @XmlEnumValue("LAST-IS-BEST")
    LAST_IS_BEST("LAST-IS-BEST"),;
    
    @XmlEnumValue("QUEUED")
    QUEUED("QUEUED");
    

    private final java.lang.String value;

    ContainedIPduCollectionSemanticsEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ContainedIPduCollectionSemanticsEnumSimple fromValue(java.lang.String v) {
        for (ContainedIPduCollectionSemanticsEnumSimple c: ContainedIPduCollectionSemanticsEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}