package stdgui.data.model.orimodel;

@XmlType(name="SO-AD-ROUTING-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum SoAdRoutingGroupSubtypesEnum {

@XmlEnumValue("SO-AD-ROUTING-GROUP")
SO_AD_ROUTING_GROUP("SO-AD-ROUTING-GROUP");


    private final java.lang.String value;

    SoAdRoutingGroupSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SoAdRoutingGroupSubtypesEnum fromValue(java.lang.String v) {
        for (SoAdRoutingGroupSubtypesEnum c: SoAdRoutingGroupSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}