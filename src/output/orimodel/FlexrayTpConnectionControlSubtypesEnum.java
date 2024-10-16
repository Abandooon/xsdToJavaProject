package stdgui.data.model.orimodel;

@XmlType(name="FLEXRAY-TP-CONNECTION-CONTROL--SUBTYPES-ENUM")
@XmlEnum
public enum FlexrayTpConnectionControlSubtypesEnum {

@XmlEnumValue("FLEXRAY-TP-CONNECTION-CONTROL")
FLEXRAY_TP_CONNECTION_CONTROL("FLEXRAY-TP-CONNECTION-CONTROL");


    private final java.lang.String value;

    FlexrayTpConnectionControlSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FlexrayTpConnectionControlSubtypesEnum fromValue(java.lang.String v) {
        for (FlexrayTpConnectionControlSubtypesEnum c: FlexrayTpConnectionControlSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}