package stdgui.data.model.orimodel;

@XmlType(name="J-1939-TP-NODE--SUBTYPES-ENUM")
@XmlEnum
public enum J1939TpNodeSubtypesEnum {

@XmlEnumValue("J-1939-TP-NODE")
J_1939_TP_NODE("J-1939-TP-NODE");


    private final java.lang.String value;

    J1939TpNodeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static J1939TpNodeSubtypesEnum fromValue(java.lang.String v) {
        for (J1939TpNodeSubtypesEnum c: J1939TpNodeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}