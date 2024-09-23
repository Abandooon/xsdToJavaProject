package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Errormappings {

    
    
    protected ArrayList<ClientServerApplicationErrorMapping> clientServerApplicationErrorMappings;
    
    

    
    
    @XmlElement(name="CLIENT-SERVER-APPLICATION-ERROR-MAPPING")
    public ArrayList<ClientServerApplicationErrorMapping> getClientServerApplicationErrorMappings() {
        return this.clientServerApplicationErrorMappings;
    }

    public void setClientServerApplicationErrorMappings(ArrayList<ClientServerApplicationErrorMapping> value) {
        this.clientServerApplicationErrorMappings = value;
    }
    
    
}