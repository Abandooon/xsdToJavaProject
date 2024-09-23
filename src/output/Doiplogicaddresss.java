package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Doiplogicaddresss {

    
    
    protected ArrayList<DoIpLogicAddress> doIpLogicAddresss;
    
    

    
    
    @XmlElement(name="DO-IP-LOGIC-ADDRESS")
    public ArrayList<DoIpLogicAddress> getDoIpLogicAddresss() {
        return this.doIpLogicAddresss;
    }

    public void setDoIpLogicAddresss(ArrayList<DoIpLogicAddress> value) {
        this.doIpLogicAddresss = value;
    }
    
    
}