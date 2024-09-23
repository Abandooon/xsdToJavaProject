package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SW-COMPONENT-TYPE--SUBTYPES-ENUM")
@XmlEnum
public enum SwComponentTypeSubtypesEnum {

    
    @XmlEnumValue("APPLICATION-SW-COMPONENT-TYPE")
    APPLICATION_SW_COMPONENT_TYPE("APPLICATION-SW-COMPONENT-TYPE"),;
    
    @XmlEnumValue("ATOMIC-SW-COMPONENT-TYPE")
    ATOMIC_SW_COMPONENT_TYPE("ATOMIC-SW-COMPONENT-TYPE"),;
    
    @XmlEnumValue("COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE")
    COMPLEX_DEVICE_DRIVER_SW_COMPONENT_TYPE("COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE"),;
    
    @XmlEnumValue("COMPOSITION-SW-COMPONENT-TYPE")
    COMPOSITION_SW_COMPONENT_TYPE("COMPOSITION-SW-COMPONENT-TYPE"),;
    
    @XmlEnumValue("ECU-ABSTRACTION-SW-COMPONENT-TYPE")
    ECU_ABSTRACTION_SW_COMPONENT_TYPE("ECU-ABSTRACTION-SW-COMPONENT-TYPE"),;
    
    @XmlEnumValue("NV-BLOCK-SW-COMPONENT-TYPE")
    NV_BLOCK_SW_COMPONENT_TYPE("NV-BLOCK-SW-COMPONENT-TYPE"),;
    
    @XmlEnumValue("PARAMETER-SW-COMPONENT-TYPE")
    PARAMETER_SW_COMPONENT_TYPE("PARAMETER-SW-COMPONENT-TYPE"),;
    
    @XmlEnumValue("SENSOR-ACTUATOR-SW-COMPONENT-TYPE")
    SENSOR_ACTUATOR_SW_COMPONENT_TYPE("SENSOR-ACTUATOR-SW-COMPONENT-TYPE"),;
    
    @XmlEnumValue("SERVICE-PROXY-SW-COMPONENT-TYPE")
    SERVICE_PROXY_SW_COMPONENT_TYPE("SERVICE-PROXY-SW-COMPONENT-TYPE"),;
    
    @XmlEnumValue("SERVICE-SW-COMPONENT-TYPE")
    SERVICE_SW_COMPONENT_TYPE("SERVICE-SW-COMPONENT-TYPE"),;
    
    @XmlEnumValue("SW-COMPONENT-TYPE")
    SW_COMPONENT_TYPE("SW-COMPONENT-TYPE");
    

    private final java.lang.String value;

    SwComponentTypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SwComponentTypeSubtypesEnum fromValue(java.lang.String v) {
        for (SwComponentTypeSubtypesEnum c: SwComponentTypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}