package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-VALUE-NEEDS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticValueNeedsSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-VALUE-NEEDS")
DIAGNOSTIC_VALUE_NEEDS("DIAGNOSTIC-VALUE-NEEDS");


    private final java.lang.String value;

    DiagnosticValueNeedsSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticValueNeedsSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticValueNeedsSubtypesEnum c: DiagnosticValueNeedsSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}