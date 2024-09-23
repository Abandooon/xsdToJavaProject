package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Compositenetworkrepresentations {

    
    
    protected ArrayList<CompositeNetworkRepresentation> compositeNetworkRepresentations;
    
    

    
    
    @XmlElement(name="COMPOSITE-NETWORK-REPRESENTATION")
    public ArrayList<CompositeNetworkRepresentation> getCompositeNetworkRepresentations() {
        return this.compositeNetworkRepresentations;
    }

    public void setCompositeNetworkRepresentations(ArrayList<CompositeNetworkRepresentation> value) {
        this.compositeNetworkRepresentations = value;
    }
    
    
}