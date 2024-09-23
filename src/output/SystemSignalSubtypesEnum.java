package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SYSTEM-SIGNAL--SUBTYPES-ENUM")
@XmlEnum
public enum SystemSignalSubtypesEnum {

    
    @XmlEnumValue("SYSTEM-SIGNAL")
    SYSTEM_SIGNAL("SYSTEM-SIGNAL");
    

    private final java.lang.String value;

    SystemSignalSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SystemSignalSubtypesEnum fromValue(java.lang.String v) {
        for (SystemSignalSubtypesEnum c: SystemSignalSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}