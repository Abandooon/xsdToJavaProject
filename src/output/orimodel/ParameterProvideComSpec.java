package stdgui.data.model.orimodel;
@XmlRootElement(name = "PARAMETER-PROVIDE-COM-SPEC")
public class ParameterProvideComSpec {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected InitValue initValue;
    
    
    
    protected ParameterRef parameterRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="INIT-VALUE")
    public InitValue getInitValue() {
    return this.initValue;
}

    public void setInitValue(InitValue value) {
        this.initValue = value;
    }
    
    
    
    @XmlElement(name="PARAMETER-REF")
    public ParameterRef getParameterRef() {
    return this.parameterRef;
}

    public void setParameterRef(ParameterRef value) {
        this.parameterRef = value;
    }
    
    
}