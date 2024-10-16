package stdgui.data.model.orimodel;
@XmlRootElement(name = "VARIABLE-DATA-PROTOTYPE-IN-COMPOSITION-INSTANCE-REF")
public class VariableDataPrototypeInCompositionInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<ContextSwComponentPrototypeRef> contextSwComponentPrototypeRefs;
    
    
    
    protected ContextPortPrototypeRef contextPortPrototypeRef;
    
    
    
    protected TargetVariableDataPrototypeRef targetVariableDataPrototypeRef;
    
    
    
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
    
    
    
    @XmlElement(name="CONTEXT-PORT-PROTOTYPE-REF")
    public ContextPortPrototypeRef getContextPortPrototypeRef() {
    return this.contextPortPrototypeRef;
}

    public void setContextPortPrototypeRef(ContextPortPrototypeRef value) {
        this.contextPortPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="TARGET-VARIABLE-DATA-PROTOTYPE-REF")
    public TargetVariableDataPrototypeRef getTargetVariableDataPrototypeRef() {
    return this.targetVariableDataPrototypeRef;
}

    public void setTargetVariableDataPrototypeRef(TargetVariableDataPrototypeRef value) {
        this.targetVariableDataPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}