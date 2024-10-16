package stdgui.data.model.orimodel;
@XmlRootElement(name = "IMPLEMENTATION-ELEMENT-IN-PARAMETER-INSTANCE-REF")
public class ImplementationElementInParameterInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ContextRef contextRef;
    
    
    
    protected TargetRef_ImplementationElementInParameterInstanceRef targetRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONTEXT-REF")
    public ContextRef getContextRef() {
    return this.contextRef;
}

    public void setContextRef(ContextRef value) {
        this.contextRef = value;
    }
    
    
    
    @XmlElement(name="TARGET-REF")
    public TargetRef_ImplementationElementInParameterInstanceRef getTargetRef() {
    return this.targetRef;
}

    public void setTargetRef(TargetRef_ImplementationElementInParameterInstanceRef value) {
        this.targetRef = value;
    }
    
    
}