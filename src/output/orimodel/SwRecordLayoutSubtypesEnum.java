package stdgui.data.model.orimodel;

@XmlType(name="SW-RECORD-LAYOUT--SUBTYPES-ENUM")
@XmlEnum
public enum SwRecordLayoutSubtypesEnum {

@XmlEnumValue("SW-RECORD-LAYOUT")
SW_RECORD_LAYOUT("SW-RECORD-LAYOUT");


    private final java.lang.String value;

    SwRecordLayoutSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SwRecordLayoutSubtypesEnum fromValue(java.lang.String v) {
        for (SwRecordLayoutSubtypesEnum c: SwRecordLayoutSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}