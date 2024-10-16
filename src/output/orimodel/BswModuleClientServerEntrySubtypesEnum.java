package stdgui.data.model.orimodel;

@XmlType(name="BSW-MODULE-CLIENT-SERVER-ENTRY--SUBTYPES-ENUM")
@XmlEnum
public enum BswModuleClientServerEntrySubtypesEnum {

@XmlEnumValue("BSW-MODULE-CLIENT-SERVER-ENTRY")
BSW_MODULE_CLIENT_SERVER_ENTRY("BSW-MODULE-CLIENT-SERVER-ENTRY");


    private final java.lang.String value;

    BswModuleClientServerEntrySubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BswModuleClientServerEntrySubtypesEnum fromValue(java.lang.String v) {
        for (BswModuleClientServerEntrySubtypesEnum c: BswModuleClientServerEntrySubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}