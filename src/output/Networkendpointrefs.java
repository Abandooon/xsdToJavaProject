package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Networkendpointrefs {

    
    
    protected ArrayList<NetworkEndpointRef> networkEndpointRefs;
    
    

    
    
    @XmlElement(name="NETWORK-ENDPOINT-REF")
    public ArrayList<NetworkEndpointRef> getNetworkEndpointRefs() {
        return this.networkEndpointRefs;
    }

    public void setNetworkEndpointRefs(ArrayList<NetworkEndpointRef> value) {
        this.networkEndpointRefs = value;
    }
    
    
}