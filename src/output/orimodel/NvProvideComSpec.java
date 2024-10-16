package stdgui.data.model.orimodel;
@XmlRootElement(name = "NV-PROVIDE-COM-SPEC")
public class NvProvideComSpec {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected RamBlockInitValue ramBlockInitValue;
    
    
    
    protected RomBlockInitValue romBlockInitValue;
    
    
    
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
    
    
    
    @XmlElement(name="RAM-BLOCK-INIT-VALUE")
    public RamBlockInitValue getRamBlockInitValue() {
    return this.ramBlockInitValue;
}

    public void setRamBlockInitValue(RamBlockInitValue value) {
        this.ramBlockInitValue = value;
    }
    
    
    
    @XmlElement(name="ROM-BLOCK-INIT-VALUE")
    public RomBlockInitValue getRomBlockInitValue() {
    return this.romBlockInitValue;
}

    public void setRomBlockInitValue(RomBlockInitValue value) {
        this.romBlockInitValue = value;
    }
    
    
    
    @XmlElement(name="VARIABLE-REF")
    public VariableRef getVariableRef() {
    return this.variableRef;
}

    public void setVariableRef(VariableRef value) {
        this.variableRef = value;
    }
    
    
}