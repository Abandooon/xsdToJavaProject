package stdgui.data.model.orimodel;

@XmlType(name="CONTAINER-I-PDU-TRIGGER-ENUM--SIMPLE")
@XmlEnum
public enum ContainerIPduTriggerEnumSimple {

@XmlEnumValue("DEFAULT-TRIGGER")
DEFAULT_TRIGGER("DEFAULT-TRIGGER"),

@XmlEnumValue("FIRST-CONTAINED-TRIGGER")
FIRST_CONTAINED_TRIGGER("FIRST-CONTAINED-TRIGGER");


    private final java.lang.String value;

    ContainerIPduTriggerEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ContainerIPduTriggerEnumSimple fromValue(java.lang.String v) {
        for (ContainerIPduTriggerEnumSimple c: ContainerIPduTriggerEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}