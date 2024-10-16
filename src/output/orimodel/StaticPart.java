package stdgui.data.model.orimodel;
@XmlRootElement(name = "STATIC-PART")
public class StaticPart {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<SegmentPosition> segmentPositions;
    
    
    
    protected IPduRef iPduRef;
    
    
    
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
    
    
    
    @XmlElement(name="I-PDU-REF")
    public IPduRef getIPduRef() {
    return this.iPduRef;
}

    public void setIPduRef(IPduRef value) {
        this.iPduRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}