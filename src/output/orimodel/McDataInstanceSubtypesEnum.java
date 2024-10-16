package stdgui.data.model.orimodel;

@XmlType(name="MC-DATA-INSTANCE--SUBTYPES-ENUM")
@XmlEnum
public enum McDataInstanceSubtypesEnum {

@XmlEnumValue("MC-DATA-INSTANCE")
MC_DATA_INSTANCE("MC-DATA-INSTANCE");


    private final java.lang.String value;

    McDataInstanceSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static McDataInstanceSubtypesEnum fromValue(java.lang.String v) {
        for (McDataInstanceSubtypesEnum c: McDataInstanceSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}