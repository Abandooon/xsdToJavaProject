package stdgui.data.model.orimodel;

@XmlType(name="FLAT-INSTANCE-DESCRIPTOR--SUBTYPES-ENUM")
@XmlEnum
public enum FlatInstanceDescriptorSubtypesEnum {

@XmlEnumValue("FLAT-INSTANCE-DESCRIPTOR")
FLAT_INSTANCE_DESCRIPTOR("FLAT-INSTANCE-DESCRIPTOR");


    private final java.lang.String value;

    FlatInstanceDescriptorSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FlatInstanceDescriptorSubtypesEnum fromValue(java.lang.String v) {
        for (FlatInstanceDescriptorSubtypesEnum c: FlatInstanceDescriptorSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}