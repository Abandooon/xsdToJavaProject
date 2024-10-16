package stdgui.data.model.orimodel;

@XmlType(name="ETHERNET-COMMUNICATION-CONNECTOR--SUBTYPES-ENUM")
@XmlEnum
public enum EthernetCommunicationConnectorSubtypesEnum {

@XmlEnumValue("ETHERNET-COMMUNICATION-CONNECTOR")
ETHERNET_COMMUNICATION_CONNECTOR("ETHERNET-COMMUNICATION-CONNECTOR");


    private final java.lang.String value;

    EthernetCommunicationConnectorSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EthernetCommunicationConnectorSubtypesEnum fromValue(java.lang.String v) {
        for (EthernetCommunicationConnectorSubtypesEnum c: EthernetCommunicationConnectorSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}