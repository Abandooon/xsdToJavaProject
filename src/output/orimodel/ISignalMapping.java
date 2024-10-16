package stdgui.data.model.orimodel;
@XmlRootElement(name = "I-SIGNAL-MAPPING")
public class ISignalMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected SourceSignalRef sourceSignalRef;
    
    
    
    protected TargetSignalRef targetSignalRef;
    
    
    
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
    
    
    
    @XmlElement(name="INTRODUCTION")
    public DocumentationBlock getIntroduction() {
    return this.introduction;
}

    public void setIntroduction(DocumentationBlock value) {
        this.introduction = value;
    }
    
    
    
    @XmlElement(name="SOURCE-SIGNAL-REF")
    public SourceSignalRef getSourceSignalRef() {
    return this.sourceSignalRef;
}

    public void setSourceSignalRef(SourceSignalRef value) {
        this.sourceSignalRef = value;
    }
    
    
    
    @XmlElement(name="TARGET-SIGNAL-REF")
    public TargetSignalRef getTargetSignalRef() {
    return this.targetSignalRef;
}

    public void setTargetSignalRef(TargetSignalRef value) {
        this.targetSignalRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}