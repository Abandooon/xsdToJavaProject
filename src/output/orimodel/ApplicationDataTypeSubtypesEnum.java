package stdgui.data.model.orimodel;

@XmlType(name="APPLICATION-DATA-TYPE--SUBTYPES-ENUM")
@XmlEnum
public enum ApplicationDataTypeSubtypesEnum {

@XmlEnumValue("APPLICATION-ARRAY-DATA-TYPE")
APPLICATION_ARRAY_DATA_TYPE("APPLICATION-ARRAY-DATA-TYPE"),

@XmlEnumValue("APPLICATION-COMPOSITE-DATA-TYPE")
APPLICATION_COMPOSITE_DATA_TYPE("APPLICATION-COMPOSITE-DATA-TYPE"),

@XmlEnumValue("APPLICATION-DATA-TYPE")
APPLICATION_DATA_TYPE("APPLICATION-DATA-TYPE"),

@XmlEnumValue("APPLICATION-PRIMITIVE-DATA-TYPE")
APPLICATION_PRIMITIVE_DATA_TYPE("APPLICATION-PRIMITIVE-DATA-TYPE"),

@XmlEnumValue("APPLICATION-RECORD-DATA-TYPE")
APPLICATION_RECORD_DATA_TYPE("APPLICATION-RECORD-DATA-TYPE");


    private final java.lang.String value;

    ApplicationDataTypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ApplicationDataTypeSubtypesEnum fromValue(java.lang.String v) {
        for (ApplicationDataTypeSubtypesEnum c: ApplicationDataTypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}