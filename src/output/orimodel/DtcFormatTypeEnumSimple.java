package stdgui.data.model.orimodel;

@XmlType(name="DTC-FORMAT-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum DtcFormatTypeEnumSimple {

@XmlEnumValue("J-1939")
J_1939("J-1939"),

@XmlEnumValue("OBD")
OBD("OBD"),

@XmlEnumValue("UDS")
UDS("UDS");


    private final java.lang.String value;

    DtcFormatTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DtcFormatTypeEnumSimple fromValue(java.lang.String v) {
        for (DtcFormatTypeEnumSimple c: DtcFormatTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}