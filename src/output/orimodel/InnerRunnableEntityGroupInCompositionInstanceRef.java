package stdgui.data.model.orimodel;
@XmlRootElement(name = "INNER-RUNNABLE-ENTITY-GROUP-IN-COMPOSITION-INSTANCE-REF")
public class InnerRunnableEntityGroupInCompositionInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<ContextSwComponentPrototypeRef> contextSwComponentPrototypeRefs;
    
    
    
    protected TargetRunnableEntityGroupRef targetRunnableEntityGroupRef;
    
    
    
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
    
    
    
    @XmlElement(name="TARGET-RUNNABLE-ENTITY-GROUP-REF")
    public TargetRunnableEntityGroupRef getTargetRunnableEntityGroupRef() {
    return this.targetRunnableEntityGroupRef;
}

    public void setTargetRunnableEntityGroupRef(TargetRunnableEntityGroupRef value) {
        this.targetRunnableEntityGroupRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}