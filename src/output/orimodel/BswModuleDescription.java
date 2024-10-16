package stdgui.data.model.orimodel;
@XmlRootElement(name = "BSW-MODULE-DESCRIPTION")
public class BswModuleDescription {

    
    
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
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected BlueprintPolicys blueprintPolicys;
    
    
    
    protected String shortNamePattern;
    
    
    
    protected PositiveInteger moduleId;
    
    
    
    protected ArrayList<SwComponentDocumentation> bswModuleDocumentations;
    
    
    
    protected ArrayList<BswModuleEntryRefConditional> providedEntrys;
    
    
    
    protected ArrayList<BswModuleEntryRefConditional> outgoingCallbacks;
    
    
    
    protected ArrayList<BswModuleDependency> bswModuleDependencys;
    
    
    
    protected ArrayList<ModeDeclarationGroupPrototype> providedModeGroups;
    
    
    
    protected ArrayList<ModeDeclarationGroupPrototype> requiredModeGroups;
    
    
    
    protected ArrayList<Trigger> releasedTriggers;
    
    
    
    protected ArrayList<Trigger> requiredTriggers;
    
    
    
    protected ArrayList<BswModuleClientServerEntry> providedClientServerEntrys;
    
    
    
    protected ArrayList<BswModuleClientServerEntry> requiredClientServerEntrys;
    
    
    
    protected ArrayList<VariableDataPrototype> providedDatas;
    
    
    
    protected ArrayList<VariableDataPrototype> requiredDatas;
    
    
    
    protected ArrayList<BswInternalBehavior> internalBehaviors;
    
    

    
    
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
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="BLUEPRINT-POLICYS")
    public BlueprintPolicys getBlueprintPolicys() {
    return this.blueprintPolicys;
}

    public void setBlueprintPolicys(BlueprintPolicys value) {
        this.blueprintPolicys = value;
    }
    
    
    
    @XmlElement(name="SHORT-NAME-PATTERN")
    public String getShortNamePattern() {
    return this.shortNamePattern;
}

    public void setShortNamePattern(String value) {
        this.shortNamePattern = value;
    }
    
    
    
    @XmlElement(name="MODULE-ID")
    public PositiveInteger getModuleId() {
    return this.moduleId;
}

    public void setModuleId(PositiveInteger value) {
        this.moduleId = value;
    }
    
    
    
    @XmlElementWrapper(name="BSW-MODULE-DOCUMENTATIONS")
@XmlElement(name="SW-COMPONENT-DOCUMENTATION")
    public ArrayList<SwComponentDocumentation> getBswModuleDocumentations() {
    return this.bswModuleDocumentations;
}

    public void setBswModuleDocumentations(ArrayList<SwComponentDocumentation> value) {
        this.bswModuleDocumentations = value;
    }
    
    
    
    @XmlElementWrapper(name="PROVIDED-ENTRYS")
@XmlElement(name="BSW-MODULE-ENTRY-REF-CONDITIONAL")
    public ArrayList<BswModuleEntryRefConditional> getProvidedEntrys() {
    return this.providedEntrys;
}

    public void setProvidedEntrys(ArrayList<BswModuleEntryRefConditional> value) {
        this.providedEntrys = value;
    }
    
    
    
    @XmlElementWrapper(name="OUTGOING-CALLBACKS")
@XmlElement(name="BSW-MODULE-ENTRY-REF-CONDITIONAL")
    public ArrayList<BswModuleEntryRefConditional> getOutgoingCallbacks() {
    return this.outgoingCallbacks;
}

    public void setOutgoingCallbacks(ArrayList<BswModuleEntryRefConditional> value) {
        this.outgoingCallbacks = value;
    }
    
    
    
    @XmlElementWrapper(name="BSW-MODULE-DEPENDENCYS")
@XmlElement(name="BSW-MODULE-DEPENDENCY")
    public ArrayList<BswModuleDependency> getBswModuleDependencys() {
    return this.bswModuleDependencys;
}

    public void setBswModuleDependencys(ArrayList<BswModuleDependency> value) {
        this.bswModuleDependencys = value;
    }
    
    
    
    @XmlElementWrapper(name="PROVIDED-MODE-GROUPS")
@XmlElement(name="MODE-DECLARATION-GROUP-PROTOTYPE")
    public ArrayList<ModeDeclarationGroupPrototype> getProvidedModeGroups() {
    return this.providedModeGroups;
}

    public void setProvidedModeGroups(ArrayList<ModeDeclarationGroupPrototype> value) {
        this.providedModeGroups = value;
    }
    
    
    
    @XmlElementWrapper(name="REQUIRED-MODE-GROUPS")
@XmlElement(name="MODE-DECLARATION-GROUP-PROTOTYPE")
    public ArrayList<ModeDeclarationGroupPrototype> getRequiredModeGroups() {
    return this.requiredModeGroups;
}

    public void setRequiredModeGroups(ArrayList<ModeDeclarationGroupPrototype> value) {
        this.requiredModeGroups = value;
    }
    
    
    
    @XmlElementWrapper(name="RELEASED-TRIGGERS")
@XmlElement(name="TRIGGER")
    public ArrayList<Trigger> getReleasedTriggers() {
    return this.releasedTriggers;
}

    public void setReleasedTriggers(ArrayList<Trigger> value) {
        this.releasedTriggers = value;
    }
    
    
    
    @XmlElementWrapper(name="REQUIRED-TRIGGERS")
@XmlElement(name="TRIGGER")
    public ArrayList<Trigger> getRequiredTriggers() {
    return this.requiredTriggers;
}

    public void setRequiredTriggers(ArrayList<Trigger> value) {
        this.requiredTriggers = value;
    }
    
    
    
    @XmlElementWrapper(name="PROVIDED-CLIENT-SERVER-ENTRYS")
@XmlElement(name="BSW-MODULE-CLIENT-SERVER-ENTRY")
    public ArrayList<BswModuleClientServerEntry> getProvidedClientServerEntrys() {
    return this.providedClientServerEntrys;
}

    public void setProvidedClientServerEntrys(ArrayList<BswModuleClientServerEntry> value) {
        this.providedClientServerEntrys = value;
    }
    
    
    
    @XmlElementWrapper(name="REQUIRED-CLIENT-SERVER-ENTRYS")
@XmlElement(name="BSW-MODULE-CLIENT-SERVER-ENTRY")
    public ArrayList<BswModuleClientServerEntry> getRequiredClientServerEntrys() {
    return this.requiredClientServerEntrys;
}

    public void setRequiredClientServerEntrys(ArrayList<BswModuleClientServerEntry> value) {
        this.requiredClientServerEntrys = value;
    }
    
    
    
    @XmlElementWrapper(name="PROVIDED-DATAS")
@XmlElement(name="VARIABLE-DATA-PROTOTYPE")
    public ArrayList<VariableDataPrototype> getProvidedDatas() {
    return this.providedDatas;
}

    public void setProvidedDatas(ArrayList<VariableDataPrototype> value) {
        this.providedDatas = value;
    }
    
    
    
    @XmlElementWrapper(name="REQUIRED-DATAS")
@XmlElement(name="VARIABLE-DATA-PROTOTYPE")
    public ArrayList<VariableDataPrototype> getRequiredDatas() {
    return this.requiredDatas;
}

    public void setRequiredDatas(ArrayList<VariableDataPrototype> value) {
        this.requiredDatas = value;
    }
    
    
    
    @XmlElementWrapper(name="INTERNAL-BEHAVIORS")
@XmlElement(name="BSW-INTERNAL-BEHAVIOR")
    public ArrayList<BswInternalBehavior> getInternalBehaviors() {
    return this.internalBehaviors;
}

    public void setInternalBehaviors(ArrayList<BswInternalBehavior> value) {
        this.internalBehaviors = value;
    }
    
    
}