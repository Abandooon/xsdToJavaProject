package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="AUTOSAR-VARIABLE-INSTANCE--SUBTYPES-ENUM")
@XmlEnum
public enum AutosarVariableInstanceSubtypesEnum {

    
    @XmlEnumValue("AUTOSAR-VARIABLE-INSTANCE")
    AUTOSAR_VARIABLE_INSTANCE("AUTOSAR-VARIABLE-INSTANCE");
    

    private final java.lang.String value;

    AutosarVariableInstanceSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AutosarVariableInstanceSubtypesEnum fromValue(java.lang.String v) {
        for (AutosarVariableInstanceSubtypesEnum c: AutosarVariableInstanceSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}