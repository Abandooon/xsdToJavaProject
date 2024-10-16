package stdgui.data.model.orimodel;
@XmlRootElement(name = "MODE-REQUEST-TYPE-MAP")
public class ModeRequestTypeMap {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ImplementationDataTypeRef implementationDataTypeRef;
    
    
    
    protected ModeGroupRef_ModeRequestTypeMap modeGroupRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="IMPLEMENTATION-DATA-TYPE-REF")
    public ImplementationDataTypeRef getImplementationDataTypeRef() {
    return this.implementationDataTypeRef;
}

    public void setImplementationDataTypeRef(ImplementationDataTypeRef value) {
        this.implementationDataTypeRef = value;
    }
    
    
    
    @XmlElement(name="MODE-GROUP-REF")
    public ModeGroupRef_ModeRequestTypeMap getModeGroupRef() {
    return this.modeGroupRef;
}

    public void setModeGroupRef(ModeGroupRef_ModeRequestTypeMap value) {
        this.modeGroupRef = value;
    }
    
    
}