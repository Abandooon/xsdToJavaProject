package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="BUILD-ACTION--SUBTYPES-ENUM")
@XmlEnum
public enum BuildActionSubtypesEnum {

    
    @XmlEnumValue("BUILD-ACTION")
    BUILD_ACTION("BUILD-ACTION");
    

    private final java.lang.String value;

    BuildActionSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BuildActionSubtypesEnum fromValue(java.lang.String v) {
        for (BuildActionSubtypesEnum c: BuildActionSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}