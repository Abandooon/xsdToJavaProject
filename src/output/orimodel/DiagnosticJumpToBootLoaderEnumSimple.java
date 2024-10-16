package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-JUMP-TO-BOOT-LOADER-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticJumpToBootLoaderEnumSimple {

@XmlEnumValue("NO-BOOT")
NO_BOOT("NO-BOOT"),

@XmlEnumValue("OEM-BOOT")
OEM_BOOT("OEM-BOOT"),

@XmlEnumValue("SYSTEM-SUPPLIER-BOOT")
SYSTEM_SUPPLIER_BOOT("SYSTEM-SUPPLIER-BOOT");


    private final java.lang.String value;

    DiagnosticJumpToBootLoaderEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticJumpToBootLoaderEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticJumpToBootLoaderEnumSimple c: DiagnosticJumpToBootLoaderEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}