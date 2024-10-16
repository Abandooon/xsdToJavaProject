package stdgui.data.model.orimodel;
@XmlRootElement(name = "R-TRIGGER-IN-ATOMIC-SWC-INSTANCE-REF")
public class RTriggerInAtomicSwcInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ContextRPortRef contextRPortRef;
    
    
    
    protected TargetTriggerRef targetTriggerRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONTEXT-R-PORT-REF")
    public ContextRPortRef getContextRPortRef() {
    return this.contextRPortRef;
}

    public void setContextRPortRef(ContextRPortRef value) {
        this.contextRPortRef = value;
    }
    
    
    
    @XmlElement(name="TARGET-TRIGGER-REF")
    public TargetTriggerRef getTargetTriggerRef() {
    return this.targetTriggerRef;
}

    public void setTargetTriggerRef(TargetTriggerRef value) {
        this.targetTriggerRef = value;
    }
    
    
}