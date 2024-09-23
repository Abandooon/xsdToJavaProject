package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SWC-SERVICE-DEPENDENCY--SUBTYPES-ENUM")
@XmlEnum
public enum SwcServiceDependencySubtypesEnum {

    
    @XmlEnumValue("SWC-SERVICE-DEPENDENCY")
    SWC_SERVICE_DEPENDENCY("SWC-SERVICE-DEPENDENCY");
    

    private final java.lang.String value;

    SwcServiceDependencySubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SwcServiceDependencySubtypesEnum fromValue(java.lang.String v) {
        for (SwcServiceDependencySubtypesEnum c: SwcServiceDependencySubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}