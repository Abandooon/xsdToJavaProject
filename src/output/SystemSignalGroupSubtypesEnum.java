package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SYSTEM-SIGNAL-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum SystemSignalGroupSubtypesEnum {

    
    @XmlEnumValue("SYSTEM-SIGNAL-GROUP")
    SYSTEM_SIGNAL_GROUP("SYSTEM-SIGNAL-GROUP");
    

    private final java.lang.String value;

    SystemSignalGroupSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SystemSignalGroupSubtypesEnum fromValue(java.lang.String v) {
        for (SystemSignalGroupSubtypesEnum c: SystemSignalGroupSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}