package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Resourceestimations {

    
    
    protected ArrayList<EcuResourceEstimation> ecuResourceEstimations;
    
    

    
    
    @XmlElement(name="ECU-RESOURCE-ESTIMATION")
    public ArrayList<EcuResourceEstimation> getEcuResourceEstimations() {
        return this.ecuResourceEstimations;
    }

    public void setEcuResourceEstimations(ArrayList<EcuResourceEstimation> value) {
        this.ecuResourceEstimations = value;
    }
    
    
}