package stdgui.data.model.orimodel;
@XmlRootElement(name = "BSW-MODULE-ENTRY-REF-CONDITIONAL")
public class BswModuleEntryRefConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected BswModuleEntryRef bswModuleEntryRef;
    
    
    
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
    
    
    
    @XmlElement(name="BSW-MODULE-ENTRY-REF")
    public BswModuleEntryRef getBswModuleEntryRef() {
    return this.bswModuleEntryRef;
}

    public void setBswModuleEntryRef(BswModuleEntryRef value) {
        this.bswModuleEntryRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}