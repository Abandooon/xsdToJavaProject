package stdgui.data.model.orimodel;

@XmlType(name="ETHERNET-PHYSICAL-LAYER-TYPE-ENUM--SIMPLE")
@XmlEnum
public enum EthernetPhysicalLayerTypeEnumSimple {

@XmlEnumValue("BASE-T")
BASE_T("BASE-T"),

@XmlEnumValue("BROAD-R-REACH")
BROAD_R_REACH("BROAD-R-REACH"),

@XmlEnumValue("RTPGE")
RTPGE("RTPGE"),

@XmlEnumValue("X-MII")
X_MII("X-MII"),

@XmlEnumValue("X-MMI")
X_MMI("X-MMI");


    private final java.lang.String value;

    EthernetPhysicalLayerTypeEnumSimple(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EthernetPhysicalLayerTypeEnumSimple fromValue(java.lang.String v) {
        for (EthernetPhysicalLayerTypeEnumSimple c: EthernetPhysicalLayerTypeEnumSimple.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}