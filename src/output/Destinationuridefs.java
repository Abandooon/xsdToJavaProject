package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Destinationuridefs {

    
    
    protected ArrayList<EcucDestinationUriDef> ecucDestinationUriDefs;
    
    

    
    
    @XmlElement(name="ECUC-DESTINATION-URI-DEF")
    public ArrayList<EcucDestinationUriDef> getEcucDestinationUriDefs() {
        return this.ecucDestinationUriDefs;
    }

    public void setEcucDestinationUriDefs(ArrayList<EcucDestinationUriDef> value) {
        this.ecucDestinationUriDefs = value;
    }
    
    
}