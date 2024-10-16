package stdgui.data.model.orimodel;
@XmlRootElement(name = "SDF")
public class Sdf {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String gid;
    
    
    
    protected NumericalValueVariationPoint value;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="GID")
    public java.lang.String getGid() {
    return this.gid;
}

    public void setGid(java.lang.String value) {
        this.gid = value;
    }
    
    
    
    @XmlElement(name="VALUE")
    public NumericalValueVariationPoint getValue() {
    return this.value;
}

    public void setValue(NumericalValueVariationPoint value) {
        this.value = value;
    }
    
    
}