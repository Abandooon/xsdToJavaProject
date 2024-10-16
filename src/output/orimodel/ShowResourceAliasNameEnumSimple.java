package stdgui.data.model.orimodel;

@XmlType(name="SHOW-RESOURCE-ALIAS-NAME-ENUM--SIMPLE")
@XmlEnum
public enum ShowResourceAliasNameEnumSimple {

@XmlEnumValue("NO-SHOW-ALIAS-NAME")
NO_SHOW_ALIAS_NAME("NO-SHOW-ALIAS-NAME"),

@XmlEnumValue("SHOW-ALIAS-NAME")
SHOW_ALIAS_NAME("SHOW-ALIAS-NAME");


    private final java.lang.String value;

    ShowResourceAliasNameEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ShowResourceAliasNameEnumSimple fromValue(java.lang.String v) {
        for (ShowResourceAliasNameEnumSimple c: ShowResourceAliasNameEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}