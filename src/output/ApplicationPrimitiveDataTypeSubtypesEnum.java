package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="APPLICATION-PRIMITIVE-DATA-TYPE--SUBTYPES-ENUM")
@XmlEnum
public enum ApplicationPrimitiveDataTypeSubtypesEnum {

    
    @XmlEnumValue("APPLICATION-PRIMITIVE-DATA-TYPE")
    APPLICATION_PRIMITIVE_DATA_TYPE("APPLICATION-PRIMITIVE-DATA-TYPE");
    

    private final java.lang.String value;

    ApplicationPrimitiveDataTypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ApplicationPrimitiveDataTypeSubtypesEnum fromValue(java.lang.String v) {
        for (ApplicationPrimitiveDataTypeSubtypesEnum c: ApplicationPrimitiveDataTypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}