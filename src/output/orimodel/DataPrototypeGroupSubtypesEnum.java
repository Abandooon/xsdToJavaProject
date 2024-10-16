package stdgui.data.model.orimodel;

@XmlType(name="DATA-PROTOTYPE-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum DataPrototypeGroupSubtypesEnum {

@XmlEnumValue("DATA-PROTOTYPE-GROUP")
DATA_PROTOTYPE_GROUP("DATA-PROTOTYPE-GROUP");


    private final java.lang.String value;

    DataPrototypeGroupSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DataPrototypeGroupSubtypesEnum fromValue(java.lang.String v) {
        for (DataPrototypeGroupSubtypesEnum c: DataPrototypeGroupSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}