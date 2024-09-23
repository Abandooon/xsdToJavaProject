package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DATA-TYPE-POLICY-ENUM--SIMPLE")
@XmlEnum
public enum DataTypePolicyEnumSimple {

    
    @XmlEnumValue("LEGACY")
    LEGACY("LEGACY"),;
    
    @XmlEnumValue("NETWORK-REPRESENTATION-FROM-COM-SPEC")
    NETWORK_REPRESENTATION_FROM_COM_SPEC("NETWORK-REPRESENTATION-FROM-COM-SPEC"),;
    
    @XmlEnumValue("OVERRIDE")
    OVERRIDE("OVERRIDE"),;
    
    @XmlEnumValue("PORT-INTERFACE-DEFINITION")
    PORT_INTERFACE_DEFINITION("PORT-INTERFACE-DEFINITION"),;
    
    @XmlEnumValue("TRANSFORMING-I-SIGNAL")
    TRANSFORMING_I_SIGNAL("TRANSFORMING-I-SIGNAL");
    

    private final java.lang.String value;

    DataTypePolicyEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DataTypePolicyEnumSimple fromValue(java.lang.String v) {
        for (DataTypePolicyEnumSimple c: DataTypePolicyEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}