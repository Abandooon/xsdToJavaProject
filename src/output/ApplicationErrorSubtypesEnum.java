package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="APPLICATION-ERROR--SUBTYPES-ENUM")
@XmlEnum
public enum ApplicationErrorSubtypesEnum {

    
    @XmlEnumValue("APPLICATION-ERROR")
    APPLICATION_ERROR("APPLICATION-ERROR");
    

    private final java.lang.String value;

    ApplicationErrorSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ApplicationErrorSubtypesEnum fromValue(java.lang.String v) {
        for (ApplicationErrorSubtypesEnum c: ApplicationErrorSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}