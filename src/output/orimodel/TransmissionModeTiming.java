package stdgui.data.model.orimodel;
@XmlRootElement(name = "TRANSMISSION-MODE-TIMING")
public class TransmissionModeTiming {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CyclicTiming cyclicTiming;
    
    
    
    protected EventControlledTiming eventControlledTiming;
    
    

    
    
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
    
    
    
    @XmlElement(name="CYCLIC-TIMING")
    public CyclicTiming getCyclicTiming() {
    return this.cyclicTiming;
}

    public void setCyclicTiming(CyclicTiming value) {
        this.cyclicTiming = value;
    }
    
    
    
    @XmlElement(name="EVENT-CONTROLLED-TIMING")
    public EventControlledTiming getEventControlledTiming() {
    return this.eventControlledTiming;
}

    public void setEventControlledTiming(EventControlledTiming value) {
        this.eventControlledTiming = value;
    }
    
    
}