package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="LOGIC-ADDRESS--SUBTYPES-ENUM")
@XmlEnum
public enum LogicAddressSubtypesEnum {

    
    @XmlEnumValue("LOGIC-ADDRESS")
    LOGIC_ADDRESS("LOGIC-ADDRESS");
    

    private final java.lang.String value;

    LogicAddressSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static LogicAddressSubtypesEnum fromValue(java.lang.String v) {
        for (LogicAddressSubtypesEnum c: LogicAddressSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}