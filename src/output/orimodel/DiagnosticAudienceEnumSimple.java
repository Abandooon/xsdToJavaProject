package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-AUDIENCE-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticAudienceEnumSimple {

@XmlEnumValue("AFTER-SALES")
AFTER_SALES("AFTER-SALES"),

@XmlEnumValue("AFTERMAKET")
AFTERMAKET("AFTERMAKET"),

@XmlEnumValue("AFTERMARKET")
AFTERMARKET("AFTERMARKET"),

@XmlEnumValue("DEVELOPMENT")
DEVELOPMENT("DEVELOPMENT"),

@XmlEnumValue("MANUFACTURING")
MANUFACTURING("MANUFACTURING"),

@XmlEnumValue("SUPPLIER")
SUPPLIER("SUPPLIER");


    private final java.lang.String value;

    DiagnosticAudienceEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticAudienceEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticAudienceEnumSimple c: DiagnosticAudienceEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}