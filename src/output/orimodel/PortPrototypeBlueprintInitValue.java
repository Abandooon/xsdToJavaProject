package stdgui.data.model.orimodel;
@XmlRootElement(name = "PORT-PROTOTYPE-BLUEPRINT-INIT-VALUE")
public class PortPrototypeBlueprintInitValue {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DataPrototypeRef dataPrototypeRef;
    
    
    
    protected Value value;
    
    

    
    
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
    
    
    
    @XmlElement(name="DATA-PROTOTYPE-REF")
    public DataPrototypeRef getDataPrototypeRef() {
    return this.dataPrototypeRef;
}

    public void setDataPrototypeRef(DataPrototypeRef value) {
        this.dataPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="VALUE")
    public Value getValue() {
    return this.value;
}

    public void setValue(Value value) {
        this.value = value;
    }
    
    
}