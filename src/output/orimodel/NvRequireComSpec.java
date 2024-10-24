package stdgui.data.model.orimodel;
@XmlRootElement(name = "NV-REQUIRE-COM-SPEC")
public class NvRequireComSpec {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected InitValue initValue;
    
    
    
    protected VariableRef variableRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="VARIABLE-REF")
    public VariableRef getVariableRef() {
    return this.variableRef;
}

    public void setVariableRef(VariableRef value) {
        this.variableRef = value;
    }
    
    
}