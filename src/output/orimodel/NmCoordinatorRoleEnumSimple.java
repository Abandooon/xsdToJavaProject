package stdgui.data.model.orimodel;

@XmlType(name="NM-COORDINATOR-ROLE-ENUM--SIMPLE")
@XmlEnum
public enum NmCoordinatorRoleEnumSimple {

@XmlEnumValue("ACTIVE")
ACTIVE("ACTIVE"),

@XmlEnumValue("PASSIVE")
PASSIVE("PASSIVE");


    private final java.lang.String value;

    NmCoordinatorRoleEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static NmCoordinatorRoleEnumSimple fromValue(java.lang.String v) {
        for (NmCoordinatorRoleEnumSimple c: NmCoordinatorRoleEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}