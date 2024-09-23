package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ECUC-VALUE-COLLECTION--SUBTYPES-ENUM")
@XmlEnum
public enum EcucValueCollectionSubtypesEnum {

    
    @XmlEnumValue("ECUC-VALUE-COLLECTION")
    ECUC_VALUE_COLLECTION("ECUC-VALUE-COLLECTION");
    

    private final java.lang.String value;

    EcucValueCollectionSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EcucValueCollectionSubtypesEnum fromValue(java.lang.String v) {
        for (EcucValueCollectionSubtypesEnum c: EcucValueCollectionSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}