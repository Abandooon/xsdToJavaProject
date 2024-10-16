package stdgui.data.model.orimodel;

@XmlType(name="VARIABLE-ACCESS--SUBTYPES-ENUM")
@XmlEnum
public enum VariableAccessSubtypesEnum {

@XmlEnumValue("VARIABLE-ACCESS")
VARIABLE_ACCESS("VARIABLE-ACCESS");


    private final java.lang.String value;

    VariableAccessSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static VariableAccessSubtypesEnum fromValue(java.lang.String v) {
        for (VariableAccessSubtypesEnum c: VariableAccessSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}