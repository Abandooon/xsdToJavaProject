package stdgui.data.model.orimodel;

@XmlType(name="RESUME-POSITION--SIMPLE")
@XmlEnum
public enum ResumePositionSimple {

@XmlEnumValue("CONTINUE-AT-IT-POSITION")
CONTINUE_AT_IT_POSITION("CONTINUE-AT-IT-POSITION"),

@XmlEnumValue("START-FROM-BEGINNING")
START_FROM_BEGINNING("START-FROM-BEGINNING");


    private final java.lang.String value;

    ResumePositionSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ResumePositionSimple fromValue(java.lang.String v) {
        for (ResumePositionSimple c: ResumePositionSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}