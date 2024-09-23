package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="PORT-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum PortGroupSubtypesEnum {

    
    @XmlEnumValue("PORT-GROUP")
    PORT_GROUP("PORT-GROUP");
    

    private final java.lang.String value;

    PortGroupSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static PortGroupSubtypesEnum fromValue(java.lang.String v) {
        for (PortGroupSubtypesEnum c: PortGroupSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}