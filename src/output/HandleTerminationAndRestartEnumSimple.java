package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="HANDLE-TERMINATION-AND-RESTART-ENUM--SIMPLE")
@XmlEnum
public enum HandleTerminationAndRestartEnumSimple {

    
    @XmlEnumValue("CAN-BE-TERMINATED")
    CAN_BE_TERMINATED("CAN-BE-TERMINATED"),;
    
    @XmlEnumValue("CAN-BE-TERMINATED-AND-RESTARTED")
    CAN_BE_TERMINATED_AND_RESTARTED("CAN-BE-TERMINATED-AND-RESTARTED"),;
    
    @XmlEnumValue("NO-SUPPORT")
    NO_SUPPORT("NO-SUPPORT");
    

    private final java.lang.String value;

    HandleTerminationAndRestartEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static HandleTerminationAndRestartEnumSimple fromValue(java.lang.String v) {
        for (HandleTerminationAndRestartEnumSimple c: HandleTerminationAndRestartEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}