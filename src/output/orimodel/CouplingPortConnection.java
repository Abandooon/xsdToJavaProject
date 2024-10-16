package stdgui.data.model.orimodel;
@XmlRootElement(name = "COUPLING-PORT-CONNECTION")
public class CouplingPortConnection {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected FirstPortRef firstPortRef;
    
    
    
    protected SecondPortRef secondPortRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="FIRST-PORT-REF")
    public FirstPortRef getFirstPortRef() {
    return this.firstPortRef;
}

    public void setFirstPortRef(FirstPortRef value) {
        this.firstPortRef = value;
    }
    
    
    
    @XmlElement(name="SECOND-PORT-REF")
    public SecondPortRef getSecondPortRef() {
    return this.secondPortRef;
}

    public void setSecondPortRef(SecondPortRef value) {
        this.secondPortRef = value;
    }
    
    
}