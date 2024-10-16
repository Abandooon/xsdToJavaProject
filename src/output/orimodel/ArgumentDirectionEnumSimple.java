package stdgui.data.model.orimodel;

@XmlType(name="ARGUMENT-DIRECTION-ENUM--SIMPLE")
@XmlEnum
public enum ArgumentDirectionEnumSimple {

@XmlEnumValue("IN")
IN("IN"),

@XmlEnumValue("INOUT")
INOUT("INOUT"),

@XmlEnumValue("OUT")
OUT("OUT");


    private final java.lang.String value;

    ArgumentDirectionEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ArgumentDirectionEnumSimple fromValue(java.lang.String v) {
        for (ArgumentDirectionEnumSimple c: ArgumentDirectionEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}