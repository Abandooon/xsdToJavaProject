package stdgui.data.model.orimodel;

@XmlType(name="SYNCHRONIZATION-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum SynchronizationTypeEnumSimple {

@XmlEnumValue("RESPONSE-SYNCHRONIZATION")
RESPONSE_SYNCHRONIZATION("RESPONSE-SYNCHRONIZATION"),

@XmlEnumValue("STIMULUS-SYNCHRONIZATION")
STIMULUS_SYNCHRONIZATION("STIMULUS-SYNCHRONIZATION");


    private final java.lang.String value;

    SynchronizationTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SynchronizationTypeEnumSimple fromValue(java.lang.String v) {
        for (SynchronizationTypeEnumSimple c: SynchronizationTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}