package stdgui.data.model.orimodel;

@XmlType(name="STORAGE-CONDITION-STATUS-ENUM--SIMPLE")
@XmlEnum
public enum StorageConditionStatusEnumSimple {

@XmlEnumValue("EVENT-STORAGE-DISABLED")
EVENT_STORAGE_DISABLED("EVENT-STORAGE-DISABLED"),

@XmlEnumValue("EVENT-STORAGE-ENABLED")
EVENT_STORAGE_ENABLED("EVENT-STORAGE-ENABLED");


    private final java.lang.String value;

    StorageConditionStatusEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static StorageConditionStatusEnumSimple fromValue(java.lang.String v) {
        for (StorageConditionStatusEnumSimple c: StorageConditionStatusEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}