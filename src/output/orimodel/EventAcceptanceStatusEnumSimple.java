package stdgui.data.model.orimodel;

@XmlType(name="EVENT-ACCEPTANCE-STATUS-ENUM--SIMPLE")
@XmlEnum
public enum EventAcceptanceStatusEnumSimple {

@XmlEnumValue("EVENT-ACCEPTANCE-DISABLED")
EVENT_ACCEPTANCE_DISABLED("EVENT-ACCEPTANCE-DISABLED"),

@XmlEnumValue("EVENT-ACCEPTANCE-ENABLED")
EVENT_ACCEPTANCE_ENABLED("EVENT-ACCEPTANCE-ENABLED");


    private final java.lang.String value;

    EventAcceptanceStatusEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EventAcceptanceStatusEnumSimple fromValue(java.lang.String v) {
        for (EventAcceptanceStatusEnumSimple c: EventAcceptanceStatusEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}