package stdgui.data.model.orimodel;

@XmlType(name="TD-EVENT-BSW-MODULE-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum TdEventBswModuleTypeEnumSimple {

@XmlEnumValue("BSW-M-ENTRY-CALL-RETURNED")
BSW_M_ENTRY_CALL_RETURNED("BSW-M-ENTRY-CALL-RETURNED"),

@XmlEnumValue("BSW-M-ENTRY-CALLED")
BSW_M_ENTRY_CALLED("BSW-M-ENTRY-CALLED");


    private final java.lang.String value;

    TdEventBswModuleTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TdEventBswModuleTypeEnumSimple fromValue(java.lang.String v) {
        for (TdEventBswModuleTypeEnumSimple c: TdEventBswModuleTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}