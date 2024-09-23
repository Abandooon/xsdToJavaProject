package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Datamappings {

    
    
    protected ArrayList<DataPrototypeMapping> dataPrototypeMappings;
    
    

    
    
    @XmlElement(name="DATA-PROTOTYPE-MAPPING")
    public ArrayList<DataPrototypeMapping> getDataPrototypeMappings() {
        return this.dataPrototypeMappings;
    }

    public void setDataPrototypeMappings(ArrayList<DataPrototypeMapping> value) {
        this.dataPrototypeMappings = value;
    }
    
    
}