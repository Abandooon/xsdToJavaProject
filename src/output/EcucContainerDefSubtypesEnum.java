package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ECUC-CONTAINER-DEF--SUBTYPES-ENUM")
@XmlEnum
public enum EcucContainerDefSubtypesEnum {

    
    @XmlEnumValue("ECUC-CHOICE-CONTAINER-DEF")
    ECUC_CHOICE_CONTAINER_DEF("ECUC-CHOICE-CONTAINER-DEF"),;
    
    @XmlEnumValue("ECUC-CONTAINER-DEF")
    ECUC_CONTAINER_DEF("ECUC-CONTAINER-DEF"),;
    
    @XmlEnumValue("ECUC-PARAM-CONF-CONTAINER-DEF")
    ECUC_PARAM_CONF_CONTAINER_DEF("ECUC-PARAM-CONF-CONTAINER-DEF");
    

    private final java.lang.String value;

    EcucContainerDefSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EcucContainerDefSubtypesEnum fromValue(java.lang.String v) {
        for (EcucContainerDefSubtypesEnum c: EcucContainerDefSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}