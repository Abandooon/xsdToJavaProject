package stdgui.data.model.orimodel;

@XmlType(name="LIN-CHECKSUM-TYPE--SIMPLE")
@XmlEnum
public enum LinChecksumTypeSimple {

@XmlEnumValue("CLASSIC")
CLASSIC("CLASSIC"),

@XmlEnumValue("ENHANCED")
ENHANCED("ENHANCED");


    private final java.lang.String value;

    LinChecksumTypeSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static LinChecksumTypeSimple fromValue(java.lang.String v) {
        for (LinChecksumTypeSimple c: LinChecksumTypeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}