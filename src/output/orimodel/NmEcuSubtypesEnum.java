package stdgui.data.model.orimodel;

@XmlType(name="NM-ECU--SUBTYPES-ENUM")
@XmlEnum
public enum NmEcuSubtypesEnum {

@XmlEnumValue("NM-ECU")
NM_ECU("NM-ECU");


    private final java.lang.String value;

    NmEcuSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static NmEcuSubtypesEnum fromValue(java.lang.String v) {
        for (NmEcuSubtypesEnum c: NmEcuSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}