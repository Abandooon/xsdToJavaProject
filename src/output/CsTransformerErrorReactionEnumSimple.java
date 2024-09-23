package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="CS-TRANSFORMER-ERROR-REACTION-ENUM--SIMPLE")
@XmlEnum
public enum CsTransformerErrorReactionEnumSimple {

    
    @XmlEnumValue("APPLICATION-ONLY")
    APPLICATION_ONLY("APPLICATION-ONLY"),;
    
    @XmlEnumValue("AUTONOMOUS")
    AUTONOMOUS("AUTONOMOUS");
    

    private final java.lang.String value;

    CsTransformerErrorReactionEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CsTransformerErrorReactionEnumSimple fromValue(java.lang.String v) {
        for (CsTransformerErrorReactionEnumSimple c: CsTransformerErrorReactionEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}