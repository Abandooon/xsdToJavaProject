package stdgui.data.model.orimodel;
@XmlRootElement(name = "PORT-DEFINED-ARGUMENT-VALUE")
public class PortDefinedArgumentValue {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Value value;
    
    
    
    protected ValueTypeTref valueTypeTref;
    
    

    
    
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
    
    
    
    @XmlElement(name="VALUE")
    public Value getValue() {
    return this.value;
}

    public void setValue(Value value) {
        this.value = value;
    }
    
    
    
    @XmlElement(name="VALUE-TYPE-TREF")
    public ValueTypeTref getValueTypeTref() {
    return this.valueTypeTref;
}

    public void setValueTypeTref(ValueTypeTref value) {
        this.valueTypeTref = value;
    }
    
    
}