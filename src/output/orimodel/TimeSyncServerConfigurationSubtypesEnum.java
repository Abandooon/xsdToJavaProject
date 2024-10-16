package stdgui.data.model.orimodel;

@XmlType(name="TIME-SYNC-SERVER-CONFIGURATION--SUBTYPES-ENUM")
@XmlEnum
public enum TimeSyncServerConfigurationSubtypesEnum {

@XmlEnumValue("TIME-SYNC-SERVER-CONFIGURATION")
TIME_SYNC_SERVER_CONFIGURATION("TIME-SYNC-SERVER-CONFIGURATION");


    private final java.lang.String value;

    TimeSyncServerConfigurationSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TimeSyncServerConfigurationSubtypesEnum fromValue(java.lang.String v) {
        for (TimeSyncServerConfigurationSubtypesEnum c: TimeSyncServerConfigurationSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}