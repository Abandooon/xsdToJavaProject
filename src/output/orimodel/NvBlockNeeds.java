package stdgui.data.model.orimodel;
@XmlRootElement(name = "NV-BLOCK-NEEDS")
public class NvBlockNeeds {

    
    
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
    
    
    
    protected Boolean calcRamBlockCrc;
    
    
    
    protected Boolean checkStaticBlockId;
    
    
    
    protected TimeValue cyclicWritingPeriod;
    
    
    
    protected PositiveInteger nDataSets;
    
    
    
    protected PositiveInteger nRomBlocks;
    
    
    
    protected RamBlockStatusControlEnum ramBlockStatusControl;
    
    
    
    protected Boolean readonly;
    
    
    
    protected NvBlockNeedsReliabilityEnum reliability;
    
    
    
    protected Boolean resistantToChangedSw;
    
    
    
    protected Boolean restoreAtStart;
    
    
    
    protected Boolean storeAtShutdown;
    
    
    
    protected Boolean storeCyclic;
    
    
    
    protected Boolean storeEmergency;
    
    
    
    protected Boolean storeImmediate;
    
    
    
    protected Boolean useAutoValidationAtShutDown;
    
    
    
    protected Boolean useCrcCompMechanism;
    
    
    
    protected Boolean writeOnlyOnce;
    
    
    
    protected Boolean writeVerification;
    
    
    
    protected PositiveInteger writingFrequency;
    
    
    
    protected NvBlockNeedsWritingPriorityEnum writingPriority;
    
    

    
    
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
    
    
    
    @XmlElement(name="CALC-RAM-BLOCK-CRC")
    public Boolean getCalcRamBlockCrc() {
    return this.calcRamBlockCrc;
}

    public void setCalcRamBlockCrc(Boolean value) {
        this.calcRamBlockCrc = value;
    }
    
    
    
    @XmlElement(name="CHECK-STATIC-BLOCK-ID")
    public Boolean getCheckStaticBlockId() {
    return this.checkStaticBlockId;
}

    public void setCheckStaticBlockId(Boolean value) {
        this.checkStaticBlockId = value;
    }
    
    
    
    @XmlElement(name="CYCLIC-WRITING-PERIOD")
    public TimeValue getCyclicWritingPeriod() {
    return this.cyclicWritingPeriod;
}

    public void setCyclicWritingPeriod(TimeValue value) {
        this.cyclicWritingPeriod = value;
    }
    
    
    
    @XmlElement(name="N-DATA-SETS")
    public PositiveInteger getNDataSets() {
    return this.nDataSets;
}

    public void setNDataSets(PositiveInteger value) {
        this.nDataSets = value;
    }
    
    
    
    @XmlElement(name="N-ROM-BLOCKS")
    public PositiveInteger getNRomBlocks() {
    return this.nRomBlocks;
}

    public void setNRomBlocks(PositiveInteger value) {
        this.nRomBlocks = value;
    }
    
    
    
    @XmlElement(name="RAM-BLOCK-STATUS-CONTROL")
    public RamBlockStatusControlEnum getRamBlockStatusControl() {
    return this.ramBlockStatusControl;
}

    public void setRamBlockStatusControl(RamBlockStatusControlEnum value) {
        this.ramBlockStatusControl = value;
    }
    
    
    
    @XmlElement(name="READONLY")
    public Boolean getReadonly() {
    return this.readonly;
}

    public void setReadonly(Boolean value) {
        this.readonly = value;
    }
    
    
    
    @XmlElement(name="RELIABILITY")
    public NvBlockNeedsReliabilityEnum getReliability() {
    return this.reliability;
}

    public void setReliability(NvBlockNeedsReliabilityEnum value) {
        this.reliability = value;
    }
    
    
    
    @XmlElement(name="RESISTANT-TO-CHANGED-SW")
    public Boolean getResistantToChangedSw() {
    return this.resistantToChangedSw;
}

    public void setResistantToChangedSw(Boolean value) {
        this.resistantToChangedSw = value;
    }
    
    
    
    @XmlElement(name="RESTORE-AT-START")
    public Boolean getRestoreAtStart() {
    return this.restoreAtStart;
}

    public void setRestoreAtStart(Boolean value) {
        this.restoreAtStart = value;
    }
    
    
    
    @XmlElement(name="STORE-AT-SHUTDOWN")
    public Boolean getStoreAtShutdown() {
    return this.storeAtShutdown;
}

    public void setStoreAtShutdown(Boolean value) {
        this.storeAtShutdown = value;
    }
    
    
    
    @XmlElement(name="STORE-CYCLIC")
    public Boolean getStoreCyclic() {
    return this.storeCyclic;
}

    public void setStoreCyclic(Boolean value) {
        this.storeCyclic = value;
    }
    
    
    
    @XmlElement(name="STORE-EMERGENCY")
    public Boolean getStoreEmergency() {
    return this.storeEmergency;
}

    public void setStoreEmergency(Boolean value) {
        this.storeEmergency = value;
    }
    
    
    
    @XmlElement(name="STORE-IMMEDIATE")
    public Boolean getStoreImmediate() {
    return this.storeImmediate;
}

    public void setStoreImmediate(Boolean value) {
        this.storeImmediate = value;
    }
    
    
    
    @XmlElement(name="USE-AUTO-VALIDATION-AT-SHUT-DOWN")
    public Boolean getUseAutoValidationAtShutDown() {
    return this.useAutoValidationAtShutDown;
}

    public void setUseAutoValidationAtShutDown(Boolean value) {
        this.useAutoValidationAtShutDown = value;
    }
    
    
    
    @XmlElement(name="USE-CRC-COMP-MECHANISM")
    public Boolean getUseCrcCompMechanism() {
    return this.useCrcCompMechanism;
}

    public void setUseCrcCompMechanism(Boolean value) {
        this.useCrcCompMechanism = value;
    }
    
    
    
    @XmlElement(name="WRITE-ONLY-ONCE")
    public Boolean getWriteOnlyOnce() {
    return this.writeOnlyOnce;
}

    public void setWriteOnlyOnce(Boolean value) {
        this.writeOnlyOnce = value;
    }
    
    
    
    @XmlElement(name="WRITE-VERIFICATION")
    public Boolean getWriteVerification() {
    return this.writeVerification;
}

    public void setWriteVerification(Boolean value) {
        this.writeVerification = value;
    }
    
    
    
    @XmlElement(name="WRITING-FREQUENCY")
    public PositiveInteger getWritingFrequency() {
    return this.writingFrequency;
}

    public void setWritingFrequency(PositiveInteger value) {
        this.writingFrequency = value;
    }
    
    
    
    @XmlElement(name="WRITING-PRIORITY")
    public NvBlockNeedsWritingPriorityEnum getWritingPriority() {
    return this.writingPriority;
}

    public void setWritingPriority(NvBlockNeedsWritingPriorityEnum value) {
        this.writingPriority = value;
    }
    
    
}