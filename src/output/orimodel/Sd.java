package stdgui.data.model.orimodel;
@XmlRootElement(name = "SD")
public class Sd {

    
    
    protected java.lang.String value;
    
    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String gid;
    
    
    
    

    
    
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
    
    
    
    @XmlAttribute(name="GID")
    public java.lang.String getGid() {
    return this.gid;
}

    public void setGid(java.lang.String value) {
        this.gid = value;
    }
    
    
    
    
}