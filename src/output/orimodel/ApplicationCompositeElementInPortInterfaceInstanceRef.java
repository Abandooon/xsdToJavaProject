package stdgui.data.model.orimodel;
@XmlRootElement(name = "APPLICATION-COMPOSITE-ELEMENT-IN-PORT-INTERFACE-INSTANCE-REF")
public class ApplicationCompositeElementInPortInterfaceInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected RootDataPrototypeRef rootDataPrototypeRef;
    
    
    
    protected ArrayList<ContextDataPrototypeRef> contextDataPrototypeRefs;
    
    
    
    protected TargetDataPrototypeRef targetDataPrototypeRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="ROOT-DATA-PROTOTYPE-REF")
    public RootDataPrototypeRef getRootDataPrototypeRef() {
    return this.rootDataPrototypeRef;
}

    public void setRootDataPrototypeRef(RootDataPrototypeRef value) {
        this.rootDataPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="CONTEXT-DATA-PROTOTYPE-REF")
    public ArrayList<ContextDataPrototypeRef> getContextDataPrototypeRefs() {
    return this.contextDataPrototypeRefs;
}

    public void setContextDataPrototypeRefs(ArrayList<ContextDataPrototypeRef> value) {
        this.contextDataPrototypeRefs = value;
    }
    
    
    
    @XmlElement(name="TARGET-DATA-PROTOTYPE-REF")
    public TargetDataPrototypeRef getTargetDataPrototypeRef() {
    return this.targetDataPrototypeRef;
}

    public void setTargetDataPrototypeRef(TargetDataPrototypeRef value) {
        this.targetDataPrototypeRef = value;
    }
    
    
}