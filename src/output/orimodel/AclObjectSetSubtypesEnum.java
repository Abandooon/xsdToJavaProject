package stdgui.data.model.orimodel;

@XmlType(name="ACL-OBJECT-SET--SUBTYPES-ENUM")
@XmlEnum
public enum AclObjectSetSubtypesEnum {

@XmlEnumValue("ACL-OBJECT-SET")
ACL_OBJECT_SET("ACL-OBJECT-SET");


    private final java.lang.String value;

    AclObjectSetSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AclObjectSetSubtypesEnum fromValue(java.lang.String v) {
        for (AclObjectSetSubtypesEnum c: AclObjectSetSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}