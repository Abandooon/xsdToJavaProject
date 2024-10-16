package stdgui.data.model.orimodel;
@XmlRootElement(name = "MODE-ERROR-BEHAVIOR")
public class ModeErrorBehavior {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DefaultModeRef defaultModeRef;
    
    
    
    protected ModeErrorReactionPolicyEnum errorReactionPolicy;
    
    

    
    
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
    
    
    
    @XmlElement(name="DEFAULT-MODE-REF")
    public DefaultModeRef getDefaultModeRef() {
    return this.defaultModeRef;
}

    public void setDefaultModeRef(DefaultModeRef value) {
        this.defaultModeRef = value;
    }
    
    
    
    @XmlElement(name="ERROR-REACTION-POLICY")
    public ModeErrorReactionPolicyEnum getErrorReactionPolicy() {
    return this.errorReactionPolicy;
}

    public void setErrorReactionPolicy(ModeErrorReactionPolicyEnum value) {
        this.errorReactionPolicy = value;
    }
    
    
}