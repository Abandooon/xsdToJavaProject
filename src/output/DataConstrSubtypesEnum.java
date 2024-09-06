package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DATA-CONSTR--SUBTYPES-ENUM")
@XmlEnum
public enum DataConstrSubtypesEnum {

    
    @XmlEnumValue("DATA-CONSTR")
    DATA_CONSTR("DATA-CONSTR");
    

    private final java.lang.String value;

    DataConstrSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DataConstrSubtypesEnum fromValue(java.lang.String v) {
        for (DataConstrSubtypesEnum c: DataConstrSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}