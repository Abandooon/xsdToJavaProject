package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-READ-DTC-INFORMATION-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticReadDtcInformationClassSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-READ-DTC-INFORMATION-CLASS")
DIAGNOSTIC_READ_DTC_INFORMATION_CLASS("DIAGNOSTIC-READ-DTC-INFORMATION-CLASS");


    private final java.lang.String value;

    DiagnosticReadDtcInformationClassSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticReadDtcInformationClassSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticReadDtcInformationClassSubtypesEnum c: DiagnosticReadDtcInformationClassSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}