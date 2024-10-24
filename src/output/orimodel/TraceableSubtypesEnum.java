package stdgui.data.model.orimodel;

@XmlType(name="TRACEABLE--SUBTYPES-ENUM")
@XmlEnum
public enum TraceableSubtypesEnum {

@XmlEnumValue("AGE-CONSTRAINT")
AGE_CONSTRAINT("AGE-CONSTRAINT"),

@XmlEnumValue("ARBITRARY-EVENT-TRIGGERING")
ARBITRARY_EVENT_TRIGGERING("ARBITRARY-EVENT-TRIGGERING"),

@XmlEnumValue("BURST-PATTERN-EVENT-TRIGGERING")
BURST_PATTERN_EVENT_TRIGGERING("BURST-PATTERN-EVENT-TRIGGERING"),

@XmlEnumValue("CONCRETE-PATTERN-EVENT-TRIGGERING")
CONCRETE_PATTERN_EVENT_TRIGGERING("CONCRETE-PATTERN-EVENT-TRIGGERING"),

@XmlEnumValue("EVENT-TRIGGERING-CONSTRAINT")
EVENT_TRIGGERING_CONSTRAINT("EVENT-TRIGGERING-CONSTRAINT"),

@XmlEnumValue("EXECUTION-ORDER-CONSTRAINT")
EXECUTION_ORDER_CONSTRAINT("EXECUTION-ORDER-CONSTRAINT"),

@XmlEnumValue("EXECUTION-TIME-CONSTRAINT")
EXECUTION_TIME_CONSTRAINT("EXECUTION-TIME-CONSTRAINT"),

@XmlEnumValue("LATENCY-TIMING-CONSTRAINT")
LATENCY_TIMING_CONSTRAINT("LATENCY-TIMING-CONSTRAINT"),

@XmlEnumValue("OFFSET-TIMING-CONSTRAINT")
OFFSET_TIMING_CONSTRAINT("OFFSET-TIMING-CONSTRAINT"),

@XmlEnumValue("PERIODIC-EVENT-TRIGGERING")
PERIODIC_EVENT_TRIGGERING("PERIODIC-EVENT-TRIGGERING"),

@XmlEnumValue("SPORADIC-EVENT-TRIGGERING")
SPORADIC_EVENT_TRIGGERING("SPORADIC-EVENT-TRIGGERING"),

@XmlEnumValue("STRUCTURED-REQ")
STRUCTURED_REQ("STRUCTURED-REQ"),

@XmlEnumValue("SYNCHRONIZATION-TIMING-CONSTRAINT")
SYNCHRONIZATION_TIMING_CONSTRAINT("SYNCHRONIZATION-TIMING-CONSTRAINT"),

@XmlEnumValue("TIMING-CONSTRAINT")
TIMING_CONSTRAINT("TIMING-CONSTRAINT"),

@XmlEnumValue("TRACEABLE")
TRACEABLE("TRACEABLE"),

@XmlEnumValue("TRACEABLE-TEXT")
TRACEABLE_TEXT("TRACEABLE-TEXT");


    private final java.lang.String value;

    TraceableSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TraceableSubtypesEnum fromValue(java.lang.String v) {
        for (TraceableSubtypesEnum c: TraceableSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}