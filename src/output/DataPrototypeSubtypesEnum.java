package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DATA-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum DataPrototypeSubtypesEnum {

    
    @XmlEnumValue("APPLICATION-ARRAY-ELEMENT")
    APPLICATION_ARRAY_ELEMENT("APPLICATION-ARRAY-ELEMENT"),;
    
    @XmlEnumValue("APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE")
    APPLICATION_COMPOSITE_ELEMENT_DATA_PROTOTYPE("APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE"),;
    
    @XmlEnumValue("APPLICATION-RECORD-ELEMENT")
    APPLICATION_RECORD_ELEMENT("APPLICATION-RECORD-ELEMENT"),;
    
    @XmlEnumValue("ARGUMENT-DATA-PROTOTYPE")
    ARGUMENT_DATA_PROTOTYPE("ARGUMENT-DATA-PROTOTYPE"),;
    
    @XmlEnumValue("AUTOSAR-DATA-PROTOTYPE")
    AUTOSAR_DATA_PROTOTYPE("AUTOSAR-DATA-PROTOTYPE"),;
    
    @XmlEnumValue("DATA-PROTOTYPE")
    DATA_PROTOTYPE("DATA-PROTOTYPE"),;
    
    @XmlEnumValue("PARAMETER-DATA-PROTOTYPE")
    PARAMETER_DATA_PROTOTYPE("PARAMETER-DATA-PROTOTYPE"),;
    
    @XmlEnumValue("VARIABLE-DATA-PROTOTYPE")
    VARIABLE_DATA_PROTOTYPE("VARIABLE-DATA-PROTOTYPE");
    

    private final java.lang.String value;

    DataPrototypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DataPrototypeSubtypesEnum fromValue(java.lang.String v) {
        for (DataPrototypeSubtypesEnum c: DataPrototypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}