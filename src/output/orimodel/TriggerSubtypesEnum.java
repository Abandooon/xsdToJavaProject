package stdgui.data.model.orimodel;

@XmlType(name="TRIGGER--SUBTYPES-ENUM")
@XmlEnum
public enum TriggerSubtypesEnum {

@XmlEnumValue("TRIGGER")
TRIGGER("TRIGGER");


    private final java.lang.String value;

    TriggerSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TriggerSubtypesEnum fromValue(java.lang.String v) {
        for (TriggerSubtypesEnum c: TriggerSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}