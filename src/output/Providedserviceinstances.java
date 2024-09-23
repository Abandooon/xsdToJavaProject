package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Providedserviceinstances {

    
    
    protected ArrayList<ProvidedServiceInstance> providedServiceInstances;
    
    

    
    
    @XmlElement(name="PROVIDED-SERVICE-INSTANCE")
    public ArrayList<ProvidedServiceInstance> getProvidedServiceInstances() {
        return this.providedServiceInstances;
    }

    public void setProvidedServiceInstances(ArrayList<ProvidedServiceInstance> value) {
        this.providedServiceInstances = value;
    }
    
    
}