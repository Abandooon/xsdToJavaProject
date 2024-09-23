package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class TtcanCommunicationControllerConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Boolean wakeUpByControllerSupported;
    
    
    
    protected CanControllerAttributes canControllerAttributes;
    
    
    
    protected Integer applWatchdogLimit;
    
    
    
    protected Integer expectedTxTrigger;
    
    
    
    protected Boolean externalClockSynchronisation;
    
    
    
    protected Integer initialRefOffset;
    
    
    
    protected Boolean master;
    
    
    
    protected Integer timeMasterPriority;
    
    
    
    protected Integer timeTriggeredCanLevel;
    
    
    
    protected Integer txEnableWindowLength;
    
    
    
    protected VariationPoint variationPoint;
    
    

    
    
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
    
    
    
    @XmlElement(name="WAKE-UP-BY-CONTROLLER-SUPPORTED")
    public Boolean getWakeUpByControllerSupported() {
        return this.wakeUpByControllerSupported;
    }

    public void setWakeUpByControllerSupported(Boolean value) {
        this.wakeUpByControllerSupported = value;
    }
    
    
    
    @XmlElement(name="CAN-CONTROLLER-ATTRIBUTES")
    public CanControllerAttributes getCanControllerAttributes() {
        return this.canControllerAttributes;
    }

    public void setCanControllerAttributes(CanControllerAttributes value) {
        this.canControllerAttributes = value;
    }
    
    
    
    @XmlElement(name="APPL-WATCHDOG-LIMIT")
    public Integer getApplWatchdogLimit() {
        return this.applWatchdogLimit;
    }

    public void setApplWatchdogLimit(Integer value) {
        this.applWatchdogLimit = value;
    }
    
    
    
    @XmlElement(name="EXPECTED-TX-TRIGGER")
    public Integer getExpectedTxTrigger() {
        return this.expectedTxTrigger;
    }

    public void setExpectedTxTrigger(Integer value) {
        this.expectedTxTrigger = value;
    }
    
    
    
    @XmlElement(name="EXTERNAL-CLOCK-SYNCHRONISATION")
    public Boolean getExternalClockSynchronisation() {
        return this.externalClockSynchronisation;
    }

    public void setExternalClockSynchronisation(Boolean value) {
        this.externalClockSynchronisation = value;
    }
    
    
    
    @XmlElement(name="INITIAL-REF-OFFSET")
    public Integer getInitialRefOffset() {
        return this.initialRefOffset;
    }

    public void setInitialRefOffset(Integer value) {
        this.initialRefOffset = value;
    }
    
    
    
    @XmlElement(name="MASTER")
    public Boolean getMaster() {
        return this.master;
    }

    public void setMaster(Boolean value) {
        this.master = value;
    }
    
    
    
    @XmlElement(name="TIME-MASTER-PRIORITY")
    public Integer getTimeMasterPriority() {
        return this.timeMasterPriority;
    }

    public void setTimeMasterPriority(Integer value) {
        this.timeMasterPriority = value;
    }
    
    
    
    @XmlElement(name="TIME-TRIGGERED-CAN-LEVEL")
    public Integer getTimeTriggeredCanLevel() {
        return this.timeTriggeredCanLevel;
    }

    public void setTimeTriggeredCanLevel(Integer value) {
        this.timeTriggeredCanLevel = value;
    }
    
    
    
    @XmlElement(name="TX-ENABLE-WINDOW-LENGTH")
    public Integer getTxEnableWindowLength() {
        return this.txEnableWindowLength;
    }

    public void setTxEnableWindowLength(Integer value) {
        this.txEnableWindowLength = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}