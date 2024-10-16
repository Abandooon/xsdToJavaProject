package stdgui.data.model.orimodel;
@XmlRootElement(name = "SWC-SERVICE-DEPENDENCY-IN-COMPOSITION-INSTANCE-REF")
public class SwcServiceDependencyInCompositionInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected BaseRef_SwcServiceDependencyInCompositionInstanceRef baseRef;
    
    
    
    protected RootContextRef rootContextRef;
    
    
    
    protected ArrayList<ContextSwComponentPrototypeRef> contextSwComponentPrototypeRefs;
    
    
    
    protected TargetSwcServiceDependencyRef targetSwcServiceDependencyRef;
    
    

    
    
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
    public BaseRef_SwcServiceDependencyInCompositionInstanceRef getBaseRef() {
    return this.baseRef;
}

    public void setBaseRef(BaseRef_SwcServiceDependencyInCompositionInstanceRef value) {
        this.baseRef = value;
    }
    
    
    
    @XmlElement(name="ROOT-CONTEXT-REF")
    public RootContextRef getRootContextRef() {
    return this.rootContextRef;
}

    public void setRootContextRef(RootContextRef value) {
        this.rootContextRef = value;
    }
    
    
    
    @XmlElement(name="CONTEXT-SW-COMPONENT-PROTOTYPE-REF")
    public ArrayList<ContextSwComponentPrototypeRef> getContextSwComponentPrototypeRefs() {
    return this.contextSwComponentPrototypeRefs;
}

    public void setContextSwComponentPrototypeRefs(ArrayList<ContextSwComponentPrototypeRef> value) {
        this.contextSwComponentPrototypeRefs = value;
    }
    
    
    
    @XmlElement(name="TARGET-SWC-SERVICE-DEPENDENCY-REF")
    public TargetSwcServiceDependencyRef getTargetSwcServiceDependencyRef() {
    return this.targetSwcServiceDependencyRef;
}

    public void setTargetSwcServiceDependencyRef(TargetSwcServiceDependencyRef value) {
        this.targetSwcServiceDependencyRef = value;
    }
    
    
}