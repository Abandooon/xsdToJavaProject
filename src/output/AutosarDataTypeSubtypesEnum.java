package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="AUTOSAR-DATA-TYPE--SUBTYPES-ENUM")
@XmlEnum
public enum AutosarDataTypeSubtypesEnum {

    
    @XmlEnumValue("APPLICATION-ARRAY-DATA-TYPE")
    APPLICATION_ARRAY_DATA_TYPE("APPLICATION-ARRAY-DATA-TYPE"),;
    
    @XmlEnumValue("APPLICATION-COMPOSITE-DATA-TYPE")
    APPLICATION_COMPOSITE_DATA_TYPE("APPLICATION-COMPOSITE-DATA-TYPE"),;
    
    @XmlEnumValue("APPLICATION-DATA-TYPE")
    APPLICATION_DATA_TYPE("APPLICATION-DATA-TYPE"),;
    
    @XmlEnumValue("APPLICATION-PRIMITIVE-DATA-TYPE")
    APPLICATION_PRIMITIVE_DATA_TYPE("APPLICATION-PRIMITIVE-DATA-TYPE"),;
    
    @XmlEnumValue("APPLICATION-RECORD-DATA-TYPE")
    APPLICATION_RECORD_DATA_TYPE("APPLICATION-RECORD-DATA-TYPE"),;
    
    @XmlEnumValue("AUTOSAR-DATA-TYPE")
    AUTOSAR_DATA_TYPE("AUTOSAR-DATA-TYPE"),;
    
    @XmlEnumValue("IMPLEMENTATION-DATA-TYPE")
    IMPLEMENTATION_DATA_TYPE("IMPLEMENTATION-DATA-TYPE");
    

    private final java.lang.String value;

    AutosarDataTypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AutosarDataTypeSubtypesEnum fromValue(java.lang.String v) {
        for (AutosarDataTypeSubtypesEnum c: AutosarDataTypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}