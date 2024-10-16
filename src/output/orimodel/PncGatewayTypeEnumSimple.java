package stdgui.data.model.orimodel;

@XmlType(name="PNC-GATEWAY-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum PncGatewayTypeEnumSimple {

@XmlEnumValue("ACTIVE")
ACTIVE("ACTIVE"),

@XmlEnumValue("NONE")
NONE("NONE"),

@XmlEnumValue("PASSIVE")
PASSIVE("PASSIVE");


    private final java.lang.String value;

    PncGatewayTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static PncGatewayTypeEnumSimple fromValue(java.lang.String v) {
        for (PncGatewayTypeEnumSimple c: PncGatewayTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}