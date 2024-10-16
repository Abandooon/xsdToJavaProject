package stdgui.data.model.orimodel;

@XmlType(name="ACL-ROLE--SUBTYPES-ENUM")
@XmlEnum
public enum AclRoleSubtypesEnum {

@XmlEnumValue("ACL-ROLE")
ACL_ROLE("ACL-ROLE");


    private final java.lang.String value;

    AclRoleSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static AclRoleSubtypesEnum fromValue(java.lang.String v) {
        for (AclRoleSubtypesEnum c: AclRoleSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}