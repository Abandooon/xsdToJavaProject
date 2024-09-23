package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class HardwareConfiguration {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected String additionalInformation;
    
    
    
    protected String processorMode;
    
    
    
    protected String processorSpeed;
    
    

    
    
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
    
    
    
    @XmlElement(name="ADDITIONAL-INFORMATION")
    public String getAdditionalInformation() {
        return this.additionalInformation;
    }

    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }
    
    
    
    @XmlElement(name="PROCESSOR-MODE")
    public String getProcessorMode() {
        return this.processorMode;
    }

    public void setProcessorMode(String value) {
        this.processorMode = value;
    }
    
    
    
    @XmlElement(name="PROCESSOR-SPEED")
    public String getProcessorSpeed() {
        return this.processorSpeed;
    }

    public void setProcessorSpeed(String value) {
        this.processorSpeed = value;
    }
    
    
}