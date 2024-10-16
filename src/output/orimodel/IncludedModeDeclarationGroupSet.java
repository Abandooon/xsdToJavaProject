package stdgui.data.model.orimodel;
@XmlRootElement(name = "INCLUDED-MODE-DECLARATION-GROUP-SET")
public class IncludedModeDeclarationGroupSet {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<ModeDeclarationGroupRef> modeDeclarationGroupRefs;
    
    
    
    protected Identifier prefix;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="MODE-DECLARATION-GROUP-REFS")
@XmlElement(name="MODE-DECLARATION-GROUP-REF")
    public ArrayList<ModeDeclarationGroupRef> getModeDeclarationGroupRefs() {
    return this.modeDeclarationGroupRefs;
}

    public void setModeDeclarationGroupRefs(ArrayList<ModeDeclarationGroupRef> value) {
        this.modeDeclarationGroupRefs = value;
    }
    
    
    
    @XmlElement(name="PREFIX")
    public Identifier getPrefix() {
    return this.prefix;
}

    public void setPrefix(Identifier value) {
        this.prefix = value;
    }
    
    
}