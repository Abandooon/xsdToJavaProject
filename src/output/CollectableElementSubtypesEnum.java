package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="COLLECTABLE-ELEMENT--SUBTYPES-ENUM")
@XmlEnum
public enum CollectableElementSubtypesEnum {

    
    @XmlEnumValue("AR-ELEMENT")
    AR_ELEMENT("AR-ELEMENT"),;
    
    @XmlEnumValue("AR-PACKAGE")
    AR_PACKAGE("AR-PACKAGE"),;
    
    @XmlEnumValue("ABSTRACT-CAN-CLUSTER")
    ABSTRACT_CAN_CLUSTER("ABSTRACT-CAN-CLUSTER"),;
    
    @XmlEnumValue("ACL-OBJECT-SET")
    ACL_OBJECT_SET("ACL-OBJECT-SET"),;
    
    @XmlEnumValue("ACL-OPERATION")
    ACL_OPERATION("ACL-OPERATION"),;
    
    @XmlEnumValue("ACL-PERMISSION")
    ACL_PERMISSION("ACL-PERMISSION"),;
    
    @XmlEnumValue("ACL-ROLE")
    ACL_ROLE("ACL-ROLE"),;
    
    @XmlEnumValue("ALIAS-NAME-SET")
    ALIAS_NAME_SET("ALIAS-NAME-SET"),;
    
    @XmlEnumValue("APPLICATION-ARRAY-DATA-TYPE")
    APPLICATION_ARRAY_DATA_TYPE("APPLICATION-ARRAY-DATA-TYPE"),;
    
    @XmlEnumValue("APPLICATION-COMPOSITE-DATA-TYPE")
    APPLICATION_COMPOSITE_DATA_TYPE("APPLICATION-COMPOSITE-DATA-TYPE"),;
    
    @XmlEnumValue("APPLICATION-DATA-TYPE")
    APPLICATION_DATA_TYPE("APPLICATION-DATA-TYPE"),;
    
    @XmlEnumValue("APPLICATION-PRIMITIVE-DATA-TYPE")
    APPLICATION_PRIMITIVE_DATA_TYPE("APPLICATION-PRIMITIVE-DATA-TYPE"),;
    
    @XmlEnumValue("APPLICATION-RECORD-DATA-TYPE")
    APPLICATION_RECORD_DATA_TYPE("APPLICATION-RECORD-DATA-TYPE"),;
    
    @XmlEnumValue("APPLICATION-SW-COMPONENT-TYPE")
    APPLICATION_SW_COMPONENT_TYPE("APPLICATION-SW-COMPONENT-TYPE"),;
    
    @XmlEnumValue("ATOMIC-SW-COMPONENT-TYPE")
    ATOMIC_SW_COMPONENT_TYPE("ATOMIC-SW-COMPONENT-TYPE"),;
    
    @XmlEnumValue("AUTOSAR-DATA-TYPE")
    AUTOSAR_DATA_TYPE("AUTOSAR-DATA-TYPE"),;
    
    @XmlEnumValue("BASE-TYPE")
    BASE_TYPE("BASE-TYPE"),;
    
    @XmlEnumValue("BLUEPRINT-MAPPING-SET")
    BLUEPRINT_MAPPING_SET("BLUEPRINT-MAPPING-SET"),;
    
    @XmlEnumValue("BSW-IMPLEMENTATION")
    BSW_IMPLEMENTATION("BSW-IMPLEMENTATION"),;
    
    @XmlEnumValue("BSW-MODULE-DESCRIPTION")
    BSW_MODULE_DESCRIPTION("BSW-MODULE-DESCRIPTION"),;
    
    @XmlEnumValue("BSW-MODULE-ENTRY")
    BSW_MODULE_ENTRY("BSW-MODULE-ENTRY"),;
    
    @XmlEnumValue("BSW-MODULE-TIMING")
    BSW_MODULE_TIMING("BSW-MODULE-TIMING"),;
    
    @XmlEnumValue("BUILD-ACTION-MANIFEST")
    BUILD_ACTION_MANIFEST("BUILD-ACTION-MANIFEST"),;
    
    @XmlEnumValue("CALIBRATION-PARAMETER-VALUE-SET")
    CALIBRATION_PARAMETER_VALUE_SET("CALIBRATION-PARAMETER-VALUE-SET"),;
    
    @XmlEnumValue("CAN-CLUSTER")
    CAN_CLUSTER("CAN-CLUSTER"),;
    
    @XmlEnumValue("CAN-FRAME")
    CAN_FRAME("CAN-FRAME"),;
    
    @XmlEnumValue("CAN-TP-CONFIG")
    CAN_TP_CONFIG("CAN-TP-CONFIG"),;
    
    @XmlEnumValue("CLIENT-ID-DEFINITION-SET")
    CLIENT_ID_DEFINITION_SET("CLIENT-ID-DEFINITION-SET"),;
    
    @XmlEnumValue("CLIENT-SERVER-INTERFACE")
    CLIENT_SERVER_INTERFACE("CLIENT-SERVER-INTERFACE"),;
    
    @XmlEnumValue("COLLECTABLE-ELEMENT")
    COLLECTABLE_ELEMENT("COLLECTABLE-ELEMENT"),;
    
    @XmlEnumValue("COLLECTION")
    COLLECTION("COLLECTION"),;
    
    @XmlEnumValue("COMMUNICATION-CLUSTER")
    COMMUNICATION_CLUSTER("COMMUNICATION-CLUSTER"),;
    
    @XmlEnumValue("COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE")
    COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE("COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE"),;
    
    @XmlEnumValue("COMPOSITION-SW-COMPONENT-TYPE")
    COMPOSITION_SW_COMPONENT_TYPE("COMPOSITION-SW-COMPONENT-TYPE"),;
    
    @XmlEnumValue("COMPU-METHOD")
    COMPU_METHOD("COMPU-METHOD"),;
    
    @XmlEnumValue("CONSISTENCY-NEEDS-BLUEPRINT-SET")
    CONSISTENCY_NEEDS_BLUEPRINT_SET("CONSISTENCY-NEEDS-BLUEPRINT-SET"),;
    
    @XmlEnumValue("CONSTANT-SPECIFICATION")
    CONSTANT_SPECIFICATION("CONSTANT-SPECIFICATION"),;
    
    @XmlEnumValue("CONSTANT-SPECIFICATION-MAPPING-SET")
    CONSTANT_SPECIFICATION_MAPPING_SET("CONSTANT-SPECIFICATION-MAPPING-SET"),;
    
    @XmlEnumValue("CONTAINER-I-PDU")
    CONTAINER_I_PDU("CONTAINER-I-PDU"),;
    
    @XmlEnumValue("COUPLING-ELEMENT")
    COUPLING_ELEMENT("COUPLING-ELEMENT"),;
    
    @XmlEnumValue("DATA-CONSTR")
    DATA_CONSTR("DATA-CONSTR"),;
    
    @XmlEnumValue("DATA-INTERFACE")
    DATA_INTERFACE("DATA-INTERFACE"),;
    
    @XmlEnumValue("DATA-TRANSFORMATION-SET")
    DATA_TRANSFORMATION_SET("DATA-TRANSFORMATION-SET"),;
    
    @XmlEnumValue("DATA-TYPE-MAPPING-SET")
    DATA_TYPE_MAPPING_SET("DATA-TYPE-MAPPING-SET"),;
    
    @XmlEnumValue("DCM-I-PDU")
    DCM_I_PDU("DCM-I-PDU"),;
    
    @XmlEnumValue("DIAGNOSTIC-ABSTRACT-DATA-IDENTIFIER")
    DIAGNOSTIC_ABSTRACT_DATA_IDENTIFIER("DIAGNOSTIC-ABSTRACT-DATA-IDENTIFIER"),;
    
    @XmlEnumValue("DIAGNOSTIC-ACCESS-PERMISSION")
    DIAGNOSTIC_ACCESS_PERMISSION("DIAGNOSTIC-ACCESS-PERMISSION"),;
    
    @XmlEnumValue("DIAGNOSTIC-AGING")
    DIAGNOSTIC_AGING("DIAGNOSTIC-AGING"),;
    
    @XmlEnumValue("DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION")
    DIAGNOSTIC_CLEAR_DIAGNOSTIC_INFORMATION("DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION"),;
    
    @XmlEnumValue("DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION-CLASS")
    DIAGNOSTIC_CLEAR_DIAGNOSTIC_INFORMATION_CLASS("DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-COM-CONTROL")
    DIAGNOSTIC_COM_CONTROL("DIAGNOSTIC-COM-CONTROL"),;
    
    @XmlEnumValue("DIAGNOSTIC-COM-CONTROL-CLASS")
    DIAGNOSTIC_COM_CONTROL_CLASS("DIAGNOSTIC-COM-CONTROL-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-COMMON-ELEMENT")
    DIAGNOSTIC_COMMON_ELEMENT("DIAGNOSTIC-COMMON-ELEMENT"),;
    
    @XmlEnumValue("DIAGNOSTIC-CONDITION")
    DIAGNOSTIC_CONDITION("DIAGNOSTIC-CONDITION"),;
    
    @XmlEnumValue("DIAGNOSTIC-CONDITION-GROUP")
    DIAGNOSTIC_CONDITION_GROUP("DIAGNOSTIC-CONDITION-GROUP"),;
    
    @XmlEnumValue("DIAGNOSTIC-CONNECTION")
    DIAGNOSTIC_CONNECTION("DIAGNOSTIC-CONNECTION"),;
    
    @XmlEnumValue("DIAGNOSTIC-CONTRIBUTION-SET")
    DIAGNOSTIC_CONTRIBUTION_SET("DIAGNOSTIC-CONTRIBUTION-SET"),;
    
    @XmlEnumValue("DIAGNOSTIC-CONTROL-DTC-SETTING")
    DIAGNOSTIC_CONTROL_DTC_SETTING("DIAGNOSTIC-CONTROL-DTC-SETTING"),;
    
    @XmlEnumValue("DIAGNOSTIC-CONTROL-DTC-SETTING-CLASS")
    DIAGNOSTIC_CONTROL_DTC_SETTING_CLASS("DIAGNOSTIC-CONTROL-DTC-SETTING-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-CUSTOM-SERVICE-CLASS")
    DIAGNOSTIC_CUSTOM_SERVICE_CLASS("DIAGNOSTIC-CUSTOM-SERVICE-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-DATA-BY-IDENTIFIER")
    DIAGNOSTIC_DATA_BY_IDENTIFIER("DIAGNOSTIC-DATA-BY-IDENTIFIER"),;
    
    @XmlEnumValue("DIAGNOSTIC-DATA-IDENTIFIER")
    DIAGNOSTIC_DATA_IDENTIFIER("DIAGNOSTIC-DATA-IDENTIFIER"),;
    
    @XmlEnumValue("DIAGNOSTIC-DATA-IDENTIFIER-SET")
    DIAGNOSTIC_DATA_IDENTIFIER_SET("DIAGNOSTIC-DATA-IDENTIFIER-SET"),;
    
    @XmlEnumValue("DIAGNOSTIC-DATA-TRANSFER")
    DIAGNOSTIC_DATA_TRANSFER("DIAGNOSTIC-DATA-TRANSFER"),;
    
    @XmlEnumValue("DIAGNOSTIC-DATA-TRANSFER-CLASS")
    DIAGNOSTIC_DATA_TRANSFER_CLASS("DIAGNOSTIC-DATA-TRANSFER-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-DEM-PROVIDED-DATA-MAPPING")
    DIAGNOSTIC_DEM_PROVIDED_DATA_MAPPING("DIAGNOSTIC-DEM-PROVIDED-DATA-MAPPING"),;
    
    @XmlEnumValue("DIAGNOSTIC-DYNAMIC-DATA-IDENTIFIER")
    DIAGNOSTIC_DYNAMIC_DATA_IDENTIFIER("DIAGNOSTIC-DYNAMIC-DATA-IDENTIFIER"),;
    
    @XmlEnumValue("DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER")
    DIAGNOSTIC_DYNAMICALLY_DEFINE_DATA_IDENTIFIER("DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER"),;
    
    @XmlEnumValue("DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER-CLASS")
    DIAGNOSTIC_DYNAMICALLY_DEFINE_DATA_IDENTIFIER_CLASS("DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-ECU-RESET")
    DIAGNOSTIC_ECU_RESET("DIAGNOSTIC-ECU-RESET"),;
    
    @XmlEnumValue("DIAGNOSTIC-ECU-RESET-CLASS")
    DIAGNOSTIC_ECU_RESET_CLASS("DIAGNOSTIC-ECU-RESET-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-ENABLE-CONDITION")
    DIAGNOSTIC_ENABLE_CONDITION("DIAGNOSTIC-ENABLE-CONDITION"),;
    
    @XmlEnumValue("DIAGNOSTIC-ENABLE-CONDITION-GROUP")
    DIAGNOSTIC_ENABLE_CONDITION_GROUP("DIAGNOSTIC-ENABLE-CONDITION-GROUP"),;
    
    @XmlEnumValue("DIAGNOSTIC-ENABLE-CONDITION-PORT-MAPPING")
    DIAGNOSTIC_ENABLE_CONDITION_PORT_MAPPING("DIAGNOSTIC-ENABLE-CONDITION-PORT-MAPPING"),;
    
    @XmlEnumValue("DIAGNOSTIC-EVENT")
    DIAGNOSTIC_EVENT("DIAGNOSTIC-EVENT"),;
    
    @XmlEnumValue("DIAGNOSTIC-EVENT-PORT-MAPPING")
    DIAGNOSTIC_EVENT_PORT_MAPPING("DIAGNOSTIC-EVENT-PORT-MAPPING"),;
    
    @XmlEnumValue("DIAGNOSTIC-EVENT-TO-DEBOUNCE-ALGORITHM-MAPPING")
    DIAGNOSTIC_EVENT_TO_DEBOUNCE_ALGORITHM_MAPPING("DIAGNOSTIC-EVENT-TO-DEBOUNCE-ALGORITHM-MAPPING"),;
    
    @XmlEnumValue("DIAGNOSTIC-EVENT-TO-ENABLE-CONDITION-GROUP-MAPPING")
    DIAGNOSTIC_EVENT_TO_ENABLE_CONDITION_GROUP_MAPPING("DIAGNOSTIC-EVENT-TO-ENABLE-CONDITION-GROUP-MAPPING"),;
    
    @XmlEnumValue("DIAGNOSTIC-EVENT-TO-OPERATION-CYCLE-MAPPING")
    DIAGNOSTIC_EVENT_TO_OPERATION_CYCLE_MAPPING("DIAGNOSTIC-EVENT-TO-OPERATION-CYCLE-MAPPING"),;
    
    @XmlEnumValue("DIAGNOSTIC-EVENT-TO-STORAGE-CONDITION-GROUP-MAPPING")
    DIAGNOSTIC_EVENT_TO_STORAGE_CONDITION_GROUP_MAPPING("DIAGNOSTIC-EVENT-TO-STORAGE-CONDITION-GROUP-MAPPING"),;
    
    @XmlEnumValue("DIAGNOSTIC-EVENT-TO-TROUBLE-CODE-UDS-MAPPING")
    DIAGNOSTIC_EVENT_TO_TROUBLE_CODE_UDS_MAPPING("DIAGNOSTIC-EVENT-TO-TROUBLE-CODE-UDS-MAPPING"),;
    
    @XmlEnumValue("DIAGNOSTIC-EXTENDED-DATA-RECORD")
    DIAGNOSTIC_EXTENDED_DATA_RECORD("DIAGNOSTIC-EXTENDED-DATA-RECORD"),;
    
    @XmlEnumValue("DIAGNOSTIC-FREEZE-FRAME")
    DIAGNOSTIC_FREEZE_FRAME("DIAGNOSTIC-FREEZE-FRAME"),;
    
    @XmlEnumValue("DIAGNOSTIC-IO-CONTROL")
    DIAGNOSTIC_IO_CONTROL("DIAGNOSTIC-IO-CONTROL"),;
    
    @XmlEnumValue("DIAGNOSTIC-INDICATOR")
    DIAGNOSTIC_INDICATOR("DIAGNOSTIC-INDICATOR"),;
    
    @XmlEnumValue("DIAGNOSTIC-IO-CONTROL-CLASS")
    DIAGNOSTIC_IO_CONTROL_CLASS("DIAGNOSTIC-IO-CONTROL-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-MAPPING")
    DIAGNOSTIC_MAPPING("DIAGNOSTIC-MAPPING"),;
    
    @XmlEnumValue("DIAGNOSTIC-MEMORY-ADDRESSABLE-RANGE-ACCESS")
    DIAGNOSTIC_MEMORY_ADDRESSABLE_RANGE_ACCESS("DIAGNOSTIC-MEMORY-ADDRESSABLE-RANGE-ACCESS"),;
    
    @XmlEnumValue("DIAGNOSTIC-MEMORY-BY-ADDRESS")
    DIAGNOSTIC_MEMORY_BY_ADDRESS("DIAGNOSTIC-MEMORY-BY-ADDRESS"),;
    
    @XmlEnumValue("DIAGNOSTIC-MEMORY-DESTINATION")
    DIAGNOSTIC_MEMORY_DESTINATION("DIAGNOSTIC-MEMORY-DESTINATION"),;
    
    @XmlEnumValue("DIAGNOSTIC-MEMORY-DESTINATION-MIRROR")
    DIAGNOSTIC_MEMORY_DESTINATION_MIRROR("DIAGNOSTIC-MEMORY-DESTINATION-MIRROR"),;
    
    @XmlEnumValue("DIAGNOSTIC-MEMORY-DESTINATION-PRIMARY")
    DIAGNOSTIC_MEMORY_DESTINATION_PRIMARY("DIAGNOSTIC-MEMORY-DESTINATION-PRIMARY"),;
    
    @XmlEnumValue("DIAGNOSTIC-MEMORY-DESTINATION-USER-DEFINED")
    DIAGNOSTIC_MEMORY_DESTINATION_USER_DEFINED("DIAGNOSTIC-MEMORY-DESTINATION-USER-DEFINED"),;
    
    @XmlEnumValue("DIAGNOSTIC-MEMORY-IDENTIFIER")
    DIAGNOSTIC_MEMORY_IDENTIFIER("DIAGNOSTIC-MEMORY-IDENTIFIER"),;
    
    @XmlEnumValue("DIAGNOSTIC-OPERATION-CYCLE")
    DIAGNOSTIC_OPERATION_CYCLE("DIAGNOSTIC-OPERATION-CYCLE"),;
    
    @XmlEnumValue("DIAGNOSTIC-OPERATION-CYCLE-PORT-MAPPING")
    DIAGNOSTIC_OPERATION_CYCLE_PORT_MAPPING("DIAGNOSTIC-OPERATION-CYCLE-PORT-MAPPING"),;
    
    @XmlEnumValue("DIAGNOSTIC-READ-DTC-INFORMATION")
    DIAGNOSTIC_READ_DTC_INFORMATION("DIAGNOSTIC-READ-DTC-INFORMATION"),;
    
    @XmlEnumValue("DIAGNOSTIC-READ-DTC-INFORMATION-CLASS")
    DIAGNOSTIC_READ_DTC_INFORMATION_CLASS("DIAGNOSTIC-READ-DTC-INFORMATION-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-READ-DATA-BY-IDENTIFIER")
    DIAGNOSTIC_READ_DATA_BY_IDENTIFIER("DIAGNOSTIC-READ-DATA-BY-IDENTIFIER"),;
    
    @XmlEnumValue("DIAGNOSTIC-READ-DATA-BY-IDENTIFIER-CLASS")
    DIAGNOSTIC_READ_DATA_BY_IDENTIFIER_CLASS("DIAGNOSTIC-READ-DATA-BY-IDENTIFIER-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID")
    DIAGNOSTIC_READ_DATA_BY_PERIODIC_ID("DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID"),;
    
    @XmlEnumValue("DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS")
    DIAGNOSTIC_READ_DATA_BY_PERIODIC_ID_CLASS("DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-READ-MEMORY-BY-ADDRESS")
    DIAGNOSTIC_READ_MEMORY_BY_ADDRESS("DIAGNOSTIC-READ-MEMORY-BY-ADDRESS"),;
    
    @XmlEnumValue("DIAGNOSTIC-READ-MEMORY-BY-ADDRESS-CLASS")
    DIAGNOSTIC_READ_MEMORY_BY_ADDRESS_CLASS("DIAGNOSTIC-READ-MEMORY-BY-ADDRESS-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-REQUEST-DOWNLOAD")
    DIAGNOSTIC_REQUEST_DOWNLOAD("DIAGNOSTIC-REQUEST-DOWNLOAD"),;
    
    @XmlEnumValue("DIAGNOSTIC-REQUEST-DOWNLOAD-CLASS")
    DIAGNOSTIC_REQUEST_DOWNLOAD_CLASS("DIAGNOSTIC-REQUEST-DOWNLOAD-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-REQUEST-FILE-TRANSFER")
    DIAGNOSTIC_REQUEST_FILE_TRANSFER("DIAGNOSTIC-REQUEST-FILE-TRANSFER"),;
    
    @XmlEnumValue("DIAGNOSTIC-REQUEST-FILE-TRANSFER-CLASS")
    DIAGNOSTIC_REQUEST_FILE_TRANSFER_CLASS("DIAGNOSTIC-REQUEST-FILE-TRANSFER-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-REQUEST-UPLOAD")
    DIAGNOSTIC_REQUEST_UPLOAD("DIAGNOSTIC-REQUEST-UPLOAD"),;
    
    @XmlEnumValue("DIAGNOSTIC-REQUEST-UPLOAD-CLASS")
    DIAGNOSTIC_REQUEST_UPLOAD_CLASS("DIAGNOSTIC-REQUEST-UPLOAD-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-RESPONSE-ON-EVENT")
    DIAGNOSTIC_RESPONSE_ON_EVENT("DIAGNOSTIC-RESPONSE-ON-EVENT"),;
    
    @XmlEnumValue("DIAGNOSTIC-RESPONSE-ON-EVENT-CLASS")
    DIAGNOSTIC_RESPONSE_ON_EVENT_CLASS("DIAGNOSTIC-RESPONSE-ON-EVENT-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-ROUTINE")
    DIAGNOSTIC_ROUTINE("DIAGNOSTIC-ROUTINE"),;
    
    @XmlEnumValue("DIAGNOSTIC-ROUTINE-CONTROL")
    DIAGNOSTIC_ROUTINE_CONTROL("DIAGNOSTIC-ROUTINE-CONTROL"),;
    
    @XmlEnumValue("DIAGNOSTIC-ROUTINE-CONTROL-CLASS")
    DIAGNOSTIC_ROUTINE_CONTROL_CLASS("DIAGNOSTIC-ROUTINE-CONTROL-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-SECURITY-ACCESS")
    DIAGNOSTIC_SECURITY_ACCESS("DIAGNOSTIC-SECURITY-ACCESS"),;
    
    @XmlEnumValue("DIAGNOSTIC-SECURITY-ACCESS-CLASS")
    DIAGNOSTIC_SECURITY_ACCESS_CLASS("DIAGNOSTIC-SECURITY-ACCESS-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-SECURITY-LEVEL")
    DIAGNOSTIC_SECURITY_LEVEL("DIAGNOSTIC-SECURITY-LEVEL"),;
    
    @XmlEnumValue("DIAGNOSTIC-SERVICE-CLASS")
    DIAGNOSTIC_SERVICE_CLASS("DIAGNOSTIC-SERVICE-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-SERVICE-DATA-MAPPING")
    DIAGNOSTIC_SERVICE_DATA_MAPPING("DIAGNOSTIC-SERVICE-DATA-MAPPING"),;
    
    @XmlEnumValue("DIAGNOSTIC-SERVICE-INSTANCE")
    DIAGNOSTIC_SERVICE_INSTANCE("DIAGNOSTIC-SERVICE-INSTANCE"),;
    
    @XmlEnumValue("DIAGNOSTIC-SERVICE-SW-MAPPING")
    DIAGNOSTIC_SERVICE_SW_MAPPING("DIAGNOSTIC-SERVICE-SW-MAPPING"),;
    
    @XmlEnumValue("DIAGNOSTIC-SERVICE-TABLE")
    DIAGNOSTIC_SERVICE_TABLE("DIAGNOSTIC-SERVICE-TABLE"),;
    
    @XmlEnumValue("DIAGNOSTIC-SESSION")
    DIAGNOSTIC_SESSION("DIAGNOSTIC-SESSION"),;
    
    @XmlEnumValue("DIAGNOSTIC-SESSION-CONTROL")
    DIAGNOSTIC_SESSION_CONTROL("DIAGNOSTIC-SESSION-CONTROL"),;
    
    @XmlEnumValue("DIAGNOSTIC-SESSION-CONTROL-CLASS")
    DIAGNOSTIC_SESSION_CONTROL_CLASS("DIAGNOSTIC-SESSION-CONTROL-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-STORAGE-CONDITION")
    DIAGNOSTIC_STORAGE_CONDITION("DIAGNOSTIC-STORAGE-CONDITION"),;
    
    @XmlEnumValue("DIAGNOSTIC-STORAGE-CONDITION-GROUP")
    DIAGNOSTIC_STORAGE_CONDITION_GROUP("DIAGNOSTIC-STORAGE-CONDITION-GROUP"),;
    
    @XmlEnumValue("DIAGNOSTIC-STORAGE-CONDITION-PORT-MAPPING")
    DIAGNOSTIC_STORAGE_CONDITION_PORT_MAPPING("DIAGNOSTIC-STORAGE-CONDITION-PORT-MAPPING"),;
    
    @XmlEnumValue("DIAGNOSTIC-SW-MAPPING")
    DIAGNOSTIC_SW_MAPPING("DIAGNOSTIC-SW-MAPPING"),;
    
    @XmlEnumValue("DIAGNOSTIC-TRANSFER-EXIT")
    DIAGNOSTIC_TRANSFER_EXIT("DIAGNOSTIC-TRANSFER-EXIT"),;
    
    @XmlEnumValue("DIAGNOSTIC-TRANSFER-EXIT-CLASS")
    DIAGNOSTIC_TRANSFER_EXIT_CLASS("DIAGNOSTIC-TRANSFER-EXIT-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE")
    DIAGNOSTIC_TROUBLE_CODE("DIAGNOSTIC-TROUBLE-CODE"),;
    
    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE-GROUP")
    DIAGNOSTIC_TROUBLE_CODE_GROUP("DIAGNOSTIC-TROUBLE-CODE-GROUP"),;
    
    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE-J-1939")
    DIAGNOSTIC_TROUBLE_CODE_J_1939("DIAGNOSTIC-TROUBLE-CODE-J-1939"),;
    
    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE-OBD")
    DIAGNOSTIC_TROUBLE_CODE_OBD("DIAGNOSTIC-TROUBLE-CODE-OBD"),;
    
    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE-PROPS")
    DIAGNOSTIC_TROUBLE_CODE_PROPS("DIAGNOSTIC-TROUBLE-CODE-PROPS"),;
    
    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE-UDS")
    DIAGNOSTIC_TROUBLE_CODE_UDS("DIAGNOSTIC-TROUBLE-CODE-UDS"),;
    
    @XmlEnumValue("DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER")
    DIAGNOSTIC_WRITE_DATA_BY_IDENTIFIER("DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER"),;
    
    @XmlEnumValue("DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER-CLASS")
    DIAGNOSTIC_WRITE_DATA_BY_IDENTIFIER_CLASS("DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER-CLASS"),;
    
    @XmlEnumValue("DIAGNOSTIC-WRITE-MEMORY-BY-ADDRESS")
    DIAGNOSTIC_WRITE_MEMORY_BY_ADDRESS("DIAGNOSTIC-WRITE-MEMORY-BY-ADDRESS"),;
    
    @XmlEnumValue("DIAGNOSTIC-WRITE-MEMORY-BY-ADDRESS-CLASS")
    DIAGNOSTIC_WRITE_MEMORY_BY_ADDRESS_CLASS("DIAGNOSTIC-WRITE-MEMORY-BY-ADDRESS-CLASS"),;
    
    @XmlEnumValue("DO-IP-TP-CONFIG")
    DO_IP_TP_CONFIG("DO-IP-TP-CONFIG"),;
    
    @XmlEnumValue("DOCUMENTATION")
    DOCUMENTATION("DOCUMENTATION"),;
    
    @XmlEnumValue("ECU-ABSTRACTION-SW-COMPONENT-TYPE")
    ECU_ABSTRACTION_SW_COMPONENT_TYPE("ECU-ABSTRACTION-SW-COMPONENT-TYPE"),;
    
    @XmlEnumValue("ECU-INSTANCE")
    ECU_INSTANCE("ECU-INSTANCE"),;
    
    @XmlEnumValue("ECU-TIMING")
    ECU_TIMING("ECU-TIMING"),;
    
    @XmlEnumValue("ECUC-DEFINITION-COLLECTION")
    ECUC_DEFINITION_COLLECTION("ECUC-DEFINITION-COLLECTION"),;
    
    @XmlEnumValue("ECUC-DESTINATION-URI-DEF-SET")
    ECUC_DESTINATION_URI_DEF_SET("ECUC-DESTINATION-URI-DEF-SET"),;
    
    @XmlEnumValue("ECUC-MODULE-CONFIGURATION-VALUES")
    ECUC_MODULE_CONFIGURATION_VALUES("ECUC-MODULE-CONFIGURATION-VALUES"),;
    
    @XmlEnumValue("ECUC-MODULE-DEF")
    ECUC_MODULE_DEF("ECUC-MODULE-DEF"),;
    
    @XmlEnumValue("ECUC-VALUE-COLLECTION")
    ECUC_VALUE_COLLECTION("ECUC-VALUE-COLLECTION"),;
    
    @XmlEnumValue("END-TO-END-PROTECTION-SET")
    END_TO_END_PROTECTION_SET("END-TO-END-PROTECTION-SET"),;
    
    @XmlEnumValue("ETHERNET-CLUSTER")
    ETHERNET_CLUSTER("ETHERNET-CLUSTER"),;
    
    @XmlEnumValue("ETHERNET-FRAME")
    ETHERNET_FRAME("ETHERNET-FRAME"),;
    
    @XmlEnumValue("EVALUATED-VARIANT-SET")
    EVALUATED_VARIANT_SET("EVALUATED-VARIANT-SET"),;
    
    @XmlEnumValue("FM-FEATURE")
    FM_FEATURE("FM-FEATURE"),;
    
    @XmlEnumValue("FM-FEATURE-MAP")
    FM_FEATURE_MAP("FM-FEATURE-MAP"),;
    
    @XmlEnumValue("FM-FEATURE-MODEL")
    FM_FEATURE_MODEL("FM-FEATURE-MODEL"),;
    
    @XmlEnumValue("FM-FEATURE-SELECTION-SET")
    FM_FEATURE_SELECTION_SET("FM-FEATURE-SELECTION-SET"),;
    
    @XmlEnumValue("FIBEX-ELEMENT")
    FIBEX_ELEMENT("FIBEX-ELEMENT"),;
    
    @XmlEnumValue("FLAT-MAP")
    FLAT_MAP("FLAT-MAP"),;
    
    @XmlEnumValue("FLEXRAY-AR-TP-CONFIG")
    FLEXRAY_AR_TP_CONFIG("FLEXRAY-AR-TP-CONFIG"),;
    
    @XmlEnumValue("FLEXRAY-CLUSTER")
    FLEXRAY_CLUSTER("FLEXRAY-CLUSTER"),;
    
    @XmlEnumValue("FLEXRAY-FRAME")
    FLEXRAY_FRAME("FLEXRAY-FRAME"),;
    
    @XmlEnumValue("FLEXRAY-TP-CONFIG")
    FLEXRAY_TP_CONFIG("FLEXRAY-TP-CONFIG"),;
    
    @XmlEnumValue("FRAME")
    FRAME("FRAME"),;
    
    @XmlEnumValue("GATEWAY")
    GATEWAY("GATEWAY"),;
    
    @XmlEnumValue("GENERAL-PURPOSE-I-PDU")
    GENERAL_PURPOSE_I_PDU("GENERAL-PURPOSE-I-PDU"),;
    
    @XmlEnumValue("GENERAL-PURPOSE-PDU")
    GENERAL_PURPOSE_PDU("GENERAL-PURPOSE-PDU"),;
    
    @XmlEnumValue("GENERIC-ETHERNET-FRAME")
    GENERIC_ETHERNET_FRAME("GENERIC-ETHERNET-FRAME"),;
    
    @XmlEnumValue("GLOBAL-TIME-DOMAIN")
    GLOBAL_TIME_DOMAIN("GLOBAL-TIME-DOMAIN"),;
    
    @XmlEnumValue("HW-CATEGORY")
    HW_CATEGORY("HW-CATEGORY"),;
    
    @XmlEnumValue("HW-ELEMENT")
    HW_ELEMENT("HW-ELEMENT"),;
    
    @XmlEnumValue("HW-TYPE")
    HW_TYPE("HW-TYPE"),;
    
    @XmlEnumValue("I-PDU")
    I_PDU("I-PDU"),;
    
    @XmlEnumValue("I-SIGNAL")
    I_SIGNAL("I-SIGNAL"),;
    
    @XmlEnumValue("I-SIGNAL-GROUP")
    I_SIGNAL_GROUP("I-SIGNAL-GROUP"),;
    
    @XmlEnumValue("I-SIGNAL-I-PDU")
    I_SIGNAL_I_PDU("I-SIGNAL-I-PDU"),;
    
    @XmlEnumValue("I-SIGNAL-I-PDU-GROUP")
    I_SIGNAL_I_PDU_GROUP("I-SIGNAL-I-PDU-GROUP"),;
    
    @XmlEnumValue("IEEE-1722-TP-ETHERNET-FRAME")
    IEEE_1722_TP_ETHERNET_FRAME("IEEE-1722-TP-ETHERNET-FRAME"),;
    
    @XmlEnumValue("IMPLEMENTATION")
    IMPLEMENTATION("IMPLEMENTATION"),;
    
    @XmlEnumValue("IMPLEMENTATION-DATA-TYPE")
    IMPLEMENTATION_DATA_TYPE("IMPLEMENTATION-DATA-TYPE"),;
    
    @XmlEnumValue("INTERPOLATION-ROUTINE-MAPPING-SET")
    INTERPOLATION_ROUTINE_MAPPING_SET("INTERPOLATION-ROUTINE-MAPPING-SET"),;
    
    @XmlEnumValue("J-1939-CLUSTER")
    J_1939_CLUSTER("J-1939-CLUSTER"),;
    
    @XmlEnumValue("J-1939-DCM-I-PDU")
    J_1939_DCM_I_PDU("J-1939-DCM-I-PDU"),;
    
    @XmlEnumValue("J-1939-TP-CONFIG")
    J_1939_TP_CONFIG("J-1939-TP-CONFIG"),;
    
    @XmlEnumValue("KEYWORD-SET")
    KEYWORD_SET("KEYWORD-SET"),;
    
    @XmlEnumValue("LIFE-CYCLE-INFO-SET")
    LIFE_CYCLE_INFO_SET("LIFE-CYCLE-INFO-SET"),;
    
    @XmlEnumValue("LIFE-CYCLE-STATE-DEFINITION-GROUP")
    LIFE_CYCLE_STATE_DEFINITION_GROUP("LIFE-CYCLE-STATE-DEFINITION-GROUP"),;
    
    @XmlEnumValue("LIN-CLUSTER")
    LIN_CLUSTER("LIN-CLUSTER"),;
    
    @XmlEnumValue("LIN-EVENT-TRIGGERED-FRAME")
    LIN_EVENT_TRIGGERED_FRAME("LIN-EVENT-TRIGGERED-FRAME"),;
    
    @XmlEnumValue("LIN-FRAME")
    LIN_FRAME("LIN-FRAME"),;
    
    @XmlEnumValue("LIN-SPORADIC-FRAME")
    LIN_SPORADIC_FRAME("LIN-SPORADIC-FRAME"),;
    
    @XmlEnumValue("LIN-TP-CONFIG")
    LIN_TP_CONFIG("LIN-TP-CONFIG"),;
    
    @XmlEnumValue("LIN-UNCONDITIONAL-FRAME")
    LIN_UNCONDITIONAL_FRAME("LIN-UNCONDITIONAL-FRAME"),;
    
    @XmlEnumValue("MC-FUNCTION")
    MC_FUNCTION("MC-FUNCTION"),;
    
    @XmlEnumValue("MODE-DECLARATION-GROUP")
    MODE_DECLARATION_GROUP("MODE-DECLARATION-GROUP"),;
    
    @XmlEnumValue("MODE-DECLARATION-MAPPING-SET")
    MODE_DECLARATION_MAPPING_SET("MODE-DECLARATION-MAPPING-SET"),;
    
    @XmlEnumValue("MODE-SWITCH-INTERFACE")
    MODE_SWITCH_INTERFACE("MODE-SWITCH-INTERFACE"),;
    
    @XmlEnumValue("MULTIPLEXED-I-PDU")
    MULTIPLEXED_I_PDU("MULTIPLEXED-I-PDU"),;
    
    @XmlEnumValue("N-PDU")
    N_PDU("N-PDU"),;
    
    @XmlEnumValue("NM-CONFIG")
    NM_CONFIG("NM-CONFIG"),;
    
    @XmlEnumValue("NM-PDU")
    NM_PDU("NM-PDU"),;
    
    @XmlEnumValue("NV-BLOCK-SW-COMPONENT-TYPE")
    NV_BLOCK_SW_COMPONENT_TYPE("NV-BLOCK-SW-COMPONENT-TYPE"),;
    
    @XmlEnumValue("NV-DATA-INTERFACE")
    NV_DATA_INTERFACE("NV-DATA-INTERFACE"),;
    
    @XmlEnumValue("PACKAGEABLE-ELEMENT")
    PACKAGEABLE_ELEMENT("PACKAGEABLE-ELEMENT"),;
    
    @XmlEnumValue("PARAMETER-INTERFACE")
    PARAMETER_INTERFACE("PARAMETER-INTERFACE"),;
    
    @XmlEnumValue("PARAMETER-SW-COMPONENT-TYPE")
    PARAMETER_SW_COMPONENT_TYPE("PARAMETER-SW-COMPONENT-TYPE"),;
    
    @XmlEnumValue("PDU")
    PDU("PDU"),;
    
    @XmlEnumValue("PDUR-I-PDU-GROUP")
    PDUR_I_PDU_GROUP("PDUR-I-PDU-GROUP"),;
    
    @XmlEnumValue("PHYSICAL-DIMENSION")
    PHYSICAL_DIMENSION("PHYSICAL-DIMENSION"),;
    
    @XmlEnumValue("PHYSICAL-DIMENSION-MAPPING-SET")
    PHYSICAL_DIMENSION_MAPPING_SET("PHYSICAL-DIMENSION-MAPPING-SET"),;
    
    @XmlEnumValue("PORT-INTERFACE")
    PORT_INTERFACE("PORT-INTERFACE"),;
    
    @XmlEnumValue("PORT-INTERFACE-MAPPING-SET")
    PORT_INTERFACE_MAPPING_SET("PORT-INTERFACE-MAPPING-SET"),;
    
    @XmlEnumValue("PORT-PROTOTYPE-BLUEPRINT")
    PORT_PROTOTYPE_BLUEPRINT("PORT-PROTOTYPE-BLUEPRINT"),;
    
    @XmlEnumValue("POST-BUILD-VARIANT-CRITERION")
    POST_BUILD_VARIANT_CRITERION("POST-BUILD-VARIANT-CRITERION"),;
    
    @XmlEnumValue("POST-BUILD-VARIANT-CRITERION-VALUE-SET")
    POST_BUILD_VARIANT_CRITERION_VALUE_SET("POST-BUILD-VARIANT-CRITERION-VALUE-SET"),;
    
    @XmlEnumValue("PREDEFINED-VARIANT")
    PREDEFINED_VARIANT("PREDEFINED-VARIANT"),;
    
    @XmlEnumValue("RAPID-PROTOTYPING-SCENARIO")
    RAPID_PROTOTYPING_SCENARIO("RAPID-PROTOTYPING-SCENARIO"),;
    
    @XmlEnumValue("SECURED-I-PDU")
    SECURED_I_PDU("SECURED-I-PDU"),;
    
    @XmlEnumValue("SENDER-RECEIVER-INTERFACE")
    SENDER_RECEIVER_INTERFACE("SENDER-RECEIVER-INTERFACE"),;
    
    @XmlEnumValue("SENSOR-ACTUATOR-SW-COMPONENT-TYPE")
    SENSOR_ACTUATOR_SW_COMPONENT_TYPE("SENSOR-ACTUATOR-SW-COMPONENT-TYPE"),;
    
    @XmlEnumValue("SERIALIZATION-TECHNOLOGY")
    SERIALIZATION_TECHNOLOGY("SERIALIZATION-TECHNOLOGY"),;
    
    @XmlEnumValue("SERVICE-PROXY-SW-COMPONENT-TYPE")
    SERVICE_PROXY_SW_COMPONENT_TYPE("SERVICE-PROXY-SW-COMPONENT-TYPE"),;
    
    @XmlEnumValue("SERVICE-SW-COMPONENT-TYPE")
    SERVICE_SW_COMPONENT_TYPE("SERVICE-SW-COMPONENT-TYPE"),;
    
    @XmlEnumValue("SO-AD-ROUTING-GROUP")
    SO_AD_ROUTING_GROUP("SO-AD-ROUTING-GROUP"),;
    
    @XmlEnumValue("SW-ADDR-METHOD")
    SW_ADDR_METHOD("SW-ADDR-METHOD"),;
    
    @XmlEnumValue("SW-AXIS-TYPE")
    SW_AXIS_TYPE("SW-AXIS-TYPE"),;
    
    @XmlEnumValue("SW-BASE-TYPE")
    SW_BASE_TYPE("SW-BASE-TYPE"),;
    
    @XmlEnumValue("SW-COMPONENT-TYPE")
    SW_COMPONENT_TYPE("SW-COMPONENT-TYPE"),;
    
    @XmlEnumValue("SW-RECORD-LAYOUT")
    SW_RECORD_LAYOUT("SW-RECORD-LAYOUT"),;
    
    @XmlEnumValue("SW-SYSTEMCONST")
    SW_SYSTEMCONST("SW-SYSTEMCONST"),;
    
    @XmlEnumValue("SW-SYSTEMCONSTANT-VALUE-SET")
    SW_SYSTEMCONSTANT_VALUE_SET("SW-SYSTEMCONSTANT-VALUE-SET"),;
    
    @XmlEnumValue("SWC-BSW-MAPPING")
    SWC_BSW_MAPPING("SWC-BSW-MAPPING"),;
    
    @XmlEnumValue("SWC-IMPLEMENTATION")
    SWC_IMPLEMENTATION("SWC-IMPLEMENTATION"),;
    
    @XmlEnumValue("SWC-TIMING")
    SWC_TIMING("SWC-TIMING"),;
    
    @XmlEnumValue("SYSTEM")
    SYSTEM("SYSTEM"),;
    
    @XmlEnumValue("SYSTEM-SIGNAL")
    SYSTEM_SIGNAL("SYSTEM-SIGNAL"),;
    
    @XmlEnumValue("SYSTEM-SIGNAL-GROUP")
    SYSTEM_SIGNAL_GROUP("SYSTEM-SIGNAL-GROUP"),;
    
    @XmlEnumValue("SYSTEM-TIMING")
    SYSTEM_TIMING("SYSTEM-TIMING"),;
    
    @XmlEnumValue("TIMING-EXTENSION")
    TIMING_EXTENSION("TIMING-EXTENSION"),;
    
    @XmlEnumValue("TP-CONFIG")
    TP_CONFIG("TP-CONFIG"),;
    
    @XmlEnumValue("TRIGGER-INTERFACE")
    TRIGGER_INTERFACE("TRIGGER-INTERFACE"),;
    
    @XmlEnumValue("TTCAN-CLUSTER")
    TTCAN_CLUSTER("TTCAN-CLUSTER"),;
    
    @XmlEnumValue("UNIT")
    UNIT("UNIT"),;
    
    @XmlEnumValue("UNIT-GROUP")
    UNIT_GROUP("UNIT-GROUP"),;
    
    @XmlEnumValue("USER-DEFINED-CLUSTER")
    USER_DEFINED_CLUSTER("USER-DEFINED-CLUSTER"),;
    
    @XmlEnumValue("USER-DEFINED-ETHERNET-FRAME")
    USER_DEFINED_ETHERNET_FRAME("USER-DEFINED-ETHERNET-FRAME"),;
    
    @XmlEnumValue("USER-DEFINED-I-PDU")
    USER_DEFINED_I_PDU("USER-DEFINED-I-PDU"),;
    
    @XmlEnumValue("USER-DEFINED-PDU")
    USER_DEFINED_PDU("USER-DEFINED-PDU"),;
    
    @XmlEnumValue("VFB-TIMING")
    VFB_TIMING("VFB-TIMING"),;
    
    @XmlEnumValue("VIEW-MAP-SET")
    VIEW_MAP_SET("VIEW-MAP-SET"),;
    
    @XmlEnumValue("XCP-PDU")
    XCP_PDU("XCP-PDU");
    

    private final java.lang.String value;

    CollectableElementSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CollectableElementSubtypesEnum fromValue(java.lang.String v) {
        for (CollectableElementSubtypesEnum c: CollectableElementSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}