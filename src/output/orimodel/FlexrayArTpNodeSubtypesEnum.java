package stdgui.data.model.orimodel;

@XmlType(name="FLEXRAY-AR-TP-NODE--SUBTYPES-ENUM")
@XmlEnum
public enum FlexrayArTpNodeSubtypesEnum {

@XmlEnumValue("FLEXRAY-AR-TP-NODE")
FLEXRAY_AR_TP_NODE("FLEXRAY-AR-TP-NODE");


    private final java.lang.String value;

    FlexrayArTpNodeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FlexrayArTpNodeSubtypesEnum fromValue(java.lang.String v) {
        for (FlexrayArTpNodeSubtypesEnum c: FlexrayArTpNodeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}