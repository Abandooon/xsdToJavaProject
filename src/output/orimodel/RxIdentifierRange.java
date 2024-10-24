package stdgui.data.model.orimodel;
@XmlRootElement(name = "RX-IDENTIFIER-RANGE")
public class RxIdentifierRange {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PositiveInteger lowerCanId;
    
    
    
    protected PositiveInteger upperCanId;
    
    

    
    
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
    
    
    
    @XmlElement(name="LOWER-CAN-ID")
    public PositiveInteger getLowerCanId() {
    return this.lowerCanId;
}

    public void setLowerCanId(PositiveInteger value) {
        this.lowerCanId = value;
    }
    
    
    
    @XmlElement(name="UPPER-CAN-ID")
    public PositiveInteger getUpperCanId() {
    return this.upperCanId;
}

    public void setUpperCanId(PositiveInteger value) {
        this.upperCanId = value;
    }
    
    
}