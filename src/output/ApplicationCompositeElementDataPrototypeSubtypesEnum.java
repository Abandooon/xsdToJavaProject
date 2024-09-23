package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE--SUBTYPES-ENUM")
@XmlEnum
public enum ApplicationCompositeElementDataPrototypeSubtypesEnum {

    
    @XmlEnumValue("APPLICATION-ARRAY-ELEMENT")
    APPLICATION_ARRAY_ELEMENT("APPLICATION-ARRAY-ELEMENT"),;
    
    @XmlEnumValue("APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE")
    APPLICATION_COMPOSITE_ELEMENT_DATA_PROTOTYPE("APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE"),;
    
    @XmlEnumValue("APPLICATION-RECORD-ELEMENT")
    APPLICATION_RECORD_ELEMENT("APPLICATION-RECORD-ELEMENT");
    

    private final java.lang.String value;

    ApplicationCompositeElementDataPrototypeSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ApplicationCompositeElementDataPrototypeSubtypesEnum fromValue(java.lang.String v) {
        for (ApplicationCompositeElementDataPrototypeSubtypesEnum c: ApplicationCompositeElementDataPrototypeSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}