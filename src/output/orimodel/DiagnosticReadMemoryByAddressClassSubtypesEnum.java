package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-READ-MEMORY-BY-ADDRESS-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticReadMemoryByAddressClassSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-READ-MEMORY-BY-ADDRESS-CLASS")
DIAGNOSTIC_READ_MEMORY_BY_ADDRESS_CLASS("DIAGNOSTIC-READ-MEMORY-BY-ADDRESS-CLASS");


    private final java.lang.String value;

    DiagnosticReadMemoryByAddressClassSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticReadMemoryByAddressClassSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticReadMemoryByAddressClassSubtypesEnum c: DiagnosticReadMemoryByAddressClassSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}