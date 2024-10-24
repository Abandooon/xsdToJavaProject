package stdgui.data.model.orimodel;
@XmlRootElement(name = "END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS-CONDITIONAL")
public class EndToEndTransformationISignalPropsConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CsTransformerErrorReactionEnum csErrorReaction;
    
    
    
    protected TransformerRef transformerRef;
    
    
    
    protected ArrayList<PositiveInteger> dataIds;
    
    
    
    protected PositiveInteger dataLength;
    
    
    
    protected PositiveInteger maxDataLength;
    
    
    
    protected PositiveInteger minDataLength;
    
    
    
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
    
    
    
    @XmlElement(name="CS-ERROR-REACTION")
    public CsTransformerErrorReactionEnum getCsErrorReaction() {
    return this.csErrorReaction;
}

    public void setCsErrorReaction(CsTransformerErrorReactionEnum value) {
        this.csErrorReaction = value;
    }
    
    
    
    @XmlElement(name="TRANSFORMER-REF")
    public TransformerRef getTransformerRef() {
    return this.transformerRef;
}

    public void setTransformerRef(TransformerRef value) {
        this.transformerRef = value;
    }
    
    
    
    @XmlElementWrapper(name="DATA-IDS")
@XmlElement(name="DATA-ID")
    public ArrayList<PositiveInteger> getDataIds() {
    return this.dataIds;
}

    public void setDataIds(ArrayList<PositiveInteger> value) {
        this.dataIds = value;
    }
    
    
    
    @XmlElement(name="DATA-LENGTH")
    public PositiveInteger getDataLength() {
    return this.dataLength;
}

    public void setDataLength(PositiveInteger value) {
        this.dataLength = value;
    }
    
    
    
    @XmlElement(name="MAX-DATA-LENGTH")
    public PositiveInteger getMaxDataLength() {
    return this.maxDataLength;
}

    public void setMaxDataLength(PositiveInteger value) {
        this.maxDataLength = value;
    }
    
    
    
    @XmlElement(name="MIN-DATA-LENGTH")
    public PositiveInteger getMinDataLength() {
    return this.minDataLength;
}

    public void setMinDataLength(PositiveInteger value) {
        this.minDataLength = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}