package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Flexrayfifos {

    
    
    protected ArrayList<FlexrayFifoConfiguration> flexrayFifoConfigurations;
    
    

    
    
    @XmlElement(name="FLEXRAY-FIFO-CONFIGURATION")
    public ArrayList<FlexrayFifoConfiguration> getFlexrayFifoConfigurations() {
        return this.flexrayFifoConfigurations;
    }

    public void setFlexrayFifoConfigurations(ArrayList<FlexrayFifoConfiguration> value) {
        this.flexrayFifoConfigurations = value;
    }
    
    
}