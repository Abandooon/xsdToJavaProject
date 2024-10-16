package stdgui.data.model.orimodel;

@XmlType(name="DATA-TRANSFORMATION--SUBTYPES-ENUM")
@XmlEnum
public enum DataTransformationSubtypesEnum {

@XmlEnumValue("DATA-TRANSFORMATION")
DATA_TRANSFORMATION("DATA-TRANSFORMATION");


    private final java.lang.String value;

    DataTransformationSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DataTransformationSubtypesEnum fromValue(java.lang.String v) {
        for (DataTransformationSubtypesEnum c: DataTransformationSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}