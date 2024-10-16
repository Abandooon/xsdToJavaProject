package stdgui.data.model.orimodel;
@XmlRootElement(name = "SWC-BSW-SYNCHRONIZED-TRIGGER")
public class SwcBswSynchronizedTrigger {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected BswTriggerRef bswTriggerRef;
    
    
    
    protected PTriggerInAtomicSwcTypeInstanceRef swcTriggerIref;
    
    
    
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
    
    
    
    @XmlElement(name="BSW-TRIGGER-REF")
    public BswTriggerRef getBswTriggerRef() {
    return this.bswTriggerRef;
}

    public void setBswTriggerRef(BswTriggerRef value) {
        this.bswTriggerRef = value;
    }
    
    
    
    @XmlElement(name="SWC-TRIGGER-IREF")
    public PTriggerInAtomicSwcTypeInstanceRef getSwcTriggerIref() {
    return this.swcTriggerIref;
}

    public void setSwcTriggerIref(PTriggerInAtomicSwcTypeInstanceRef value) {
        this.swcTriggerIref = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}