package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-IO-CONTROL-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticIoControlClassSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-IO-CONTROL-CLASS")
DIAGNOSTIC_IO_CONTROL_CLASS("DIAGNOSTIC-IO-CONTROL-CLASS");


    private final java.lang.String value;

    DiagnosticIoControlClassSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticIoControlClassSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticIoControlClassSubtypesEnum c: DiagnosticIoControlClassSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}