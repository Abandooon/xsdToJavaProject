package stdgui.data.model.orimodel;
@XmlRootElement(name = "FRAME-MAPPING")
public class FrameMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected SourceFrameRef sourceFrameRef;
    
    
    
    protected TargetFrameRef targetFrameRef;
    
    
    
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
    
    
    
    @XmlElement(name="SOURCE-FRAME-REF")
    public SourceFrameRef getSourceFrameRef() {
    return this.sourceFrameRef;
}

    public void setSourceFrameRef(SourceFrameRef value) {
        this.sourceFrameRef = value;
    }
    
    
    
    @XmlElement(name="TARGET-FRAME-REF")
    public TargetFrameRef getTargetFrameRef() {
    return this.targetFrameRef;
}

    public void setTargetFrameRef(TargetFrameRef value) {
        this.targetFrameRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}