package stdgui.data.model.orimodel;
@XmlRootElement(name = "INNER-DATA-PROTOTYPE-GROUP-IN-COMPOSITION-INSTANCE-REF")
public class InnerDataPrototypeGroupInCompositionInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<ContextSwComponentPrototypeRef> contextSwComponentPrototypeRefs;
    
    
    
    protected TargetDataPrototypeGroupRef targetDataPrototypeGroupRef;
    
    
    
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
    
    
    
    @XmlElement(name="CONTEXT-SW-COMPONENT-PROTOTYPE-REF")
    public ArrayList<ContextSwComponentPrototypeRef> getContextSwComponentPrototypeRefs() {
    return this.contextSwComponentPrototypeRefs;
}

    public void setContextSwComponentPrototypeRefs(ArrayList<ContextSwComponentPrototypeRef> value) {
        this.contextSwComponentPrototypeRefs = value;
    }
    
    
    
    @XmlElement(name="TARGET-DATA-PROTOTYPE-GROUP-REF")
    public TargetDataPrototypeGroupRef getTargetDataPrototypeGroupRef() {
    return this.targetDataPrototypeGroupRef;
}

    public void setTargetDataPrototypeGroupRef(TargetDataPrototypeGroupRef value) {
        this.targetDataPrototypeGroupRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}