package stdgui.data.model.orimodel;

@XmlType(name="FLEXRAY-CHANNEL-NAME--SIMPLE")
@XmlEnum
public enum FlexrayChannelNameSimple {

@XmlEnumValue("CHANNEL-A")
CHANNEL_A("CHANNEL-A"),

@XmlEnumValue("CHANNEL-B")
CHANNEL_B("CHANNEL-B");


    private final java.lang.String value;

    FlexrayChannelNameSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static FlexrayChannelNameSimple fromValue(java.lang.String v) {
        for (FlexrayChannelNameSimple c: FlexrayChannelNameSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}