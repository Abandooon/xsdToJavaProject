package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Linslavevariants {

    
    
    protected ArrayList<LinSlaveConditional> linSlaveConditionals;
    
    

    
    
    @XmlElement(name="LIN-SLAVE-CONDITIONAL")
    public ArrayList<LinSlaveConditional> getLinSlaveConditionals() {
        return this.linSlaveConditionals;
    }

    public void setLinSlaveConditionals(ArrayList<LinSlaveConditional> value) {
        this.linSlaveConditionals = value;
    }
    
    
}