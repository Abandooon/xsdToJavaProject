package stdgui.data.model.orimodel;
@XmlRootElement(name = "SIGNAL-I-PDU-COUNTER")
public class SignalIPduCounter {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Integer pduCounterSize;
    
    
    
    protected Integer pduCounterStartPosition;
    
    
    
    protected Integer pduCounterThreshold;
    
    
    
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
    
    
    
    @XmlElement(name="PDU-COUNTER-SIZE")
    public Integer getPduCounterSize() {
    return this.pduCounterSize;
}

    public void setPduCounterSize(Integer value) {
        this.pduCounterSize = value;
    }
    
    
    
    @XmlElement(name="PDU-COUNTER-START-POSITION")
    public Integer getPduCounterStartPosition() {
    return this.pduCounterStartPosition;
}

    public void setPduCounterStartPosition(Integer value) {
        this.pduCounterStartPosition = value;
    }
    
    
    
    @XmlElement(name="PDU-COUNTER-THRESHOLD")
    public Integer getPduCounterThreshold() {
    return this.pduCounterThreshold;
}

    public void setPduCounterThreshold(Integer value) {
        this.pduCounterThreshold = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}