package stdgui.data.model.orimodel;

@XmlType(name="ECUC-MODULE-CONFIGURATION-VALUES--SUBTYPES-ENUM")
@XmlEnum
public enum EcucModuleConfigurationValuesSubtypesEnum {

@XmlEnumValue("ECUC-MODULE-CONFIGURATION-VALUES")
ECUC_MODULE_CONFIGURATION_VALUES("ECUC-MODULE-CONFIGURATION-VALUES");


    private final java.lang.String value;

    EcucModuleConfigurationValuesSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EcucModuleConfigurationValuesSubtypesEnum fromValue(java.lang.String v) {
        for (EcucModuleConfigurationValuesSubtypesEnum c: EcucModuleConfigurationValuesSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}