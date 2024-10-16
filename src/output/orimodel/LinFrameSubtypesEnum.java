package stdgui.data.model.orimodel;

@XmlType(name="LIN-FRAME--SUBTYPES-ENUM")
@XmlEnum
public enum LinFrameSubtypesEnum {

@XmlEnumValue("LIN-EVENT-TRIGGERED-FRAME")
LIN_EVENT_TRIGGERED_FRAME("LIN-EVENT-TRIGGERED-FRAME"),

@XmlEnumValue("LIN-FRAME")
LIN_FRAME("LIN-FRAME"),

@XmlEnumValue("LIN-SPORADIC-FRAME")
LIN_SPORADIC_FRAME("LIN-SPORADIC-FRAME"),

@XmlEnumValue("LIN-UNCONDITIONAL-FRAME")
LIN_UNCONDITIONAL_FRAME("LIN-UNCONDITIONAL-FRAME");


    private final java.lang.String value;

    LinFrameSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static LinFrameSubtypesEnum fromValue(java.lang.String v) {
        for (LinFrameSubtypesEnum c: LinFrameSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}