package stdgui.data.model.orimodel;

@XmlType(name="MEMORY-SECTION-TYPE--SIMPLE")
@XmlEnum
public enum MemorySectionTypeSimple {

@XmlEnumValue("CALIBRATION-OFFLINE")
CALIBRATION_OFFLINE("CALIBRATION-OFFLINE"),

@XmlEnumValue("CALIBRATION-ONLINE")
CALIBRATION_ONLINE("CALIBRATION-ONLINE"),

@XmlEnumValue("CALIBRATION-VARIABLES")
CALIBRATION_VARIABLES("CALIBRATION-VARIABLES"),

@XmlEnumValue("CALPRM")
CALPRM("CALPRM"),

@XmlEnumValue("CODE")
CODE("CODE"),

@XmlEnumValue("CONFIG-DATA")
CONFIG_DATA("CONFIG-DATA"),

@XmlEnumValue("CONST")
CONST("CONST"),

@XmlEnumValue("EXCLUDE-FROM-FLASH")
EXCLUDE_FROM_FLASH("EXCLUDE-FROM-FLASH"),

@XmlEnumValue("USER-DEFINED")
USER_DEFINED("USER-DEFINED"),

@XmlEnumValue("VAR")
VAR("VAR"),

@XmlEnumValue("VAR-FAST")
VAR_FAST("VAR-FAST"),

@XmlEnumValue("VAR-NO-INIT")
VAR_NO_INIT("VAR-NO-INIT"),

@XmlEnumValue("VAR-POWER-ON-INIT")
VAR_POWER_ON_INIT("VAR-POWER-ON-INIT");


    private final java.lang.String value;

    MemorySectionTypeSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static MemorySectionTypeSimple fromValue(java.lang.String v) {
        for (MemorySectionTypeSimple c: MemorySectionTypeSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}