package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class BswCalledEntity {

    
    
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
    
    
    
    protected ActivationReasons activationReasons;
    
    
    
    protected CanEnterExclusiveAreaRefs canEnterExclusiveAreaRefs;
    
    
    
    protected ExclusiveAreaNestingOrderRefs exclusiveAreaNestingOrderRefs;
    
    
    
    protected TimeValue minimumStartInterval;
    
    
    
    protected ReentrancyLevelEnum reentrancyLevel;
    
    
    
    protected RunsInsideExclusiveAreaRefs runsInsideExclusiveAreaRefs;
    
    
    
    protected SwAddrMethodRef swAddrMethodRef;
    
    
    
    protected AccessedModeGroups accessedModeGroups;
    
    
    
    protected ActivationPoints activationPoints;
    
    
    
    protected CallPoints callPoints;
    
    
    
    protected CalledEntrys calledEntrys;
    
    
    
    protected DataReceivePoints dataReceivePoints;
    
    
    
    protected DataSendPoints dataSendPoints;
    
    
    
    protected ImplementedEntryRef implementedEntryRef;
    
    
    
    protected IssuedTriggers issuedTriggers;
    
    
    
    protected ManagedModeGroups managedModeGroups;
    
    
    
    protected SchedulerNamePrefixRef schedulerNamePrefixRef;
    
    
    
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
    
    
    
    @XmlElement(name="ACTIVATION-REASONS")
    public ActivationReasons getActivationReasons() {
        return this.activationReasons;
    }

    public void setActivationReasons(ActivationReasons value) {
        this.activationReasons = value;
    }
    
    
    
    @XmlElement(name="CAN-ENTER-EXCLUSIVE-AREA-REFS")
    public CanEnterExclusiveAreaRefs getCanEnterExclusiveAreaRefs() {
        return this.canEnterExclusiveAreaRefs;
    }

    public void setCanEnterExclusiveAreaRefs(CanEnterExclusiveAreaRefs value) {
        this.canEnterExclusiveAreaRefs = value;
    }
    
    
    
    @XmlElement(name="EXCLUSIVE-AREA-NESTING-ORDER-REFS")
    public ExclusiveAreaNestingOrderRefs getExclusiveAreaNestingOrderRefs() {
        return this.exclusiveAreaNestingOrderRefs;
    }

    public void setExclusiveAreaNestingOrderRefs(ExclusiveAreaNestingOrderRefs value) {
        this.exclusiveAreaNestingOrderRefs = value;
    }
    
    
    
    @XmlElement(name="MINIMUM-START-INTERVAL")
    public TimeValue getMinimumStartInterval() {
        return this.minimumStartInterval;
    }

    public void setMinimumStartInterval(TimeValue value) {
        this.minimumStartInterval = value;
    }
    
    
    
    @XmlElement(name="REENTRANCY-LEVEL")
    public ReentrancyLevelEnum getReentrancyLevel() {
        return this.reentrancyLevel;
    }

    public void setReentrancyLevel(ReentrancyLevelEnum value) {
        this.reentrancyLevel = value;
    }
    
    
    
    @XmlElement(name="RUNS-INSIDE-EXCLUSIVE-AREA-REFS")
    public RunsInsideExclusiveAreaRefs getRunsInsideExclusiveAreaRefs() {
        return this.runsInsideExclusiveAreaRefs;
    }

    public void setRunsInsideExclusiveAreaRefs(RunsInsideExclusiveAreaRefs value) {
        this.runsInsideExclusiveAreaRefs = value;
    }
    
    
    
    @XmlElement(name="SW-ADDR-METHOD-REF")
    public SwAddrMethodRef getSwAddrMethodRef() {
        return this.swAddrMethodRef;
    }

    public void setSwAddrMethodRef(SwAddrMethodRef value) {
        this.swAddrMethodRef = value;
    }
    
    
    
    @XmlElement(name="ACCESSED-MODE-GROUPS")
    public AccessedModeGroups getAccessedModeGroups() {
        return this.accessedModeGroups;
    }

    public void setAccessedModeGroups(AccessedModeGroups value) {
        this.accessedModeGroups = value;
    }
    
    
    
    @XmlElement(name="ACTIVATION-POINTS")
    public ActivationPoints getActivationPoints() {
        return this.activationPoints;
    }

    public void setActivationPoints(ActivationPoints value) {
        this.activationPoints = value;
    }
    
    
    
    @XmlElement(name="CALL-POINTS")
    public CallPoints getCallPoints() {
        return this.callPoints;
    }

    public void setCallPoints(CallPoints value) {
        this.callPoints = value;
    }
    
    
    
    @XmlElement(name="CALLED-ENTRYS")
    public CalledEntrys getCalledEntrys() {
        return this.calledEntrys;
    }

    public void setCalledEntrys(CalledEntrys value) {
        this.calledEntrys = value;
    }
    
    
    
    @XmlElement(name="DATA-RECEIVE-POINTS")
    public DataReceivePoints getDataReceivePoints() {
        return this.dataReceivePoints;
    }

    public void setDataReceivePoints(DataReceivePoints value) {
        this.dataReceivePoints = value;
    }
    
    
    
    @XmlElement(name="DATA-SEND-POINTS")
    public DataSendPoints getDataSendPoints() {
        return this.dataSendPoints;
    }

    public void setDataSendPoints(DataSendPoints value) {
        this.dataSendPoints = value;
    }
    
    
    
    @XmlElement(name="IMPLEMENTED-ENTRY-REF")
    public ImplementedEntryRef getImplementedEntryRef() {
        return this.implementedEntryRef;
    }

    public void setImplementedEntryRef(ImplementedEntryRef value) {
        this.implementedEntryRef = value;
    }
    
    
    
    @XmlElement(name="ISSUED-TRIGGERS")
    public IssuedTriggers getIssuedTriggers() {
        return this.issuedTriggers;
    }

    public void setIssuedTriggers(IssuedTriggers value) {
        this.issuedTriggers = value;
    }
    
    
    
    @XmlElement(name="MANAGED-MODE-GROUPS")
    public ManagedModeGroups getManagedModeGroups() {
        return this.managedModeGroups;
    }

    public void setManagedModeGroups(ManagedModeGroups value) {
        this.managedModeGroups = value;
    }
    
    
    
    @XmlElement(name="SCHEDULER-NAME-PREFIX-REF")
    public SchedulerNamePrefixRef getSchedulerNamePrefixRef() {
        return this.schedulerNamePrefixRef;
    }

    public void setSchedulerNamePrefixRef(SchedulerNamePrefixRef value) {
        this.schedulerNamePrefixRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}