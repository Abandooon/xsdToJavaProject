package stdgui.data.model.orimodel;

@XmlType(name="MAPPING-DIRECTION-ENUM--SIMPLE")
@XmlEnum
public enum MappingDirectionEnumSimple {

@XmlEnumValue("BIDIRECTIONAL")
BIDIRECTIONAL("BIDIRECTIONAL"),

@XmlEnumValue("FIRST-TO-SECOND")
FIRST_TO_SECOND("FIRST-TO-SECOND"),

@XmlEnumValue("SECOND-TO-FIRST")
SECOND_TO_FIRST("SECOND-TO-FIRST");


    private final java.lang.String value;

    MappingDirectionEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static MappingDirectionEnumSimple fromValue(java.lang.String v) {
        for (MappingDirectionEnumSimple c: MappingDirectionEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}