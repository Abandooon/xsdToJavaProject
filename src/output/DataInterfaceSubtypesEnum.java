package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DATA-INTERFACE--SUBTYPES-ENUM")
@XmlEnum
public enum DataInterfaceSubtypesEnum {

    
    @XmlEnumValue("DATA-INTERFACE")
    DATA_INTERFACE("DATA-INTERFACE"),;
    
    @XmlEnumValue("NV-DATA-INTERFACE")
    NV_DATA_INTERFACE("NV-DATA-INTERFACE"),;
    
    @XmlEnumValue("PARAMETER-INTERFACE")
    PARAMETER_INTERFACE("PARAMETER-INTERFACE"),;
    
    @XmlEnumValue("SENDER-RECEIVER-INTERFACE")
    SENDER_RECEIVER_INTERFACE("SENDER-RECEIVER-INTERFACE");
    

    private final java.lang.String value;

    DataInterfaceSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DataInterfaceSubtypesEnum fromValue(java.lang.String v) {
        for (DataInterfaceSubtypesEnum c: DataInterfaceSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}