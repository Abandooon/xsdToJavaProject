package stdgui.data.model.orimodel;

@XmlType(name="COUPLING-PORT-STRUCTURAL-ELEMENT--SUBTYPES-ENUM")
@XmlEnum
public enum CouplingPortStructuralElementSubtypesEnum {

@XmlEnumValue("COUPLING-PORT-FIFO")
COUPLING_PORT_FIFO("COUPLING-PORT-FIFO"),

@XmlEnumValue("COUPLING-PORT-SCHEDULER")
COUPLING_PORT_SCHEDULER("COUPLING-PORT-SCHEDULER"),

@XmlEnumValue("COUPLING-PORT-SHAPER")
COUPLING_PORT_SHAPER("COUPLING-PORT-SHAPER"),

@XmlEnumValue("COUPLING-PORT-STRUCTURAL-ELEMENT")
COUPLING_PORT_STRUCTURAL_ELEMENT("COUPLING-PORT-STRUCTURAL-ELEMENT");


    private final java.lang.String value;

    CouplingPortStructuralElementSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CouplingPortStructuralElementSubtypesEnum fromValue(java.lang.String v) {
        for (CouplingPortStructuralElementSubtypesEnum c: CouplingPortStructuralElementSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}