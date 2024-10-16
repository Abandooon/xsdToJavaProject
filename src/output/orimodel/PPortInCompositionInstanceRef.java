package stdgui.data.model.orimodel;
@XmlRootElement(name = "P-PORT-IN-COMPOSITION-INSTANCE-REF")
public class PPortInCompositionInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ContextComponentRef contextComponentRef;
    
    
    
    protected TargetPPortRef targetPPortRef;
    
    

    
    
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
    public ContextComponentRef getContextComponentRef() {
    return this.contextComponentRef;
}

    public void setContextComponentRef(ContextComponentRef value) {
        this.contextComponentRef = value;
    }
    
    
    
    @XmlElement(name="TARGET-P-PORT-REF")
    public TargetPPortRef getTargetPPortRef() {
    return this.targetPPortRef;
}

    public void setTargetPPortRef(TargetPPortRef value) {
        this.targetPPortRef = value;
    }
    
    
}