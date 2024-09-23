package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="APPLICATION-ARRAY-ELEMENT--SUBTYPES-ENUM")
@XmlEnum
public enum ApplicationArrayElementSubtypesEnum {

    
    @XmlEnumValue("APPLICATION-ARRAY-ELEMENT")
    APPLICATION_ARRAY_ELEMENT("APPLICATION-ARRAY-ELEMENT");
    

    private final java.lang.String value;

    ApplicationArrayElementSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ApplicationArrayElementSubtypesEnum fromValue(java.lang.String v) {
        for (ApplicationArrayElementSubtypesEnum c: ApplicationArrayElementSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}