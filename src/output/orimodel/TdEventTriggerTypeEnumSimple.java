package stdgui.data.model.orimodel;

@XmlType(name="TD-EVENT-TRIGGER-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum TdEventTriggerTypeEnumSimple {

@XmlEnumValue("TRIGGER-ACTIVATED")
TRIGGER_ACTIVATED("TRIGGER-ACTIVATED"),

@XmlEnumValue("TRIGGER-RELEASED")
TRIGGER_RELEASED("TRIGGER-RELEASED");


    private final java.lang.String value;

    TdEventTriggerTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TdEventTriggerTypeEnumSimple fromValue(java.lang.String v) {
        for (TdEventTriggerTypeEnumSimple c: TdEventTriggerTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}