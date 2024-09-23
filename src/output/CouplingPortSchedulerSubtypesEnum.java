package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="COUPLING-PORT-SCHEDULER--SUBTYPES-ENUM")
@XmlEnum
public enum CouplingPortSchedulerSubtypesEnum {

    
    @XmlEnumValue("COUPLING-PORT-SCHEDULER")
    COUPLING_PORT_SCHEDULER("COUPLING-PORT-SCHEDULER");
    

    private final java.lang.String value;

    CouplingPortSchedulerSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CouplingPortSchedulerSubtypesEnum fromValue(java.lang.String v) {
        for (CouplingPortSchedulerSubtypesEnum c: CouplingPortSchedulerSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}