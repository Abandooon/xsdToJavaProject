package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Portargvalues {

    
    
    protected ArrayList<PortDefinedArgumentValue> portDefinedArgumentValues;
    
    

    
    
    @XmlElement(name="PORT-DEFINED-ARGUMENT-VALUE")
    public ArrayList<PortDefinedArgumentValue> getPortDefinedArgumentValues() {
        return this.portDefinedArgumentValues;
    }

    public void setPortDefinedArgumentValues(ArrayList<PortDefinedArgumentValue> value) {
        this.portDefinedArgumentValues = value;
    }
    
    
}