package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-DATA-TRANSFER-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticDataTransferClassSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-DATA-TRANSFER-CLASS")
DIAGNOSTIC_DATA_TRANSFER_CLASS("DIAGNOSTIC-DATA-TRANSFER-CLASS");


    private final java.lang.String value;

    DiagnosticDataTransferClassSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticDataTransferClassSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticDataTransferClassSubtypesEnum c: DiagnosticDataTransferClassSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}