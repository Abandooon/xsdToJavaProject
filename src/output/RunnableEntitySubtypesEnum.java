package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="RUNNABLE-ENTITY--SUBTYPES-ENUM")
@XmlEnum
public enum RunnableEntitySubtypesEnum {

    
    @XmlEnumValue("RUNNABLE-ENTITY")
    RUNNABLE_ENTITY("RUNNABLE-ENTITY");
    

    private final java.lang.String value;

    RunnableEntitySubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static RunnableEntitySubtypesEnum fromValue(java.lang.String v) {
        for (RunnableEntitySubtypesEnum c: RunnableEntitySubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}