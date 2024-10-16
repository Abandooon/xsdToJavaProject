package stdgui.data.model.orimodel;
@XmlRootElement(name = "P-TRIGGER-IN-ATOMIC-SWC-TYPE-INSTANCE-REF")
public class PTriggerInAtomicSwcTypeInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ContextPPortRef contextPPortRef;
    
    
    
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
    
    
    
    @XmlElement(name="CONTEXT-P-PORT-REF")
    public ContextPPortRef getContextPPortRef() {
    return this.contextPPortRef;
}

    public void setContextPPortRef(ContextPPortRef value) {
        this.contextPPortRef = value;
    }
    
    
    
    @XmlElement(name="TARGET-TRIGGER-REF")
    public TargetTriggerRef getTargetTriggerRef() {
    return this.targetTriggerRef;
}

    public void setTargetTriggerRef(TargetTriggerRef value) {
        this.targetTriggerRef = value;
    }
    
    
}