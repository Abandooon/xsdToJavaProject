package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="DIAGNOSTIC-REQUEST-UPLOAD-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticRequestUploadClassSubtypesEnum {

    
    @XmlEnumValue("DIAGNOSTIC-REQUEST-UPLOAD-CLASS")
    DIAGNOSTIC_REQUEST_UPLOAD_CLASS("DIAGNOSTIC-REQUEST-UPLOAD-CLASS");
    

    private final java.lang.String value;

    DiagnosticRequestUploadClassSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticRequestUploadClassSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticRequestUploadClassSubtypesEnum c: DiagnosticRequestUploadClassSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}