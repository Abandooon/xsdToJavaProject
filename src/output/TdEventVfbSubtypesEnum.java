package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="TD-EVENT-VFB--SUBTYPES-ENUM")
@XmlEnum
public enum TdEventVfbSubtypesEnum {

    
    @XmlEnumValue("TD-EVENT-MODE-DECLARATION")
    TD_EVENT_MODE_DECLARATION("TD-EVENT-MODE-DECLARATION"),;
    
    @XmlEnumValue("TD-EVENT-OPERATION")
    TD_EVENT_OPERATION("TD-EVENT-OPERATION"),;
    
    @XmlEnumValue("TD-EVENT-TRIGGER")
    TD_EVENT_TRIGGER("TD-EVENT-TRIGGER"),;
    
    @XmlEnumValue("TD-EVENT-VARIABLE-DATA-PROTOTYPE")
    TD_EVENT_VARIABLE_DATA_PROTOTYPE("TD-EVENT-VARIABLE-DATA-PROTOTYPE"),;
    
    @XmlEnumValue("TD-EVENT-VFB")
    TD_EVENT_VFB("TD-EVENT-VFB"),;
    
    @XmlEnumValue("TD-EVENT-VFB-PORT")
    TD_EVENT_VFB_PORT("TD-EVENT-VFB-PORT"),;
    
    @XmlEnumValue("TD-EVENT-VFB-REFERENCE")
    TD_EVENT_VFB_REFERENCE("TD-EVENT-VFB-REFERENCE");
    

    private final java.lang.String value;

    TdEventVfbSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TdEventVfbSubtypesEnum fromValue(java.lang.String v) {
        for (TdEventVfbSubtypesEnum c: TdEventVfbSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}