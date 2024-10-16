package stdgui.data.model.orimodel;

@XmlType(name="POST-BUILD-VARIANT-CRITERION--SUBTYPES-ENUM")
@XmlEnum
public enum PostBuildVariantCriterionSubtypesEnum {

@XmlEnumValue("POST-BUILD-VARIANT-CRITERION")
POST_BUILD_VARIANT_CRITERION("POST-BUILD-VARIANT-CRITERION");


    private final java.lang.String value;

    PostBuildVariantCriterionSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static PostBuildVariantCriterionSubtypesEnum fromValue(java.lang.String v) {
        for (PostBuildVariantCriterionSubtypesEnum c: PostBuildVariantCriterionSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}