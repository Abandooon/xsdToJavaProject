package stdgui.data.model.orimodel;

@XmlType(name="FLEXRAY-TP-NODE--SUBTYPES-ENUM")
@XmlEnum
public enum FlexrayTpNodeSubtypesEnum {

@XmlEnumValue("FLEXRAY-TP-NODE")
FLEXRAY_TP_NODE("FLEXRAY-TP-NODE");


    private final java.lang.String value;

    FlexrayTpNodeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FlexrayTpNodeSubtypesEnum fromValue(java.lang.String v) {
        for (FlexrayTpNodeSubtypesEnum c: FlexrayTpNodeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}