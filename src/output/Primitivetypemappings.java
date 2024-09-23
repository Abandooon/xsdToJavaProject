package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Primitivetypemappings {

    
    
    protected ArrayList<ClientServerPrimitiveTypeMapping> clientServerPrimitiveTypeMappings;
    
    

    
    
    @XmlElement(name="CLIENT-SERVER-PRIMITIVE-TYPE-MAPPING")
    public ArrayList<ClientServerPrimitiveTypeMapping> getClientServerPrimitiveTypeMappings() {
        return this.clientServerPrimitiveTypeMappings;
    }

    public void setClientServerPrimitiveTypeMappings(ArrayList<ClientServerPrimitiveTypeMapping> value) {
        this.clientServerPrimitiveTypeMappings = value;
    }
    
    
}