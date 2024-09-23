package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ABSTRACT-REQUIRED-PORT-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum AbstractRequiredPortPrototypeSubtypesEnum {

    
    @XmlEnumValue("ABSTRACT-REQUIRED-PORT-PROTOTYPE")
    ABSTRACT_REQUIRED_PORT_PROTOTYPE("ABSTRACT-REQUIRED-PORT-PROTOTYPE"),;
    
    @XmlEnumValue("PR-PORT-PROTOTYPE")
    PR_PORT_PROTOTYPE("PR-PORT-PROTOTYPE"),;
    
    @XmlEnumValue("R-PORT-PROTOTYPE")
    R_PORT_PROTOTYPE("R-PORT-PROTOTYPE");
    

    private final java.lang.String value;

    AbstractRequiredPortPrototypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AbstractRequiredPortPrototypeSubtypesEnum fromValue(java.lang.String v) {
        for (AbstractRequiredPortPrototypeSubtypesEnum c: AbstractRequiredPortPrototypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}