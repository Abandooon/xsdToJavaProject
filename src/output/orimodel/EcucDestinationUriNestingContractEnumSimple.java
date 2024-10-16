package stdgui.data.model.orimodel;

@XmlType(name="ECUC-DESTINATION-URI-NESTING-CONTRACT-ENUM--SIMPLE")
@XmlEnum
public enum EcucDestinationUriNestingContractEnumSimple {

@XmlEnumValue("LEAF-OF-TARGET-CONTAINER")
LEAF_OF_TARGET_CONTAINER("LEAF-OF-TARGET-CONTAINER"),

@XmlEnumValue("TARGET-CONTAINER")
TARGET_CONTAINER("TARGET-CONTAINER"),

@XmlEnumValue("VERTEX-OF-TARGET-CONTAINER")
VERTEX_OF_TARGET_CONTAINER("VERTEX-OF-TARGET-CONTAINER");


    private final java.lang.String value;

    EcucDestinationUriNestingContractEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EcucDestinationUriNestingContractEnumSimple fromValue(java.lang.String v) {
        for (EcucDestinationUriNestingContractEnumSimple c: EcucDestinationUriNestingContractEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}