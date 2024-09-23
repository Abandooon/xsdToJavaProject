package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Physicalchannelrefs {

    
    
    protected ArrayList<PhysicalChannelRef> physicalChannelRefs;
    
    

    
    
    @XmlElement(name="PHYSICAL-CHANNEL-REF")
    public ArrayList<PhysicalChannelRef> getPhysicalChannelRefs() {
        return this.physicalChannelRefs;
    }

    public void setPhysicalChannelRefs(ArrayList<PhysicalChannelRef> value) {
        this.physicalChannelRefs = value;
    }
    
    
}