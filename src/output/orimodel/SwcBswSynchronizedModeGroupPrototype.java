package stdgui.data.model.orimodel;
@XmlRootElement(name = "SWC-BSW-SYNCHRONIZED-MODE-GROUP-PROTOTYPE")
public class SwcBswSynchronizedModeGroupPrototype {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected BswModeGroupRef bswModeGroupRef;
    
    
    
    protected PModeGroupInAtomicSwcInstanceRef swcModeGroupIref;
    
    
    
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
    
    
    
    @XmlElement(name="BSW-MODE-GROUP-REF")
    public BswModeGroupRef getBswModeGroupRef() {
    return this.bswModeGroupRef;
}

    public void setBswModeGroupRef(BswModeGroupRef value) {
        this.bswModeGroupRef = value;
    }
    
    
    
    @XmlElement(name="SWC-MODE-GROUP-IREF")
    public PModeGroupInAtomicSwcInstanceRef getSwcModeGroupIref() {
    return this.swcModeGroupIref;
}

    public void setSwcModeGroupIref(PModeGroupInAtomicSwcInstanceRef value) {
        this.swcModeGroupIref = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}