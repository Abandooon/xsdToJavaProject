package stdgui.data.model.orimodel;

@XmlType(name="FUNCTION-INHIBITION-NEEDS--SUBTYPES-ENUM")
@XmlEnum
public enum FunctionInhibitionNeedsSubtypesEnum {

@XmlEnumValue("FUNCTION-INHIBITION-NEEDS")
FUNCTION_INHIBITION_NEEDS("FUNCTION-INHIBITION-NEEDS");


    private final java.lang.String value;

    FunctionInhibitionNeedsSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FunctionInhibitionNeedsSubtypesEnum fromValue(java.lang.String v) {
        for (FunctionInhibitionNeedsSubtypesEnum c: FunctionInhibitionNeedsSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}