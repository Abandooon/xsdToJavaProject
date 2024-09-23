package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ECUC-PARAMETER-DEF--SUBTYPES-ENUM")
@XmlEnum
public enum EcucParameterDefSubtypesEnum {

    
    @XmlEnumValue("ECUC-ABSTRACT-STRING-PARAM-DEF")
    ECUC_ABSTRACT_STRING_PARAM_DEF("ECUC-ABSTRACT-STRING-PARAM-DEF"),;
    
    @XmlEnumValue("ECUC-ADD-INFO-PARAM-DEF")
    ECUC_ADD_INFO_PARAM_DEF("ECUC-ADD-INFO-PARAM-DEF"),;
    
    @XmlEnumValue("ECUC-BOOLEAN-PARAM-DEF")
    ECUC_BOOLEAN_PARAM_DEF("ECUC-BOOLEAN-PARAM-DEF"),;
    
    @XmlEnumValue("ECUC-ENUMERATION-PARAM-DEF")
    ECUC_ENUMERATION_PARAM_DEF("ECUC-ENUMERATION-PARAM-DEF"),;
    
    @XmlEnumValue("ECUC-FLOAT-PARAM-DEF")
    ECUC_FLOAT_PARAM_DEF("ECUC-FLOAT-PARAM-DEF"),;
    
    @XmlEnumValue("ECUC-FUNCTION-NAME-DEF")
    ECUC_FUNCTION_NAME_DEF("ECUC-FUNCTION-NAME-DEF"),;
    
    @XmlEnumValue("ECUC-INTEGER-PARAM-DEF")
    ECUC_INTEGER_PARAM_DEF("ECUC-INTEGER-PARAM-DEF"),;
    
    @XmlEnumValue("ECUC-LINKER-SYMBOL-DEF")
    ECUC_LINKER_SYMBOL_DEF("ECUC-LINKER-SYMBOL-DEF"),;
    
    @XmlEnumValue("ECUC-MULTILINE-STRING-PARAM-DEF")
    ECUC_MULTILINE_STRING_PARAM_DEF("ECUC-MULTILINE-STRING-PARAM-DEF"),;
    
    @XmlEnumValue("ECUC-PARAMETER-DEF")
    ECUC_PARAMETER_DEF("ECUC-PARAMETER-DEF"),;
    
    @XmlEnumValue("ECUC-STRING-PARAM-DEF")
    ECUC_STRING_PARAM_DEF("ECUC-STRING-PARAM-DEF");
    

    private final java.lang.String value;

    EcucParameterDefSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EcucParameterDefSubtypesEnum fromValue(java.lang.String v) {
        for (EcucParameterDefSubtypesEnum c: EcucParameterDefSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}