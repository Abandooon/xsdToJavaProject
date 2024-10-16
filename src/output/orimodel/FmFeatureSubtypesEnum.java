package stdgui.data.model.orimodel;

@XmlType(name="FM-FEATURE--SUBTYPES-ENUM")
@XmlEnum
public enum FmFeatureSubtypesEnum {

@XmlEnumValue("FM-FEATURE")
FM_FEATURE("FM-FEATURE");


    private final java.lang.String value;

    FmFeatureSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FmFeatureSubtypesEnum fromValue(java.lang.String v) {
        for (FmFeatureSubtypesEnum c: FmFeatureSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}