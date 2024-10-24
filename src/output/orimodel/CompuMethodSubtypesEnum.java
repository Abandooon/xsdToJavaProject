package stdgui.data.model.orimodel;

@XmlType(name="COMPU-METHOD--SUBTYPES-ENUM")
@XmlEnum
public enum CompuMethodSubtypesEnum {

@XmlEnumValue("COMPU-METHOD")
COMPU_METHOD("COMPU-METHOD");


    private final java.lang.String value;

    CompuMethodSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CompuMethodSubtypesEnum fromValue(java.lang.String v) {
        for (CompuMethodSubtypesEnum c: CompuMethodSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}