package stdgui.data.model.orimodel;

@XmlType(name="DATA-TRANSFORMATION-ERROR-HANDLING-ENUM--SIMPLE")
@XmlEnum
public enum DataTransformationErrorHandlingEnumSimple {

@XmlEnumValue("NO-TRANSFORMER-ERROR-HANDLING")
NO_TRANSFORMER_ERROR_HANDLING("NO-TRANSFORMER-ERROR-HANDLING"),

@XmlEnumValue("TRANSFORMER-ERROR-HANDLING")
TRANSFORMER_ERROR_HANDLING("TRANSFORMER-ERROR-HANDLING");


    private final java.lang.String value;

    DataTransformationErrorHandlingEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DataTransformationErrorHandlingEnumSimple fromValue(java.lang.String v) {
        for (DataTransformationErrorHandlingEnumSimple c: DataTransformationErrorHandlingEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}