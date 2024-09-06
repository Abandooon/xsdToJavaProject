package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SERVICE-NEEDS--SUBTYPES-ENUM")
@XmlEnum
public enum ServiceNeedsSubtypesEnum {

    
    @XmlEnumValue("BSW-MGR-NEEDS")
    BSW_MGR_NEEDS("BSW-MGR-NEEDS"),;
    
    @XmlEnumValue("COM-MGR-USER-NEEDS")
    COM_MGR_USER_NEEDS("COM-MGR-USER-NEEDS"),;
    
    @XmlEnumValue("CRYPTO-SERVICE-NEEDS")
    CRYPTO_SERVICE_NEEDS("CRYPTO-SERVICE-NEEDS"),;
    
    @XmlEnumValue("DIAGNOSTIC-CAPABILITY-ELEMENT")
    DIAGNOSTIC_CAPABILITY_ELEMENT("DIAGNOSTIC-CAPABILITY-ELEMENT"),;
    
    @XmlEnumValue("DIAGNOSTIC-COMMUNICATION-MANAGER-NEEDS")
    DIAGNOSTIC_COMMUNICATION_MANAGER_NEEDS("DIAGNOSTIC-COMMUNICATION-MANAGER-NEEDS"),;
    
    @XmlEnumValue("DIAGNOSTIC-ENABLE-CONDITION-NEEDS")
    DIAGNOSTIC_ENABLE_CONDITION_NEEDS("DIAGNOSTIC-ENABLE-CONDITION-NEEDS"),;
    
    @XmlEnumValue("DIAGNOSTIC-EVENT-INFO-NEEDS")
    DIAGNOSTIC_EVENT_INFO_NEEDS("DIAGNOSTIC-EVENT-INFO-NEEDS"),;
    
    @XmlEnumValue("DIAGNOSTIC-EVENT-MANAGER-NEEDS")
    DIAGNOSTIC_EVENT_MANAGER_NEEDS("DIAGNOSTIC-EVENT-MANAGER-NEEDS"),;
    
    @XmlEnumValue("DIAGNOSTIC-EVENT-NEEDS")
    DIAGNOSTIC_EVENT_NEEDS("DIAGNOSTIC-EVENT-NEEDS"),;
    
    @XmlEnumValue("DIAGNOSTIC-IO-CONTROL-NEEDS")
    DIAGNOSTIC_IO_CONTROL_NEEDS("DIAGNOSTIC-IO-CONTROL-NEEDS"),;
    
    @XmlEnumValue("DIAGNOSTIC-OPERATION-CYCLE-NEEDS")
    DIAGNOSTIC_OPERATION_CYCLE_NEEDS("DIAGNOSTIC-OPERATION-CYCLE-NEEDS"),;
    
    @XmlEnumValue("DIAGNOSTIC-ROUTINE-NEEDS")
    DIAGNOSTIC_ROUTINE_NEEDS("DIAGNOSTIC-ROUTINE-NEEDS"),;
    
    @XmlEnumValue("DIAGNOSTIC-STORAGE-CONDITION-NEEDS")
    DIAGNOSTIC_STORAGE_CONDITION_NEEDS("DIAGNOSTIC-STORAGE-CONDITION-NEEDS"),;
    
    @XmlEnumValue("DIAGNOSTIC-VALUE-NEEDS")
    DIAGNOSTIC_VALUE_NEEDS("DIAGNOSTIC-VALUE-NEEDS"),;
    
    @XmlEnumValue("DIAGNOSTICS-COMMUNICATION-SECURITY-NEEDS")
    DIAGNOSTICS_COMMUNICATION_SECURITY_NEEDS("DIAGNOSTICS-COMMUNICATION-SECURITY-NEEDS"),;
    
    @XmlEnumValue("DLT-USER-NEEDS")
    DLT_USER_NEEDS("DLT-USER-NEEDS"),;
    
    @XmlEnumValue("DO-IP-ACTIVATION-LINE-NEEDS")
    DO_IP_ACTIVATION_LINE_NEEDS("DO-IP-ACTIVATION-LINE-NEEDS"),;
    
    @XmlEnumValue("DO-IP-GID-NEEDS")
    DO_IP_GID_NEEDS("DO-IP-GID-NEEDS"),;
    
    @XmlEnumValue("DO-IP-GID-SYNCHRONIZATION-NEEDS")
    DO_IP_GID_SYNCHRONIZATION_NEEDS("DO-IP-GID-SYNCHRONIZATION-NEEDS"),;
    
    @XmlEnumValue("DO-IP-POWER-MODE-STATUS-NEEDS")
    DO_IP_POWER_MODE_STATUS_NEEDS("DO-IP-POWER-MODE-STATUS-NEEDS"),;
    
    @XmlEnumValue("DO-IP-ROUTING-ACTIVATION-AUTHENTICATION-NEEDS")
    DO_IP_ROUTING_ACTIVATION_AUTHENTICATION_NEEDS("DO-IP-ROUTING-ACTIVATION-AUTHENTICATION-NEEDS"),;
    
    @XmlEnumValue("DO-IP-ROUTING-ACTIVATION-CONFIRMATION-NEEDS")
    DO_IP_ROUTING_ACTIVATION_CONFIRMATION_NEEDS("DO-IP-ROUTING-ACTIVATION-CONFIRMATION-NEEDS"),;
    
    @XmlEnumValue("DO-IP-SERVICE-NEEDS")
    DO_IP_SERVICE_NEEDS("DO-IP-SERVICE-NEEDS"),;
    
    @XmlEnumValue("DTC-STATUS-CHANGE-NOTIFICATION-NEEDS")
    DTC_STATUS_CHANGE_NOTIFICATION_NEEDS("DTC-STATUS-CHANGE-NOTIFICATION-NEEDS"),;
    
    @XmlEnumValue("ECU-STATE-MGR-USER-NEEDS")
    ECU_STATE_MGR_USER_NEEDS("ECU-STATE-MGR-USER-NEEDS"),;
    
    @XmlEnumValue("FUNCTION-INHIBITION-NEEDS")
    FUNCTION_INHIBITION_NEEDS("FUNCTION-INHIBITION-NEEDS"),;
    
    @XmlEnumValue("NV-BLOCK-NEEDS")
    NV_BLOCK_NEEDS("NV-BLOCK-NEEDS"),;
    
    @XmlEnumValue("OBD-CONTROL-SERVICE-NEEDS")
    OBD_CONTROL_SERVICE_NEEDS("OBD-CONTROL-SERVICE-NEEDS"),;
    
    @XmlEnumValue("OBD-INFO-SERVICE-NEEDS")
    OBD_INFO_SERVICE_NEEDS("OBD-INFO-SERVICE-NEEDS"),;
    
    @XmlEnumValue("OBD-MONITOR-SERVICE-NEEDS")
    OBD_MONITOR_SERVICE_NEEDS("OBD-MONITOR-SERVICE-NEEDS"),;
    
    @XmlEnumValue("OBD-PID-SERVICE-NEEDS")
    OBD_PID_SERVICE_NEEDS("OBD-PID-SERVICE-NEEDS"),;
    
    @XmlEnumValue("OBD-RATIO-SERVICE-NEEDS")
    OBD_RATIO_SERVICE_NEEDS("OBD-RATIO-SERVICE-NEEDS"),;
    
    @XmlEnumValue("SERVICE-NEEDS")
    SERVICE_NEEDS("SERVICE-NEEDS"),;
    
    @XmlEnumValue("SUPERVISED-ENTITY-NEEDS")
    SUPERVISED_ENTITY_NEEDS("SUPERVISED-ENTITY-NEEDS"),;
    
    @XmlEnumValue("SYNC-TIME-BASE-MGR-USER-NEEDS")
    SYNC_TIME_BASE_MGR_USER_NEEDS("SYNC-TIME-BASE-MGR-USER-NEEDS"),;
    
    @XmlEnumValue("WARNING-INDICATOR-REQUESTED-BIT-NEEDS")
    WARNING_INDICATOR_REQUESTED_BIT_NEEDS("WARNING-INDICATOR-REQUESTED-BIT-NEEDS");
    

    private final java.lang.String value;

    ServiceNeedsSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ServiceNeedsSubtypesEnum fromValue(java.lang.String v) {
        for (ServiceNeedsSubtypesEnum c: ServiceNeedsSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}