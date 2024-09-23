package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Operationmappings {

    
    
    protected ArrayList<ClientServerOperationMapping> clientServerOperationMappings;
    
    

    
    
    @XmlElement(name="CLIENT-SERVER-OPERATION-MAPPING")
    public ArrayList<ClientServerOperationMapping> getClientServerOperationMappings() {
        return this.clientServerOperationMappings;
    }

    public void setClientServerOperationMappings(ArrayList<ClientServerOperationMapping> value) {
        this.clientServerOperationMappings = value;
    }
    
    
}