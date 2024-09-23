package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="I-PDU--SUBTYPES-ENUM")
@XmlEnum
public enum IPduSubtypesEnum {

    
    @XmlEnumValue("CONTAINER-I-PDU")
    CONTAINER_I_PDU("CONTAINER-I-PDU"),;
    
    @XmlEnumValue("DCM-I-PDU")
    DCM_I_PDU("DCM-I-PDU"),;
    
    @XmlEnumValue("GENERAL-PURPOSE-I-PDU")
    GENERAL_PURPOSE_I_PDU("GENERAL-PURPOSE-I-PDU"),;
    
    @XmlEnumValue("I-PDU")
    I_PDU("I-PDU"),;
    
    @XmlEnumValue("I-SIGNAL-I-PDU")
    I_SIGNAL_I_PDU("I-SIGNAL-I-PDU"),;
    
    @XmlEnumValue("J-1939-DCM-I-PDU")
    J_1939_DCM_I_PDU("J-1939-DCM-I-PDU"),;
    
    @XmlEnumValue("MULTIPLEXED-I-PDU")
    MULTIPLEXED_I_PDU("MULTIPLEXED-I-PDU"),;
    
    @XmlEnumValue("N-PDU")
    N_PDU("N-PDU"),;
    
    @XmlEnumValue("SECURED-I-PDU")
    SECURED_I_PDU("SECURED-I-PDU"),;
    
    @XmlEnumValue("USER-DEFINED-I-PDU")
    USER_DEFINED_I_PDU("USER-DEFINED-I-PDU"),;
    
    @XmlEnumValue("XCP-PDU")
    XCP_PDU("XCP-PDU");
    

    private final java.lang.String value;

    IPduSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static IPduSubtypesEnum fromValue(java.lang.String v) {
        for (IPduSubtypesEnum c: IPduSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}