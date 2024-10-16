package stdgui.data.model.orimodel;

@XmlType(name="DATA-FILTER-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum DataFilterTypeEnumSimple {

@XmlEnumValue("ALWAYS")
ALWAYS("ALWAYS"),

@XmlEnumValue("MASKED-NEW-DIFFERS-MASKED-OLD")
MASKED_NEW_DIFFERS_MASKED_OLD("MASKED-NEW-DIFFERS-MASKED-OLD"),

@XmlEnumValue("MASKED-NEW-DIFFERS-X")
MASKED_NEW_DIFFERS_X("MASKED-NEW-DIFFERS-X"),

@XmlEnumValue("MASKED-NEW-EQUALS-X")
MASKED_NEW_EQUALS_X("MASKED-NEW-EQUALS-X"),

@XmlEnumValue("NEVER")
NEVER("NEVER"),

@XmlEnumValue("NEW-IS-OUTSIDE")
NEW_IS_OUTSIDE("NEW-IS-OUTSIDE"),

@XmlEnumValue("NEW-IS-WITHIN")
NEW_IS_WITHIN("NEW-IS-WITHIN"),

@XmlEnumValue("ONE-EVERY-N")
ONE_EVERY_N("ONE-EVERY-N");


    private final java.lang.String value;

    DataFilterTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DataFilterTypeEnumSimple fromValue(java.lang.String v) {
        for (DataFilterTypeEnumSimple c: DataFilterTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}