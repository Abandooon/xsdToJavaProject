package stdgui.data.model.orimodel;

@XmlType(name="CONSUMED-EVENT-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum ConsumedEventGroupSubtypesEnum {

@XmlEnumValue("CONSUMED-EVENT-GROUP")
CONSUMED_EVENT_GROUP("CONSUMED-EVENT-GROUP");


    private final java.lang.String value;

    ConsumedEventGroupSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ConsumedEventGroupSubtypesEnum fromValue(java.lang.String v) {
        for (ConsumedEventGroupSubtypesEnum c: ConsumedEventGroupSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}