package stdgui.data.model.orimodel;
@XmlRootElement(name = "I-PDU-MAPPING")
public class IPduMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected PositiveInteger pdurTpChunkSize;
    
    
    
    protected SourceIPduRef sourceIPduRef;
    
    
    
    protected TargetIPduRef targetIPdu;
    
    
    
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
    
    
    
    @XmlElement(name="PDUR-TP-CHUNK-SIZE")
    public PositiveInteger getPdurTpChunkSize() {
    return this.pdurTpChunkSize;
}

    public void setPdurTpChunkSize(PositiveInteger value) {
        this.pdurTpChunkSize = value;
    }
    
    
    
    @XmlElement(name="SOURCE-I-PDU-REF")
    public SourceIPduRef getSourceIPduRef() {
    return this.sourceIPduRef;
}

    public void setSourceIPduRef(SourceIPduRef value) {
        this.sourceIPduRef = value;
    }
    
    
    
    @XmlElement(name="TARGET-I-PDU")
    public TargetIPduRef getTargetIPdu() {
    return this.targetIPdu;
}

    public void setTargetIPdu(TargetIPduRef value) {
        this.targetIPdu = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}