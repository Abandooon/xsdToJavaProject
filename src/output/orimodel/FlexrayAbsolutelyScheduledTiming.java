package stdgui.data.model.orimodel;
@XmlRootElement(name = "FLEXRAY-ABSOLUTELY-SCHEDULED-TIMING")
public class FlexrayAbsolutelyScheduledTiming {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CommunicationCycle communicationCycle;
    
    
    
    protected PositiveInteger slotId;
    
    

    
    
    @XmlAttribute(name="S")
    public java.lang.String getS() {
    return this.s;
}

    public void setS(java.lang.String value) {
        this.s = value;
    }
    
    
    
    @XmlAttribute(name="T")
    public java.lang.String getT() {
    return this.t;
}

    public void setT(java.lang.String value) {
        this.t = value;
    }
    
    
    
    @XmlElement(name="COMMUNICATION-CYCLE")
    public CommunicationCycle getCommunicationCycle() {
    return this.communicationCycle;
}

    public void setCommunicationCycle(CommunicationCycle value) {
        this.communicationCycle = value;
    }
    
    
    
    @XmlElement(name="SLOT-ID")
    public PositiveInteger getSlotId() {
    return this.slotId;
}

    public void setSlotId(PositiveInteger value) {
        this.slotId = value;
    }
    
    
}