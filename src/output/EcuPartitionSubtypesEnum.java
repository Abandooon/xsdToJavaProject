package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ECU-PARTITION--SUBTYPES-ENUM")
@XmlEnum
public enum EcuPartitionSubtypesEnum {

    
    @XmlEnumValue("ECU-PARTITION")
    ECU_PARTITION("ECU-PARTITION");
    

    private final java.lang.String value;

    EcuPartitionSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EcuPartitionSubtypesEnum fromValue(java.lang.String v) {
        for (EcuPartitionSubtypesEnum c: EcuPartitionSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}