package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class References {

    
    
    protected ArrayList<EcucChoiceReferenceDef> ecucChoiceReferenceDefs;
    
    
    
    protected ArrayList<EcucForeignReferenceDef> ecucForeignReferenceDefs;
    
    
    
    protected ArrayList<EcucInstanceReferenceDef> ecucInstanceReferenceDefs;
    
    
    
    protected ArrayList<EcucReferenceDef> ecucReferenceDefs;
    
    
    
    protected ArrayList<EcucSymbolicNameReferenceDef> ecucSymbolicNameReferenceDefs;
    
    
    
    protected ArrayList<EcucUriReferenceDef> ecucUriReferenceDefs;
    
    

    
    
    @XmlElement(name="ECUC-CHOICE-REFERENCE-DEF")
    public ArrayList<EcucChoiceReferenceDef> getEcucChoiceReferenceDefs() {
        return this.ecucChoiceReferenceDefs;
    }

    public void setEcucChoiceReferenceDefs(ArrayList<EcucChoiceReferenceDef> value) {
        this.ecucChoiceReferenceDefs = value;
    }
    
    
    
    @XmlElement(name="ECUC-FOREIGN-REFERENCE-DEF")
    public ArrayList<EcucForeignReferenceDef> getEcucForeignReferenceDefs() {
        return this.ecucForeignReferenceDefs;
    }

    public void setEcucForeignReferenceDefs(ArrayList<EcucForeignReferenceDef> value) {
        this.ecucForeignReferenceDefs = value;
    }
    
    
    
    @XmlElement(name="ECUC-INSTANCE-REFERENCE-DEF")
    public ArrayList<EcucInstanceReferenceDef> getEcucInstanceReferenceDefs() {
        return this.ecucInstanceReferenceDefs;
    }

    public void setEcucInstanceReferenceDefs(ArrayList<EcucInstanceReferenceDef> value) {
        this.ecucInstanceReferenceDefs = value;
    }
    
    
    
    @XmlElement(name="ECUC-REFERENCE-DEF")
    public ArrayList<EcucReferenceDef> getEcucReferenceDefs() {
        return this.ecucReferenceDefs;
    }

    public void setEcucReferenceDefs(ArrayList<EcucReferenceDef> value) {
        this.ecucReferenceDefs = value;
    }
    
    
    
    @XmlElement(name="ECUC-SYMBOLIC-NAME-REFERENCE-DEF")
    public ArrayList<EcucSymbolicNameReferenceDef> getEcucSymbolicNameReferenceDefs() {
        return this.ecucSymbolicNameReferenceDefs;
    }

    public void setEcucSymbolicNameReferenceDefs(ArrayList<EcucSymbolicNameReferenceDef> value) {
        this.ecucSymbolicNameReferenceDefs = value;
    }
    
    
    
    @XmlElement(name="ECUC-URI-REFERENCE-DEF")
    public ArrayList<EcucUriReferenceDef> getEcucUriReferenceDefs() {
        return this.ecucUriReferenceDefs;
    }

    public void setEcucUriReferenceDefs(ArrayList<EcucUriReferenceDef> value) {
        this.ecucUriReferenceDefs = value;
    }
    
    
}