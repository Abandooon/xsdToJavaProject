package stdgui.data.model.orimodel;

@XmlType(name="SOCKET-ADDRESS--SUBTYPES-ENUM")
@XmlEnum
public enum SocketAddressSubtypesEnum {

@XmlEnumValue("SOCKET-ADDRESS")
SOCKET_ADDRESS("SOCKET-ADDRESS");


    private final java.lang.String value;

    SocketAddressSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SocketAddressSubtypesEnum fromValue(java.lang.String v) {
        for (SocketAddressSubtypesEnum c: SocketAddressSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}