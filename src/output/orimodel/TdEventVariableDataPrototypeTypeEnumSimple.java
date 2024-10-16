package stdgui.data.model.orimodel;

@XmlType(name="TD-EVENT-VARIABLE-DATA-PROTOTYPE-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum TdEventVariableDataPrototypeTypeEnumSimple {

@XmlEnumValue("VARIABLE-DATA-PROTOTYPE-RECEIVED")
VARIABLE_DATA_PROTOTYPE_RECEIVED("VARIABLE-DATA-PROTOTYPE-RECEIVED"),

@XmlEnumValue("VARIABLE-DATA-PROTOTYPE-SENT")
VARIABLE_DATA_PROTOTYPE_SENT("VARIABLE-DATA-PROTOTYPE-SENT");


    private final java.lang.String value;

    TdEventVariableDataPrototypeTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TdEventVariableDataPrototypeTypeEnumSimple fromValue(java.lang.String v) {
        for (TdEventVariableDataPrototypeTypeEnumSimple c: TdEventVariableDataPrototypeTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}