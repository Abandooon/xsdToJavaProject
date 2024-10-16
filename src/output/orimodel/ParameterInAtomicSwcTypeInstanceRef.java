package stdgui.data.model.orimodel;
@XmlRootElement(name = "PARAMETER-IN-ATOMIC-SWC-TYPE-INSTANCE-REF")
public class ParameterInAtomicSwcTypeInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PortPrototypeRef portPrototypeRef;
    
    
    
    protected RootParameterDataPrototypeRef rootParameterDataPrototypeRef;
    
    
    
    protected ArrayList<ContextDataPrototypeRef> contextDataPrototypeRefs;
    
    
    
    protected TargetDataPrototypeRef_DataPrototypeInSystemInstanceRef targetDataPrototypeRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="PORT-PROTOTYPE-REF")
    public PortPrototypeRef getPortPrototypeRef() {
    return this.portPrototypeRef;
}

    public void setPortPrototypeRef(PortPrototypeRef value) {
        this.portPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="ROOT-PARAMETER-DATA-PROTOTYPE-REF")
    public RootParameterDataPrototypeRef getRootParameterDataPrototypeRef() {
    return this.rootParameterDataPrototypeRef;
}

    public void setRootParameterDataPrototypeRef(RootParameterDataPrototypeRef value) {
        this.rootParameterDataPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="CONTEXT-DATA-PROTOTYPE-REF")
    public ArrayList<ContextDataPrototypeRef> getContextDataPrototypeRefs() {
    return this.contextDataPrototypeRefs;
}

    public void setContextDataPrototypeRefs(ArrayList<ContextDataPrototypeRef> value) {
        this.contextDataPrototypeRefs = value;
    }
    
    
    
    @XmlElement(name="TARGET-DATA-PROTOTYPE-REF")
    public TargetDataPrototypeRef_DataPrototypeInSystemInstanceRef getTargetDataPrototypeRef() {
    return this.targetDataPrototypeRef;
}

    public void setTargetDataPrototypeRef(TargetDataPrototypeRef_DataPrototypeInSystemInstanceRef value) {
        this.targetDataPrototypeRef = value;
    }
    
    
}