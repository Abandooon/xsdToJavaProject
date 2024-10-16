package stdgui.data.model.orimodel;

@XmlType(name="CAN-NM-CLUSTER--SUBTYPES-ENUM")
@XmlEnum
public enum CanNmClusterSubtypesEnum {

@XmlEnumValue("CAN-NM-CLUSTER")
CAN_NM_CLUSTER("CAN-NM-CLUSTER");


    private final java.lang.String value;

    CanNmClusterSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CanNmClusterSubtypesEnum fromValue(java.lang.String v) {
        for (CanNmClusterSubtypesEnum c: CanNmClusterSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}