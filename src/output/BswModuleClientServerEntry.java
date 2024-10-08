package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class BswModuleClientServerEntry {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected EncapsulatedEntryRef encapsulatedEntryRef;
    
    
    
    protected ArrayList<Boolean> isReentrants;
    
    
    
    protected ArrayList<Boolean> isSynchronouss;
    
    
    
    protected ArrayList<AllChannelsRef> allChannelsRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="ENCAPSULATED-ENTRY-REF")
    public EncapsulatedEntryRef getEncapsulatedEntryRef() {
        return this.encapsulatedEntryRef;
    }

    public void setEncapsulatedEntryRef(EncapsulatedEntryRef value) {
        this.encapsulatedEntryRef = value;
    }
    
    
    
    @XmlElement(name="IS-REENTRANT")
    public ArrayList<Boolean> getIsReentrants() {
        return this.isReentrants;
    }

    public void setIsReentrants(ArrayList<Boolean> value) {
        this.isReentrants = value;
    }
    
    
    
    @XmlElement(name="IS-SYNCHRONOUS")
    public ArrayList<Boolean> getIsSynchronouss() {
        return this.isSynchronouss;
    }

    public void setIsSynchronouss(ArrayList<Boolean> value) {
        this.isSynchronouss = value;
    }
    
    
    
    @XmlElementWrapper(name="ALL-CHANNELS-REFS")
@XmlElement(name="ALL-CHANNELS-REF")
    public ArrayList<AllChannelsRef> getAllChannelsRef() {
        return this.allChannelsRef;
    }

    public void setAllChannelsRef(ArrayList<AllChannelsRef> value) {
        this.allChannelsRef = value;
    }
    
    
}