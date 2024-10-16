package stdgui.data.model.orimodel;

@XmlType(name="LIN-TP-NODE--SUBTYPES-ENUM")
@XmlEnum
public enum LinTpNodeSubtypesEnum {

@XmlEnumValue("LIN-TP-NODE")
LIN_TP_NODE("LIN-TP-NODE");


    private final java.lang.String value;

    LinTpNodeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static LinTpNodeSubtypesEnum fromValue(java.lang.String v) {
        for (LinTpNodeSubtypesEnum c: LinTpNodeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}