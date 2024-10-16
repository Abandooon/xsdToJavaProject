package stdgui.data.model.orimodel;

@XmlType(name="TRANSFORMATION-TECHNOLOGY--SUBTYPES-ENUM")
@XmlEnum
public enum TransformationTechnologySubtypesEnum {

@XmlEnumValue("TRANSFORMATION-TECHNOLOGY")
TRANSFORMATION_TECHNOLOGY("TRANSFORMATION-TECHNOLOGY");


    private final java.lang.String value;

    TransformationTechnologySubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TransformationTechnologySubtypesEnum fromValue(java.lang.String v) {
        for (TransformationTechnologySubtypesEnum c: TransformationTechnologySubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}