package stdgui.data.model.orimodel;

@XmlType(name="TD-EVENT-BSW-INTERNAL-BEHAVIOR-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum TdEventBswInternalBehaviorTypeEnumSimple {

@XmlEnumValue("BSW-MODULE-ENTITY-ACTIVATED")
BSW_MODULE_ENTITY_ACTIVATED("BSW-MODULE-ENTITY-ACTIVATED"),

@XmlEnumValue("BSW-MODULE-ENTITY-STARTED")
BSW_MODULE_ENTITY_STARTED("BSW-MODULE-ENTITY-STARTED"),

@XmlEnumValue("BSW-MODULE-ENTITY-TERMINATED")
BSW_MODULE_ENTITY_TERMINATED("BSW-MODULE-ENTITY-TERMINATED");


    private final java.lang.String value;

    TdEventBswInternalBehaviorTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TdEventBswInternalBehaviorTypeEnumSimple fromValue(java.lang.String v) {
        for (TdEventBswInternalBehaviorTypeEnumSimple c: TdEventBswInternalBehaviorTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}