package stdgui.data.model.orimodel;

@XmlType(name="XML-SPACE-ENUM--SIMPLE")
@XmlEnum
public enum XmlSpaceEnumSimple {

@XmlEnumValue("default")
DEFAULT("default"),

@XmlEnumValue("preserve")
PRESERVE("preserve");


    private final java.lang.String value;

    XmlSpaceEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static XmlSpaceEnumSimple fromValue(java.lang.String v) {
        for (XmlSpaceEnumSimple c: XmlSpaceEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}