package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Providedserviceinstanceref extends Ref {

    
    
    protected ProvidedServiceInstanceSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public ProvidedServiceInstanceSubtypesEnum getDest() {
        return this.dest;
    }

    public void setDest(ProvidedServiceInstanceSubtypesEnum value) {
        this.dest = value;
    }
    
    
}