package stdgui.data.model.orimodel;

@XmlType(name="RUNTIME-ADDRESS-CONFIGURATION-ENUM--SIMPLE")
@XmlEnum
public enum RuntimeAddressConfigurationEnumSimple {

@XmlEnumValue("NONE")
NONE("NONE"),

@XmlEnumValue("SD")
SD("SD");


    private final java.lang.String value;

    RuntimeAddressConfigurationEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static RuntimeAddressConfigurationEnumSimple fromValue(java.lang.String v) {
        for (RuntimeAddressConfigurationEnumSimple c: RuntimeAddressConfigurationEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}