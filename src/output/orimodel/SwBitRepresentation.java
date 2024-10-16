package stdgui.data.model.orimodel;
@XmlRootElement(name = "SW-BIT-REPRESENTATION")
public class SwBitRepresentation {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Integer bitPosition;
    
    
    
    protected Integer numberOfBits;
    
    

    
    
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
    
    
    
    @XmlElement(name="BIT-POSITION")
    public Integer getBitPosition() {
    return this.bitPosition;
}

    public void setBitPosition(Integer value) {
        this.bitPosition = value;
    }
    
    
    
    @XmlElement(name="NUMBER-OF-BITS")
    public Integer getNumberOfBits() {
    return this.numberOfBits;
}

    public void setNumberOfBits(Integer value) {
        this.numberOfBits = value;
    }
    
    
}