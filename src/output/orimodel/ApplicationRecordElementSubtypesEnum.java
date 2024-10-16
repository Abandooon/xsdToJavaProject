package stdgui.data.model.orimodel;

@XmlType(name="APPLICATION-RECORD-ELEMENT--SUBTYPES-ENUM")
@XmlEnum
public enum ApplicationRecordElementSubtypesEnum {

@XmlEnumValue("APPLICATION-RECORD-ELEMENT")
APPLICATION_RECORD_ELEMENT("APPLICATION-RECORD-ELEMENT");


    private final java.lang.String value;

    ApplicationRecordElementSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ApplicationRecordElementSubtypesEnum fromValue(java.lang.String v) {
        for (ApplicationRecordElementSubtypesEnum c: ApplicationRecordElementSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}