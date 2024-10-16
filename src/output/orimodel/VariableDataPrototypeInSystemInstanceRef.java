package stdgui.data.model.orimodel;
@XmlRootElement(name = "VARIABLE-DATA-PROTOTYPE-IN-SYSTEM-INSTANCE-REF")
public class VariableDataPrototypeInSystemInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<ContextComponentRef> contextComponentRefs;
    
    
    
    protected ContextCompositionRef contextCompositionRef;
    
    
    
    protected ContextPortRef contextPortRef;
    
    
    
    protected TargetDataPrototypeRef_VariableDataPrototypeInSystemInstanceRef targetDataPrototypeRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONTEXT-COMPOSITION-REF")
    public ContextCompositionRef getContextCompositionRef() {
    return this.contextCompositionRef;
}

    public void setContextCompositionRef(ContextCompositionRef value) {
        this.contextCompositionRef = value;
    }
    
    
    
    @XmlElement(name="CONTEXT-PORT-REF")
    public ContextPortRef getContextPortRef() {
    return this.contextPortRef;
}

    public void setContextPortRef(ContextPortRef value) {
        this.contextPortRef = value;
    }
    
    
    
    @XmlElement(name="TARGET-DATA-PROTOTYPE-REF")
    public TargetDataPrototypeRef_VariableDataPrototypeInSystemInstanceRef getTargetDataPrototypeRef() {
    return this.targetDataPrototypeRef;
}

    public void setTargetDataPrototypeRef(TargetDataPrototypeRef_VariableDataPrototypeInSystemInstanceRef value) {
        this.targetDataPrototypeRef = value;
    }
    
    
}