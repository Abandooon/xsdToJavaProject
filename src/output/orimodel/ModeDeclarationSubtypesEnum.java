package stdgui.data.model.orimodel;

@XmlType(name="MODE-DECLARATION--SUBTYPES-ENUM")
@XmlEnum
public enum ModeDeclarationSubtypesEnum {

@XmlEnumValue("MODE-DECLARATION")
MODE_DECLARATION("MODE-DECLARATION");


    private final java.lang.String value;

    ModeDeclarationSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ModeDeclarationSubtypesEnum fromValue(java.lang.String v) {
        for (ModeDeclarationSubtypesEnum c: ModeDeclarationSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}