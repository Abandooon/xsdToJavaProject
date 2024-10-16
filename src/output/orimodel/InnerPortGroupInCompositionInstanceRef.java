package stdgui.data.model.orimodel;
@XmlRootElement(name = "INNER-PORT-GROUP-IN-COMPOSITION-INSTANCE-REF")
public class InnerPortGroupInCompositionInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<ContextRef_InnerPortGroupInCompositionInstanceRef> contextRefs;
    
    
    
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
    
    
    
    @XmlElement(name="CONTEXT-REF")
    public ArrayList<ContextRef_InnerPortGroupInCompositionInstanceRef> getContextRefs() {
    return this.contextRefs;
}

    public void setContextRefs(ArrayList<ContextRef_InnerPortGroupInCompositionInstanceRef> value) {
        this.contextRefs = value;
    }
    
    
    
    @XmlElement(name="TARGET-REF")
    public TargetRef_InnerPortGroupInCompositionInstanceRef getTargetRef() {
    return this.targetRef;
}

    public void setTargetRef(TargetRef_InnerPortGroupInCompositionInstanceRef value) {
        this.targetRef = value;
    }
    
    
}