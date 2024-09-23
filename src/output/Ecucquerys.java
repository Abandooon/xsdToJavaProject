package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Ecucquerys {

    
    
    protected ArrayList<EcucQuery> ecucQuerys;
    
    

    
    
    @XmlElement(name="ECUC-QUERY")
    public ArrayList<EcucQuery> getEcucQuerys() {
        return this.ecucQuerys;
    }

    public void setEcucQuerys(ArrayList<EcucQuery> value) {
        this.ecucQuerys = value;
    }
    
    
}