package stdgui.data.model.orimodel;

@XmlType(name="COUPLING-PORT-FIFO--SUBTYPES-ENUM")
@XmlEnum
public enum CouplingPortFifoSubtypesEnum {

@XmlEnumValue("COUPLING-PORT-FIFO")
COUPLING_PORT_FIFO("COUPLING-PORT-FIFO");


    private final java.lang.String value;

    CouplingPortFifoSubtypesEnum(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CouplingPortFifoSubtypesEnum fromValue(java.lang.String v) {
        for (CouplingPortFifoSubtypesEnum c: CouplingPortFifoSubtypesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}