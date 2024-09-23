package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="BUILD-ACTION-ENVIRONMENT--SUBTYPES-ENUM")
@XmlEnum
public enum BuildActionEnvironmentSubtypesEnum {

    
    @XmlEnumValue("BUILD-ACTION-ENVIRONMENT")
    BUILD_ACTION_ENVIRONMENT("BUILD-ACTION-ENVIRONMENT");
    

    private final java.lang.String value;

    BuildActionEnvironmentSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BuildActionEnvironmentSubtypesEnum fromValue(java.lang.String v) {
        for (BuildActionEnvironmentSubtypesEnum c: BuildActionEnvironmentSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}