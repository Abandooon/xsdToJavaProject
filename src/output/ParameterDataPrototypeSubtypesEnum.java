package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="PARAMETER-DATA-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum ParameterDataPrototypeSubtypesEnum {

    
    @XmlEnumValue("PARAMETER-DATA-PROTOTYPE")
    PARAMETER_DATA_PROTOTYPE("PARAMETER-DATA-PROTOTYPE");
    

    private final java.lang.String value;

    ParameterDataPrototypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ParameterDataPrototypeSubtypesEnum fromValue(java.lang.String v) {
        for (ParameterDataPrototypeSubtypesEnum c: ParameterDataPrototypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}