package stdgui.data.model.orimodel;
@XmlRootElement(name = "TP-PORT")
public class TpPort {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Boolean dynamicallyAssigned;
    
    
    
    protected PositiveInteger portNumber;
    
    

    
    
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
    
    
    
    @XmlElement(name="DYNAMICALLY-ASSIGNED")
    public Boolean getDynamicallyAssigned() {
    return this.dynamicallyAssigned;
}

    public void setDynamicallyAssigned(Boolean value) {
        this.dynamicallyAssigned = value;
    }
    
    
    
    @XmlElement(name="PORT-NUMBER")
    public PositiveInteger getPortNumber() {
    return this.portNumber;
}

    public void setPortNumber(PositiveInteger value) {
        this.portNumber = value;
    }
    
    
}