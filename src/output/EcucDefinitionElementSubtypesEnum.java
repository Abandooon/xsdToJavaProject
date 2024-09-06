package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ECUC-DEFINITION-ELEMENT--SUBTYPES-ENUM")
@XmlEnum
public enum EcucDefinitionElementSubtypesEnum {

    
    @XmlEnumValue("ECUC-ABSTRACT-REFERENCE-DEF")
    ECUC_ABSTRACT_REFERENCE_DEF("ECUC-ABSTRACT-REFERENCE-DEF"),;
    
    @XmlEnumValue("ECUC-ABSTRACT-STRING-PARAM-DEF")
    ECUC_ABSTRACT_STRING_PARAM_DEF("ECUC-ABSTRACT-STRING-PARAM-DEF"),;
    
    @XmlEnumValue("ECUC-ADD-INFO-PARAM-DEF")
    ECUC_ADD_INFO_PARAM_DEF("ECUC-ADD-INFO-PARAM-DEF"),;
    
    @XmlEnumValue("ECUC-BOOLEAN-PARAM-DEF")
    ECUC_BOOLEAN_PARAM_DEF("ECUC-BOOLEAN-PARAM-DEF"),;
    
    @XmlEnumValue("ECUC-CHOICE-CONTAINER-DEF")
    ECUC_CHOICE_CONTAINER_DEF("ECUC-CHOICE-CONTAINER-DEF"),;
    
    @XmlEnumValue("ECUC-CHOICE-REFERENCE-DEF")
    ECUC_CHOICE_REFERENCE_DEF("ECUC-CHOICE-REFERENCE-DEF"),;
    
    @XmlEnumValue("ECUC-COMMON-ATTRIBUTES")
    ECUC_COMMON_ATTRIBUTES("ECUC-COMMON-ATTRIBUTES"),;
    
    @XmlEnumValue("ECUC-CONTAINER-DEF")
    ECUC_CONTAINER_DEF("ECUC-CONTAINER-DEF"),;
    
    @XmlEnumValue("ECUC-DEFINITION-ELEMENT")
    ECUC_DEFINITION_ELEMENT("ECUC-DEFINITION-ELEMENT"),;
    
    @XmlEnumValue("ECUC-ENUMERATION-PARAM-DEF")
    ECUC_ENUMERATION_PARAM_DEF("ECUC-ENUMERATION-PARAM-DEF"),;
    
    @XmlEnumValue("ECUC-FLOAT-PARAM-DEF")
    ECUC_FLOAT_PARAM_DEF("ECUC-FLOAT-PARAM-DEF"),;
    
    @XmlEnumValue("ECUC-FOREIGN-REFERENCE-DEF")
    ECUC_FOREIGN_REFERENCE_DEF("ECUC-FOREIGN-REFERENCE-DEF"),;
    
    @XmlEnumValue("ECUC-FUNCTION-NAME-DEF")
    ECUC_FUNCTION_NAME_DEF("ECUC-FUNCTION-NAME-DEF"),;
    
    @XmlEnumValue("ECUC-INSTANCE-REFERENCE-DEF")
    ECUC_INSTANCE_REFERENCE_DEF("ECUC-INSTANCE-REFERENCE-DEF"),;
    
    @XmlEnumValue("ECUC-INTEGER-PARAM-DEF")
    ECUC_INTEGER_PARAM_DEF("ECUC-INTEGER-PARAM-DEF"),;
    
    @XmlEnumValue("ECUC-LINKER-SYMBOL-DEF")
    ECUC_LINKER_SYMBOL_DEF("ECUC-LINKER-SYMBOL-DEF"),;
    
    @XmlEnumValue("ECUC-MODULE-DEF")
    ECUC_MODULE_DEF("ECUC-MODULE-DEF"),;
    
    @XmlEnumValue("ECUC-MULTILINE-STRING-PARAM-DEF")
    ECUC_MULTILINE_STRING_PARAM_DEF("ECUC-MULTILINE-STRING-PARAM-DEF"),;
    
    @XmlEnumValue("ECUC-PARAM-CONF-CONTAINER-DEF")
    ECUC_PARAM_CONF_CONTAINER_DEF("ECUC-PARAM-CONF-CONTAINER-DEF"),;
    
    @XmlEnumValue("ECUC-PARAMETER-DEF")
    ECUC_PARAMETER_DEF("ECUC-PARAMETER-DEF"),;
    
    @XmlEnumValue("ECUC-REFERENCE-DEF")
    ECUC_REFERENCE_DEF("ECUC-REFERENCE-DEF"),;
    
    @XmlEnumValue("ECUC-STRING-PARAM-DEF")
    ECUC_STRING_PARAM_DEF("ECUC-STRING-PARAM-DEF"),;
    
    @XmlEnumValue("ECUC-SYMBOLIC-NAME-REFERENCE-DEF")
    ECUC_SYMBOLIC_NAME_REFERENCE_DEF("ECUC-SYMBOLIC-NAME-REFERENCE-DEF"),;
    
    @XmlEnumValue("ECUC-URI-REFERENCE-DEF")
    ECUC_URI_REFERENCE_DEF("ECUC-URI-REFERENCE-DEF");
    

    private final java.lang.String value;

    EcucDefinitionElementSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EcucDefinitionElementSubtypesEnum fromValue(java.lang.String v) {
        for (EcucDefinitionElementSubtypesEnum c: EcucDefinitionElementSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}