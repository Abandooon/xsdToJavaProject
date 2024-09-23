package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Isignalportrefs {

    
    
    protected ArrayList<ISignalPortRef> iSignalPortRefs;
    
    

    
    
    @XmlElement(name="I-SIGNAL-PORT-REF")
    public ArrayList<ISignalPortRef> getISignalPortRefs() {
        return this.iSignalPortRefs;
    }

    public void setISignalPortRefs(ArrayList<ISignalPortRef> value) {
        this.iSignalPortRefs = value;
    }
    
    
}