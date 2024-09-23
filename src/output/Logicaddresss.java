package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Logicaddresss {

    
    
    protected ArrayList<LogicAddress> logicAddresss;
    
    

    
    
    @XmlElement(name="LOGIC-ADDRESS")
    public ArrayList<LogicAddress> getLogicAddresss() {
        return this.logicAddresss;
    }

    public void setLogicAddresss(ArrayList<LogicAddress> value) {
        this.logicAddresss = value;
    }
    
    
}