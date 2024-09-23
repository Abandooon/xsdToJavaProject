package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Flexrayclustervariants {

    
    
    protected ArrayList<FlexrayClusterConditional> flexrayClusterConditionals;
    
    

    
    
    @XmlElement(name="FLEXRAY-CLUSTER-CONDITIONAL")
    public ArrayList<FlexrayClusterConditional> getFlexrayClusterConditionals() {
        return this.flexrayClusterConditionals;
    }

    public void setFlexrayClusterConditionals(ArrayList<FlexrayClusterConditional> value) {
        this.flexrayClusterConditionals = value;
    }
    
    
}