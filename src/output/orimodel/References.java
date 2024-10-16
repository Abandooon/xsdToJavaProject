package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class References {

    
    
    protected ArrayList<EcucChoiceReferenceDef> ecucChoiceReferenceDef;
    
    
    
    protected ArrayList<EcucForeignReferenceDef> ecucForeignReferenceDef;
    
    
    
    protected ArrayList<EcucInstanceReferenceDef> ecucInstanceReferenceDef;
    
    
    
    protected ArrayList<EcucReferenceDef> ecucReferenceDef;
    
    
    
    protected ArrayList<EcucSymbolicNameReferenceDef> ecucSymbolicNameReferenceDef;
    
    
    
    protected ArrayList<EcucUriReferenceDef> ecucUriReferenceDef;
    
    

    
    
    @XmlElement(name="ECUC-CHOICE-REFERENCE-DEF")
    public ArrayList<EcucChoiceReferenceDef> getEcucChoiceReferenceDef() {
    return this.ecucChoiceReferenceDef;
}

    public void setEcucChoiceReferenceDef(ArrayList<EcucChoiceReferenceDef> value) {
        this.ecucChoiceReferenceDef = value;
    }
    
    
    
    @XmlElement(name="ECUC-FOREIGN-REFERENCE-DEF")
    public ArrayList<EcucForeignReferenceDef> getEcucForeignReferenceDef() {
    return this.ecucForeignReferenceDef;
}

    public void setEcucForeignReferenceDef(ArrayList<EcucForeignReferenceDef> value) {
        this.ecucForeignReferenceDef = value;
    }
    
    
    
    @XmlElement(name="ECUC-INSTANCE-REFERENCE-DEF")
    public ArrayList<EcucInstanceReferenceDef> getEcucInstanceReferenceDef() {
    return this.ecucInstanceReferenceDef;
}

    public void setEcucInstanceReferenceDef(ArrayList<EcucInstanceReferenceDef> value) {
        this.ecucInstanceReferenceDef = value;
    }
    
    
    
    @XmlElement(name="ECUC-REFERENCE-DEF")
    public ArrayList<EcucReferenceDef> getEcucReferenceDef() {
    return this.ecucReferenceDef;
}

    public void setEcucReferenceDef(ArrayList<EcucReferenceDef> value) {
        this.ecucReferenceDef = value;
    }
    
    
    
    @XmlElement(name="ECUC-SYMBOLIC-NAME-REFERENCE-DEF")
    public ArrayList<EcucSymbolicNameReferenceDef> getEcucSymbolicNameReferenceDef() {
    return this.ecucSymbolicNameReferenceDef;
}

    public void setEcucSymbolicNameReferenceDef(ArrayList<EcucSymbolicNameReferenceDef> value) {
        this.ecucSymbolicNameReferenceDef = value;
    }
    
    
    
    @XmlElement(name="ECUC-URI-REFERENCE-DEF")
    public ArrayList<EcucUriReferenceDef> getEcucUriReferenceDef() {
    return this.ecucUriReferenceDef;
}

    public void setEcucUriReferenceDef(ArrayList<EcucUriReferenceDef> value) {
        this.ecucUriReferenceDef = value;
    }
    
    
}