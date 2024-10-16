package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-REQUEST-DOWNLOAD-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticRequestDownloadClassSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-REQUEST-DOWNLOAD-CLASS")
DIAGNOSTIC_REQUEST_DOWNLOAD_CLASS("DIAGNOSTIC-REQUEST-DOWNLOAD-CLASS");


    private final java.lang.String value;

    DiagnosticRequestDownloadClassSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticRequestDownloadClassSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticRequestDownloadClassSubtypesEnum c: DiagnosticRequestDownloadClassSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}