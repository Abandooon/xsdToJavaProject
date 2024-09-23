package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Rptcontainers {

    
    
    protected ArrayList<RptContainer> rptContainers;
    
    

    
    
    @XmlElement(name="RPT-CONTAINER")
    public ArrayList<RptContainer> getRptContainers() {
        return this.rptContainers;
    }

    public void setRptContainers(ArrayList<RptContainer> value) {
        this.rptContainers = value;
    }
    
    
}