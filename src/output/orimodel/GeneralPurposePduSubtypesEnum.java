package stdgui.data.model.orimodel;

@XmlType(name="GENERAL-PURPOSE-PDU--SUBTYPES-ENUM")
@XmlEnum
public enum GeneralPurposePduSubtypesEnum {

@XmlEnumValue("GENERAL-PURPOSE-PDU")
GENERAL_PURPOSE_PDU("GENERAL-PURPOSE-PDU");


    private final java.lang.String value;

    GeneralPurposePduSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static GeneralPurposePduSubtypesEnum fromValue(java.lang.String v) {
        for (GeneralPurposePduSubtypesEnum c: GeneralPurposePduSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}