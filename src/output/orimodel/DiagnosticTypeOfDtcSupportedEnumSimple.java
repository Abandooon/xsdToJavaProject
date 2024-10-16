package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-TYPE-OF-DTC-SUPPORTED-ENUM--SIMPLE")
@XmlEnum
public enum DiagnosticTypeOfDtcSupportedEnumSimple {

@XmlEnumValue("ISO-11992--4")
ISO_11992__4("ISO-11992--4"),

@XmlEnumValue("ISO-14229--1")
ISO_14229__1("ISO-14229--1"),

@XmlEnumValue("ISO-15031--6")
ISO_15031__6("ISO-15031--6"),

@XmlEnumValue("SAE-J-1939--73")
SAE_J_1939__73("SAE-J-1939--73"),

@XmlEnumValue("SAE-J-2012--DA")
SAE_J_2012__DA("SAE-J-2012--DA");


    private final java.lang.String value;

    DiagnosticTypeOfDtcSupportedEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticTypeOfDtcSupportedEnumSimple fromValue(java.lang.String v) {
        for (DiagnosticTypeOfDtcSupportedEnumSimple c: DiagnosticTypeOfDtcSupportedEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}