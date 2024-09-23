package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Tpchannels {

    
    
    protected ArrayList<FlexrayArTpChannel> flexrayArTpChannels;
    
    

    
    
    @XmlElement(name="FLEXRAY-AR-TP-CHANNEL")
    public ArrayList<FlexrayArTpChannel> getFlexrayArTpChannels() {
        return this.flexrayArTpChannels;
    }

    public void setFlexrayArTpChannels(ArrayList<FlexrayArTpChannel> value) {
        this.flexrayArTpChannels = value;
    }
    
    
}