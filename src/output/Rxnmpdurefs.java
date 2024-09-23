package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Rxnmpdurefs {

    
    
    protected ArrayList<RxNmPduRef> rxNmPduRefs;
    
    

    
    
    @XmlElement(name="RX-NM-PDU-REF")
    public ArrayList<RxNmPduRef> getRxNmPduRefs() {
        return this.rxNmPduRefs;
    }

    public void setRxNmPduRefs(ArrayList<RxNmPduRef> value) {
        this.rxNmPduRefs = value;
    }
    
    
}