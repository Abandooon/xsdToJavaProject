package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-ACCESS-PERMISSION--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticAccessPermissionSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-ACCESS-PERMISSION")
DIAGNOSTIC_ACCESS_PERMISSION("DIAGNOSTIC-ACCESS-PERMISSION");


    private final java.lang.String value;

    DiagnosticAccessPermissionSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticAccessPermissionSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticAccessPermissionSubtypesEnum c: DiagnosticAccessPermissionSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}