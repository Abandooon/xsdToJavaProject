package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Pdupools {

    
    
    protected ArrayList<FlexrayTpPduPool> flexrayTpPduPools;
    
    

    
    
    @XmlElement(name="FLEXRAY-TP-PDU-POOL")
    public ArrayList<FlexrayTpPduPool> getFlexrayTpPduPools() {
        return this.flexrayTpPduPools;
    }

    public void setFlexrayTpPduPools(ArrayList<FlexrayTpPduPool> value) {
        this.flexrayTpPduPools = value;
    }
    
    
}