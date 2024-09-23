package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="LIN-SCHEDULE-TABLE--SUBTYPES-ENUM")
@XmlEnum
public enum LinScheduleTableSubtypesEnum {

    
    @XmlEnumValue("LIN-SCHEDULE-TABLE")
    LIN_SCHEDULE_TABLE("LIN-SCHEDULE-TABLE");
    

    private final java.lang.String value;

    LinScheduleTableSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static LinScheduleTableSubtypesEnum fromValue(java.lang.String v) {
        for (LinScheduleTableSubtypesEnum c: LinScheduleTableSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}