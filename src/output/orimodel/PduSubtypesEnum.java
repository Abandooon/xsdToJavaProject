package stdgui.data.model.orimodel;

@XmlType(name="PDU--SUBTYPES-ENUM")
@XmlEnum
public enum PduSubtypesEnum {

@XmlEnumValue("CONTAINER-I-PDU")
CONTAINER_I_PDU("CONTAINER-I-PDU"),

@XmlEnumValue("DCM-I-PDU")
DCM_I_PDU("DCM-I-PDU"),

@XmlEnumValue("GENERAL-PURPOSE-I-PDU")
GENERAL_PURPOSE_I_PDU("GENERAL-PURPOSE-I-PDU"),

@XmlEnumValue("GENERAL-PURPOSE-PDU")
GENERAL_PURPOSE_PDU("GENERAL-PURPOSE-PDU"),

@XmlEnumValue("I-PDU")
I_PDU("I-PDU"),

@XmlEnumValue("I-SIGNAL-I-PDU")
I_SIGNAL_I_PDU("I-SIGNAL-I-PDU"),

@XmlEnumValue("J-1939-DCM-I-PDU")
J_1939_DCM_I_PDU("J-1939-DCM-I-PDU"),

@XmlEnumValue("MULTIPLEXED-I-PDU")
MULTIPLEXED_I_PDU("MULTIPLEXED-I-PDU"),

@XmlEnumValue("N-PDU")
N_PDU("N-PDU"),

@XmlEnumValue("NM-PDU")
NM_PDU("NM-PDU"),

@XmlEnumValue("PDU")
PDU("PDU"),

@XmlEnumValue("SECURED-I-PDU")
SECURED_I_PDU("SECURED-I-PDU"),

@XmlEnumValue("USER-DEFINED-I-PDU")
USER_DEFINED_I_PDU("USER-DEFINED-I-PDU"),

@XmlEnumValue("USER-DEFINED-PDU")
USER_DEFINED_PDU("USER-DEFINED-PDU"),

@XmlEnumValue("XCP-PDU")
XCP_PDU("XCP-PDU");


    private final java.lang.String value;

    PduSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static PduSubtypesEnum fromValue(java.lang.String v) {
        for (PduSubtypesEnum c: PduSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}