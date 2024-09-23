package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="MODE-ERROR-REACTION-POLICY-ENUM--SIMPLE")
@XmlEnum
public enum ModeErrorReactionPolicyEnumSimple {

    
    @XmlEnumValue("DEFAULT-MODE")
    DEFAULT_MODE("DEFAULT-MODE"),;
    
    @XmlEnumValue("LAST-MODE")
    LAST_MODE("LAST-MODE");
    

    private final java.lang.String value;

    ModeErrorReactionPolicyEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ModeErrorReactionPolicyEnumSimple fromValue(java.lang.String v) {
        for (ModeErrorReactionPolicyEnumSimple c: ModeErrorReactionPolicyEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}