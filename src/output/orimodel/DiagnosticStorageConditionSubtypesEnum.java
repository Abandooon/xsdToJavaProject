package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-STORAGE-CONDITION--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticStorageConditionSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-STORAGE-CONDITION")
DIAGNOSTIC_STORAGE_CONDITION("DIAGNOSTIC-STORAGE-CONDITION");


    private final java.lang.String value;

    DiagnosticStorageConditionSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticStorageConditionSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticStorageConditionSubtypesEnum c: DiagnosticStorageConditionSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}