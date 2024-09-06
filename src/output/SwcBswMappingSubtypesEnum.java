package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SWC-BSW-MAPPING--SUBTYPES-ENUM")
@XmlEnum
public enum SwcBswMappingSubtypesEnum {

    
    @XmlEnumValue("SWC-BSW-MAPPING")
    SWC_BSW_MAPPING("SWC-BSW-MAPPING");
    

    private final java.lang.String value;

    SwcBswMappingSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SwcBswMappingSubtypesEnum fromValue(java.lang.String v) {
        for (SwcBswMappingSubtypesEnum c: SwcBswMappingSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}