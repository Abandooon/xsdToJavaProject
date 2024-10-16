package stdgui.data.model.orimodel;
@XmlRootElement(name = "MODE-DECLARATION-GROUP-PROTOTYPE-MAPPING")
public class ModeDeclarationGroupPrototypeMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected FirstModeGroupRef firstModeGroupRef;
    
    
    
    protected ModeDeclarationMappingSetRef modeDeclarationMappingSetRef;
    
    
    
    protected SecondModeGroupRef secondModeGroupRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="FIRST-MODE-GROUP-REF")
    public FirstModeGroupRef getFirstModeGroupRef() {
    return this.firstModeGroupRef;
}

    public void setFirstModeGroupRef(FirstModeGroupRef value) {
        this.firstModeGroupRef = value;
    }
    
    
    
    @XmlElement(name="MODE-DECLARATION-MAPPING-SET-REF")
    public ModeDeclarationMappingSetRef getModeDeclarationMappingSetRef() {
    return this.modeDeclarationMappingSetRef;
}

    public void setModeDeclarationMappingSetRef(ModeDeclarationMappingSetRef value) {
        this.modeDeclarationMappingSetRef = value;
    }
    
    
    
    @XmlElement(name="SECOND-MODE-GROUP-REF")
    public SecondModeGroupRef getSecondModeGroupRef() {
    return this.secondModeGroupRef;
}

    public void setSecondModeGroupRef(SecondModeGroupRef value) {
        this.secondModeGroupRef = value;
    }
    
    
}