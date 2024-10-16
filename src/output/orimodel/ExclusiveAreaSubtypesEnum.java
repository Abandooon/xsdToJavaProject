package stdgui.data.model.orimodel;

@XmlType(name="EXCLUSIVE-AREA--SUBTYPES-ENUM")
@XmlEnum
public enum ExclusiveAreaSubtypesEnum {

@XmlEnumValue("EXCLUSIVE-AREA")
EXCLUSIVE_AREA("EXCLUSIVE-AREA");


    private final java.lang.String value;

    ExclusiveAreaSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ExclusiveAreaSubtypesEnum fromValue(java.lang.String v) {
        for (ExclusiveAreaSubtypesEnum c: ExclusiveAreaSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}