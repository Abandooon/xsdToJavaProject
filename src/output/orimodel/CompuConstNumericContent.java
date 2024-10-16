package stdgui.data.model.orimodel;
@XmlRootElement(name = "COMPU-CONST-NUMERIC-CONTENT")
public class CompuConstNumericContent {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected NumericalValue v;
    
    

    
    
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
    
    
    
    @XmlElement(name="V")
    public NumericalValue getV() {
    return this.v;
}

    public void setV(NumericalValue value) {
        this.v = value;
    }
    
    
}