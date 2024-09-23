package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="VARIABLE-DATA-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum VariableDataPrototypeSubtypesEnum {

    
    @XmlEnumValue("VARIABLE-DATA-PROTOTYPE")
    VARIABLE_DATA_PROTOTYPE("VARIABLE-DATA-PROTOTYPE");
    

    private final java.lang.String value;

    VariableDataPrototypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static VariableDataPrototypeSubtypesEnum fromValue(java.lang.String v) {
        for (VariableDataPrototypeSubtypesEnum c: VariableDataPrototypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}