package stdgui.data.model.orimodel;
@XmlRootElement(name = "MODE-DRIVEN-TRANSMISSION-MODE-CONDITION")
public class ModeDrivenTransmissionModeCondition {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<ModeDeclarationRef> modeDeclarationRefs;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="MODE-DECLARATION-REFS")
@XmlElement(name="MODE-DECLARATION-REF")
    public ArrayList<ModeDeclarationRef> getModeDeclarationRefs() {
    return this.modeDeclarationRefs;
}

    public void setModeDeclarationRefs(ArrayList<ModeDeclarationRef> value) {
        this.modeDeclarationRefs = value;
    }
    
    
}