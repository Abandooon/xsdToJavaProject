package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ClientServerToSignalGroupMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CommunicationDirectionType communicationDirection;
    
    
    
    protected EventGroupRefs eventGroupRefs;
    
    
    
    protected EventHandlerRefs eventHandlerRefs;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected ServiceInstanceRefs serviceInstanceRefs;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected ApplicationErrorMapping applicationError;
    
    
    
    protected ClientIdMapping clientId;
    
    
    
    protected CompositeTypeMappings compositeTypeMappings;
    
    
    
    protected EmptySignalMapping emptySignal;
    
    
    
    protected OperationInSystemInstanceRef mappedOperationIref;
    
    
    
    protected PrimitiveTypeMappings primitiveTypeMappings;
    
    
    
    protected RequestGroupRef requestGroupRef;
    
    
    
    protected ResponseGroupRef responseGroupRef;
    
    
    
    protected SequenceCounterMapping sequenceCounter;
    
    

    
    
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
    
    
    
    @XmlElement(name="APPLICATION-ERROR")
    public ApplicationErrorMapping getApplicationError() {
        return this.applicationError;
    }

    public void setApplicationError(ApplicationErrorMapping value) {
        this.applicationError = value;
    }
    
    
    
    @XmlElement(name="CLIENT-ID")
    public ClientIdMapping getClientId() {
        return this.clientId;
    }

    public void setClientId(ClientIdMapping value) {
        this.clientId = value;
    }
    
    
    
    @XmlElement(name="COMPOSITE-TYPE-MAPPINGS")
    public CompositeTypeMappings getCompositeTypeMappings() {
        return this.compositeTypeMappings;
    }

    public void setCompositeTypeMappings(CompositeTypeMappings value) {
        this.compositeTypeMappings = value;
    }
    
    
    
    @XmlElement(name="EMPTY-SIGNAL")
    public EmptySignalMapping getEmptySignal() {
        return this.emptySignal;
    }

    public void setEmptySignal(EmptySignalMapping value) {
        this.emptySignal = value;
    }
    
    
    
    @XmlElement(name="MAPPED-OPERATION-IREF")
    public OperationInSystemInstanceRef getMappedOperationIref() {
        return this.mappedOperationIref;
    }

    public void setMappedOperationIref(OperationInSystemInstanceRef value) {
        this.mappedOperationIref = value;
    }
    
    
    
    @XmlElement(name="PRIMITIVE-TYPE-MAPPINGS")
    public PrimitiveTypeMappings getPrimitiveTypeMappings() {
        return this.primitiveTypeMappings;
    }

    public void setPrimitiveTypeMappings(PrimitiveTypeMappings value) {
        this.primitiveTypeMappings = value;
    }
    
    
    
    @XmlElement(name="REQUEST-GROUP-REF")
    public RequestGroupRef getRequestGroupRef() {
        return this.requestGroupRef;
    }

    public void setRequestGroupRef(RequestGroupRef value) {
        this.requestGroupRef = value;
    }
    
    
    
    @XmlElement(name="RESPONSE-GROUP-REF")
    public ResponseGroupRef getResponseGroupRef() {
        return this.responseGroupRef;
    }

    public void setResponseGroupRef(ResponseGroupRef value) {
        this.responseGroupRef = value;
    }
    
    
    
    @XmlElement(name="SEQUENCE-COUNTER")
    public SequenceCounterMapping getSequenceCounter() {
        return this.sequenceCounter;
    }

    public void setSequenceCounter(SequenceCounterMapping value) {
        this.sequenceCounter = value;
    }
    
    
}