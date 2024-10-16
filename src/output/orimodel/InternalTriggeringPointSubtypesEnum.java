package stdgui.data.model.orimodel;

@XmlType(name="INTERNAL-TRIGGERING-POINT--SUBTYPES-ENUM")
@XmlEnum
public enum InternalTriggeringPointSubtypesEnum {

@XmlEnumValue("INTERNAL-TRIGGERING-POINT")
INTERNAL_TRIGGERING_POINT("INTERNAL-TRIGGERING-POINT");


    private final java.lang.String value;

    InternalTriggeringPointSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static InternalTriggeringPointSubtypesEnum fromValue(java.lang.String v) {
        for (InternalTriggeringPointSubtypesEnum c: InternalTriggeringPointSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}