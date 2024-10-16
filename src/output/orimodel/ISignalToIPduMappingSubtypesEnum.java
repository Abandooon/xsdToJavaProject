package stdgui.data.model.orimodel;

@XmlType(name="I-SIGNAL-TO-I-PDU-MAPPING--SUBTYPES-ENUM")
@XmlEnum
public enum ISignalToIPduMappingSubtypesEnum {

@XmlEnumValue("I-SIGNAL-TO-I-PDU-MAPPING")
I_SIGNAL_TO_I_PDU_MAPPING("I-SIGNAL-TO-I-PDU-MAPPING");


    private final java.lang.String value;

    ISignalToIPduMappingSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ISignalToIPduMappingSubtypesEnum fromValue(java.lang.String v) {
        for (ISignalToIPduMappingSubtypesEnum c: ISignalToIPduMappingSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}