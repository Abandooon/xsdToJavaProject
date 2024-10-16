package stdgui.data.model.orimodel;

@XmlType(name="LIST-ENUM--SIMPLE")
@XmlEnum
public enum ListEnumSimple {

@XmlEnumValue("NUMBER")
NUMBER("NUMBER"),

@XmlEnumValue("UNNUMBER")
UNNUMBER("UNNUMBER");


    private final java.lang.String value;

    ListEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ListEnumSimple fromValue(java.lang.String v) {
        for (ListEnumSimple c: ListEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}