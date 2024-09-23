package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Tpsdurefs {

    
    
    protected ArrayList<TpSduRef> tpSduRefs;
    
    

    
    
    @XmlElement(name="TP-SDU-REF")
    public ArrayList<TpSduRef> getTpSduRefs() {
        return this.tpSduRefs;
    }

    public void setTpSduRefs(ArrayList<TpSduRef> value) {
        this.tpSduRefs = value;
    }
    
    
}