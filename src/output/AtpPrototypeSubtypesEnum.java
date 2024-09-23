package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ATP-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum AtpPrototypeSubtypesEnum {

    
    @XmlEnumValue("ABSTRACT-PROVIDED-PORT-PROTOTYPE")
    ABSTRACT_PROVIDED_PORT_PROTOTYPE("ABSTRACT-PROVIDED-PORT-PROTOTYPE"),;
    
    @XmlEnumValue("ABSTRACT-REQUIRED-PORT-PROTOTYPE")
    ABSTRACT_REQUIRED_PORT_PROTOTYPE("ABSTRACT-REQUIRED-PORT-PROTOTYPE"),;
    
    @XmlEnumValue("APPLICATION-ARRAY-ELEMENT")
    APPLICATION_ARRAY_ELEMENT("APPLICATION-ARRAY-ELEMENT"),;
    
    @XmlEnumValue("APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE")
    APPLICATION_COMPOSITE_ELEMENT_DATA_PROTOTYPE("APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE"),;
    
    @XmlEnumValue("APPLICATION-RECORD-ELEMENT")
    APPLICATION_RECORD_ELEMENT("APPLICATION-RECORD-ELEMENT"),;
    
    @XmlEnumValue("ARGUMENT-DATA-PROTOTYPE")
    ARGUMENT_DATA_PROTOTYPE("ARGUMENT-DATA-PROTOTYPE"),;
    
    @XmlEnumValue("ATP-PROTOTYPE")
    ATP_PROTOTYPE("ATP-PROTOTYPE"),;
    
    @XmlEnumValue("AUTOSAR-DATA-PROTOTYPE")
    AUTOSAR_DATA_PROTOTYPE("AUTOSAR-DATA-PROTOTYPE"),;
    
    @XmlEnumValue("DATA-PROTOTYPE")
    DATA_PROTOTYPE("DATA-PROTOTYPE"),;
    
    @XmlEnumValue("MODE-DECLARATION-GROUP-PROTOTYPE")
    MODE_DECLARATION_GROUP_PROTOTYPE("MODE-DECLARATION-GROUP-PROTOTYPE"),;
    
    @XmlEnumValue("P-PORT-PROTOTYPE")
    P_PORT_PROTOTYPE("P-PORT-PROTOTYPE"),;
    
    @XmlEnumValue("PR-PORT-PROTOTYPE")
    PR_PORT_PROTOTYPE("PR-PORT-PROTOTYPE"),;
    
    @XmlEnumValue("PARAMETER-DATA-PROTOTYPE")
    PARAMETER_DATA_PROTOTYPE("PARAMETER-DATA-PROTOTYPE"),;
    
    @XmlEnumValue("PORT-PROTOTYPE")
    PORT_PROTOTYPE("PORT-PROTOTYPE"),;
    
    @XmlEnumValue("R-PORT-PROTOTYPE")
    R_PORT_PROTOTYPE("R-PORT-PROTOTYPE"),;
    
    @XmlEnumValue("ROOT-SW-COMPOSITION-PROTOTYPE")
    ROOT_SW_COMPOSITION_PROTOTYPE("ROOT-SW-COMPOSITION-PROTOTYPE"),;
    
    @XmlEnumValue("SW-COMPONENT-PROTOTYPE")
    SW_COMPONENT_PROTOTYPE("SW-COMPONENT-PROTOTYPE"),;
    
    @XmlEnumValue("VARIABLE-DATA-PROTOTYPE")
    VARIABLE_DATA_PROTOTYPE("VARIABLE-DATA-PROTOTYPE");
    

    private final java.lang.String value;

    AtpPrototypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AtpPrototypeSubtypesEnum fromValue(java.lang.String v) {
        for (AtpPrototypeSubtypesEnum c: AtpPrototypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}