package stdgui.data.model.orimodel;

@XmlType(name="I-SIGNAL-I-PDU--SUBTYPES-ENUM")
@XmlEnum
public enum ISignalIPduSubtypesEnum {

@XmlEnumValue("I-SIGNAL-I-PDU")
I_SIGNAL_I_PDU("I-SIGNAL-I-PDU");


    private final java.lang.String value;

    ISignalIPduSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ISignalIPduSubtypesEnum fromValue(java.lang.String v) {
        for (ISignalIPduSubtypesEnum c: ISignalIPduSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}