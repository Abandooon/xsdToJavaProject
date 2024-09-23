package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Physicalchannels {

    
    
    protected ArrayList<CanPhysicalChannel> canPhysicalChannels;
    
    
    
    protected ArrayList<EthernetPhysicalChannel> ethernetPhysicalChannels;
    
    
    
    protected ArrayList<FlexrayPhysicalChannel> flexrayPhysicalChannels;
    
    
    
    protected ArrayList<LinPhysicalChannel> linPhysicalChannels;
    
    
    
    protected ArrayList<TtcanPhysicalChannel> ttcanPhysicalChannels;
    
    
    
    protected ArrayList<UserDefinedPhysicalChannel> userDefinedPhysicalChannels;
    
    

    
    
    @XmlElement(name="CAN-PHYSICAL-CHANNEL")
    public ArrayList<CanPhysicalChannel> getCanPhysicalChannels() {
        return this.canPhysicalChannels;
    }

    public void setCanPhysicalChannels(ArrayList<CanPhysicalChannel> value) {
        this.canPhysicalChannels = value;
    }
    
    
    
    @XmlElement(name="ETHERNET-PHYSICAL-CHANNEL")
    public ArrayList<EthernetPhysicalChannel> getEthernetPhysicalChannels() {
        return this.ethernetPhysicalChannels;
    }

    public void setEthernetPhysicalChannels(ArrayList<EthernetPhysicalChannel> value) {
        this.ethernetPhysicalChannels = value;
    }
    
    
    
    @XmlElement(name="FLEXRAY-PHYSICAL-CHANNEL")
    public ArrayList<FlexrayPhysicalChannel> getFlexrayPhysicalChannels() {
        return this.flexrayPhysicalChannels;
    }

    public void setFlexrayPhysicalChannels(ArrayList<FlexrayPhysicalChannel> value) {
        this.flexrayPhysicalChannels = value;
    }
    
    
    
    @XmlElement(name="LIN-PHYSICAL-CHANNEL")
    public ArrayList<LinPhysicalChannel> getLinPhysicalChannels() {
        return this.linPhysicalChannels;
    }

    public void setLinPhysicalChannels(ArrayList<LinPhysicalChannel> value) {
        this.linPhysicalChannels = value;
    }
    
    
    
    @XmlElement(name="TTCAN-PHYSICAL-CHANNEL")
    public ArrayList<TtcanPhysicalChannel> getTtcanPhysicalChannels() {
        return this.ttcanPhysicalChannels;
    }

    public void setTtcanPhysicalChannels(ArrayList<TtcanPhysicalChannel> value) {
        this.ttcanPhysicalChannels = value;
    }
    
    
    
    @XmlElement(name="USER-DEFINED-PHYSICAL-CHANNEL")
    public ArrayList<UserDefinedPhysicalChannel> getUserDefinedPhysicalChannels() {
        return this.userDefinedPhysicalChannels;
    }

    public void setUserDefinedPhysicalChannels(ArrayList<UserDefinedPhysicalChannel> value) {
        this.userDefinedPhysicalChannels = value;
    }
    
    
}