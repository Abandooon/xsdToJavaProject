package stdgui.data.model.orimodel;

@XmlType(name="FLEXRAY-COMMUNICATION-CONNECTOR--SUBTYPES-ENUM")
@XmlEnum
public enum FlexrayCommunicationConnectorSubtypesEnum {

@XmlEnumValue("FLEXRAY-COMMUNICATION-CONNECTOR")
FLEXRAY_COMMUNICATION_CONNECTOR("FLEXRAY-COMMUNICATION-CONNECTOR");


    private final java.lang.String value;

    FlexrayCommunicationConnectorSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FlexrayCommunicationConnectorSubtypesEnum fromValue(java.lang.String v) {
        for (FlexrayCommunicationConnectorSubtypesEnum c: FlexrayCommunicationConnectorSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}