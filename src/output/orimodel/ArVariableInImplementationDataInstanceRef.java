package stdgui.data.model.orimodel;
@XmlRootElement(name = "AR-VARIABLE-IN-IMPLEMENTATION-DATA-INSTANCE-REF")
public class ArVariableInImplementationDataInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected PortPrototypeRef portPrototypeRef;
    
    
    
    protected RootVariableDataPrototypeRef rootVariableDataPrototypeRef;
    
    
    
    protected ArrayList<ContextDataPrototypeRef_ArVariableInImplementationDataInstanceRef> contextDataPrototypeRefs;
    
    
    
    protected TargetDataPrototypeRef_ArVariableInImplementationDataInstanceRef targetDataPrototypeRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="ROOT-VARIABLE-DATA-PROTOTYPE-REF")
    public RootVariableDataPrototypeRef getRootVariableDataPrototypeRef() {
    return this.rootVariableDataPrototypeRef;
}

    public void setRootVariableDataPrototypeRef(RootVariableDataPrototypeRef value) {
        this.rootVariableDataPrototypeRef = value;
    }
    
    
    
    @XmlElementWrapper(name="CONTEXT-DATA-PROTOTYPE-REFS")
@XmlElement(name="CONTEXT-DATA-PROTOTYPE-REF")
    public ArrayList<ContextDataPrototypeRef_ArVariableInImplementationDataInstanceRef> getContextDataPrototypeRefs() {
    return this.contextDataPrototypeRefs;
}

    public void setContextDataPrototypeRefs(ArrayList<ContextDataPrototypeRef_ArVariableInImplementationDataInstanceRef> value) {
        this.contextDataPrototypeRefs = value;
    }
    
    
    
    @XmlElement(name="TARGET-DATA-PROTOTYPE-REF")
    public TargetDataPrototypeRef_ArVariableInImplementationDataInstanceRef getTargetDataPrototypeRef() {
    return this.targetDataPrototypeRef;
}

    public void setTargetDataPrototypeRef(TargetDataPrototypeRef_ArVariableInImplementationDataInstanceRef value) {
        this.targetDataPrototypeRef = value;
    }
    
    
}