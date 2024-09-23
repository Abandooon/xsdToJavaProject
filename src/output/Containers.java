package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Containers {

    
    
    protected ArrayList<EcucChoiceContainerDef> ecucChoiceContainerDefs;
    
    
    
    protected ArrayList<EcucParamConfContainerDef> ecucParamConfContainerDefs;
    
    

    
    
    @XmlElement(name="ECUC-CHOICE-CONTAINER-DEF")
    public ArrayList<EcucChoiceContainerDef> getEcucChoiceContainerDefs() {
        return this.ecucChoiceContainerDefs;
    }

    public void setEcucChoiceContainerDefs(ArrayList<EcucChoiceContainerDef> value) {
        this.ecucChoiceContainerDefs = value;
    }
    
    
    
    @XmlElement(name="ECUC-PARAM-CONF-CONTAINER-DEF")
    public ArrayList<EcucParamConfContainerDef> getEcucParamConfContainerDefs() {
        return this.ecucParamConfContainerDefs;
    }

    public void setEcucParamConfContainerDefs(ArrayList<EcucParamConfContainerDef> value) {
        this.ecucParamConfContainerDefs = value;
    }
    
    
}