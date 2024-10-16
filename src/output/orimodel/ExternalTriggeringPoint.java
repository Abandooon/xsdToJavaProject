package stdgui.data.model.orimodel;
@XmlRootElement(name = "EXTERNAL-TRIGGERING-POINT")
public class ExternalTriggeringPoint {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ExternalTriggeringPointIdent ident;
    
    
    
    protected TriggerIref triggerIref;
    
    
    
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
    
    
    
    @XmlElement(name="IDENT")
    public ExternalTriggeringPointIdent getIdent() {
    return this.ident;
}

    public void setIdent(ExternalTriggeringPointIdent value) {
        this.ident = value;
    }
    
    
    
    @XmlElement(name="TRIGGER-IREF")
    public TriggerIref getTriggerIref() {
    return this.triggerIref;
}

    public void setTriggerIref(TriggerIref value) {
        this.triggerIref = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}