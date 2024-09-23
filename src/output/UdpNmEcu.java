package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class UdpNmEcu {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Boolean nmRepeatMsgIndicationEnabled;
    
    
    
    protected Boolean nmSynchronizationPointEnabled;
    
    

    
    
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
    
    
    
    @XmlElement(name="NM-REPEAT-MSG-INDICATION-ENABLED")
    public Boolean getNmRepeatMsgIndicationEnabled() {
        return this.nmRepeatMsgIndicationEnabled;
    }

    public void setNmRepeatMsgIndicationEnabled(Boolean value) {
        this.nmRepeatMsgIndicationEnabled = value;
    }
    
    
    
    @XmlElement(name="NM-SYNCHRONIZATION-POINT-ENABLED")
    public Boolean getNmSynchronizationPointEnabled() {
        return this.nmSynchronizationPointEnabled;
    }

    public void setNmSynchronizationPointEnabled(Boolean value) {
        this.nmSynchronizationPointEnabled = value;
    }
    
    
}