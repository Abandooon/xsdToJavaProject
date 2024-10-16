package stdgui.data.model.orimodel;

@XmlType(name="ECUC-VALUE-COLLECTION--SUBTYPES-ENUM")
@XmlEnum
public enum EcucValueCollectionSubtypesEnum {

@XmlEnumValue("ECUC-VALUE-COLLECTION")
ECUC_VALUE_COLLECTION("ECUC-VALUE-COLLECTION");


    private final java.lang.String value;

    EcucValueCollectionSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EcucValueCollectionSubtypesEnum fromValue(java.lang.String v) {
        for (EcucValueCollectionSubtypesEnum c: EcucValueCollectionSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}