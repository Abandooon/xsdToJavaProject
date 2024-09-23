package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Tpaddresss {

    
    
    protected ArrayList<TpAddress> tpAddresss;
    
    

    
    
    @XmlElement(name="TP-ADDRESS")
    public ArrayList<TpAddress> getTpAddresss() {
        return this.tpAddresss;
    }

    public void setTpAddresss(ArrayList<TpAddress> value) {
        this.tpAddresss = value;
    }
    
    
}