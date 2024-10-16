package stdgui.data.model.orimodel;
@XmlRootElement(name = "ECUC-CONFIGURATION-CLASS-AFFECTION")
public class EcucConfigurationClassAffection {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<AffectedRef> affectedRefs;
    
    
    
    protected EcucAffectionEnum affectionKind;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="AFFECTED-REFS")
@XmlElement(name="AFFECTED-REF")
    public ArrayList<AffectedRef> getAffectedRefs() {
    return this.affectedRefs;
}

    public void setAffectedRefs(ArrayList<AffectedRef> value) {
        this.affectedRefs = value;
    }
    
    
    
    @XmlElement(name="AFFECTION-KIND")
    public EcucAffectionEnum getAffectionKind() {
    return this.affectionKind;
}

    public void setAffectionKind(EcucAffectionEnum value) {
        this.affectionKind = value;
    }
    
    
}