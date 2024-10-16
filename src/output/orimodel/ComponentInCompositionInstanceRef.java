package stdgui.data.model.orimodel;
@XmlRootElement(name = "COMPONENT-IN-COMPOSITION-INSTANCE-REF")
public class ComponentInCompositionInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<ContextComponentRef> contextComponentRefs;
    
    
    
    protected TargetComponentRef targetComponentRef;
    
    

    
    
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
    public ArrayList<ContextComponentRef> getContextComponentRefs() {
    return this.contextComponentRefs;
}

    public void setContextComponentRefs(ArrayList<ContextComponentRef> value) {
        this.contextComponentRefs = value;
    }
    
    
    
    @XmlElement(name="TARGET-COMPONENT-REF")
    public TargetComponentRef getTargetComponentRef() {
    return this.targetComponentRef;
}

    public void setTargetComponentRef(TargetComponentRef value) {
        this.targetComponentRef = value;
    }
    
    
}