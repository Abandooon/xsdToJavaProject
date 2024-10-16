package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticReadDataByPeriodicIdClassSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS")
DIAGNOSTIC_READ_DATA_BY_PERIODIC_ID_CLASS("DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS");


    private final java.lang.String value;

    DiagnosticReadDataByPeriodicIdClassSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticReadDataByPeriodicIdClassSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticReadDataByPeriodicIdClassSubtypesEnum c: DiagnosticReadDataByPeriodicIdClassSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}