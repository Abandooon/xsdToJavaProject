package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="FLEXRAY-NM-SCHEDULE-VARIANT--SIMPLE")
@XmlEnum
public enum FlexrayNmScheduleVariantSimple {

    
    @XmlEnumValue("SCHEDULE-VARIANT-1")
    SCHEDULE_VARIANT_1("SCHEDULE-VARIANT-1"),;
    
    @XmlEnumValue("SCHEDULE-VARIANT-2")
    SCHEDULE_VARIANT_2("SCHEDULE-VARIANT-2"),;
    
    @XmlEnumValue("SCHEDULE-VARIANT-3")
    SCHEDULE_VARIANT_3("SCHEDULE-VARIANT-3"),;
    
    @XmlEnumValue("SCHEDULE-VARIANT-4")
    SCHEDULE_VARIANT_4("SCHEDULE-VARIANT-4"),;
    
    @XmlEnumValue("SCHEDULE-VARIANT-5")
    SCHEDULE_VARIANT_5("SCHEDULE-VARIANT-5"),;
    
    @XmlEnumValue("SCHEDULE-VARIANT-6")
    SCHEDULE_VARIANT_6("SCHEDULE-VARIANT-6"),;
    
    @XmlEnumValue("SCHEDULE-VARIANT-7")
    SCHEDULE_VARIANT_7("SCHEDULE-VARIANT-7");
    

    private final java.lang.String value;

    FlexrayNmScheduleVariantSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FlexrayNmScheduleVariantSimple fromValue(java.lang.String v) {
        for (FlexrayNmScheduleVariantSimple c: FlexrayNmScheduleVariantSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}