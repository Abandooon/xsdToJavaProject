package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Gateways {

    
    
    protected ArrayList<GlobalTimeGateway> globalTimeGateways;
    
    

    
    
    @XmlElement(name="GLOBAL-TIME-GATEWAY")
    public ArrayList<GlobalTimeGateway> getGlobalTimeGateways() {
        return this.globalTimeGateways;
    }

    public void setGlobalTimeGateways(ArrayList<GlobalTimeGateway> value) {
        this.globalTimeGateways = value;
    }
    
    
}