package stdgui.data.model.orimodel;
@XmlRootElement(name = "BUILD-ACTION")
public class BuildAction {

    
    
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
    
    
    
    protected BlueprintPolicys blueprintPolicys;
    
    
    
    protected String shortNamePattern;
    
    
    
    protected ArrayList<AutosarEngineeringObject> deliveryArtifacts;
    
    
    
    protected BuildActionInvocator invocation;
    
    
    
    protected ArrayList<PredecessorActionRef> predecessorActionRefs;
    
    
    
    protected ArrayList<FollowUpActionRef> followUpActionRefs;
    
    
    
    protected ArrayList<BuildActionIoElement> createdDatas;
    
    
    
    protected ArrayList<BuildActionIoElement> inputDatas;
    
    
    
    protected ArrayList<BuildActionIoElement> modifiedDatas;
    
    
    
    protected RequiredEnvironmentRef requiredEnvironmentRef;
    
    
    
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
    
    
    
    @XmlElementWrapper(name="DELIVERY-ARTIFACTS")
@XmlElement(name="AUTOSAR-ENGINEERING-OBJECT")
    public ArrayList<AutosarEngineeringObject> getDeliveryArtifacts() {
    return this.deliveryArtifacts;
}

    public void setDeliveryArtifacts(ArrayList<AutosarEngineeringObject> value) {
        this.deliveryArtifacts = value;
    }
    
    
    
    @XmlElement(name="INVOCATION")
    public BuildActionInvocator getInvocation() {
    return this.invocation;
}

    public void setInvocation(BuildActionInvocator value) {
        this.invocation = value;
    }
    
    
    
    @XmlElementWrapper(name="PREDECESSOR-ACTION-REFS")
@XmlElement(name="PREDECESSOR-ACTION-REF")
    public ArrayList<PredecessorActionRef> getPredecessorActionRefs() {
    return this.predecessorActionRefs;
}

    public void setPredecessorActionRefs(ArrayList<PredecessorActionRef> value) {
        this.predecessorActionRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="FOLLOW-UP-ACTION-REFS")
@XmlElement(name="FOLLOW-UP-ACTION-REF")
    public ArrayList<FollowUpActionRef> getFollowUpActionRefs() {
    return this.followUpActionRefs;
}

    public void setFollowUpActionRefs(ArrayList<FollowUpActionRef> value) {
        this.followUpActionRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="CREATED-DATAS")
@XmlElement(name="BUILD-ACTION-IO-ELEMENT")
    public ArrayList<BuildActionIoElement> getCreatedDatas() {
    return this.createdDatas;
}

    public void setCreatedDatas(ArrayList<BuildActionIoElement> value) {
        this.createdDatas = value;
    }
    
    
    
    @XmlElementWrapper(name="INPUT-DATAS")
@XmlElement(name="BUILD-ACTION-IO-ELEMENT")
    public ArrayList<BuildActionIoElement> getInputDatas() {
    return this.inputDatas;
}

    public void setInputDatas(ArrayList<BuildActionIoElement> value) {
        this.inputDatas = value;
    }
    
    
    
    @XmlElementWrapper(name="MODIFIED-DATAS")
@XmlElement(name="BUILD-ACTION-IO-ELEMENT")
    public ArrayList<BuildActionIoElement> getModifiedDatas() {
    return this.modifiedDatas;
}

    public void setModifiedDatas(ArrayList<BuildActionIoElement> value) {
        this.modifiedDatas = value;
    }
    
    
    
    @XmlElement(name="REQUIRED-ENVIRONMENT-REF")
    public RequiredEnvironmentRef getRequiredEnvironmentRef() {
    return this.requiredEnvironmentRef;
}

    public void setRequiredEnvironmentRef(RequiredEnvironmentRef value) {
        this.requiredEnvironmentRef = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}