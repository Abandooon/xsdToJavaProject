package stdgui.data.model.orimodel;

@XmlType(name="BSW-SCHEDULER-NAME-PREFIX--SUBTYPES-ENUM")
@XmlEnum
public enum BswSchedulerNamePrefixSubtypesEnum {

@XmlEnumValue("BSW-SCHEDULER-NAME-PREFIX")
BSW_SCHEDULER_NAME_PREFIX("BSW-SCHEDULER-NAME-PREFIX");


    private final java.lang.String value;

    BswSchedulerNamePrefixSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BswSchedulerNamePrefixSubtypesEnum fromValue(java.lang.String v) {
        for (BswSchedulerNamePrefixSubtypesEnum c: BswSchedulerNamePrefixSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}