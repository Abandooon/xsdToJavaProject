package stdgui.data.model.orimodel;

@XmlType(name="END-TO-END-PROFILE-BEHAVIOR-ENUM--SIMPLE")
@XmlEnum
public enum EndToEndProfileBehaviorEnumSimple {

@XmlEnumValue("PRE--R-4--2")
PRE__R_4__2("PRE--R-4--2"),

@XmlEnumValue("R-4--2")
R_4__2("R-4--2");


    private final java.lang.String value;

    EndToEndProfileBehaviorEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EndToEndProfileBehaviorEnumSimple fromValue(java.lang.String v) {
        for (EndToEndProfileBehaviorEnumSimple c: EndToEndProfileBehaviorEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}