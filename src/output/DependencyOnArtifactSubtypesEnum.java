package com.example.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DEPENDENCY-ON-ARTIFACT--SUBTYPES-ENUM")
@XmlEnum
public enum DependencyOnArtifactSubtypesEnum {

    
    @XmlEnumValue("DEPENDENCY-ON-ARTIFACT")
    DEPENDENCY_ON_ARTIFACT("DEPENDENCY-ON-ARTIFACT");
    

    private final java.lang.String value;

    DependencyOnArtifactSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DependencyOnArtifactSubtypesEnum fromValue(java.lang.String v) {
        for (DependencyOnArtifactSubtypesEnum c: DependencyOnArtifactSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}