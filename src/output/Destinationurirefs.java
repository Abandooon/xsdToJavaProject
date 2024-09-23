package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Destinationurirefs {

    
    
    protected ArrayList<DestinationUriRef> destinationUriRefs;
    
    

    
    
    @XmlElement(name="DESTINATION-URI-REF")
    public ArrayList<DestinationUriRef> getDestinationUriRefs() {
        return this.destinationUriRefs;
    }

    public void setDestinationUriRefs(ArrayList<DestinationUriRef> value) {
        this.destinationUriRefs = value;
    }
    
    
}