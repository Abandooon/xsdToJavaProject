package stdgui.data.model.orimodel;

@XmlType(name="LIN-SLAVE-CONFIG-IDENT--SUBTYPES-ENUM")
@XmlEnum
public enum LinSlaveConfigIdentSubtypesEnum {

@XmlEnumValue("LIN-SLAVE-CONFIG-IDENT")
LIN_SLAVE_CONFIG_IDENT("LIN-SLAVE-CONFIG-IDENT");


    private final java.lang.String value;

    LinSlaveConfigIdentSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static LinSlaveConfigIdentSubtypesEnum fromValue(java.lang.String v) {
        for (LinSlaveConfigIdentSubtypesEnum c: LinSlaveConfigIdentSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}