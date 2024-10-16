package stdgui.data.model.orimodel;

@XmlType(name="SWC-TO-ECU-MAPPING--SUBTYPES-ENUM")
@XmlEnum
public enum SwcToEcuMappingSubtypesEnum {

@XmlEnumValue("SWC-TO-ECU-MAPPING")
SWC_TO_ECU_MAPPING("SWC-TO-ECU-MAPPING");


    private final java.lang.String value;

    SwcToEcuMappingSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SwcToEcuMappingSubtypesEnum fromValue(java.lang.String v) {
        for (SwcToEcuMappingSubtypesEnum c: SwcToEcuMappingSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}