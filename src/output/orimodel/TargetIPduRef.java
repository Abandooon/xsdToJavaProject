package stdgui.data.model.orimodel;
@XmlRootElement(name = "TARGET-I-PDU-REF")
public class TargetIPduRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PduMappingDefaultValue defaultValue;
    
    
    
    protected TargetIPduRef targetIPduRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="DEFAULT-VALUE")
    public PduMappingDefaultValue getDefaultValue() {
    return this.defaultValue;
}

    public void setDefaultValue(PduMappingDefaultValue value) {
        this.defaultValue = value;
    }
    
    
    
    @XmlElement(name="TARGET-I-PDU-REF")
    public TargetIPduRef getTargetIPduRef() {
    return this.targetIPduRef;
}

    public void setTargetIPduRef(TargetIPduRef value) {
        this.targetIPduRef = value;
    }
    
    
}