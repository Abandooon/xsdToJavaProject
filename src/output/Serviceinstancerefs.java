package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Serviceinstancerefs {

    
    
    protected ArrayList<ServiceInstanceRef> serviceInstanceRefs;
    
    

    
    
    @XmlElement(name="SERVICE-INSTANCE-REF")
    public ArrayList<ServiceInstanceRef> getServiceInstanceRefs() {
        return this.serviceInstanceRefs;
    }

    public void setServiceInstanceRefs(ArrayList<ServiceInstanceRef> value) {
        this.serviceInstanceRefs = value;
    }
    
    
}