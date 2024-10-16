package stdgui.data.model.orimodel;
@XmlRootElement(name = "TIME-RANGE-TYPE")
public class TimeRangeType {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Tolerance tolerance;
    
    
    
    protected TimeValue value;
    
    

    
    
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
    
    
    
    @XmlElement(name="TOLERANCE")
    public Tolerance getTolerance() {
    return this.tolerance;
}

    public void setTolerance(Tolerance value) {
        this.tolerance = value;
    }
    
    
    
    @XmlElement(name="VALUE")
    public TimeValue getValue() {
    return this.value;
}

    public void setValue(TimeValue value) {
        this.value = value;
    }
    
    
}