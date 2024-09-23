package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Isignalrefs {

    
    
    protected ArrayList<ISignalRef> iSignalRefs;
    
    

    
    
    @XmlElement(name="I-SIGNAL-REF")
    public ArrayList<ISignalRef> getISignalRefs() {
        return this.iSignalRefs;
    }

    public void setISignalRefs(ArrayList<ISignalRef> value) {
        this.iSignalRefs = value;
    }
    
    
}