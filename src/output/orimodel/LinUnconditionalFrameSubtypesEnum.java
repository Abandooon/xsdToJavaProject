package stdgui.data.model.orimodel;

@XmlType(name="LIN-UNCONDITIONAL-FRAME--SUBTYPES-ENUM")
@XmlEnum
public enum LinUnconditionalFrameSubtypesEnum {

@XmlEnumValue("LIN-UNCONDITIONAL-FRAME")
LIN_UNCONDITIONAL_FRAME("LIN-UNCONDITIONAL-FRAME");


    private final java.lang.String value;

    LinUnconditionalFrameSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static LinUnconditionalFrameSubtypesEnum fromValue(java.lang.String v) {
        for (LinUnconditionalFrameSubtypesEnum c: LinUnconditionalFrameSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}