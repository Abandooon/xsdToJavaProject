package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Isignalipdus {

    
    
    protected ArrayList<ISignalIPduRefConditional> iSignalIPduRefConditionals;
    
    

    
    
    @XmlElement(name="I-SIGNAL-I-PDU-REF-CONDITIONAL")
    public ArrayList<ISignalIPduRefConditional> getISignalIPduRefConditionals() {
        return this.iSignalIPduRefConditionals;
    }

    public void setISignalIPduRefConditionals(ArrayList<ISignalIPduRefConditional> value) {
        this.iSignalIPduRefConditionals = value;
    }
    
    
}