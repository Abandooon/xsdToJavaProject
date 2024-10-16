package stdgui.data.model.orimodel;
@XmlRootElement(name = "CLIENT-SERVER-TO-SIGNAL-MAPPING")
public class ClientServerToSignalMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CommunicationDirectionType communicationDirection;
    
    
    
    protected ArrayList<EventGroupRef> eventGroupRefs;
    
    
    
    protected ArrayList<EventHandlerRef> eventHandlerRefs;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected ArrayList<ServiceInstanceRef> serviceInstanceRefs;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected CallSignalRef callSignalRef;
    
    
    
    protected OperationInSystemInstanceRef clientServerOperationIref;
    
    
    
    protected PositiveInteger lengthClientId;
    
    
    
    protected PositiveInteger lengthSequenceCounter;
    
    
    
    protected ReturnSignalRef returnSignalRef;
    
    
    
    protected SerializerRef serializerRef;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="EVENT-GROUP-REFS")
@XmlElement(name="EVENT-GROUP-REF")
    public ArrayList<EventGroupRef> getEventGroupRefs() {
    return this.eventGroupRefs;
}

    public void setEventGroupRefs(ArrayList<EventGroupRef> value) {
        this.eventGroupRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="EVENT-HANDLER-REFS")
@XmlElement(name="EVENT-HANDLER-REF")
    public ArrayList<EventHandlerRef> getEventHandlerRefs() {
    return this.eventHandlerRefs;
}

    public void setEventHandlerRefs(ArrayList<EventHandlerRef> value) {
        this.eventHandlerRefs = value;
    }
    
    
    
    @XmlElement(name="INTRODUCTION")
    public DocumentationBlock getIntroduction() {
    return this.introduction;
}

    public void setIntroduction(DocumentationBlock value) {
        this.introduction = value;
    }
    
    
    
    @XmlElementWrapper(name="SERVICE-INSTANCE-REFS")
@XmlElement(name="SERVICE-INSTANCE-REF")
    public ArrayList<ServiceInstanceRef> getServiceInstanceRefs() {
    return this.serviceInstanceRefs;
}

    public void setServiceInstanceRefs(ArrayList<ServiceInstanceRef> value) {
        this.serviceInstanceRefs = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="CALL-SIGNAL-REF")
    public CallSignalRef getCallSignalRef() {
    return this.callSignalRef;
}

    public void setCallSignalRef(CallSignalRef value) {
        this.callSignalRef = value;
    }
    
    
    
    @XmlElement(name="CLIENT-SERVER-OPERATION-IREF")
    public OperationInSystemInstanceRef getClientServerOperationIref() {
    return this.clientServerOperationIref;
}

    public void setClientServerOperationIref(OperationInSystemInstanceRef value) {
        this.clientServerOperationIref = value;
    }
    
    
    
    @XmlElement(name="LENGTH-CLIENT-ID")
    public PositiveInteger getLengthClientId() {
    return this.lengthClientId;
}

    public void setLengthClientId(PositiveInteger value) {
        this.lengthClientId = value;
    }
    
    
    
    @XmlElement(name="LENGTH-SEQUENCE-COUNTER")
    public PositiveInteger getLengthSequenceCounter() {
    return this.lengthSequenceCounter;
}

    public void setLengthSequenceCounter(PositiveInteger value) {
        this.lengthSequenceCounter = value;
    }
    
    
    
    @XmlElement(name="RETURN-SIGNAL-REF")
    public ReturnSignalRef getReturnSignalRef() {
    return this.returnSignalRef;
}

    public void setReturnSignalRef(ReturnSignalRef value) {
        this.returnSignalRef = value;
    }
    
    
    
    @XmlElement(name="SERIALIZER-REF")
    public SerializerRef getSerializerRef() {
    return this.serializerRef;
}

    public void setSerializerRef(SerializerRef value) {
        this.serializerRef = value;
    }
    
    
}