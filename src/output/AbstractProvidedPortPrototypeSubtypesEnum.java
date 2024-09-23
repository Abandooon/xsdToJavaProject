package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ABSTRACT-PROVIDED-PORT-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum AbstractProvidedPortPrototypeSubtypesEnum {

    
    @XmlEnumValue("ABSTRACT-PROVIDED-PORT-PROTOTYPE")
    ABSTRACT_PROVIDED_PORT_PROTOTYPE("ABSTRACT-PROVIDED-PORT-PROTOTYPE"),;
    
    @XmlEnumValue("P-PORT-PROTOTYPE")
    P_PORT_PROTOTYPE("P-PORT-PROTOTYPE"),;
    
    @XmlEnumValue("PR-PORT-PROTOTYPE")
    PR_PORT_PROTOTYPE("PR-PORT-PROTOTYPE");
    

    private final java.lang.String value;

    AbstractProvidedPortPrototypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AbstractProvidedPortPrototypeSubtypesEnum fromValue(java.lang.String v) {
        for (AbstractProvidedPortPrototypeSubtypesEnum c: AbstractProvidedPortPrototypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}