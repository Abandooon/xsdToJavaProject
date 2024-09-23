package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class SenderReceiverToSignalGroupMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CommunicationDirectionType communicationDirection;
    
    
    
    protected EventGroupRefs eventGroupRefs;
    
    
    
    protected EventHandlerRefs eventHandlerRefs;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected ServiceInstanceRefs serviceInstanceRefs;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected VariableDataPrototypeInSystemInstanceRef dataElementIref;
    
    
    
    protected SignalGroupRef signalGroupRef;
    
    
    
    protected TypeMapping typeMapping;
    
    

    
    
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
    
    
    
    @XmlElement(name="COMMUNICATION-DIRECTION")
    public CommunicationDirectionType getCommunicationDirection() {
        return this.communicationDirection;
    }

    public void setCommunicationDirection(CommunicationDirectionType value) {
        this.communicationDirection = value;
    }
    
    
    
    @XmlElement(name="EVENT-GROUP-REFS")
    public EventGroupRefs getEventGroupRefs() {
        return this.eventGroupRefs;
    }

    public void setEventGroupRefs(EventGroupRefs value) {
        this.eventGroupRefs = value;
    }
    
    
    
    @XmlElement(name="EVENT-HANDLER-REFS")
    public EventHandlerRefs getEventHandlerRefs() {
        return this.eventHandlerRefs;
    }

    public void setEventHandlerRefs(EventHandlerRefs value) {
        this.eventHandlerRefs = value;
    }
    
    
    
    @XmlElement(name="INTRODUCTION")
    public DocumentationBlock getIntroduction() {
        return this.introduction;
    }

    public void setIntroduction(DocumentationBlock value) {
        this.introduction = value;
    }
    
    
    
    @XmlElement(name="SERVICE-INSTANCE-REFS")
    public ServiceInstanceRefs getServiceInstanceRefs() {
        return this.serviceInstanceRefs;
    }

    public void setServiceInstanceRefs(ServiceInstanceRefs value) {
        this.serviceInstanceRefs = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="DATA-ELEMENT-IREF")
    public VariableDataPrototypeInSystemInstanceRef getDataElementIref() {
        return this.dataElementIref;
    }

    public void setDataElementIref(VariableDataPrototypeInSystemInstanceRef value) {
        this.dataElementIref = value;
    }
    
    
    
    @XmlElement(name="SIGNAL-GROUP-REF")
    public SignalGroupRef getSignalGroupRef() {
        return this.signalGroupRef;
    }

    public void setSignalGroupRef(SignalGroupRef value) {
        this.signalGroupRef = value;
    }
    
    
    
    @XmlElement(name="TYPE-MAPPING")
    public TypeMapping getTypeMapping() {
        return this.typeMapping;
    }

    public void setTypeMapping(TypeMapping value) {
        this.typeMapping = value;
    }
    
    
}