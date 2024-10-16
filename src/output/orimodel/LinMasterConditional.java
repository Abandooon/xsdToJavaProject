package stdgui.data.model.orimodel;
@XmlRootElement(name = "LIN-MASTER-CONDITIONAL")
public class LinMasterConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Boolean wakeUpByControllerSupported;
    
    
    
    protected String protocolVersion;
    
    
    
    protected ArrayList<LinSlaveConfig> linSlaves;
    
    
    
    protected TimeValue timeBase;
    
    
    
    protected TimeValue timeBaseJitter;
    
    
    
    protected VariationPoint variationPoint;
    
    

    
    
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
    
    
    
    @XmlElement(name="WAKE-UP-BY-CONTROLLER-SUPPORTED")
    public Boolean getWakeUpByControllerSupported() {
    return this.wakeUpByControllerSupported;
}

    public void setWakeUpByControllerSupported(Boolean value) {
        this.wakeUpByControllerSupported = value;
    }
    
    
    
    @XmlElement(name="PROTOCOL-VERSION")
    public String getProtocolVersion() {
    return this.protocolVersion;
}

    public void setProtocolVersion(String value) {
        this.protocolVersion = value;
    }
    
    
    
    @XmlElementWrapper(name="LIN-SLAVES")
@XmlElement(name="LIN-SLAVE-CONFIG")
    public ArrayList<LinSlaveConfig> getLinSlaves() {
    return this.linSlaves;
}

    public void setLinSlaves(ArrayList<LinSlaveConfig> value) {
        this.linSlaves = value;
    }
    
    
    
    @XmlElement(name="TIME-BASE")
    public TimeValue getTimeBase() {
    return this.timeBase;
}

    public void setTimeBase(TimeValue value) {
        this.timeBase = value;
    }
    
    
    
    @XmlElement(name="TIME-BASE-JITTER")
    public TimeValue getTimeBaseJitter() {
    return this.timeBaseJitter;
}

    public void setTimeBaseJitter(TimeValue value) {
        this.timeBaseJitter = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}