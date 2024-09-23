package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="EOC-EXECUTABLE-ENTITY-REF-ABSTRACT--SUBTYPES-ENUM")
@XmlEnum
public enum EocExecutableEntityRefAbstractSubtypesEnum {

    
    @XmlEnumValue("EOC-EVENT-REF")
    EOC_EVENT_REF("EOC-EVENT-REF"),;
    
    @XmlEnumValue("EOC-EXECUTABLE-ENTITY-REF")
    EOC_EXECUTABLE_ENTITY_REF("EOC-EXECUTABLE-ENTITY-REF"),;
    
    @XmlEnumValue("EOC-EXECUTABLE-ENTITY-REF-ABSTRACT")
    EOC_EXECUTABLE_ENTITY_REF_ABSTRACT("EOC-EXECUTABLE-ENTITY-REF-ABSTRACT"),;
    
    @XmlEnumValue("EOC-EXECUTABLE-ENTITY-REF-GROUP")
    EOC_EXECUTABLE_ENTITY_REF_GROUP("EOC-EXECUTABLE-ENTITY-REF-GROUP");
    

    private final java.lang.String value;

    EocExecutableEntityRefAbstractSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EocExecutableEntityRefAbstractSubtypesEnum fromValue(java.lang.String v) {
        for (EocExecutableEntityRefAbstractSubtypesEnum c: EocExecutableEntityRefAbstractSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}