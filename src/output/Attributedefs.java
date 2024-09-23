package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Attributedefs {

    
    
    protected ArrayList<FmAttributeDef> fmAttributeDefs;
    
    

    
    
    @XmlElement(name="FM-ATTRIBUTE-DEF")
    public ArrayList<FmAttributeDef> getFmAttributeDefs() {
        return this.fmAttributeDefs;
    }

    public void setFmAttributeDefs(ArrayList<FmAttributeDef> value) {
        this.fmAttributeDefs = value;
    }
    
    
}