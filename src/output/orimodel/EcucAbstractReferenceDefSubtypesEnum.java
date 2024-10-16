package stdgui.data.model.orimodel;

@XmlType(name="ECUC-ABSTRACT-REFERENCE-DEF--SUBTYPES-ENUM")
@XmlEnum
public enum EcucAbstractReferenceDefSubtypesEnum {

@XmlEnumValue("ECUC-ABSTRACT-REFERENCE-DEF")
ECUC_ABSTRACT_REFERENCE_DEF("ECUC-ABSTRACT-REFERENCE-DEF"),

@XmlEnumValue("ECUC-CHOICE-REFERENCE-DEF")
ECUC_CHOICE_REFERENCE_DEF("ECUC-CHOICE-REFERENCE-DEF"),

@XmlEnumValue("ECUC-FOREIGN-REFERENCE-DEF")
ECUC_FOREIGN_REFERENCE_DEF("ECUC-FOREIGN-REFERENCE-DEF"),

@XmlEnumValue("ECUC-INSTANCE-REFERENCE-DEF")
ECUC_INSTANCE_REFERENCE_DEF("ECUC-INSTANCE-REFERENCE-DEF"),

@XmlEnumValue("ECUC-REFERENCE-DEF")
ECUC_REFERENCE_DEF("ECUC-REFERENCE-DEF"),

@XmlEnumValue("ECUC-SYMBOLIC-NAME-REFERENCE-DEF")
ECUC_SYMBOLIC_NAME_REFERENCE_DEF("ECUC-SYMBOLIC-NAME-REFERENCE-DEF"),

@XmlEnumValue("ECUC-URI-REFERENCE-DEF")
ECUC_URI_REFERENCE_DEF("ECUC-URI-REFERENCE-DEF");


    private final java.lang.String value;

    EcucAbstractReferenceDefSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EcucAbstractReferenceDefSubtypesEnum fromValue(java.lang.String v) {
        for (EcucAbstractReferenceDefSubtypesEnum c: EcucAbstractReferenceDefSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}