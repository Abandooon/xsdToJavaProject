package stdgui.data.model.orimodel;
@XmlRootElement(name = "ABSOLUTE-TOLERANCE")
public class AbsoluteTolerance {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected TimeValue absolute;
    
    

    
    
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
    
    
    
    @XmlElement(name="ABSOLUTE")
    public TimeValue getAbsolute() {
    return this.absolute;
}

    public void setAbsolute(TimeValue value) {
        this.absolute = value;
    }
    
    
}