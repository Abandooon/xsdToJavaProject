package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EthernetCommunicationControllerConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Boolean wakeUpByControllerSupported;
    
    
    
    protected CouplingPorts couplingPorts;
    
    
    
    protected MacAddressString macUnicastAddress;
    
    
    
    protected Integer maximumReceiveBufferLength;
    
    
    
    protected PositiveInteger maximumTransmissionUnit;
    
    
    
    protected Integer maximumTransmitBufferLength;
    
    
    
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
    
    
    
    @XmlElement(name="COUPLING-PORTS")
    public CouplingPorts getCouplingPorts() {
        return this.couplingPorts;
    }

    public void setCouplingPorts(CouplingPorts value) {
        this.couplingPorts = value;
    }
    
    
    
    @XmlElement(name="MAC-UNICAST-ADDRESS")
    public MacAddressString getMacUnicastAddress() {
        return this.macUnicastAddress;
    }

    public void setMacUnicastAddress(MacAddressString value) {
        this.macUnicastAddress = value;
    }
    
    
    
    @XmlElement(name="MAXIMUM-RECEIVE-BUFFER-LENGTH")
    public Integer getMaximumReceiveBufferLength() {
        return this.maximumReceiveBufferLength;
    }

    public void setMaximumReceiveBufferLength(Integer value) {
        this.maximumReceiveBufferLength = value;
    }
    
    
    
    @XmlElement(name="MAXIMUM-TRANSMISSION-UNIT")
    public PositiveInteger getMaximumTransmissionUnit() {
        return this.maximumTransmissionUnit;
    }

    public void setMaximumTransmissionUnit(PositiveInteger value) {
        this.maximumTransmissionUnit = value;
    }
    
    
    
    @XmlElement(name="MAXIMUM-TRANSMIT-BUFFER-LENGTH")
    public Integer getMaximumTransmitBufferLength() {
        return this.maximumTransmitBufferLength;
    }

    public void setMaximumTransmitBufferLength(Integer value) {
        this.maximumTransmitBufferLength = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}