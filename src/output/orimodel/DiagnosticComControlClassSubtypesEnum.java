package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-COM-CONTROL-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticComControlClassSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-COM-CONTROL-CLASS")
DIAGNOSTIC_COM_CONTROL_CLASS("DIAGNOSTIC-COM-CONTROL-CLASS");


    private final java.lang.String value;

    DiagnosticComControlClassSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticComControlClassSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticComControlClassSubtypesEnum c: DiagnosticComControlClassSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}