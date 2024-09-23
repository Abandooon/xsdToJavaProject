package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="EXECUTABLE-ENTITY--SUBTYPES-ENUM")
@XmlEnum
public enum ExecutableEntitySubtypesEnum {

    
    @XmlEnumValue("BSW-CALLED-ENTITY")
    BSW_CALLED_ENTITY("BSW-CALLED-ENTITY"),;
    
    @XmlEnumValue("BSW-INTERRUPT-ENTITY")
    BSW_INTERRUPT_ENTITY("BSW-INTERRUPT-ENTITY"),;
    
    @XmlEnumValue("BSW-MODULE-ENTITY")
    BSW_MODULE_ENTITY("BSW-MODULE-ENTITY"),;
    
    @XmlEnumValue("BSW-SCHEDULABLE-ENTITY")
    BSW_SCHEDULABLE_ENTITY("BSW-SCHEDULABLE-ENTITY"),;
    
    @XmlEnumValue("EXECUTABLE-ENTITY")
    EXECUTABLE_ENTITY("EXECUTABLE-ENTITY"),;
    
    @XmlEnumValue("RUNNABLE-ENTITY")
    RUNNABLE_ENTITY("RUNNABLE-ENTITY");
    

    private final java.lang.String value;

    ExecutableEntitySubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ExecutableEntitySubtypesEnum fromValue(java.lang.String v) {
        for (ExecutableEntitySubtypesEnum c: ExecutableEntitySubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}