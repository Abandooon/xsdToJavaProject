package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ECUC-PARAM-CONF-CONTAINER-DEF--SUBTYPES-ENUM")
@XmlEnum
public enum EcucParamConfContainerDefSubtypesEnum {

    
    @XmlEnumValue("ECUC-PARAM-CONF-CONTAINER-DEF")
    ECUC_PARAM_CONF_CONTAINER_DEF("ECUC-PARAM-CONF-CONTAINER-DEF");
    

    private final java.lang.String value;

    EcucParamConfContainerDefSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EcucParamConfContainerDefSubtypesEnum fromValue(java.lang.String v) {
        for (EcucParamConfContainerDefSubtypesEnum c: EcucParamConfContainerDefSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}