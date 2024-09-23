package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Clientiddefinitionsetrefs {

    
    
    protected ArrayList<ClientIdDefinitionSetRef> clientIdDefinitionSetRefs;
    
    

    
    
    @XmlElement(name="CLIENT-ID-DEFINITION-SET-REF")
    public ArrayList<ClientIdDefinitionSetRef> getClientIdDefinitionSetRefs() {
        return this.clientIdDefinitionSetRefs;
    }

    public void setClientIdDefinitionSetRefs(ArrayList<ClientIdDefinitionSetRef> value) {
        this.clientIdDefinitionSetRefs = value;
    }
    
    
}