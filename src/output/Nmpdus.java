package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Nmpdus {

    
    
    protected ArrayList<NmPduRefConditional> nmPduRefConditionals;
    
    

    
    
    @XmlElement(name="NM-PDU-REF-CONDITIONAL")
    public ArrayList<NmPduRefConditional> getNmPduRefConditionals() {
        return this.nmPduRefConditionals;
    }

    public void setNmPduRefConditionals(ArrayList<NmPduRefConditional> value) {
        this.nmPduRefConditionals = value;
    }
    
    
}