package stdgui.data.model.orimodel;
@XmlRootElement(name = "SWC-BSW-RUNNABLE-MAPPING")
public class SwcBswRunnableMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected BswEntityRef bswEntityRef;
    
    
    
    protected SwcRunnableRef swcRunnableRef;
    
    
    
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
    
    
    
    @XmlElement(name="BSW-ENTITY-REF")
    public BswEntityRef getBswEntityRef() {
    return this.bswEntityRef;
}

    public void setBswEntityRef(BswEntityRef value) {
        this.bswEntityRef = value;
    }
    
    
    
    @XmlElement(name="SWC-RUNNABLE-REF")
    public SwcRunnableRef getSwcRunnableRef() {
    return this.swcRunnableRef;
}

    public void setSwcRunnableRef(SwcRunnableRef value) {
        this.swcRunnableRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}