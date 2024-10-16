package stdgui.data.model.orimodel;

@XmlType(name="CONTAINER-I-PDU-HEADER-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum ContainerIPduHeaderTypeEnumSimple {

@XmlEnumValue("LONG-HEADER")
LONG_HEADER("LONG-HEADER"),

@XmlEnumValue("SHORT-HEADER")
SHORT_HEADER("SHORT-HEADER");


    private final java.lang.String value;

    ContainerIPduHeaderTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ContainerIPduHeaderTypeEnumSimple fromValue(java.lang.String v) {
        for (ContainerIPduHeaderTypeEnumSimple c: ContainerIPduHeaderTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}