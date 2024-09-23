package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="IMPLEMENTATION-DATA-TYPE--SUBTYPES-ENUM")
@XmlEnum
public enum ImplementationDataTypeSubtypesEnum {

    
    @XmlEnumValue("IMPLEMENTATION-DATA-TYPE")
    IMPLEMENTATION_DATA_TYPE("IMPLEMENTATION-DATA-TYPE");
    

    private final java.lang.String value;

    ImplementationDataTypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ImplementationDataTypeSubtypesEnum fromValue(java.lang.String v) {
        for (ImplementationDataTypeSubtypesEnum c: ImplementationDataTypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}