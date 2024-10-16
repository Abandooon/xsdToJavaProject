package stdgui.data.model.orimodel;

@XmlType(name="HANDLE-OUT-OF-RANGE-STATUS-ENUM--SIMPLE")
@XmlEnum
public enum HandleOutOfRangeStatusEnumSimple {

@XmlEnumValue("INDICATE")
INDICATE("INDICATE"),

@XmlEnumValue("SILENT")
SILENT("SILENT");


    private final java.lang.String value;

    HandleOutOfRangeStatusEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static HandleOutOfRangeStatusEnumSimple fromValue(java.lang.String v) {
        for (HandleOutOfRangeStatusEnumSimple c: HandleOutOfRangeStatusEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}