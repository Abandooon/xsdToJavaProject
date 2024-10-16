package stdgui.data.model.orimodel;
@XmlRootElement(name = "OPERATION-ARGUMENT-IN-COMPONENT-INSTANCE-REF")
public class OperationArgumentInComponentInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected BaseRef baseRef;
    
    
    
    protected ArrayList<ContextComponentRef> contextComponentRefs;
    
    
    
    protected ContextPortPrototypeRef contextPortPrototypeRef;
    
    
    
    protected ContextOperationRef contextOperationRef;
    
    
    
    protected RootArgumentDataPrototypeRef rootArgumentDataPrototypeRef;
    
    
    
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
    
    
    
    @XmlElement(name="BASE-REF")
    public BaseRef getBaseRef() {
    return this.baseRef;
}

    public void setBaseRef(BaseRef value) {
        this.baseRef = value;
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
    
    
    
    @XmlElement(name="CONTEXT-OPERATION-REF")
    public ContextOperationRef getContextOperationRef() {
    return this.contextOperationRef;
}

    public void setContextOperationRef(ContextOperationRef value) {
        this.contextOperationRef = value;
    }
    
    
    
    @XmlElement(name="ROOT-ARGUMENT-DATA-PROTOTYPE-REF")
    public RootArgumentDataPrototypeRef getRootArgumentDataPrototypeRef() {
    return this.rootArgumentDataPrototypeRef;
}

    public void setRootArgumentDataPrototypeRef(RootArgumentDataPrototypeRef value) {
        this.rootArgumentDataPrototypeRef = value;
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