package stdgui.data.model.orimodel;
@XmlRootElement(name = "PORT-GROUP-IN-SYSTEM-INSTANCE-REF")
public class PortGroupInSystemInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ContextCompositionRef contextCompositionRef;
    
    
    
    protected ArrayList<ContextComponentRef> contextComponentRefs;
    
    
    
    protected TargetRef_InnerPortGroupInCompositionInstanceRef targetRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONTEXT-COMPOSITION-REF")
    public ContextCompositionRef getContextCompositionRef() {
    return this.contextCompositionRef;
}

    public void setContextCompositionRef(ContextCompositionRef value) {
        this.contextCompositionRef = value;
    }
    
    
    
    @XmlElement(name="CONTEXT-COMPONENT-REF")
    public ArrayList<ContextComponentRef> getContextComponentRefs() {
    return this.contextComponentRefs;
}

    public void setContextComponentRefs(ArrayList<ContextComponentRef> value) {
        this.contextComponentRefs = value;
    }
    
    
    
    @XmlElement(name="TARGET-REF")
    public TargetRef_InnerPortGroupInCompositionInstanceRef getTargetRef() {
    return this.targetRef;
}

    public void setTargetRef(TargetRef_InnerPortGroupInCompositionInstanceRef value) {
        this.targetRef = value;
    }
    
    
}