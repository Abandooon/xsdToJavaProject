package stdgui.data.model.orimodel;
@XmlRootElement(name = "SEGMENT-POSITION")
public class SegmentPosition {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ByteOrderEnum segmentByteOrder;
    
    
    
    protected Integer segmentLength;
    
    
    
    protected Integer segmentPosition;
    
    

    
    
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
    
    
    
    @XmlElement(name="SEGMENT-BYTE-ORDER")
    public ByteOrderEnum getSegmentByteOrder() {
    return this.segmentByteOrder;
}

    public void setSegmentByteOrder(ByteOrderEnum value) {
        this.segmentByteOrder = value;
    }
    
    
    
    @XmlElement(name="SEGMENT-LENGTH")
    public Integer getSegmentLength() {
    return this.segmentLength;
}

    public void setSegmentLength(Integer value) {
        this.segmentLength = value;
    }
    
    
    
    @XmlElement(name="SEGMENT-POSITION")
    public Integer getSegmentPosition() {
    return this.segmentPosition;
}

    public void setSegmentPosition(Integer value) {
        this.segmentPosition = value;
    }
    
    
}