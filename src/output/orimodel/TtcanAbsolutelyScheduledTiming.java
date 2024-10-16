package stdgui.data.model.orimodel;
@XmlRootElement(name = "TTCAN-ABSOLUTELY-SCHEDULED-TIMING")
public class TtcanAbsolutelyScheduledTiming {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CommunicationCycle communicationCycle;
    
    
    
    protected Integer timeMark;
    
    
    
    protected TtcanTriggerType trigger;
    
    

    
    
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
    
    
    
    @XmlElement(name="TIME-MARK")
    public Integer getTimeMark() {
    return this.timeMark;
}

    public void setTimeMark(Integer value) {
        this.timeMark = value;
    }
    
    
    
    @XmlElement(name="TRIGGER")
    public TtcanTriggerType getTrigger() {
    return this.trigger;
}

    public void setTrigger(TtcanTriggerType value) {
        this.trigger = value;
    }
    
    
}