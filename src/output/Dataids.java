package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Dataids {

    
    
    protected ArrayList<PositiveInteger> dataIds;
    
    

    
    
    @XmlElement(name="DATA-ID")
    public ArrayList<PositiveInteger> getDataIds() {
        return this.dataIds;
    }

    public void setDataIds(ArrayList<PositiveInteger> value) {
        this.dataIds = value;
    }
    
    
}