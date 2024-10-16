package stdgui.data.model.orimodel;

@XmlType(name="ATOMIC-SW-COMPONENT-TYPE--SUBTYPES-ENUM")
@XmlEnum
public enum AtomicSwComponentTypeSubtypesEnum {

@XmlEnumValue("APPLICATION-SW-COMPONENT-TYPE")
APPLICATION_SW_COMPONENT_TYPE("APPLICATION-SW-COMPONENT-TYPE"),

@XmlEnumValue("ATOMIC-SW-COMPONENT-TYPE")
ATOMIC_SW_COMPONENT_TYPE("ATOMIC-SW-COMPONENT-TYPE"),

@XmlEnumValue("COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE")
COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE("COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE"),

@XmlEnumValue("ECU-ABSTRACTION-SW-COMPONENT-TYPE")
ECU_ABSTRACTION_SW_COMPONENT_TYPE("ECU-ABSTRACTION-SW-COMPONENT-TYPE"),

@XmlEnumValue("NV-BLOCK-SW-COMPONENT-TYPE")
NV_BLOCK_SW_COMPONENT_TYPE("NV-BLOCK-SW-COMPONENT-TYPE"),

@XmlEnumValue("SENSOR-ACTUATOR-SW-COMPONENT-TYPE")
SENSOR_ACTUATOR_SW_COMPONENT_TYPE("SENSOR-ACTUATOR-SW-COMPONENT-TYPE"),

@XmlEnumValue("SERVICE-PROXY-SW-COMPONENT-TYPE")
SERVICE_PROXY_SW_COMPONENT_TYPE("SERVICE-PROXY-SW-COMPONENT-TYPE"),

@XmlEnumValue("SERVICE-SW-COMPONENT-TYPE")
SERVICE_SW_COMPONENT_TYPE("SERVICE-SW-COMPONENT-TYPE");


    private final java.lang.String value;

    AtomicSwComponentTypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AtomicSwComponentTypeSubtypesEnum fromValue(java.lang.String v) {
        for (AtomicSwComponentTypeSubtypesEnum c: AtomicSwComponentTypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}