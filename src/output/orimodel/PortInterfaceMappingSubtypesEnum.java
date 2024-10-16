package stdgui.data.model.orimodel;

@XmlType(name="PORT-INTERFACE-MAPPING--SUBTYPES-ENUM")
@XmlEnum
public enum PortInterfaceMappingSubtypesEnum {

@XmlEnumValue("CLIENT-SERVER-INTERFACE-MAPPING")
CLIENT_SERVER_INTERFACE_MAPPING("CLIENT-SERVER-INTERFACE-MAPPING"),

@XmlEnumValue("MODE-INTERFACE-MAPPING")
MODE_INTERFACE_MAPPING("MODE-INTERFACE-MAPPING"),

@XmlEnumValue("PORT-INTERFACE-MAPPING")
PORT_INTERFACE_MAPPING("PORT-INTERFACE-MAPPING"),

@XmlEnumValue("TRIGGER-INTERFACE-MAPPING")
TRIGGER_INTERFACE_MAPPING("TRIGGER-INTERFACE-MAPPING"),

@XmlEnumValue("VARIABLE-AND-PARAMETER-INTERFACE-MAPPING")
VARIABLE_AND_PARAMETER_INTERFACE_MAPPING("VARIABLE-AND-PARAMETER-INTERFACE-MAPPING");


    private final java.lang.String value;

    PortInterfaceMappingSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static PortInterfaceMappingSubtypesEnum fromValue(java.lang.String v) {
        for (PortInterfaceMappingSubtypesEnum c: PortInterfaceMappingSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}