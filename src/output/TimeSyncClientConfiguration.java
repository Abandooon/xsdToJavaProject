package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class TimeSyncClientConfiguration {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected OrderedMasterList orderedMasterList;
    
    
    
    protected TimeSyncTechnologyEnum timeSyncTechnology;
    
    

    
    
    @XmlAttribute(name="S")
    public java.lang.String getS() {
        return this.s;
    }

    public void setS(java.lang.String value) {
        this.s = value;
    }
    
    
    
    @XmlAttribute(name="T")
    public java.lang.String getT() {
        return this.t;
    }

    public void setT(java.lang.String value) {
        this.t = value;
    }
    
    
    
    @XmlElement(name="ORDERED-MASTER-LIST")
    public OrderedMasterList getOrderedMasterList() {
        return this.orderedMasterList;
    }

    public void setOrderedMasterList(OrderedMasterList value) {
        this.orderedMasterList = value;
    }
    
    
    
    @XmlElement(name="TIME-SYNC-TECHNOLOGY")
    public TimeSyncTechnologyEnum getTimeSyncTechnology() {
        return this.timeSyncTechnology;
    }

    public void setTimeSyncTechnology(TimeSyncTechnologyEnum value) {
        this.timeSyncTechnology = value;
    }
    
    
}