package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="COLLECTION--SUBTYPES-ENUM")
@XmlEnum
public enum CollectionSubtypesEnum {

    
    @XmlEnumValue("COLLECTION")
    COLLECTION("COLLECTION");
    

    private final java.lang.String value;

    CollectionSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CollectionSubtypesEnum fromValue(java.lang.String v) {
        for (CollectionSubtypesEnum c: CollectionSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}