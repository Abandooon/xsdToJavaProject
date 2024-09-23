package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="IMPLEMENTATION-DATA-TYPE-ELEMENT--SUBTYPES-ENUM")
@XmlEnum
public enum ImplementationDataTypeElementSubtypesEnum {

    
    @XmlEnumValue("IMPLEMENTATION-DATA-TYPE-ELEMENT")
    IMPLEMENTATION_DATA_TYPE_ELEMENT("IMPLEMENTATION-DATA-TYPE-ELEMENT");
    

    private final java.lang.String value;

    ImplementationDataTypeElementSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ImplementationDataTypeElementSubtypesEnum fromValue(java.lang.String v) {
        for (ImplementationDataTypeElementSubtypesEnum c: ImplementationDataTypeElementSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}