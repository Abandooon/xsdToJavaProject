package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Linunconditionalframerefs {

    
    
    protected ArrayList<LinUnconditionalFrameRef> linUnconditionalFrameRefs;
    
    

    
    
    @XmlElement(name="LIN-UNCONDITIONAL-FRAME-REF")
    public ArrayList<LinUnconditionalFrameRef> getLinUnconditionalFrameRefs() {
        return this.linUnconditionalFrameRefs;
    }

    public void setLinUnconditionalFrameRefs(ArrayList<LinUnconditionalFrameRef> value) {
        this.linUnconditionalFrameRefs = value;
    }
    
    
}