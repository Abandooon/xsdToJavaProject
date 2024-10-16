package stdgui.data.model.orimodel;

@XmlType(name="POST-BUILD-VARIANT-CRITERION-VALUE-SET--SUBTYPES-ENUM")
@XmlEnum
public enum PostBuildVariantCriterionValueSetSubtypesEnum {

@XmlEnumValue("POST-BUILD-VARIANT-CRITERION-VALUE-SET")
POST_BUILD_VARIANT_CRITERION_VALUE_SET("POST-BUILD-VARIANT-CRITERION-VALUE-SET");


    private final java.lang.String value;

    PostBuildVariantCriterionValueSetSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static PostBuildVariantCriterionValueSetSubtypesEnum fromValue(java.lang.String v) {
        for (PostBuildVariantCriterionValueSetSubtypesEnum c: PostBuildVariantCriterionValueSetSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}