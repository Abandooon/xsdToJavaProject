package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DATA-TYPE-MAPPING-SET--SUBTYPES-ENUM")
@XmlEnum
public enum DataTypeMappingSetSubtypesEnum {

    
    @XmlEnumValue("DATA-TYPE-MAPPING-SET")
    DATA_TYPE_MAPPING_SET("DATA-TYPE-MAPPING-SET");
    

    private final java.lang.String value;

    DataTypeMappingSetSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DataTypeMappingSetSubtypesEnum fromValue(java.lang.String v) {
        for (DataTypeMappingSetSubtypesEnum c: DataTypeMappingSetSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}