package stdgui.data.model.orimodel;
@XmlRootElement(name = "R-OPERATION-IN-ATOMIC-SWC-INSTANCE-REF")
public class ROperationInAtomicSwcInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ContextRPortRef contextRPortRef;
    
    
    
    protected TargetRequiredOperationRef targetRequiredOperationRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="TARGET-REQUIRED-OPERATION-REF")
    public TargetRequiredOperationRef getTargetRequiredOperationRef() {
    return this.targetRequiredOperationRef;
}

    public void setTargetRequiredOperationRef(TargetRequiredOperationRef value) {
        this.targetRequiredOperationRef = value;
    }
    
    
}