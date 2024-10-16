package stdgui.data.model.orimodel;

@XmlType(name="TTCAN-CLUSTER--SUBTYPES-ENUM")
@XmlEnum
public enum TtcanClusterSubtypesEnum {

@XmlEnumValue("TTCAN-CLUSTER")
TTCAN_CLUSTER("TTCAN-CLUSTER");


    private final java.lang.String value;

    TtcanClusterSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TtcanClusterSubtypesEnum fromValue(java.lang.String v) {
        for (TtcanClusterSubtypesEnum c: TtcanClusterSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}