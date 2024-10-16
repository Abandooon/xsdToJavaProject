package stdgui.data.model.orimodel;

@XmlType(name="BYTE-ORDER-ENUM--SIMPLE")
@XmlEnum
public enum ByteOrderEnumSimple {

@XmlEnumValue("MOST-SIGNIFICANT-BYTE-FIRST")
MOST_SIGNIFICANT_BYTE_FIRST("MOST-SIGNIFICANT-BYTE-FIRST"),

@XmlEnumValue("MOST-SIGNIFICANT-BYTE-LAST")
MOST_SIGNIFICANT_BYTE_LAST("MOST-SIGNIFICANT-BYTE-LAST"),

@XmlEnumValue("OPAQUE")
OPAQUE("OPAQUE");


    private final java.lang.String value;

    ByteOrderEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ByteOrderEnumSimple fromValue(java.lang.String v) {
        for (ByteOrderEnumSimple c: ByteOrderEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}