package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class BswInternalBehavior {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String uuid;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ShortNameFragments shortNameFragments;
    
    
    
    protected MultilanguageLongName longName;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected AdminData adminData;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected Annotations annotations;
    
    
    
    protected ConstantMemorys constantMemorys;
    
    
    
    protected ConstantValueMappingRefs constantValueMappingRefs;
    
    
    
    protected DataTypeMappingRefs dataTypeMappingRefs;
    
    
    
    protected ExclusiveAreas exclusiveAreas;
    
    
    
    protected ExclusiveAreaNestingOrders exclusiveAreaNestingOrders;
    
    
    
    protected StaticMemorys staticMemorys;
    
    
    
    protected BswPerInstanceMemoryPolicys bswPerInstanceMemoryPolicys;
    
    
    
    protected ClientPolicys clientPolicys;
    
    
    
    protected ExclusiveAreaPolicys exclusiveAreaPolicys;
    
    
    
    protected IncludedDataTypeSets includedDataTypeSets;
    
    
    
    protected InternalTriggeringPointPolicys internalTriggeringPointPolicys;
    
    
    
    protected ParameterPolicys parameterPolicys;
    
    
    
    protected ReleasedTriggerPolicys releasedTriggerPolicys;
    
    
    
    protected SendPolicys sendPolicys;
    
    
    
    protected VariationPointProxys variationPointProxys;
    
    
    
    protected InternalTriggeringPoints internalTriggeringPoints;
    
    
    
    protected Entitys entitys;
    
    
    
    protected Events events;
    
    
    
    protected TriggerDirectImplementations triggerDirectImplementations;
    
    
    
    protected ModeSenderPolicys modeSenderPolicys;
    
    
    
    protected ModeReceiverPolicys modeReceiverPolicys;
    
    
    
    protected ServiceDependencys serviceDependencys;
    
    
    
    protected PerInstanceParameters perInstanceParameters;
    
    
    
    protected SchedulerNamePrefixs schedulerNamePrefixs;
    
    
    
    protected ReceptionPolicys receptionPolicys;
    
    
    
    protected DistinguishedPartitions distinguishedPartitions;
    
    

    
    
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
    
    
    
    @XmlElement(name="SHORT-NAME-FRAGMENTS")
    public ShortNameFragments getShortNameFragments() {
        return this.shortNameFragments;
    }

    public void setShortNameFragments(ShortNameFragments value) {
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
    
    
    
    @XmlElement(name="ANNOTATIONS")
    public Annotations getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Annotations value) {
        this.annotations = value;
    }
    
    
    
    @XmlElement(name="CONSTANT-MEMORYS")
    public ConstantMemorys getConstantMemorys() {
        return this.constantMemorys;
    }

    public void setConstantMemorys(ConstantMemorys value) {
        this.constantMemorys = value;
    }
    
    
    
    @XmlElement(name="CONSTANT-VALUE-MAPPING-REFS")
    public ConstantValueMappingRefs getConstantValueMappingRefs() {
        return this.constantValueMappingRefs;
    }

    public void setConstantValueMappingRefs(ConstantValueMappingRefs value) {
        this.constantValueMappingRefs = value;
    }
    
    
    
    @XmlElement(name="DATA-TYPE-MAPPING-REFS")
    public DataTypeMappingRefs getDataTypeMappingRefs() {
        return this.dataTypeMappingRefs;
    }

    public void setDataTypeMappingRefs(DataTypeMappingRefs value) {
        this.dataTypeMappingRefs = value;
    }
    
    
    
    @XmlElement(name="EXCLUSIVE-AREAS")
    public ExclusiveAreas getExclusiveAreas() {
        return this.exclusiveAreas;
    }

    public void setExclusiveAreas(ExclusiveAreas value) {
        this.exclusiveAreas = value;
    }
    
    
    
    @XmlElement(name="EXCLUSIVE-AREA-NESTING-ORDERS")
    public ExclusiveAreaNestingOrders getExclusiveAreaNestingOrders() {
        return this.exclusiveAreaNestingOrders;
    }

    public void setExclusiveAreaNestingOrders(ExclusiveAreaNestingOrders value) {
        this.exclusiveAreaNestingOrders = value;
    }
    
    
    
    @XmlElement(name="STATIC-MEMORYS")
    public StaticMemorys getStaticMemorys() {
        return this.staticMemorys;
    }

    public void setStaticMemorys(StaticMemorys value) {
        this.staticMemorys = value;
    }
    
    
    
    @XmlElement(name="BSW-PER-INSTANCE-MEMORY-POLICYS")
    public BswPerInstanceMemoryPolicys getBswPerInstanceMemoryPolicys() {
        return this.bswPerInstanceMemoryPolicys;
    }

    public void setBswPerInstanceMemoryPolicys(BswPerInstanceMemoryPolicys value) {
        this.bswPerInstanceMemoryPolicys = value;
    }
    
    
    
    @XmlElement(name="CLIENT-POLICYS")
    public ClientPolicys getClientPolicys() {
        return this.clientPolicys;
    }

    public void setClientPolicys(ClientPolicys value) {
        this.clientPolicys = value;
    }
    
    
    
    @XmlElement(name="EXCLUSIVE-AREA-POLICYS")
    public ExclusiveAreaPolicys getExclusiveAreaPolicys() {
        return this.exclusiveAreaPolicys;
    }

    public void setExclusiveAreaPolicys(ExclusiveAreaPolicys value) {
        this.exclusiveAreaPolicys = value;
    }
    
    
    
    @XmlElement(name="INCLUDED-DATA-TYPE-SETS")
    public IncludedDataTypeSets getIncludedDataTypeSets() {
        return this.includedDataTypeSets;
    }

    public void setIncludedDataTypeSets(IncludedDataTypeSets value) {
        this.includedDataTypeSets = value;
    }
    
    
    
    @XmlElement(name="INTERNAL-TRIGGERING-POINT-POLICYS")
    public InternalTriggeringPointPolicys getInternalTriggeringPointPolicys() {
        return this.internalTriggeringPointPolicys;
    }

    public void setInternalTriggeringPointPolicys(InternalTriggeringPointPolicys value) {
        this.internalTriggeringPointPolicys = value;
    }
    
    
    
    @XmlElement(name="PARAMETER-POLICYS")
    public ParameterPolicys getParameterPolicys() {
        return this.parameterPolicys;
    }

    public void setParameterPolicys(ParameterPolicys value) {
        this.parameterPolicys = value;
    }
    
    
    
    @XmlElement(name="RELEASED-TRIGGER-POLICYS")
    public ReleasedTriggerPolicys getReleasedTriggerPolicys() {
        return this.releasedTriggerPolicys;
    }

    public void setReleasedTriggerPolicys(ReleasedTriggerPolicys value) {
        this.releasedTriggerPolicys = value;
    }
    
    
    
    @XmlElement(name="SEND-POLICYS")
    public SendPolicys getSendPolicys() {
        return this.sendPolicys;
    }

    public void setSendPolicys(SendPolicys value) {
        this.sendPolicys = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT-PROXYS")
    public VariationPointProxys getVariationPointProxys() {
        return this.variationPointProxys;
    }

    public void setVariationPointProxys(VariationPointProxys value) {
        this.variationPointProxys = value;
    }
    
    
    
    @XmlElement(name="INTERNAL-TRIGGERING-POINTS")
    public InternalTriggeringPoints getInternalTriggeringPoints() {
        return this.internalTriggeringPoints;
    }

    public void setInternalTriggeringPoints(InternalTriggeringPoints value) {
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
    
    
    
    @XmlElement(name="TRIGGER-DIRECT-IMPLEMENTATIONS")
    public TriggerDirectImplementations getTriggerDirectImplementations() {
        return this.triggerDirectImplementations;
    }

    public void setTriggerDirectImplementations(TriggerDirectImplementations value) {
        this.triggerDirectImplementations = value;
    }
    
    
    
    @XmlElement(name="MODE-SENDER-POLICYS")
    public ModeSenderPolicys getModeSenderPolicys() {
        return this.modeSenderPolicys;
    }

    public void setModeSenderPolicys(ModeSenderPolicys value) {
        this.modeSenderPolicys = value;
    }
    
    
    
    @XmlElement(name="MODE-RECEIVER-POLICYS")
    public ModeReceiverPolicys getModeReceiverPolicys() {
        return this.modeReceiverPolicys;
    }

    public void setModeReceiverPolicys(ModeReceiverPolicys value) {
        this.modeReceiverPolicys = value;
    }
    
    
    
    @XmlElement(name="SERVICE-DEPENDENCYS")
    public ServiceDependencys getServiceDependencys() {
        return this.serviceDependencys;
    }

    public void setServiceDependencys(ServiceDependencys value) {
        this.serviceDependencys = value;
    }
    
    
    
    @XmlElement(name="PER-INSTANCE-PARAMETERS")
    public PerInstanceParameters getPerInstanceParameters() {
        return this.perInstanceParameters;
    }

    public void setPerInstanceParameters(PerInstanceParameters value) {
        this.perInstanceParameters = value;
    }
    
    
    
    @XmlElement(name="SCHEDULER-NAME-PREFIXS")
    public SchedulerNamePrefixs getSchedulerNamePrefixs() {
        return this.schedulerNamePrefixs;
    }

    public void setSchedulerNamePrefixs(SchedulerNamePrefixs value) {
        this.schedulerNamePrefixs = value;
    }
    
    
    
    @XmlElement(name="RECEPTION-POLICYS")
    public ReceptionPolicys getReceptionPolicys() {
        return this.receptionPolicys;
    }

    public void setReceptionPolicys(ReceptionPolicys value) {
        this.receptionPolicys = value;
    }
    
    
    
    @XmlElement(name="DISTINGUISHED-PARTITIONS")
    public DistinguishedPartitions getDistinguishedPartitions() {
        return this.distinguishedPartitions;
    }

    public void setDistinguishedPartitions(DistinguishedPartitions value) {
        this.distinguishedPartitions = value;
    }
    
    
}