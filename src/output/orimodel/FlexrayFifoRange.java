package stdgui.data.model.orimodel;
@XmlRootElement(name = "FLEXRAY-FIFO-RANGE")
public class FlexrayFifoRange {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Integer rangeMax;
    
    
    
    protected Integer rangeMin;
    
    

    
    
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
    
    
    
    @XmlElement(name="RANGE-MAX")
    public Integer getRangeMax() {
    return this.rangeMax;
}

    public void setRangeMax(Integer value) {
        this.rangeMax = value;
    }
    
    
    
    @XmlElement(name="RANGE-MIN")
    public Integer getRangeMin() {
    return this.rangeMin;
}

    public void setRangeMin(Integer value) {
        this.rangeMin = value;
    }
    
    
}