package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Tppgs {

    
    
    protected ArrayList<J1939TpPg> j1939TpPgs;
    
    

    
    
    @XmlElement(name="J-1939-TP-PG")
    public ArrayList<J1939TpPg> getJ1939TpPgs() {
        return this.j1939TpPgs;
    }

    public void setJ1939TpPgs(ArrayList<J1939TpPg> value) {
        this.j1939TpPgs = value;
    }
    
    
}