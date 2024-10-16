package stdgui.data.model.orimodel;
@XmlRootElement(name = "GENERIC-TP")
public class GenericTp {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected String tpAddress;
    
    
    
    protected String tpTechnology;
    
    

    
    
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
    
    
    
    @XmlElement(name="TP-ADDRESS")
    public String getTpAddress() {
    return this.tpAddress;
}

    public void setTpAddress(String value) {
        this.tpAddress = value;
    }
    
    
    
    @XmlElement(name="TP-TECHNOLOGY")
    public String getTpTechnology() {
    return this.tpTechnology;
}

    public void setTpTechnology(String value) {
        this.tpTechnology = value;
    }
    
    
}