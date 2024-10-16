package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-WRITE-MEMORY-BY-ADDRESS-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticWriteMemoryByAddressClassSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-WRITE-MEMORY-BY-ADDRESS-CLASS")
DIAGNOSTIC_WRITE_MEMORY_BY_ADDRESS_CLASS("DIAGNOSTIC-WRITE-MEMORY-BY-ADDRESS-CLASS");


    private final java.lang.String value;

    DiagnosticWriteMemoryByAddressClassSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticWriteMemoryByAddressClassSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticWriteMemoryByAddressClassSubtypesEnum c: DiagnosticWriteMemoryByAddressClassSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}