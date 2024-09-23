package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Exclusiveareanestingorders {

    
    
    protected ArrayList<ExclusiveAreaNestingOrder> exclusiveAreaNestingOrders;
    
    

    
    
    @XmlElement(name="EXCLUSIVE-AREA-NESTING-ORDER")
    public ArrayList<ExclusiveAreaNestingOrder> getExclusiveAreaNestingOrders() {
        return this.exclusiveAreaNestingOrders;
    }

    public void setExclusiveAreaNestingOrders(ArrayList<ExclusiveAreaNestingOrder> value) {
        this.exclusiveAreaNestingOrders = value;
    }
    
    
}