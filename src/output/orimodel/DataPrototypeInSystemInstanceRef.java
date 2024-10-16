package stdgui.data.model.orimodel;
@XmlRootElement(name = "DATA-PROTOTYPE-IN-SYSTEM-INSTANCE-REF")
public class DataPrototypeInSystemInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ContextRootCompositionRef contextRootCompositionRef;
    
    
    
    protected ArrayList<ContextComponentRef> contextComponentRefs;
    
    
    
    protected ContextPortRef contextPortRef;
    
    
    
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
    
    
    
    @XmlElement(name="CONTEXT-ROOT-COMPOSITION-REF")
    public ContextRootCompositionRef getContextRootCompositionRef() {
    return this.contextRootCompositionRef;
}

    public void setContextRootCompositionRef(ContextRootCompositionRef value) {
        this.contextRootCompositionRef = value;
    }
    
    
    
    @XmlElement(name="CONTEXT-COMPONENT-REF")
    public ArrayList<ContextComponentRef> getContextComponentRefs() {
    return this.contextComponentRefs;
}

    public void setContextComponentRefs(ArrayList<ContextComponentRef> value) {
        this.contextComponentRefs = value;
    }
    
    
    
    @XmlElement(name="CONTEXT-PORT-REF")
    public ContextPortRef getContextPortRef() {
    return this.contextPortRef;
}

    public void setContextPortRef(ContextPortRef value) {
        this.contextPortRef = value;
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