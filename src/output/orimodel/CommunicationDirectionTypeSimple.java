package stdgui.data.model.orimodel;

@XmlType(name="COMMUNICATION-DIRECTION-TYPE--SIMPLE")
@XmlEnum
public enum CommunicationDirectionTypeSimple {

@XmlEnumValue("IN")
IN("IN"),

@XmlEnumValue("OUT")
OUT("OUT");


    private final java.lang.String value;

    CommunicationDirectionTypeSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CommunicationDirectionTypeSimple fromValue(java.lang.String v) {
        for (CommunicationDirectionTypeSimple c: CommunicationDirectionTypeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}