package stdgui.data.model.orimodel;

@XmlType(name="ECUC-CONFIGURATION-VARIANT-ENUM--SIMPLE")
@XmlEnum
public enum EcucConfigurationVariantEnumSimple {

@XmlEnumValue("PRECONFIGURED-CONFIGURATION")
PRECONFIGURED_CONFIGURATION("PRECONFIGURED-CONFIGURATION"),

@XmlEnumValue("RECOMMENDED-CONFIGURATION")
RECOMMENDED_CONFIGURATION("RECOMMENDED-CONFIGURATION"),

@XmlEnumValue("VARIANT-LINK-TIME")
VARIANT_LINK_TIME("VARIANT-LINK-TIME"),

@XmlEnumValue("VARIANT-POST-BUILD")
VARIANT_POST_BUILD("VARIANT-POST-BUILD"),

@XmlEnumValue("VARIANT-POST-BUILD-LOADABLE")
VARIANT_POST_BUILD_LOADABLE("VARIANT-POST-BUILD-LOADABLE"),

@XmlEnumValue("VARIANT-POST-BUILD-SELECTABLE")
VARIANT_POST_BUILD_SELECTABLE("VARIANT-POST-BUILD-SELECTABLE"),

@XmlEnumValue("VARIANT-PRE-COMPILE")
VARIANT_PRE_COMPILE("VARIANT-PRE-COMPILE");


    private final java.lang.String value;

    EcucConfigurationVariantEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EcucConfigurationVariantEnumSimple fromValue(java.lang.String v) {
        for (EcucConfigurationVariantEnumSimple c: EcucConfigurationVariantEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}