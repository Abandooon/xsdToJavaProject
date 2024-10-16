package stdgui.data.model.orimodel;

@XmlType(name="DO-IP-ENTITY-ROLE-ENUM--SIMPLE")
@XmlEnum
public enum DoIpEntityRoleEnumSimple {

@XmlEnumValue("EDGE-NODE")
EDGE_NODE("EDGE-NODE"),

@XmlEnumValue("GATEWAY")
GATEWAY("GATEWAY"),

@XmlEnumValue("NODE")
NODE("NODE");


    private final java.lang.String value;

    DoIpEntityRoleEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DoIpEntityRoleEnumSimple fromValue(java.lang.String v) {
        for (DoIpEntityRoleEnumSimple c: DoIpEntityRoleEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}