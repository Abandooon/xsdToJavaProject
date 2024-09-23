package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="LIFE-CYCLE-STATE--SUBTYPES-ENUM")
@XmlEnum
public enum LifeCycleStateSubtypesEnum {

    
    @XmlEnumValue("LIFE-CYCLE-STATE")
    LIFE_CYCLE_STATE("LIFE-CYCLE-STATE");
    

    private final java.lang.String value;

    LifeCycleStateSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static LifeCycleStateSubtypesEnum fromValue(java.lang.String v) {
        for (LifeCycleStateSubtypesEnum c: LifeCycleStateSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}