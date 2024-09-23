package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="AUTOSAR-OPERATION-ARGUMENT-INSTANCE--SUBTYPES-ENUM")
@XmlEnum
public enum AutosarOperationArgumentInstanceSubtypesEnum {

    
    @XmlEnumValue("AUTOSAR-OPERATION-ARGUMENT-INSTANCE")
    AUTOSAR_OPERATION_ARGUMENT_INSTANCE("AUTOSAR-OPERATION-ARGUMENT-INSTANCE");
    

    private final java.lang.String value;

    AutosarOperationArgumentInstanceSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AutosarOperationArgumentInstanceSubtypesEnum fromValue(java.lang.String v) {
        for (AutosarOperationArgumentInstanceSubtypesEnum c: AutosarOperationArgumentInstanceSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}