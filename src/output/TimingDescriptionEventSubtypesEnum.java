package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="TIMING-DESCRIPTION-EVENT--SUBTYPES-ENUM")
@XmlEnum
public enum TimingDescriptionEventSubtypesEnum {

    
    @XmlEnumValue("TD-EVENT-BSW")
    TD_EVENT_BSW("TD-EVENT-BSW"),;
    
    @XmlEnumValue("TD-EVENT-BSW-INTERNAL-BEHAVIOR")
    TD_EVENT_BSW_INTERNAL_BEHAVIOR("TD-EVENT-BSW-INTERNAL-BEHAVIOR"),;
    
    @XmlEnumValue("TD-EVENT-BSW-MODE-DECLARATION")
    TD_EVENT_BSW_MODE_DECLARATION("TD-EVENT-BSW-MODE-DECLARATION"),;
    
    @XmlEnumValue("TD-EVENT-BSW-MODULE")
    TD_EVENT_BSW_MODULE("TD-EVENT-BSW-MODULE"),;
    
    @XmlEnumValue("TD-EVENT-COM")
    TD_EVENT_COM("TD-EVENT-COM"),;
    
    @XmlEnumValue("TD-EVENT-COMPLEX")
    TD_EVENT_COMPLEX("TD-EVENT-COMPLEX"),;
    
    @XmlEnumValue("TD-EVENT-CYCLE-START")
    TD_EVENT_CYCLE_START("TD-EVENT-CYCLE-START"),;
    
    @XmlEnumValue("TD-EVENT-FR-CLUSTER-CYCLE-START")
    TD_EVENT_FR_CLUSTER_CYCLE_START("TD-EVENT-FR-CLUSTER-CYCLE-START"),;
    
    @XmlEnumValue("TD-EVENT-FRAME")
    TD_EVENT_FRAME("TD-EVENT-FRAME"),;
    
    @XmlEnumValue("TD-EVENT-I-PDU")
    TD_EVENT_I_PDU("TD-EVENT-I-PDU"),;
    
    @XmlEnumValue("TD-EVENT-I-SIGNAL")
    TD_EVENT_I_SIGNAL("TD-EVENT-I-SIGNAL"),;
    
    @XmlEnumValue("TD-EVENT-MODE-DECLARATION")
    TD_EVENT_MODE_DECLARATION("TD-EVENT-MODE-DECLARATION"),;
    
    @XmlEnumValue("TD-EVENT-OPERATION")
    TD_EVENT_OPERATION("TD-EVENT-OPERATION"),;
    
    @XmlEnumValue("TD-EVENT-SWC")
    TD_EVENT_SWC("TD-EVENT-SWC"),;
    
    @XmlEnumValue("TD-EVENT-SWC-INTERNAL-BEHAVIOR")
    TD_EVENT_SWC_INTERNAL_BEHAVIOR("TD-EVENT-SWC-INTERNAL-BEHAVIOR"),;
    
    @XmlEnumValue("TD-EVENT-SWC-INTERNAL-BEHAVIOR-REFERENCE")
    TD_EVENT_SWC_INTERNAL_BEHAVIOR_REFERENCE("TD-EVENT-SWC-INTERNAL-BEHAVIOR-REFERENCE"),;
    
    @XmlEnumValue("TD-EVENT-TT-CAN-CYCLE-START")
    TD_EVENT_TT_CAN_CYCLE_START("TD-EVENT-TT-CAN-CYCLE-START"),;
    
    @XmlEnumValue("TD-EVENT-TRIGGER")
    TD_EVENT_TRIGGER("TD-EVENT-TRIGGER"),;
    
    @XmlEnumValue("TD-EVENT-VARIABLE-DATA-PROTOTYPE")
    TD_EVENT_VARIABLE_DATA_PROTOTYPE("TD-EVENT-VARIABLE-DATA-PROTOTYPE"),;
    
    @XmlEnumValue("TD-EVENT-VFB")
    TD_EVENT_VFB("TD-EVENT-VFB"),;
    
    @XmlEnumValue("TD-EVENT-VFB-PORT")
    TD_EVENT_VFB_PORT("TD-EVENT-VFB-PORT"),;
    
    @XmlEnumValue("TD-EVENT-VFB-REFERENCE")
    TD_EVENT_VFB_REFERENCE("TD-EVENT-VFB-REFERENCE"),;
    
    @XmlEnumValue("TIMING-DESCRIPTION-EVENT")
    TIMING_DESCRIPTION_EVENT("TIMING-DESCRIPTION-EVENT");
    

    private final java.lang.String value;

    TimingDescriptionEventSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TimingDescriptionEventSubtypesEnum fromValue(java.lang.String v) {
        for (TimingDescriptionEventSubtypesEnum c: TimingDescriptionEventSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}