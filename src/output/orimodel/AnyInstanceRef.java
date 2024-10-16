package stdgui.data.model.orimodel;
@XmlRootElement(name = "ANY-INSTANCE-REF")
public class AnyInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<ContextElementRef> contextElementRefs;
    
    
    
    protected TargetRef targetRef;
    
    
    
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
    
    
    
    @XmlElement(name="CONTEXT-ELEMENT-REF")
    public ArrayList<ContextElementRef> getContextElementRefs() {
    return this.contextElementRefs;
}

    public void setContextElementRefs(ArrayList<ContextElementRef> value) {
        this.contextElementRefs = value;
    }
    
    
    
    @XmlElement(name="TARGET-REF")
    public TargetRef getTargetRef() {
    return this.targetRef;
}

    public void setTargetRef(TargetRef value) {
        this.targetRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}