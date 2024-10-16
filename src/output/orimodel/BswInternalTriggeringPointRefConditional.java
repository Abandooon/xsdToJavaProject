package stdgui.data.model.orimodel;
@XmlRootElement(name = "BSW-INTERNAL-TRIGGERING-POINT-REF-CONDITIONAL")
public class BswInternalTriggeringPointRefConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected BswInternalTriggeringPointRef bswInternalTriggeringPointRef;
    
    
    
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
    
    
    
    @XmlElement(name="BSW-INTERNAL-TRIGGERING-POINT-REF")
    public BswInternalTriggeringPointRef getBswInternalTriggeringPointRef() {
    return this.bswInternalTriggeringPointRef;
}

    public void setBswInternalTriggeringPointRef(BswInternalTriggeringPointRef value) {
        this.bswInternalTriggeringPointRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}