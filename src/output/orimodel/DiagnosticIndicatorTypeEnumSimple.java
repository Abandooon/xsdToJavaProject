package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-INDICATOR-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticIndicatorTypeEnumSimple {

@XmlEnumValue("AMBER-WARNING")
AMBER_WARNING("AMBER-WARNING"),

@XmlEnumValue("MALFUNCTION")
MALFUNCTION("MALFUNCTION"),

@XmlEnumValue("PROTECT-LAMP")
PROTECT_LAMP("PROTECT-LAMP"),

@XmlEnumValue("RED-STOP-LAMP")
RED_STOP_LAMP("RED-STOP-LAMP"),

@XmlEnumValue("WARNING")
WARNING("WARNING");


    private final java.lang.String value;

    DiagnosticIndicatorTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticIndicatorTypeEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticIndicatorTypeEnumSimple c: DiagnosticIndicatorTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}