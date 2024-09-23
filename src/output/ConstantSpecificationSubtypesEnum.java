package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="CONSTANT-SPECIFICATION--SUBTYPES-ENUM")
@XmlEnum
public enum ConstantSpecificationSubtypesEnum {

    
    @XmlEnumValue("CONSTANT-SPECIFICATION")
    CONSTANT_SPECIFICATION("CONSTANT-SPECIFICATION");
    

    private final java.lang.String value;

    ConstantSpecificationSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ConstantSpecificationSubtypesEnum fromValue(java.lang.String v) {
        for (ConstantSpecificationSubtypesEnum c: ConstantSpecificationSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}