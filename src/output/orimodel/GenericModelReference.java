package stdgui.data.model.orimodel;
@XmlRootElement(name = "GENERIC-MODEL-REFERENCE")
public class GenericModelReference {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String base;
    
    
    
    protected java.lang.String dest;
    
    
    
    protected Ref ref;
    
    

    
    
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
    
    
    
    @XmlElement(name="REF")
    public Ref getRef() {
    return this.ref;
}

    public void setRef(Ref value) {
        this.ref = value;
    }
    
    
}