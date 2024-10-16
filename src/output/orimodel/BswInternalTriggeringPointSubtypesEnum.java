package stdgui.data.model.orimodel;

@XmlType(name="BSW-INTERNAL-TRIGGERING-POINT--SUBTYPES-ENUM")
@XmlEnum
public enum BswInternalTriggeringPointSubtypesEnum {

@XmlEnumValue("BSW-INTERNAL-TRIGGERING-POINT")
BSW_INTERNAL_TRIGGERING_POINT("BSW-INTERNAL-TRIGGERING-POINT");


    private final java.lang.String value;

    BswInternalTriggeringPointSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BswInternalTriggeringPointSubtypesEnum fromValue(java.lang.String v) {
        for (BswInternalTriggeringPointSubtypesEnum c: BswInternalTriggeringPointSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}