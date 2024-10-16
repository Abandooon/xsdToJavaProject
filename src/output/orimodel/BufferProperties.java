package stdgui.data.model.orimodel;
@XmlRootElement(name = "BUFFER-PROPERTIES")
public class BufferProperties {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CompuScale bufferComputation;
    
    
    
    protected Integer headerLength;
    
    
    
    protected Boolean inPlace;
    
    

    
    
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
    
    
    
    @XmlElement(name="BUFFER-COMPUTATION")
    public CompuScale getBufferComputation() {
    return this.bufferComputation;
}

    public void setBufferComputation(CompuScale value) {
        this.bufferComputation = value;
    }
    
    
    
    @XmlElement(name="HEADER-LENGTH")
    public Integer getHeaderLength() {
    return this.headerLength;
}

    public void setHeaderLength(Integer value) {
        this.headerLength = value;
    }
    
    
    
    @XmlElement(name="IN-PLACE")
    public Boolean getInPlace() {
    return this.inPlace;
}

    public void setInPlace(Boolean value) {
        this.inPlace = value;
    }
    
    
}