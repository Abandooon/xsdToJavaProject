package stdgui.data.model.orimodel;
@XmlRootElement(name = "VARIABLE-IN-COMPONENT-INSTANCE-REF")
public class VariableInComponentInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<ContextComponentRef> contextComponentRefs;
    
    
    
    protected ContextPortPrototypeRef contextPortPrototypeRef;
    
    
    
    protected RootVariableDataPrototypeRef rootVariableDataPrototypeRef;
    
    
    
    protected ArrayList<ContextDataPrototypeRef> contextDataPrototypeRefs;
    
    
    
    protected TargetDataProtoypeRef targetDataProtoypeRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONTEXT-COMPONENT-REF")
    public ArrayList<ContextComponentRef> getContextComponentRefs() {
    return this.contextComponentRefs;
}

    public void setContextComponentRefs(ArrayList<ContextComponentRef> value) {
        this.contextComponentRefs = value;
    }
    
    
    
    @XmlElement(name="CONTEXT-PORT-PROTOTYPE-REF")
    public ContextPortPrototypeRef getContextPortPrototypeRef() {
    return this.contextPortPrototypeRef;
}

    public void setContextPortPrototypeRef(ContextPortPrototypeRef value) {
        this.contextPortPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="ROOT-VARIABLE-DATA-PROTOTYPE-REF")
    public RootVariableDataPrototypeRef getRootVariableDataPrototypeRef() {
    return this.rootVariableDataPrototypeRef;
}

    public void setRootVariableDataPrototypeRef(RootVariableDataPrototypeRef value) {
        this.rootVariableDataPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="CONTEXT-DATA-PROTOTYPE-REF")
    public ArrayList<ContextDataPrototypeRef> getContextDataPrototypeRefs() {
    return this.contextDataPrototypeRefs;
}

    public void setContextDataPrototypeRefs(ArrayList<ContextDataPrototypeRef> value) {
        this.contextDataPrototypeRefs = value;
    }
    
    
    
    @XmlElement(name="TARGET-DATA-PROTOYPE-REF")
    public TargetDataProtoypeRef getTargetDataProtoypeRef() {
    return this.targetDataProtoypeRef;
}

    public void setTargetDataProtoypeRef(TargetDataProtoypeRef value) {
        this.targetDataProtoypeRef = value;
    }
    
    
}