package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="PORT-INTERFACE--SUBTYPES-ENUM")
@XmlEnum
public enum PortInterfaceSubtypesEnum {

    
    @XmlEnumValue("CLIENT-SERVER-INTERFACE")
    CLIENT_SERVER_INTERFACE("CLIENT-SERVER-INTERFACE"),;
    
    @XmlEnumValue("DATA-INTERFACE")
    DATA_INTERFACE("DATA-INTERFACE"),;
    
    @XmlEnumValue("MODE-SWITCH-INTERFACE")
    MODE_SWITCH_INTERFACE("MODE-SWITCH-INTERFACE"),;
    
    @XmlEnumValue("NV-DATA-INTERFACE")
    NV_DATA_INTERFACE("NV-DATA-INTERFACE"),;
    
    @XmlEnumValue("PARAMETER-INTERFACE")
    PARAMETER_INTERFACE("PARAMETER-INTERFACE"),;
    
    @XmlEnumValue("PORT-INTERFACE")
    PORT_INTERFACE("PORT-INTERFACE"),;
    
    @XmlEnumValue("SENDER-RECEIVER-INTERFACE")
    SENDER_RECEIVER_INTERFACE("SENDER-RECEIVER-INTERFACE"),;
    
    @XmlEnumValue("TRIGGER-INTERFACE")
    TRIGGER_INTERFACE("TRIGGER-INTERFACE");
    

    private final java.lang.String value;

    PortInterfaceSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static PortInterfaceSubtypesEnum fromValue(java.lang.String v) {
        for (PortInterfaceSubtypesEnum c: PortInterfaceSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}