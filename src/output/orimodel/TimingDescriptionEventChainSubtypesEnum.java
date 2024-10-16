package stdgui.data.model.orimodel;

@XmlType(name="TIMING-DESCRIPTION-EVENT-CHAIN--SUBTYPES-ENUM")
@XmlEnum
public enum TimingDescriptionEventChainSubtypesEnum {

@XmlEnumValue("TIMING-DESCRIPTION-EVENT-CHAIN")
TIMING_DESCRIPTION_EVENT_CHAIN("TIMING-DESCRIPTION-EVENT-CHAIN");


    private final java.lang.String value;

    TimingDescriptionEventChainSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TimingDescriptionEventChainSubtypesEnum fromValue(java.lang.String v) {
        for (TimingDescriptionEventChainSubtypesEnum c: TimingDescriptionEventChainSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}