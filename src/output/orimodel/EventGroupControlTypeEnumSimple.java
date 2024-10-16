package stdgui.data.model.orimodel;

@XmlType(name="EVENT-GROUP-CONTROL-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum EventGroupControlTypeEnumSimple {

@XmlEnumValue("ACTIVATION-AND-TRIGGER-UNICAST")
ACTIVATION_AND_TRIGGER_UNICAST("ACTIVATION-AND-TRIGGER-UNICAST"),

@XmlEnumValue("ACTIVATION-MULTICAST")
ACTIVATION_MULTICAST("ACTIVATION-MULTICAST"),

@XmlEnumValue("ACTIVATION-UNICAST")
ACTIVATION_UNICAST("ACTIVATION-UNICAST"),

@XmlEnumValue("TRIGGER-UNICAST")
TRIGGER_UNICAST("TRIGGER-UNICAST");


    private final java.lang.String value;

    EventGroupControlTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EventGroupControlTypeEnumSimple fromValue(java.lang.String v) {
        for (EventGroupControlTypeEnumSimple c: EventGroupControlTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}