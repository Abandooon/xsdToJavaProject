package stdgui.data.model.orimodel;
@XmlRootElement(name = "DYNAMIC-PART")
public class DynamicPart {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<SegmentPosition> segmentPositions;
    
    
    
    protected ArrayList<DynamicPartAlternative> dynamicPartAlternatives;
    
    
    
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
    
    
    
    @XmlElementWrapper(name="SEGMENT-POSITIONS")
@XmlElement(name="SEGMENT-POSITION")
    public ArrayList<SegmentPosition> getSegmentPositions() {
    return this.segmentPositions;
}

    public void setSegmentPositions(ArrayList<SegmentPosition> value) {
        this.segmentPositions = value;
    }
    
    
    
    @XmlElementWrapper(name="DYNAMIC-PART-ALTERNATIVES")
@XmlElement(name="DYNAMIC-PART-ALTERNATIVE")
    public ArrayList<DynamicPartAlternative> getDynamicPartAlternatives() {
    return this.dynamicPartAlternatives;
}

    public void setDynamicPartAlternatives(ArrayList<DynamicPartAlternative> value) {
        this.dynamicPartAlternatives = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}