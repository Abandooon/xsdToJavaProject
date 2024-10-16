package stdgui.data.model.orimodel;
@XmlRootElement(name = "BSW-INTERNAL-BEHAVIOR")
public class BswInternalBehavior {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String uuid;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ArrayList<ShortNameFragment> shortNameFragments;
    
    
    
    protected MultilanguageLongName longName;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected AdminData adminData;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected ArrayList<Annotation> annotations;
    
    
    
    protected ArrayList<ParameterDataPrototype> constantMemorys;
    
    
    
    protected ArrayList<ConstantValueMappingRef> constantValueMappingRefs;
    
    
    
    protected ArrayList<DataTypeMappingRef> dataTypeMappingRefs;
    
    
    
    protected ArrayList<ExclusiveArea> exclusiveAreas;
    
    
    
    protected ArrayList<ExclusiveAreaNestingOrder> exclusiveAreaNestingOrders;
    
    
    
    protected ArrayList<VariableDataPrototype> staticMemorys;
    
    
    
    protected ArrayList<BswPerInstanceMemoryPolicy> bswPerInstanceMemoryPolicys;
    
    
    
    protected ArrayList<BswClientPolicy> clientPolicys;
    
    
    
    protected ArrayList<BswExclusiveAreaPolicy> exclusiveAreaPolicys;
    
    
    
    protected ArrayList<IncludedDataTypeSet> includedDataTypeSets;
    
    
    
    protected ArrayList<BswInternalTriggeringPointPolicy> internalTriggeringPointPolicys;
    
    
    
    protected ArrayList<BswParameterPolicy> parameterPolicys;
    
    
    
    protected ArrayList<BswReleasedTriggerPolicy> releasedTriggerPolicys;
    
    
    
    protected ArrayList<BswDataSendPolicy> sendPolicys;
    
    
    
    protected ArrayList<VariationPointProxy> variationPointProxys;
    
    
    
    protected ArrayList<BswInternalTriggeringPoint> internalTriggeringPoints;
    
    
    
    protected Entitys entitys;
    
    
    
    protected Events events;
    
    
    
    protected ArrayList<BswTriggerDirectImplementation> triggerDirectImplementations;
    
    
    
    protected ArrayList<BswModeSenderPolicy> modeSenderPolicys;
    
    
    
    protected ArrayList<BswModeReceiverPolicy> modeReceiverPolicys;
    
    
    
    protected ArrayList<BswServiceDependency> serviceDependencys;
    
    
    
    protected ArrayList<ParameterDataPrototype> perInstanceParameters;
    
    
    
    protected ArrayList<BswSchedulerNamePrefix> schedulerNamePrefixs;
    
    
    
    protected ArrayList<BswQueuedDataReceptionPolicy> receptionPolicys;
    
    
    
    protected ArrayList<BswDistinguishedPartition> distinguishedPartitions;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="UUID")
    public java.lang.String getUuid() {
    return this.uuid;
}

    public void setUuid(java.lang.String value) {
        this.uuid = value;
    }
    
    
    
    @XmlElement(name="SHORT-NAME")
    public Identifier getShortName() {
    return this.shortName;
}

    public void setShortName(Identifier value) {
        this.shortName = value;
    }
    
    
    
    @XmlElementWrapper(name="SHORT-NAME-FRAGMENTS")
@XmlElement(name="SHORT-NAME-FRAGMENT")
    public ArrayList<ShortNameFragment> getShortNameFragments() {
    return this.shortNameFragments;
}

    public void setShortNameFragments(ArrayList<ShortNameFragment> value) {
        this.shortNameFragments = value;
    }
    
    
    
    @XmlElement(name="LONG-NAME")
    public MultilanguageLongName getLongName() {
    return this.longName;
}

    public void setLongName(MultilanguageLongName value) {
        this.longName = value;
    }
    
    
    
    @XmlElement(name="DESC")
    public MultiLanguageOverviewParagraph getDesc() {
    return this.desc;
}

    public void setDesc(MultiLanguageOverviewParagraph value) {
        this.desc = value;
    }
    
    
    
    @XmlElement(name="CATEGORY")
    public CategoryString getCategory() {
    return this.category;
}

    public void setCategory(CategoryString value) {
        this.category = value;
    }
    
    
    
    @XmlElement(name="ADMIN-DATA")
    public AdminData getAdminData() {
    return this.adminData;
}

    public void setAdminData(AdminData value) {
        this.adminData = value;
    }
    
    
    
    @XmlElement(name="INTRODUCTION")
    public DocumentationBlock getIntroduction() {
    return this.introduction;
}

    public void setIntroduction(DocumentationBlock value) {
        this.introduction = value;
    }
    
    
    
    @XmlElementWrapper(name="ANNOTATIONS")
@XmlElement(name="ANNOTATION")
    public ArrayList<Annotation> getAnnotations() {
    return this.annotations;
}

    public void setAnnotations(ArrayList<Annotation> value) {
        this.annotations = value;
    }
    
    
    
    @XmlElementWrapper(name="CONSTANT-MEMORYS")
@XmlElement(name="PARAMETER-DATA-PROTOTYPE")
    public ArrayList<ParameterDataPrototype> getConstantMemorys() {
    return this.constantMemorys;
}

    public void setConstantMemorys(ArrayList<ParameterDataPrototype> value) {
        this.constantMemorys = value;
    }
    
    
    
    @XmlElementWrapper(name="CONSTANT-VALUE-MAPPING-REFS")
@XmlElement(name="CONSTANT-VALUE-MAPPING-REF")
    public ArrayList<ConstantValueMappingRef> getConstantValueMappingRefs() {
    return this.constantValueMappingRefs;
}

    public void setConstantValueMappingRefs(ArrayList<ConstantValueMappingRef> value) {
        this.constantValueMappingRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="DATA-TYPE-MAPPING-REFS")
@XmlElement(name="DATA-TYPE-MAPPING-REF")
    public ArrayList<DataTypeMappingRef> getDataTypeMappingRefs() {
    return this.dataTypeMappingRefs;
}

    public void setDataTypeMappingRefs(ArrayList<DataTypeMappingRef> value) {
        this.dataTypeMappingRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="EXCLUSIVE-AREAS")
@XmlElement(name="EXCLUSIVE-AREA")
    public ArrayList<ExclusiveArea> getExclusiveAreas() {
    return this.exclusiveAreas;
}

    public void setExclusiveAreas(ArrayList<ExclusiveArea> value) {
        this.exclusiveAreas = value;
    }
    
    
    
    @XmlElementWrapper(name="EXCLUSIVE-AREA-NESTING-ORDERS")
@XmlElement(name="EXCLUSIVE-AREA-NESTING-ORDER")
    public ArrayList<ExclusiveAreaNestingOrder> getExclusiveAreaNestingOrders() {
    return this.exclusiveAreaNestingOrders;
}

    public void setExclusiveAreaNestingOrders(ArrayList<ExclusiveAreaNestingOrder> value) {
        this.exclusiveAreaNestingOrders = value;
    }
    
    
    
    @XmlElementWrapper(name="STATIC-MEMORYS")
@XmlElement(name="VARIABLE-DATA-PROTOTYPE")
    public ArrayList<VariableDataPrototype> getStaticMemorys() {
    return this.staticMemorys;
}

    public void setStaticMemorys(ArrayList<VariableDataPrototype> value) {
        this.staticMemorys = value;
    }
    
    
    
    @XmlElementWrapper(name="BSW-PER-INSTANCE-MEMORY-POLICYS")
@XmlElement(name="BSW-PER-INSTANCE-MEMORY-POLICY")
    public ArrayList<BswPerInstanceMemoryPolicy> getBswPerInstanceMemoryPolicys() {
    return this.bswPerInstanceMemoryPolicys;
}

    public void setBswPerInstanceMemoryPolicys(ArrayList<BswPerInstanceMemoryPolicy> value) {
        this.bswPerInstanceMemoryPolicys = value;
    }
    
    
    
    @XmlElementWrapper(name="CLIENT-POLICYS")
@XmlElement(name="BSW-CLIENT-POLICY")
    public ArrayList<BswClientPolicy> getClientPolicys() {
    return this.clientPolicys;
}

    public void setClientPolicys(ArrayList<BswClientPolicy> value) {
        this.clientPolicys = value;
    }
    
    
    
    @XmlElementWrapper(name="EXCLUSIVE-AREA-POLICYS")
@XmlElement(name="BSW-EXCLUSIVE-AREA-POLICY")
    public ArrayList<BswExclusiveAreaPolicy> getExclusiveAreaPolicys() {
    return this.exclusiveAreaPolicys;
}

    public void setExclusiveAreaPolicys(ArrayList<BswExclusiveAreaPolicy> value) {
        this.exclusiveAreaPolicys = value;
    }
    
    
    
    @XmlElementWrapper(name="INCLUDED-DATA-TYPE-SETS")
@XmlElement(name="INCLUDED-DATA-TYPE-SET")
    public ArrayList<IncludedDataTypeSet> getIncludedDataTypeSets() {
    return this.includedDataTypeSets;
}

    public void setIncludedDataTypeSets(ArrayList<IncludedDataTypeSet> value) {
        this.includedDataTypeSets = value;
    }
    
    
    
    @XmlElementWrapper(name="INTERNAL-TRIGGERING-POINT-POLICYS")
@XmlElement(name="BSW-INTERNAL-TRIGGERING-POINT-POLICY")
    public ArrayList<BswInternalTriggeringPointPolicy> getInternalTriggeringPointPolicys() {
    return this.internalTriggeringPointPolicys;
}

    public void setInternalTriggeringPointPolicys(ArrayList<BswInternalTriggeringPointPolicy> value) {
        this.internalTriggeringPointPolicys = value;
    }
    
    
    
    @XmlElementWrapper(name="PARAMETER-POLICYS")
@XmlElement(name="BSW-PARAMETER-POLICY")
    public ArrayList<BswParameterPolicy> getParameterPolicys() {
    return this.parameterPolicys;
}

    public void setParameterPolicys(ArrayList<BswParameterPolicy> value) {
        this.parameterPolicys = value;
    }
    
    
    
    @XmlElementWrapper(name="RELEASED-TRIGGER-POLICYS")
@XmlElement(name="BSW-RELEASED-TRIGGER-POLICY")
    public ArrayList<BswReleasedTriggerPolicy> getReleasedTriggerPolicys() {
    return this.releasedTriggerPolicys;
}

    public void setReleasedTriggerPolicys(ArrayList<BswReleasedTriggerPolicy> value) {
        this.releasedTriggerPolicys = value;
    }
    
    
    
    @XmlElementWrapper(name="SEND-POLICYS")
@XmlElement(name="BSW-DATA-SEND-POLICY")
    public ArrayList<BswDataSendPolicy> getSendPolicys() {
    return this.sendPolicys;
}

    public void setSendPolicys(ArrayList<BswDataSendPolicy> value) {
        this.sendPolicys = value;
    }
    
    
    
    @XmlElementWrapper(name="VARIATION-POINT-PROXYS")
@XmlElement(name="VARIATION-POINT-PROXY")
    public ArrayList<VariationPointProxy> getVariationPointProxys() {
    return this.variationPointProxys;
}

    public void setVariationPointProxys(ArrayList<VariationPointProxy> value) {
        this.variationPointProxys = value;
    }
    
    
    
    @XmlElementWrapper(name="INTERNAL-TRIGGERING-POINTS")
@XmlElement(name="BSW-INTERNAL-TRIGGERING-POINT")
    public ArrayList<BswInternalTriggeringPoint> getInternalTriggeringPoints() {
    return this.internalTriggeringPoints;
}

    public void setInternalTriggeringPoints(ArrayList<BswInternalTriggeringPoint> value) {
        this.internalTriggeringPoints = value;
    }
    
    
    
    @XmlElement(name="ENTITYS")
    public Entitys getEntitys() {
    return this.entitys;
}

    public void setEntitys(Entitys value) {
        this.entitys = value;
    }
    
    
    
    @XmlElement(name="EVENTS")
    public Events getEvents() {
    return this.events;
}

    public void setEvents(Events value) {
        this.events = value;
    }
    
    
    
    @XmlElementWrapper(name="TRIGGER-DIRECT-IMPLEMENTATIONS")
@XmlElement(name="BSW-TRIGGER-DIRECT-IMPLEMENTATION")
    public ArrayList<BswTriggerDirectImplementation> getTriggerDirectImplementations() {
    return this.triggerDirectImplementations;
}

    public void setTriggerDirectImplementations(ArrayList<BswTriggerDirectImplementation> value) {
        this.triggerDirectImplementations = value;
    }
    
    
    
    @XmlElementWrapper(name="MODE-SENDER-POLICYS")
@XmlElement(name="BSW-MODE-SENDER-POLICY")
    public ArrayList<BswModeSenderPolicy> getModeSenderPolicys() {
    return this.modeSenderPolicys;
}

    public void setModeSenderPolicys(ArrayList<BswModeSenderPolicy> value) {
        this.modeSenderPolicys = value;
    }
    
    
    
    @XmlElementWrapper(name="MODE-RECEIVER-POLICYS")
@XmlElement(name="BSW-MODE-RECEIVER-POLICY")
    public ArrayList<BswModeReceiverPolicy> getModeReceiverPolicys() {
    return this.modeReceiverPolicys;
}

    public void setModeReceiverPolicys(ArrayList<BswModeReceiverPolicy> value) {
        this.modeReceiverPolicys = value;
    }
    
    
    
    @XmlElementWrapper(name="SERVICE-DEPENDENCYS")
@XmlElement(name="BSW-SERVICE-DEPENDENCY")
    public ArrayList<BswServiceDependency> getServiceDependencys() {
    return this.serviceDependencys;
}

    public void setServiceDependencys(ArrayList<BswServiceDependency> value) {
        this.serviceDependencys = value;
    }
    
    
    
    @XmlElementWrapper(name="PER-INSTANCE-PARAMETERS")
@XmlElement(name="PARAMETER-DATA-PROTOTYPE")
    public ArrayList<ParameterDataPrototype> getPerInstanceParameters() {
    return this.perInstanceParameters;
}

    public void setPerInstanceParameters(ArrayList<ParameterDataPrototype> value) {
        this.perInstanceParameters = value;
    }
    
    
    
    @XmlElementWrapper(name="SCHEDULER-NAME-PREFIXS")
@XmlElement(name="BSW-SCHEDULER-NAME-PREFIX")
    public ArrayList<BswSchedulerNamePrefix> getSchedulerNamePrefixs() {
    return this.schedulerNamePrefixs;
}

    public void setSchedulerNamePrefixs(ArrayList<BswSchedulerNamePrefix> value) {
        this.schedulerNamePrefixs = value;
    }
    
    
    
    @XmlElementWrapper(name="RECEPTION-POLICYS")
@XmlElement(name="BSW-QUEUED-DATA-RECEPTION-POLICY")
    public ArrayList<BswQueuedDataReceptionPolicy> getReceptionPolicys() {
    return this.receptionPolicys;
}

    public void setReceptionPolicys(ArrayList<BswQueuedDataReceptionPolicy> value) {
        this.receptionPolicys = value;
    }
    
    
    
    @XmlElementWrapper(name="DISTINGUISHED-PARTITIONS")
@XmlElement(name="BSW-DISTINGUISHED-PARTITION")
    public ArrayList<BswDistinguishedPartition> getDistinguishedPartitions() {
    return this.distinguishedPartitions;
}

    public void setDistinguishedPartitions(ArrayList<BswDistinguishedPartition> value) {
        this.distinguishedPartitions = value;
    }
    
    
}