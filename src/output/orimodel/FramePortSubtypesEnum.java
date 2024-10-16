package stdgui.data.model.orimodel;

@XmlType(name="FRAME-PORT--SUBTYPES-ENUM")
@XmlEnum
public enum FramePortSubtypesEnum {

@XmlEnumValue("FRAME-PORT")
FRAME_PORT("FRAME-PORT");


    private final java.lang.String value;

    FramePortSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FramePortSubtypesEnum fromValue(java.lang.String v) {
        for (FramePortSubtypesEnum c: FramePortSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}