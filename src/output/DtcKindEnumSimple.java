package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DTC-KIND-ENUM--SIMPLE")
@XmlEnum
public enum DtcKindEnumSimple {

    
    @XmlEnumValue("EMISSION-RELATED-DTC")
    EMISSION_RELATED_DTC("EMISSION-RELATED-DTC"),;
    
    @XmlEnumValue("NON-EMMISSION-RELATED-DTC")
    NON_EMMISSION_RELATED_DTC("NON-EMMISSION-RELATED-DTC");
    

    private final java.lang.String value;

    DtcKindEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DtcKindEnumSimple fromValue(java.lang.String v) {
        for (DtcKindEnumSimple c: DtcKindEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}