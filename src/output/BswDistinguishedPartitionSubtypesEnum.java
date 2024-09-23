package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="BSW-DISTINGUISHED-PARTITION--SUBTYPES-ENUM")
@XmlEnum
public enum BswDistinguishedPartitionSubtypesEnum {

    
    @XmlEnumValue("BSW-DISTINGUISHED-PARTITION")
    BSW_DISTINGUISHED_PARTITION("BSW-DISTINGUISHED-PARTITION");
    

    private final java.lang.String value;

    BswDistinguishedPartitionSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BswDistinguishedPartitionSubtypesEnum fromValue(java.lang.String v) {
        for (BswDistinguishedPartitionSubtypesEnum c: BswDistinguishedPartitionSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}