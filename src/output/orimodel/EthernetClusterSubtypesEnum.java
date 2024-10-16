package stdgui.data.model.orimodel;

@XmlType(name="ETHERNET-CLUSTER--SUBTYPES-ENUM")
@XmlEnum
public enum EthernetClusterSubtypesEnum {

@XmlEnumValue("ETHERNET-CLUSTER")
ETHERNET_CLUSTER("ETHERNET-CLUSTER");


    private final java.lang.String value;

    EthernetClusterSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EthernetClusterSubtypesEnum fromValue(java.lang.String v) {
        for (EthernetClusterSubtypesEnum c: EthernetClusterSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}