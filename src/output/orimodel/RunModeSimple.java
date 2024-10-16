package stdgui.data.model.orimodel;

@XmlType(name="RUN-MODE--SIMPLE")
@XmlEnum
public enum RunModeSimple {

@XmlEnumValue("RUN-CONTINUOUS")
RUN_CONTINUOUS("RUN-CONTINUOUS"),

@XmlEnumValue("RUN-ONCE")
RUN_ONCE("RUN-ONCE");


    private final java.lang.String value;

    RunModeSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static RunModeSimple fromValue(java.lang.String v) {
        for (RunModeSimple c: RunModeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}