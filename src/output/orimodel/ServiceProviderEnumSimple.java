package stdgui.data.model.orimodel;

@XmlType(name="SERVICE-PROVIDER-ENUM--SIMPLE")
@XmlEnum
public enum ServiceProviderEnumSimple {

@XmlEnumValue("ANY-STANDARDIZED")
ANY_STANDARDIZED("ANY-STANDARDIZED"),

@XmlEnumValue("BASIC-SOFTWARE-MODE-MANAGER")
BASIC_SOFTWARE_MODE_MANAGER("BASIC-SOFTWARE-MODE-MANAGER"),

@XmlEnumValue("COM-MANAGER")
COM_MANAGER("COM-MANAGER"),

@XmlEnumValue("CRYPTO-SERVICE-MANAGER")
CRYPTO_SERVICE_MANAGER("CRYPTO-SERVICE-MANAGER"),

@XmlEnumValue("DEVELOPMENT-ERROR-TRACER")
DEVELOPMENT_ERROR_TRACER("DEVELOPMENT-ERROR-TRACER"),

@XmlEnumValue("DIAGNOSTIC-COMMUNICATION-MANAGER")
DIAGNOSTIC_COMMUNICATION_MANAGER("DIAGNOSTIC-COMMUNICATION-MANAGER"),

@XmlEnumValue("DIAGNOSTIC-EVENT-MANAGER")
DIAGNOSTIC_EVENT_MANAGER("DIAGNOSTIC-EVENT-MANAGER"),

@XmlEnumValue("DIAGNOSTIC-LOG-AND-TRACE")
DIAGNOSTIC_LOG_AND_TRACE("DIAGNOSTIC-LOG-AND-TRACE"),

@XmlEnumValue("ECU-MANAGER")
ECU_MANAGER("ECU-MANAGER"),

@XmlEnumValue("FUNCTION-INHIBITION-MANAGER")
FUNCTION_INHIBITION_MANAGER("FUNCTION-INHIBITION-MANAGER"),

@XmlEnumValue("NON-VOLATILE-RAM-MANAGER")
NON_VOLATILE_RAM_MANAGER("NON-VOLATILE-RAM-MANAGER"),

@XmlEnumValue("OPERATING-SYSTEM")
OPERATING_SYSTEM("OPERATING-SYSTEM"),

@XmlEnumValue("SYNC-BASE-TIME-MANAGER")
SYNC_BASE_TIME_MANAGER("SYNC-BASE-TIME-MANAGER"),

@XmlEnumValue("VENDOR-SPECIFIC")
VENDOR_SPECIFIC("VENDOR-SPECIFIC"),

@XmlEnumValue("WATCH-DOG-MANAGER")
WATCH_DOG_MANAGER("WATCH-DOG-MANAGER");


    private final java.lang.String value;

    ServiceProviderEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ServiceProviderEnumSimple fromValue(java.lang.String v) {
        for (ServiceProviderEnumSimple c: ServiceProviderEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}