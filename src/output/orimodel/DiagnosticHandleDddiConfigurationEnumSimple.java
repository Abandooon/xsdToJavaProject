package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-HANDLE-DDDI-CONFIGURATION-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticHandleDddiConfigurationEnumSimple {

@XmlEnumValue("NON-VOLATILE")
NON_VOLATILE("NON-VOLATILE"),

@XmlEnumValue("VOLATILE")
VOLATILE("VOLATILE");


    private final java.lang.String value;

    DiagnosticHandleDddiConfigurationEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticHandleDddiConfigurationEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticHandleDddiConfigurationEnumSimple c: DiagnosticHandleDddiConfigurationEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}