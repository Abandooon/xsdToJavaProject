package stdgui.data.model.orimodel;

@XmlType(name="I-SIGNAL-PORT--SUBTYPES-ENUM")
@XmlEnum
public enum ISignalPortSubtypesEnum {

@XmlEnumValue("I-SIGNAL-PORT")
I_SIGNAL_PORT("I-SIGNAL-PORT");


    private final java.lang.String value;

    ISignalPortSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ISignalPortSubtypesEnum fromValue(java.lang.String v) {
        for (ISignalPortSubtypesEnum c: ISignalPortSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}