package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Networkendpoints {

    
    
    protected ArrayList<NetworkEndpoint> networkEndpoints;
    
    

    
    
    @XmlElement(name="NETWORK-ENDPOINT")
    public ArrayList<NetworkEndpoint> getNetworkEndpoints() {
        return this.networkEndpoints;
    }

    public void setNetworkEndpoints(ArrayList<NetworkEndpoint> value) {
        this.networkEndpoints = value;
    }
    
    
}