package stdgui.data.model.orimodel;

@XmlType(name="UNIT-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum UnitGroupSubtypesEnum {

@XmlEnumValue("UNIT-GROUP")
UNIT_GROUP("UNIT-GROUP");


    private final java.lang.String value;

    UnitGroupSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static UnitGroupSubtypesEnum fromValue(java.lang.String v) {
        for (UnitGroupSubtypesEnum c: UnitGroupSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}