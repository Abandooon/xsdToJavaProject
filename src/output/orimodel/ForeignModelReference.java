package stdgui.data.model.orimodel;
@XmlRootElement(name = "FOREIGN-MODEL-REFERENCE")
public class ForeignModelReference {

    
    
    protected java.lang.String value;
    
    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String base;
    
    
    
    protected java.lang.String dest;
    
    

    
    
    @XmlValue
    public java.lang.String getValue() {
    return this.value;
}

    public void setValue(java.lang.String value) {
        this.value = value;
    }
    
    
    
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
    
    
    
    @XmlAttribute(name="BASE")
    public java.lang.String getBase() {
    return this.base;
}

    public void setBase(java.lang.String value) {
        this.base = value;
    }
    
    
    
    @XmlAttribute(name="DEST")
    public java.lang.String getDest() {
    return this.dest;
}

    public void setDest(java.lang.String value) {
        this.dest = value;
    }
    
    
}