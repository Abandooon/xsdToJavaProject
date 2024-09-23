package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SYSTEM--SUBTYPES-ENUM")
@XmlEnum
public enum SystemSubtypesEnum {

    
    @XmlEnumValue("SYSTEM")
    SYSTEM("SYSTEM");
    

    private final java.lang.String value;

    SystemSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SystemSubtypesEnum fromValue(java.lang.String v) {
        for (SystemSubtypesEnum c: SystemSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}