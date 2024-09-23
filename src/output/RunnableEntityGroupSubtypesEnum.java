package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="RUNNABLE-ENTITY-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum RunnableEntityGroupSubtypesEnum {

    
    @XmlEnumValue("RUNNABLE-ENTITY-GROUP")
    RUNNABLE_ENTITY_GROUP("RUNNABLE-ENTITY-GROUP");
    

    private final java.lang.String value;

    RunnableEntityGroupSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static RunnableEntityGroupSubtypesEnum fromValue(java.lang.String v) {
        for (RunnableEntityGroupSubtypesEnum c: RunnableEntityGroupSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}