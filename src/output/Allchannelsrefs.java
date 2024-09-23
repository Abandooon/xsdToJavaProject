package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Allchannelsrefs {

    
    
    protected ArrayList<AllChannelsRef> allChannelsRefs;
    
    

    
    
    @XmlElement(name="ALL-CHANNELS-REF")
    public ArrayList<AllChannelsRef> getAllChannelsRefs() {
        return this.allChannelsRefs;
    }

    public void setAllChannelsRefs(ArrayList<AllChannelsRef> value) {
        this.allChannelsRefs = value;
    }
    
    
}