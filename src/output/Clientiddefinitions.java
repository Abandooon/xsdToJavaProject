package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Clientiddefinitions {

    
    
    protected ArrayList<ClientIdDefinition> clientIdDefinitions;
    
    

    
    
    @XmlElement(name="CLIENT-ID-DEFINITION")
    public ArrayList<ClientIdDefinition> getClientIdDefinitions() {
        return this.clientIdDefinitions;
    }

    public void setClientIdDefinitions(ArrayList<ClientIdDefinition> value) {
        this.clientIdDefinitions = value;
    }
    
    
}