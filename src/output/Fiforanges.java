package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Fiforanges {

    
    
    protected ArrayList<FlexrayFifoRange> flexrayFifoRanges;
    
    

    
    
    @XmlElement(name="FLEXRAY-FIFO-RANGE")
    public ArrayList<FlexrayFifoRange> getFlexrayFifoRanges() {
        return this.flexrayFifoRanges;
    }

    public void setFlexrayFifoRanges(ArrayList<FlexrayFifoRange> value) {
        this.flexrayFifoRanges = value;
    }
    
    
}