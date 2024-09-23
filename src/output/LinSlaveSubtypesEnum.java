package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="LIN-SLAVE--SUBTYPES-ENUM")
@XmlEnum
public enum LinSlaveSubtypesEnum {

    
    @XmlEnumValue("LIN-SLAVE")
    LIN_SLAVE("LIN-SLAVE");
    

    private final java.lang.String value;

    LinSlaveSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static LinSlaveSubtypesEnum fromValue(java.lang.String v) {
        for (LinSlaveSubtypesEnum c: LinSlaveSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}