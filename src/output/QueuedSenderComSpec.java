package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class QueuedSenderComSpec {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CompositeNetworkRepresentations compositeNetworkRepresentations;
    
    
    
    protected DataElementRef dataElementRef;
    
    
    
    protected HandleOutOfRangeEnum handleOutOfRange;
    
    
    
    protected SwDataDefProps networkRepresentation;
    
    
    
    protected TransmissionAcknowledgementRequest transmissionAcknowledge;
    
    
    
    protected BooleanValueVariationPoint usesEndToEndProtection;
    
    

    
    
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
    
    
    
    @XmlElement(name="COMPOSITE-NETWORK-REPRESENTATIONS")
    public CompositeNetworkRepresentations getCompositeNetworkRepresentations() {
        return this.compositeNetworkRepresentations;
    }

    public void setCompositeNetworkRepresentations(CompositeNetworkRepresentations value) {
        this.compositeNetworkRepresentations = value;
    }
    
    
    
    @XmlElement(name="DATA-ELEMENT-REF")
    public DataElementRef getDataElementRef() {
        return this.dataElementRef;
    }

    public void setDataElementRef(DataElementRef value) {
        this.dataElementRef = value;
    }
    
    
    
    @XmlElement(name="HANDLE-OUT-OF-RANGE")
    public HandleOutOfRangeEnum getHandleOutOfRange() {
        return this.handleOutOfRange;
    }

    public void setHandleOutOfRange(HandleOutOfRangeEnum value) {
        this.handleOutOfRange = value;
    }
    
    
    
    @XmlElement(name="NETWORK-REPRESENTATION")
    public SwDataDefProps getNetworkRepresentation() {
        return this.networkRepresentation;
    }

    public void setNetworkRepresentation(SwDataDefProps value) {
        this.networkRepresentation = value;
    }
    
    
    
    @XmlElement(name="TRANSMISSION-ACKNOWLEDGE")
    public TransmissionAcknowledgementRequest getTransmissionAcknowledge() {
        return this.transmissionAcknowledge;
    }

    public void setTransmissionAcknowledge(TransmissionAcknowledgementRequest value) {
        this.transmissionAcknowledge = value;
    }
    
    
    
    @XmlElement(name="USES-END-TO-END-PROTECTION")
    public BooleanValueVariationPoint getUsesEndToEndProtection() {
        return this.usesEndToEndProtection;
    }

    public void setUsesEndToEndProtection(BooleanValueVariationPoint value) {
        this.usesEndToEndProtection = value;
    }
    
    
}