package stdgui.data.model.orimodel;
@XmlRootElement(name = "SENDER-RECEIVER-TO-SIGNAL-MAPPING")
public class SenderReceiverToSignalMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CommunicationDirectionType communicationDirection;
    
    
    
    protected ArrayList<EventGroupRef> eventGroupRefs;
    
    
    
    protected ArrayList<EventHandlerRef> eventHandlerRefs;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected ArrayList<ServiceInstanceRef> serviceInstanceRefs;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected VariableDataPrototypeInSystemInstanceRef dataElementIref;
    
    
    
    protected SystemSignalRef systemSignalRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="DATA-ELEMENT-IREF")
    public VariableDataPrototypeInSystemInstanceRef getDataElementIref() {
    return this.dataElementIref;
}

    public void setDataElementIref(VariableDataPrototypeInSystemInstanceRef value) {
        this.dataElementIref = value;
    }
    
    
    
    @XmlElement(name="SYSTEM-SIGNAL-REF")
    public SystemSignalRef getSystemSignalRef() {
    return this.systemSignalRef;
}

    public void setSystemSignalRef(SystemSignalRef value) {
        this.systemSignalRef = value;
    }
    
    
}