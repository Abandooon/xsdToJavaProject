package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class CommunicationControllerMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CommunicationControllerRef communicationControllerRef;
    
    
    
    protected HwCommunicationControllerRef hwCommunicationControllerRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="COMMUNICATION-CONTROLLER-REF")
    public CommunicationControllerRef getCommunicationControllerRef() {
        return this.communicationControllerRef;
    }

    public void setCommunicationControllerRef(CommunicationControllerRef value) {
        this.communicationControllerRef = value;
    }
    
    
    
    @XmlElement(name="HW-COMMUNICATION-CONTROLLER-REF")
    public HwCommunicationControllerRef getHwCommunicationControllerRef() {
        return this.hwCommunicationControllerRef;
    }

    public void setHwCommunicationControllerRef(HwCommunicationControllerRef value) {
        this.hwCommunicationControllerRef = value;
    }
    
    
}