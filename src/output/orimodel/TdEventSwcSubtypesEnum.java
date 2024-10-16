package stdgui.data.model.orimodel;

@XmlType(name="TD-EVENT-SWC--SUBTYPES-ENUM")
@XmlEnum
public enum TdEventSwcSubtypesEnum {

@XmlEnumValue("TD-EVENT-SWC")
TD_EVENT_SWC("TD-EVENT-SWC"),

@XmlEnumValue("TD-EVENT-SWC-INTERNAL-BEHAVIOR")
TD_EVENT_SWC_INTERNAL_BEHAVIOR("TD-EVENT-SWC-INTERNAL-BEHAVIOR"),

@XmlEnumValue("TD-EVENT-SWC-INTERNAL-BEHAVIOR-REFERENCE")
TD_EVENT_SWC_INTERNAL_BEHAVIOR_REFERENCE("TD-EVENT-SWC-INTERNAL-BEHAVIOR-REFERENCE");


    private final java.lang.String value;

    TdEventSwcSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TdEventSwcSubtypesEnum fromValue(java.lang.String v) {
        for (TdEventSwcSubtypesEnum c: TdEventSwcSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}