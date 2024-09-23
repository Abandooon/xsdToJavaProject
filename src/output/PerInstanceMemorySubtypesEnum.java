package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="PER-INSTANCE-MEMORY--SUBTYPES-ENUM")
@XmlEnum
public enum PerInstanceMemorySubtypesEnum {

    
    @XmlEnumValue("PER-INSTANCE-MEMORY")
    PER_INSTANCE_MEMORY("PER-INSTANCE-MEMORY");
    

    private final java.lang.String value;

    PerInstanceMemorySubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static PerInstanceMemorySubtypesEnum fromValue(java.lang.String v) {
        for (PerInstanceMemorySubtypesEnum c: PerInstanceMemorySubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}