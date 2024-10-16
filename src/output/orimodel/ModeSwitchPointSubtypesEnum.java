package stdgui.data.model.orimodel;

@XmlType(name="MODE-SWITCH-POINT--SUBTYPES-ENUM")
@XmlEnum
public enum ModeSwitchPointSubtypesEnum {

@XmlEnumValue("MODE-SWITCH-POINT")
MODE_SWITCH_POINT("MODE-SWITCH-POINT");


    private final java.lang.String value;

    ModeSwitchPointSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ModeSwitchPointSubtypesEnum fromValue(java.lang.String v) {
        for (ModeSwitchPointSubtypesEnum c: ModeSwitchPointSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}