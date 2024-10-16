package stdgui.data.model.orimodel;

@XmlType(name="EXCLUSIVE-AREA-NESTING-ORDER--SUBTYPES-ENUM")
@XmlEnum
public enum ExclusiveAreaNestingOrderSubtypesEnum {

@XmlEnumValue("EXCLUSIVE-AREA-NESTING-ORDER")
EXCLUSIVE_AREA_NESTING_ORDER("EXCLUSIVE-AREA-NESTING-ORDER");


    private final java.lang.String value;

    ExclusiveAreaNestingOrderSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ExclusiveAreaNestingOrderSubtypesEnum fromValue(java.lang.String v) {
        for (ExclusiveAreaNestingOrderSubtypesEnum c: ExclusiveAreaNestingOrderSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}