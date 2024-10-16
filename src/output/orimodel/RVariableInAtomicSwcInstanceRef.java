package stdgui.data.model.orimodel;
@XmlRootElement(name = "R-VARIABLE-IN-ATOMIC-SWC-INSTANCE-REF")
public class RVariableInAtomicSwcInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ContextRPortRef contextRPortRef;
    
    
    
    protected TargetDataElementRef targetDataElementRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="TARGET-DATA-ELEMENT-REF")
    public TargetDataElementRef getTargetDataElementRef() {
    return this.targetDataElementRef;
}

    public void setTargetDataElementRef(TargetDataElementRef value) {
        this.targetDataElementRef = value;
    }
    
    
}