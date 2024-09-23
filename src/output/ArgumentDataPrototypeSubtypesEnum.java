package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ARGUMENT-DATA-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum ArgumentDataPrototypeSubtypesEnum {

    
    @XmlEnumValue("ARGUMENT-DATA-PROTOTYPE")
    ARGUMENT_DATA_PROTOTYPE("ARGUMENT-DATA-PROTOTYPE");
    

    private final java.lang.String value;

    ArgumentDataPrototypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ArgumentDataPrototypeSubtypesEnum fromValue(java.lang.String v) {
        for (ArgumentDataPrototypeSubtypesEnum c: ArgumentDataPrototypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}