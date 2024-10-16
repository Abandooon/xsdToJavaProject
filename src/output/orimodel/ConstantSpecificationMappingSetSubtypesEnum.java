package stdgui.data.model.orimodel;

@XmlType(name="CONSTANT-SPECIFICATION-MAPPING-SET--SUBTYPES-ENUM")
@XmlEnum
public enum ConstantSpecificationMappingSetSubtypesEnum {

@XmlEnumValue("CONSTANT-SPECIFICATION-MAPPING-SET")
CONSTANT_SPECIFICATION_MAPPING_SET("CONSTANT-SPECIFICATION-MAPPING-SET");


    private final java.lang.String value;

    ConstantSpecificationMappingSetSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ConstantSpecificationMappingSetSubtypesEnum fromValue(java.lang.String v) {
        for (ConstantSpecificationMappingSetSubtypesEnum c: ConstantSpecificationMappingSetSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}