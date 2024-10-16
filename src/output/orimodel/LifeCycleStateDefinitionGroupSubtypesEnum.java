package stdgui.data.model.orimodel;

@XmlType(name="LIFE-CYCLE-STATE-DEFINITION-GROUP--SUBTYPES-ENUM")
@XmlEnum
public enum LifeCycleStateDefinitionGroupSubtypesEnum {

@XmlEnumValue("LIFE-CYCLE-STATE-DEFINITION-GROUP")
LIFE_CYCLE_STATE_DEFINITION_GROUP("LIFE-CYCLE-STATE-DEFINITION-GROUP");


    private final java.lang.String value;

    LifeCycleStateDefinitionGroupSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static LifeCycleStateDefinitionGroupSubtypesEnum fromValue(java.lang.String v) {
        for (LifeCycleStateDefinitionGroupSubtypesEnum c: LifeCycleStateDefinitionGroupSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}