package stdgui.data.model.orimodel;
@XmlRootElement(name = "I-SIGNAL-TRIGGERING-REF-CONDITIONAL")
public class ISignalTriggeringRefConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ISignalTriggeringRef iSignalTriggeringRef;
    
    
    
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
    
    
    
    @XmlElement(name="I-SIGNAL-TRIGGERING-REF")
    public ISignalTriggeringRef getISignalTriggeringRef() {
    return this.iSignalTriggeringRef;
}

    public void setISignalTriggeringRef(ISignalTriggeringRef value) {
        this.iSignalTriggeringRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}