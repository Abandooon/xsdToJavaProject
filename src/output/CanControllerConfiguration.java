package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class CanControllerConfiguration {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CanControllerFdConfiguration canControllerFdAttributes;
    
    
    
    protected CanControllerFdConfigurationRequirements canControllerFdRequirements;
    
    
    
    protected Integer propSeg;
    
    
    
    protected Integer syncJumpWidth;
    
    
    
    protected Integer timeSeg1;
    
    
    
    protected Integer timeSeg2;
    
    

    
    
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
    
    
    
    @XmlElement(name="CAN-CONTROLLER-FD-ATTRIBUTES")
    public CanControllerFdConfiguration getCanControllerFdAttributes() {
        return this.canControllerFdAttributes;
    }

    public void setCanControllerFdAttributes(CanControllerFdConfiguration value) {
        this.canControllerFdAttributes = value;
    }
    
    
    
    @XmlElement(name="CAN-CONTROLLER-FD-REQUIREMENTS")
    public CanControllerFdConfigurationRequirements getCanControllerFdRequirements() {
        return this.canControllerFdRequirements;
    }

    public void setCanControllerFdRequirements(CanControllerFdConfigurationRequirements value) {
        this.canControllerFdRequirements = value;
    }
    
    
    
    @XmlElement(name="PROP-SEG")
    public Integer getPropSeg() {
        return this.propSeg;
    }

    public void setPropSeg(Integer value) {
        this.propSeg = value;
    }
    
    
    
    @XmlElement(name="SYNC-JUMP-WIDTH")
    public Integer getSyncJumpWidth() {
        return this.syncJumpWidth;
    }

    public void setSyncJumpWidth(Integer value) {
        this.syncJumpWidth = value;
    }
    
    
    
    @XmlElement(name="TIME-SEG-1")
    public Integer getTimeSeg1() {
        return this.timeSeg1;
    }

    public void setTimeSeg1(Integer value) {
        this.timeSeg1 = value;
    }
    
    
    
    @XmlElement(name="TIME-SEG-2")
    public Integer getTimeSeg2() {
        return this.timeSeg2;
    }

    public void setTimeSeg2(Integer value) {
        this.timeSeg2 = value;
    }
    
    
}