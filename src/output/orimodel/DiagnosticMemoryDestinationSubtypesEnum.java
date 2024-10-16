package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-MEMORY-DESTINATION--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticMemoryDestinationSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-MEMORY-DESTINATION")
DIAGNOSTIC_MEMORY_DESTINATION("DIAGNOSTIC-MEMORY-DESTINATION"),

@XmlEnumValue("DIAGNOSTIC-MEMORY-DESTINATION-MIRROR")
DIAGNOSTIC_MEMORY_DESTINATION_MIRROR("DIAGNOSTIC-MEMORY-DESTINATION-MIRROR"),

@XmlEnumValue("DIAGNOSTIC-MEMORY-DESTINATION-PRIMARY")
DIAGNOSTIC_MEMORY_DESTINATION_PRIMARY("DIAGNOSTIC-MEMORY-DESTINATION-PRIMARY"),

@XmlEnumValue("DIAGNOSTIC-MEMORY-DESTINATION-USER-DEFINED")
DIAGNOSTIC_MEMORY_DESTINATION_USER_DEFINED("DIAGNOSTIC-MEMORY-DESTINATION-USER-DEFINED");


    private final java.lang.String value;

    DiagnosticMemoryDestinationSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticMemoryDestinationSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticMemoryDestinationSubtypesEnum c: DiagnosticMemoryDestinationSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}