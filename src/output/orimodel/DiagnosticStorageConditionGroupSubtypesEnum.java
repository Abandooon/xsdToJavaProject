package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-STORAGE-CONDITION-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticStorageConditionGroupSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-STORAGE-CONDITION-GROUP")
DIAGNOSTIC_STORAGE_CONDITION_GROUP("DIAGNOSTIC-STORAGE-CONDITION-GROUP");


    private final java.lang.String value;

    DiagnosticStorageConditionGroupSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticStorageConditionGroupSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticStorageConditionGroupSubtypesEnum c: DiagnosticStorageConditionGroupSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}