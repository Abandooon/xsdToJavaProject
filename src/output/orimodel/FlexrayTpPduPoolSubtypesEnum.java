package stdgui.data.model.orimodel;

@XmlType(name="FLEXRAY-TP-PDU-POOL--SUBTYPES-ENUM")
@XmlEnum
public enum FlexrayTpPduPoolSubtypesEnum {

@XmlEnumValue("FLEXRAY-TP-PDU-POOL")
FLEXRAY_TP_PDU_POOL("FLEXRAY-TP-PDU-POOL");


    private final java.lang.String value;

    FlexrayTpPduPoolSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FlexrayTpPduPoolSubtypesEnum fromValue(java.lang.String v) {
        for (FlexrayTpPduPoolSubtypesEnum c: FlexrayTpPduPoolSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}