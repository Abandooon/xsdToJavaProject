package stdgui.data.model.orimodel;

@XmlType(name="SW-GENERIC-AXIS-PARAM-TYPE--SUBTYPES-ENUM")
@XmlEnum
public enum SwGenericAxisParamTypeSubtypesEnum {

@XmlEnumValue("SW-GENERIC-AXIS-PARAM-TYPE")
SW_GENERIC_AXIS_PARAM_TYPE("SW-GENERIC-AXIS-PARAM-TYPE");


    private final java.lang.String value;

    SwGenericAxisParamTypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SwGenericAxisParamTypeSubtypesEnum fromValue(java.lang.String v) {
        for (SwGenericAxisParamTypeSubtypesEnum c: SwGenericAxisParamTypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}