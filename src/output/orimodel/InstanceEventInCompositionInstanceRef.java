package stdgui.data.model.orimodel;
@XmlRootElement(name = "INSTANCE-EVENT-IN-COMPOSITION-INSTANCE-REF")
public class InstanceEventInCompositionInstanceRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<ContextComponentPrototypeRef> contextComponentPrototypeRefs;
    
    
    
    protected TargetEventRef targetEventRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONTEXT-COMPONENT-PROTOTYPE-REF")
    public ArrayList<ContextComponentPrototypeRef> getContextComponentPrototypeRefs() {
    return this.contextComponentPrototypeRefs;
}

    public void setContextComponentPrototypeRefs(ArrayList<ContextComponentPrototypeRef> value) {
        this.contextComponentPrototypeRefs = value;
    }
    
    
    
    @XmlElement(name="TARGET-EVENT-REF")
    public TargetEventRef getTargetEventRef() {
    return this.targetEventRef;
}

    public void setTargetEventRef(TargetEventRef value) {
        this.targetEventRef = value;
    }
    
    
}