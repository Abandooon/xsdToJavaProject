package stdgui.data.model.orimodel;
@XmlRootElement(name = "R-MODE-IN-ATOMIC-SWC-INSTANCE-REF")
public class RModeInAtomicSwcInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ContextPortRef_RModeInAtomicSwcInstanceRef contextPortRef;
    
    
    
    protected ContextModeDeclarationGroupPrototypeRef contextModeDeclarationGroupPrototypeRef;
    
    
    
    protected TargetModeDeclarationRef targetModeDeclarationRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONTEXT-PORT-REF")
    public ContextPortRef_RModeInAtomicSwcInstanceRef getContextPortRef() {
    return this.contextPortRef;
}

    public void setContextPortRef(ContextPortRef_RModeInAtomicSwcInstanceRef value) {
        this.contextPortRef = value;
    }
    
    
    
    @XmlElement(name="CONTEXT-MODE-DECLARATION-GROUP-PROTOTYPE-REF")
    public ContextModeDeclarationGroupPrototypeRef getContextModeDeclarationGroupPrototypeRef() {
    return this.contextModeDeclarationGroupPrototypeRef;
}

    public void setContextModeDeclarationGroupPrototypeRef(ContextModeDeclarationGroupPrototypeRef value) {
        this.contextModeDeclarationGroupPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="TARGET-MODE-DECLARATION-REF")
    public TargetModeDeclarationRef getTargetModeDeclarationRef() {
    return this.targetModeDeclarationRef;
}

    public void setTargetModeDeclarationRef(TargetModeDeclarationRef value) {
        this.targetModeDeclarationRef = value;
    }
    
    
}