package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="EVENT-HANDLER--SUBTYPES-ENUM")
@XmlEnum
public enum EventHandlerSubtypesEnum {

    
    @XmlEnumValue("EVENT-HANDLER")
    EVENT_HANDLER("EVENT-HANDLER");
    

    private final java.lang.String value;

    EventHandlerSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EventHandlerSubtypesEnum fromValue(java.lang.String v) {
        for (EventHandlerSubtypesEnum c: EventHandlerSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}