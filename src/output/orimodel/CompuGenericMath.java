package stdgui.data.model.orimodel;
@XmlRootElement(name = "COMPU-GENERIC-MATH")
public class CompuGenericMath {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String level;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="LEVEL")
    public java.lang.String getLevel() {
    return this.level;
}

    public void setLevel(java.lang.String value) {
        this.level = value;
    }
    
    
}