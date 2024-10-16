package stdgui.data.model.orimodel;

@XmlType(name="SO-AD-CONNECTOR-TYPE--SIMPLE")
@XmlEnum
public enum SoAdConnectorTypeSimple {

@XmlEnumValue("DO-IP")
DO_IP("DO-IP"),

@XmlEnumValue("PDU-R")
PDU_R("PDU-R"),

@XmlEnumValue("UDP-NM")
UDP_NM("UDP-NM"),

@XmlEnumValue("XCP")
XCP("XCP");


    private final java.lang.String value;

    SoAdConnectorTypeSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SoAdConnectorTypeSimple fromValue(java.lang.String v) {
        for (SoAdConnectorTypeSimple c: SoAdConnectorTypeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}