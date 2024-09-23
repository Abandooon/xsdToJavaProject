package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Consumedserviceinstances {

    
    
    protected ArrayList<ConsumedServiceInstance> consumedServiceInstances;
    
    

    
    
    @XmlElement(name="CONSUMED-SERVICE-INSTANCE")
    public ArrayList<ConsumedServiceInstance> getConsumedServiceInstances() {
        return this.consumedServiceInstances;
    }

    public void setConsumedServiceInstances(ArrayList<ConsumedServiceInstance> value) {
        this.consumedServiceInstances = value;
    }
    
    
}