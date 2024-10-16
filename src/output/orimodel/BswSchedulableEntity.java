package stdgui.data.model.orimodel;
@XmlRootElement(name = "BSW-SCHEDULABLE-ENTITY")
public class BswSchedulableEntity {

    
    
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
    
    
    
    protected ArrayList<ExecutableEntityActivationReason> activationReasons;
    
    
    
    protected ArrayList<CanEnterExclusiveAreaRef> canEnterExclusiveAreaRefs;
    
    
    
    protected ArrayList<ExclusiveAreaNestingOrderRef> exclusiveAreaNestingOrderRefs;
    
    
    
    protected TimeValue minimumStartInterval;
    
    
    
    protected ReentrancyLevelEnum reentrancyLevel;
    
    
    
    protected ArrayList<RunsInsideExclusiveAreaRef> runsInsideExclusiveAreaRefs;
    
    
    
    protected SwAddrMethodRef swAddrMethodRef;
    
    
    
    protected ArrayList<ModeDeclarationGroupPrototypeRefConditional> accessedModeGroups;
    
    
    
    protected ArrayList<BswInternalTriggeringPointRefConditional> activationPoints;
    
    
    
    protected CallPoints callPoints;
    
    
    
    protected ArrayList<BswModuleEntryRefConditional> calledEntrys;
    
    
    
    protected ArrayList<BswVariableAccess> dataReceivePoints;
    
    
    
    protected ArrayList<BswVariableAccess> dataSendPoints;
    
    
    
    protected ImplementedEntryRef implementedEntryRef;
    
    
    
    protected ArrayList<TriggerRefConditional> issuedTriggers;
    
    
    
    protected ArrayList<ModeDeclarationGroupPrototypeRefConditional> managedModeGroups;
    
    
    
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
    
    
    
    @XmlElementWrapper(name="ACTIVATION-REASONS")
@XmlElement(name="EXECUTABLE-ENTITY-ACTIVATION-REASON")
    public ArrayList<ExecutableEntityActivationReason> getActivationReasons() {
    return this.activationReasons;
}

    public void setActivationReasons(ArrayList<ExecutableEntityActivationReason> value) {
        this.activationReasons = value;
    }
    
    
    
    @XmlElementWrapper(name="CAN-ENTER-EXCLUSIVE-AREA-REFS")
@XmlElement(name="CAN-ENTER-EXCLUSIVE-AREA-REF")
    public ArrayList<CanEnterExclusiveAreaRef> getCanEnterExclusiveAreaRefs() {
    return this.canEnterExclusiveAreaRefs;
}

    public void setCanEnterExclusiveAreaRefs(ArrayList<CanEnterExclusiveAreaRef> value) {
        this.canEnterExclusiveAreaRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="EXCLUSIVE-AREA-NESTING-ORDER-REFS")
@XmlElement(name="EXCLUSIVE-AREA-NESTING-ORDER-REF")
    public ArrayList<ExclusiveAreaNestingOrderRef> getExclusiveAreaNestingOrderRefs() {
    return this.exclusiveAreaNestingOrderRefs;
}

    public void setExclusiveAreaNestingOrderRefs(ArrayList<ExclusiveAreaNestingOrderRef> value) {
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
    
    
    
    @XmlElementWrapper(name="RUNS-INSIDE-EXCLUSIVE-AREA-REFS")
@XmlElement(name="RUNS-INSIDE-EXCLUSIVE-AREA-REF")
    public ArrayList<RunsInsideExclusiveAreaRef> getRunsInsideExclusiveAreaRefs() {
    return this.runsInsideExclusiveAreaRefs;
}

    public void setRunsInsideExclusiveAreaRefs(ArrayList<RunsInsideExclusiveAreaRef> value) {
        this.runsInsideExclusiveAreaRefs = value;
    }
    
    
    
    @XmlElement(name="SW-ADDR-METHOD-REF")
    public SwAddrMethodRef getSwAddrMethodRef() {
    return this.swAddrMethodRef;
}

    public void setSwAddrMethodRef(SwAddrMethodRef value) {
        this.swAddrMethodRef = value;
    }
    
    
    
    @XmlElementWrapper(name="ACCESSED-MODE-GROUPS")
@XmlElement(name="MODE-DECLARATION-GROUP-PROTOTYPE-REF-CONDITIONAL")
    public ArrayList<ModeDeclarationGroupPrototypeRefConditional> getAccessedModeGroups() {
    return this.accessedModeGroups;
}

    public void setAccessedModeGroups(ArrayList<ModeDeclarationGroupPrototypeRefConditional> value) {
        this.accessedModeGroups = value;
    }
    
    
    
    @XmlElementWrapper(name="ACTIVATION-POINTS")
@XmlElement(name="BSW-INTERNAL-TRIGGERING-POINT-REF-CONDITIONAL")
    public ArrayList<BswInternalTriggeringPointRefConditional> getActivationPoints() {
    return this.activationPoints;
}

    public void setActivationPoints(ArrayList<BswInternalTriggeringPointRefConditional> value) {
        this.activationPoints = value;
    }
    
    
    
    @XmlElement(name="CALL-POINTS")
    public CallPoints getCallPoints() {
    return this.callPoints;
}

    public void setCallPoints(CallPoints value) {
        this.callPoints = value;
    }
    
    
    
    @XmlElementWrapper(name="CALLED-ENTRYS")
@XmlElement(name="BSW-MODULE-ENTRY-REF-CONDITIONAL")
    public ArrayList<BswModuleEntryRefConditional> getCalledEntrys() {
    return this.calledEntrys;
}

    public void setCalledEntrys(ArrayList<BswModuleEntryRefConditional> value) {
        this.calledEntrys = value;
    }
    
    
    
    @XmlElementWrapper(name="DATA-RECEIVE-POINTS")
@XmlElement(name="BSW-VARIABLE-ACCESS")
    public ArrayList<BswVariableAccess> getDataReceivePoints() {
    return this.dataReceivePoints;
}

    public void setDataReceivePoints(ArrayList<BswVariableAccess> value) {
        this.dataReceivePoints = value;
    }
    
    
    
    @XmlElementWrapper(name="DATA-SEND-POINTS")
@XmlElement(name="BSW-VARIABLE-ACCESS")
    public ArrayList<BswVariableAccess> getDataSendPoints() {
    return this.dataSendPoints;
}

    public void setDataSendPoints(ArrayList<BswVariableAccess> value) {
        this.dataSendPoints = value;
    }
    
    
    
    @XmlElement(name="IMPLEMENTED-ENTRY-REF")
    public ImplementedEntryRef getImplementedEntryRef() {
    return this.implementedEntryRef;
}

    public void setImplementedEntryRef(ImplementedEntryRef value) {
        this.implementedEntryRef = value;
    }
    
    
    
    @XmlElementWrapper(name="ISSUED-TRIGGERS")
@XmlElement(name="TRIGGER-REF-CONDITIONAL")
    public ArrayList<TriggerRefConditional> getIssuedTriggers() {
    return this.issuedTriggers;
}

    public void setIssuedTriggers(ArrayList<TriggerRefConditional> value) {
        this.issuedTriggers = value;
    }
    
    
    
    @XmlElementWrapper(name="MANAGED-MODE-GROUPS")
@XmlElement(name="MODE-DECLARATION-GROUP-PROTOTYPE-REF-CONDITIONAL")
    public ArrayList<ModeDeclarationGroupPrototypeRefConditional> getManagedModeGroups() {
    return this.managedModeGroups;
}

    public void setManagedModeGroups(ArrayList<ModeDeclarationGroupPrototypeRefConditional> value) {
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