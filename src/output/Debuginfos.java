package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Debuginfos {

    
    
    protected ArrayList<BswDebugInfo> bswDebugInfos;
    
    

    
    
    @XmlElement(name="BSW-DEBUG-INFO")
    public ArrayList<BswDebugInfo> getBswDebugInfos() {
        return this.bswDebugInfos;
    }

    public void setBswDebugInfos(ArrayList<BswDebugInfo> value) {
        this.bswDebugInfos = value;
    }
    
    
}