package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="APPLICATION-ENDPOINT--SUBTYPES-ENUM")
@XmlEnum
public enum ApplicationEndpointSubtypesEnum {

    
    @XmlEnumValue("APPLICATION-ENDPOINT")
    APPLICATION_ENDPOINT("APPLICATION-ENDPOINT");
    

    private final java.lang.String value;

    ApplicationEndpointSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ApplicationEndpointSubtypesEnum fromValue(java.lang.String v) {
        for (ApplicationEndpointSubtypesEnum c: ApplicationEndpointSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}