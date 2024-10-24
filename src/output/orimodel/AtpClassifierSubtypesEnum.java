package stdgui.data.model.orimodel;

@XmlType(name="ATP-CLASSIFIER--SUBTYPES-ENUM")
@XmlEnum
public enum AtpClassifierSubtypesEnum {

@XmlEnumValue("APPLICATION-ARRAY-DATA-TYPE")
APPLICATION_ARRAY_DATA_TYPE("APPLICATION-ARRAY-DATA-TYPE"),

@XmlEnumValue("APPLICATION-COMPOSITE-DATA-TYPE")
APPLICATION_COMPOSITE_DATA_TYPE("APPLICATION-COMPOSITE-DATA-TYPE"),

@XmlEnumValue("APPLICATION-DATA-TYPE")
APPLICATION_DATA_TYPE("APPLICATION-DATA-TYPE"),

@XmlEnumValue("APPLICATION-PRIMITIVE-DATA-TYPE")
APPLICATION_PRIMITIVE_DATA_TYPE("APPLICATION-PRIMITIVE-DATA-TYPE"),

@XmlEnumValue("APPLICATION-RECORD-DATA-TYPE")
APPLICATION_RECORD_DATA_TYPE("APPLICATION-RECORD-DATA-TYPE"),

@XmlEnumValue("APPLICATION-SW-COMPONENT-TYPE")
APPLICATION_SW_COMPONENT_TYPE("APPLICATION-SW-COMPONENT-TYPE"),

@XmlEnumValue("ASSEMBLY-SW-CONNECTOR")
ASSEMBLY_SW_CONNECTOR("ASSEMBLY-SW-CONNECTOR"),

@XmlEnumValue("ASYNCHRONOUS-SERVER-CALL-POINT")
ASYNCHRONOUS_SERVER_CALL_POINT("ASYNCHRONOUS-SERVER-CALL-POINT"),

@XmlEnumValue("ASYNCHRONOUS-SERVER-CALL-RESULT-POINT")
ASYNCHRONOUS_SERVER_CALL_RESULT_POINT("ASYNCHRONOUS-SERVER-CALL-RESULT-POINT"),

@XmlEnumValue("ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT")
ASYNCHRONOUS_SERVER_CALL_RETURNS_EVENT("ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT"),

@XmlEnumValue("ATOMIC-SW-COMPONENT-TYPE")
ATOMIC_SW_COMPONENT_TYPE("ATOMIC-SW-COMPONENT-TYPE"),

@XmlEnumValue("ATP-CLASSIFIER")
ATP_CLASSIFIER("ATP-CLASSIFIER"),

@XmlEnumValue("ATP-STRUCTURE-ELEMENT")
ATP_STRUCTURE_ELEMENT("ATP-STRUCTURE-ELEMENT"),

@XmlEnumValue("ATP-TYPE")
ATP_TYPE("ATP-TYPE"),

@XmlEnumValue("AUTOSAR-DATA-TYPE")
AUTOSAR_DATA_TYPE("AUTOSAR-DATA-TYPE"),

@XmlEnumValue("BACKGROUND-EVENT")
BACKGROUND_EVENT("BACKGROUND-EVENT"),

@XmlEnumValue("BSW-INTERNAL-BEHAVIOR")
BSW_INTERNAL_BEHAVIOR("BSW-INTERNAL-BEHAVIOR"),

@XmlEnumValue("BSW-MODULE-DESCRIPTION")
BSW_MODULE_DESCRIPTION("BSW-MODULE-DESCRIPTION"),

@XmlEnumValue("BSW-SERVICE-DEPENDENCY-IDENT")
BSW_SERVICE_DEPENDENCY_IDENT("BSW-SERVICE-DEPENDENCY-IDENT"),

@XmlEnumValue("CLIENT-SERVER-INTERFACE")
CLIENT_SERVER_INTERFACE("CLIENT-SERVER-INTERFACE"),

@XmlEnumValue("CLIENT-SERVER-OPERATION")
CLIENT_SERVER_OPERATION("CLIENT-SERVER-OPERATION"),

@XmlEnumValue("COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE")
COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE("COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE"),

@XmlEnumValue("COMPOSITION-SW-COMPONENT-TYPE")
COMPOSITION_SW_COMPONENT_TYPE("COMPOSITION-SW-COMPONENT-TYPE"),

@XmlEnumValue("DATA-INTERFACE")
DATA_INTERFACE("DATA-INTERFACE"),

@XmlEnumValue("DATA-PROTOTYPE-GROUP")
DATA_PROTOTYPE_GROUP("DATA-PROTOTYPE-GROUP"),

@XmlEnumValue("DATA-RECEIVE-ERROR-EVENT")
DATA_RECEIVE_ERROR_EVENT("DATA-RECEIVE-ERROR-EVENT"),

@XmlEnumValue("DATA-RECEIVED-EVENT")
DATA_RECEIVED_EVENT("DATA-RECEIVED-EVENT"),

@XmlEnumValue("DATA-SEND-COMPLETED-EVENT")
DATA_SEND_COMPLETED_EVENT("DATA-SEND-COMPLETED-EVENT"),

@XmlEnumValue("DATA-WRITE-COMPLETED-EVENT")
DATA_WRITE_COMPLETED_EVENT("DATA-WRITE-COMPLETED-EVENT"),

@XmlEnumValue("DELEGATION-SW-CONNECTOR")
DELEGATION_SW_CONNECTOR("DELEGATION-SW-CONNECTOR"),

@XmlEnumValue("ECU-ABSTRACTION-SW-COMPONENT-TYPE")
ECU_ABSTRACTION_SW_COMPONENT_TYPE("ECU-ABSTRACTION-SW-COMPONENT-TYPE"),

@XmlEnumValue("EXTERNAL-TRIGGER-OCCURRED-EVENT")
EXTERNAL_TRIGGER_OCCURRED_EVENT("EXTERNAL-TRIGGER-OCCURRED-EVENT"),

@XmlEnumValue("EXTERNAL-TRIGGERING-POINT-IDENT")
EXTERNAL_TRIGGERING_POINT_IDENT("EXTERNAL-TRIGGERING-POINT-IDENT"),

@XmlEnumValue("IDENT-CAPTION")
IDENT_CAPTION("IDENT-CAPTION"),

@XmlEnumValue("IMPLEMENTATION-DATA-TYPE")
IMPLEMENTATION_DATA_TYPE("IMPLEMENTATION-DATA-TYPE"),

@XmlEnumValue("INIT-EVENT")
INIT_EVENT("INIT-EVENT"),

@XmlEnumValue("INTERNAL-BEHAVIOR")
INTERNAL_BEHAVIOR("INTERNAL-BEHAVIOR"),

@XmlEnumValue("INTERNAL-TRIGGER-OCCURRED-EVENT")
INTERNAL_TRIGGER_OCCURRED_EVENT("INTERNAL-TRIGGER-OCCURRED-EVENT"),

@XmlEnumValue("INTERNAL-TRIGGERING-POINT")
INTERNAL_TRIGGERING_POINT("INTERNAL-TRIGGERING-POINT"),

@XmlEnumValue("MODE-ACCESS-POINT-IDENT")
MODE_ACCESS_POINT_IDENT("MODE-ACCESS-POINT-IDENT"),

@XmlEnumValue("MODE-DECLARATION")
MODE_DECLARATION("MODE-DECLARATION"),

@XmlEnumValue("MODE-DECLARATION-GROUP")
MODE_DECLARATION_GROUP("MODE-DECLARATION-GROUP"),

@XmlEnumValue("MODE-DECLARATION-MAPPING")
MODE_DECLARATION_MAPPING("MODE-DECLARATION-MAPPING"),

@XmlEnumValue("MODE-DECLARATION-MAPPING-SET")
MODE_DECLARATION_MAPPING_SET("MODE-DECLARATION-MAPPING-SET"),

@XmlEnumValue("MODE-SWITCH-INTERFACE")
MODE_SWITCH_INTERFACE("MODE-SWITCH-INTERFACE"),

@XmlEnumValue("MODE-SWITCH-POINT")
MODE_SWITCH_POINT("MODE-SWITCH-POINT"),

@XmlEnumValue("MODE-SWITCHED-ACK-EVENT")
MODE_SWITCHED_ACK_EVENT("MODE-SWITCHED-ACK-EVENT"),

@XmlEnumValue("MODE-TRANSITION")
MODE_TRANSITION("MODE-TRANSITION"),

@XmlEnumValue("NV-BLOCK-DESCRIPTOR")
NV_BLOCK_DESCRIPTOR("NV-BLOCK-DESCRIPTOR"),

@XmlEnumValue("NV-BLOCK-SW-COMPONENT-TYPE")
NV_BLOCK_SW_COMPONENT_TYPE("NV-BLOCK-SW-COMPONENT-TYPE"),

@XmlEnumValue("NV-DATA-INTERFACE")
NV_DATA_INTERFACE("NV-DATA-INTERFACE"),

@XmlEnumValue("OPERATION-INVOKED-EVENT")
OPERATION_INVOKED_EVENT("OPERATION-INVOKED-EVENT"),

@XmlEnumValue("PARAMETER-ACCESS")
PARAMETER_ACCESS("PARAMETER-ACCESS"),

@XmlEnumValue("PARAMETER-INTERFACE")
PARAMETER_INTERFACE("PARAMETER-INTERFACE"),

@XmlEnumValue("PARAMETER-SW-COMPONENT-TYPE")
PARAMETER_SW_COMPONENT_TYPE("PARAMETER-SW-COMPONENT-TYPE"),

@XmlEnumValue("PASS-THROUGH-SW-CONNECTOR")
PASS_THROUGH_SW_CONNECTOR("PASS-THROUGH-SW-CONNECTOR"),

@XmlEnumValue("PER-INSTANCE-MEMORY")
PER_INSTANCE_MEMORY("PER-INSTANCE-MEMORY"),

@XmlEnumValue("PORT-GROUP")
PORT_GROUP("PORT-GROUP"),

@XmlEnumValue("PORT-INTERFACE")
PORT_INTERFACE("PORT-INTERFACE"),

@XmlEnumValue("PORT-PROTOTYPE-BLUEPRINT")
PORT_PROTOTYPE_BLUEPRINT("PORT-PROTOTYPE-BLUEPRINT"),

@XmlEnumValue("RTE-EVENT")
RTE_EVENT("RTE-EVENT"),

@XmlEnumValue("RUNNABLE-ENTITY")
RUNNABLE_ENTITY("RUNNABLE-ENTITY"),

@XmlEnumValue("RUNNABLE-ENTITY-GROUP")
RUNNABLE_ENTITY_GROUP("RUNNABLE-ENTITY-GROUP"),

@XmlEnumValue("SENDER-RECEIVER-INTERFACE")
SENDER_RECEIVER_INTERFACE("SENDER-RECEIVER-INTERFACE"),

@XmlEnumValue("SENSOR-ACTUATOR-SW-COMPONENT-TYPE")
SENSOR_ACTUATOR_SW_COMPONENT_TYPE("SENSOR-ACTUATOR-SW-COMPONENT-TYPE"),

@XmlEnumValue("SERVER-CALL-POINT")
SERVER_CALL_POINT("SERVER-CALL-POINT"),

@XmlEnumValue("SERVICE-PROXY-SW-COMPONENT-TYPE")
SERVICE_PROXY_SW_COMPONENT_TYPE("SERVICE-PROXY-SW-COMPONENT-TYPE"),

@XmlEnumValue("SERVICE-SW-COMPONENT-TYPE")
SERVICE_SW_COMPONENT_TYPE("SERVICE-SW-COMPONENT-TYPE"),

@XmlEnumValue("SW-COMPONENT-TYPE")
SW_COMPONENT_TYPE("SW-COMPONENT-TYPE"),

@XmlEnumValue("SW-CONNECTOR")
SW_CONNECTOR("SW-CONNECTOR"),

@XmlEnumValue("SWC-BSW-MAPPING")
SWC_BSW_MAPPING("SWC-BSW-MAPPING"),

@XmlEnumValue("SWC-INTERNAL-BEHAVIOR")
SWC_INTERNAL_BEHAVIOR("SWC-INTERNAL-BEHAVIOR"),

@XmlEnumValue("SWC-MODE-MANAGER-ERROR-EVENT")
SWC_MODE_MANAGER_ERROR_EVENT("SWC-MODE-MANAGER-ERROR-EVENT"),

@XmlEnumValue("SWC-MODE-SWITCH-EVENT")
SWC_MODE_SWITCH_EVENT("SWC-MODE-SWITCH-EVENT"),

@XmlEnumValue("SWC-SERVICE-DEPENDENCY")
SWC_SERVICE_DEPENDENCY("SWC-SERVICE-DEPENDENCY"),

@XmlEnumValue("SYNCHRONOUS-SERVER-CALL-POINT")
SYNCHRONOUS_SERVER_CALL_POINT("SYNCHRONOUS-SERVER-CALL-POINT"),

@XmlEnumValue("SYSTEM")
SYSTEM("SYSTEM"),

@XmlEnumValue("TIMING-EVENT")
TIMING_EVENT("TIMING-EVENT"),

@XmlEnumValue("TRANSFORMER-HARD-ERROR-EVENT")
TRANSFORMER_HARD_ERROR_EVENT("TRANSFORMER-HARD-ERROR-EVENT"),

@XmlEnumValue("TRIGGER")
TRIGGER("TRIGGER"),

@XmlEnumValue("TRIGGER-INTERFACE")
TRIGGER_INTERFACE("TRIGGER-INTERFACE"),

@XmlEnumValue("VARIABLE-ACCESS")
VARIABLE_ACCESS("VARIABLE-ACCESS");


    private final java.lang.String value;

    AtpClassifierSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AtpClassifierSubtypesEnum fromValue(java.lang.String v) {
        for (AtpClassifierSubtypesEnum c: AtpClassifierSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}