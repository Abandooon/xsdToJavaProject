package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Linmastervariants {

    
    
    protected ArrayList<LinMasterConditional> linMasterConditionals;
    
    

    
    
    @XmlElement(name="LIN-MASTER-CONDITIONAL")
    public ArrayList<LinMasterConditional> getLinMasterConditionals() {
        return this.linMasterConditionals;
    }

    public void setLinMasterConditionals(ArrayList<LinMasterConditional> value) {
        this.linMasterConditionals = value;
    }
    
    
}