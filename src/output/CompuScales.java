package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Compuscales {

    
    
    protected ArrayList<CompuScale> compuScales;
    
    

    
    
    @XmlElement(name="COMPU-SCALE")
    public ArrayList<CompuScale> getCompuScales() {
        return this.compuScales;
    }

    public void setCompuScales(ArrayList<CompuScale> value) {
        this.compuScales = value;
    }
    
    
}