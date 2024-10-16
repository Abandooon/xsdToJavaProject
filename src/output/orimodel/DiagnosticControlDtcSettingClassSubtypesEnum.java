package stdgui.data.model.orimodel;

@XmlType(name="DIAGNOSTIC-CONTROL-DTC-SETTING-CLASS--SUBTYPES-ENUM")
@XmlEnum
public enum DiagnosticControlDtcSettingClassSubtypesEnum {

@XmlEnumValue("DIAGNOSTIC-CONTROL-DTC-SETTING-CLASS")
DIAGNOSTIC_CONTROL_DTC_SETTING_CLASS("DIAGNOSTIC-CONTROL-DTC-SETTING-CLASS");


    private final java.lang.String value;

    DiagnosticControlDtcSettingClassSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DiagnosticControlDtcSettingClassSubtypesEnum fromValue(java.lang.String v) {
        for (DiagnosticControlDtcSettingClassSubtypesEnum c: DiagnosticControlDtcSettingClassSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}