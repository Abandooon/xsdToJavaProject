package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="RTE-EVENT--SUBTYPES-ENUM")
@XmlEnum
public enum RteEventSubtypesEnum {

    
    @XmlEnumValue("ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT")
    ASYNCHRONOUS_SERVER_CALL_RETURNS_EVENT("ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT"),;
    
    @XmlEnumValue("BACKGROUND-EVENT")
    BACKGROUND_EVENT("BACKGROUND-EVENT"),;
    
    @XmlEnumValue("DATA-RECEIVE-ERROR-EVENT")
    DATA_RECEIVE_ERROR_EVENT("DATA-RECEIVE-ERROR-EVENT"),;
    
    @XmlEnumValue("DATA-RECEIVED-EVENT")
    DATA_RECEIVED_EVENT("DATA-RECEIVED-EVENT"),;
    
    @XmlEnumValue("DATA-SEND-COMPLETED-EVENT")
    DATA_SEND_COMPLETED_EVENT("DATA-SEND-COMPLETED-EVENT"),;
    
    @XmlEnumValue("DATA-WRITE-COMPLETED-EVENT")
    DATA_WRITE_COMPLETED_EVENT("DATA-WRITE-COMPLETED-EVENT"),;
    
    @XmlEnumValue("EXTERNAL-TRIGGER-OCCURRED-EVENT")
    EXTERNAL_TRIGGER_OCCURRED_EVENT("EXTERNAL-TRIGGER-OCCURRED-EVENT"),;
    
    @XmlEnumValue("INIT-EVENT")
    INIT_EVENT("INIT-EVENT"),;
    
    @XmlEnumValue("INTERNAL-TRIGGER-OCCURRED-EVENT")
    INTERNAL_TRIGGER_OCCURRED_EVENT("INTERNAL-TRIGGER-OCCURRED-EVENT"),;
    
    @XmlEnumValue("MODE-SWITCHED-ACK-EVENT")
    MODE_SWITCHED_ACK_EVENT("MODE-SWITCHED-ACK-EVENT"),;
    
    @XmlEnumValue("OPERATION-INVOKED-EVENT")
    OPERATION_INVOKED_EVENT("OPERATION-INVOKED-EVENT"),;
    
    @XmlEnumValue("RTE-EVENT")
    RTE_EVENT("RTE-EVENT"),;
    
    @XmlEnumValue("SWC-MODE-MANAGER-ERROR-EVENT")
    SWC_MODE_MANAGER_ERROR_EVENT("SWC-MODE-MANAGER-ERROR-EVENT"),;
    
    @XmlEnumValue("SWC-MODE-SWITCH-EVENT")
    SWC_MODE_SWITCH_EVENT("SWC-MODE-SWITCH-EVENT"),;
    
    @XmlEnumValue("TIMING-EVENT")
    TIMING_EVENT("TIMING-EVENT"),;
    
    @XmlEnumValue("TRANSFORMER-HARD-ERROR-EVENT")
    TRANSFORMER_HARD_ERROR_EVENT("TRANSFORMER-HARD-ERROR-EVENT");
    

    private final java.lang.String value;

    RteEventSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static RteEventSubtypesEnum fromValue(java.lang.String v) {
        for (RteEventSubtypesEnum c: RteEventSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}