package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="TD-EVENT-I-PDU-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum TdEventIPduTypeEnumSimple {

    
    @XmlEnumValue("I-PDU-RECEIVED-BY-COM")
    I_PDU_RECEIVED_BY_COM("I-PDU-RECEIVED-BY-COM"),;
    
    @XmlEnumValue("I-PDU-SENT-TO-IF")
    I_PDU_SENT_TO_IF("I-PDU-SENT-TO-IF");
    

    private final java.lang.String value;

    TdEventIPduTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TdEventIPduTypeEnumSimple fromValue(java.lang.String v) {
        for (TdEventIPduTypeEnumSimple c: TdEventIPduTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}