package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Outerports {

    
    
    protected ArrayList<PortPrototypeRefConditional> portPrototypeRefConditionals;
    
    

    
    
    @XmlElement(name="PORT-PROTOTYPE-REF-CONDITIONAL")
    public ArrayList<PortPrototypeRefConditional> getPortPrototypeRefConditionals() {
        return this.portPrototypeRefConditionals;
    }

    public void setPortPrototypeRefConditionals(ArrayList<PortPrototypeRefConditional> value) {
        this.portPrototypeRefConditionals = value;
    }
    
    
}