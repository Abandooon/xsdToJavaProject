package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ModeSwitchSenderComSpec {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Boolean enhancedModeApi;
    
    
    
    protected ModeGroupRef modeGroupRef;
    
    
    
    protected ModeSwitchedAckRequest modeSwitchedAck;
    
    
    
    protected PositiveInteger queueLength;
    
    

    
    
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
    
    
    
    @XmlElement(name="ENHANCED-MODE-API")
    public Boolean getEnhancedModeApi() {
        return this.enhancedModeApi;
    }

    public void setEnhancedModeApi(Boolean value) {
        this.enhancedModeApi = value;
    }
    
    
    
    @XmlElement(name="MODE-GROUP-REF")
    public ModeGroupRef getModeGroupRef() {
        return this.modeGroupRef;
    }

    public void setModeGroupRef(ModeGroupRef value) {
        this.modeGroupRef = value;
    }
    
    
    
    @XmlElement(name="MODE-SWITCHED-ACK")
    public ModeSwitchedAckRequest getModeSwitchedAck() {
        return this.modeSwitchedAck;
    }

    public void setModeSwitchedAck(ModeSwitchedAckRequest value) {
        this.modeSwitchedAck = value;
    }
    
    
    
    @XmlElement(name="QUEUE-LENGTH")
    public PositiveInteger getQueueLength() {
        return this.queueLength;
    }

    public void setQueueLength(PositiveInteger value) {
        this.queueLength = value;
    }
    
    
}