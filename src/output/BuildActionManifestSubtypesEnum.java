package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="BUILD-ACTION-MANIFEST--SUBTYPES-ENUM")
@XmlEnum
public enum BuildActionManifestSubtypesEnum {

    
    @XmlEnumValue("BUILD-ACTION-MANIFEST")
    BUILD_ACTION_MANIFEST("BUILD-ACTION-MANIFEST");
    

    private final java.lang.String value;

    BuildActionManifestSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BuildActionManifestSubtypesEnum fromValue(java.lang.String v) {
        for (BuildActionManifestSubtypesEnum c: BuildActionManifestSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}