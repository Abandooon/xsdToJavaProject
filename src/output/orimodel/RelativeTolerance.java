package stdgui.data.model.orimodel;
@XmlRootElement(name = "RELATIVE-TOLERANCE")
public class RelativeTolerance {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Integer relative;
    
    

    
    
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
    
    
    
    @XmlElement(name="RELATIVE")
    public Integer getRelative() {
    return this.relative;
}

    public void setRelative(Integer value) {
        this.relative = value;
    }
    
    
}