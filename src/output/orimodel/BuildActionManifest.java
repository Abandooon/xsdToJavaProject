package stdgui.data.model.orimodel;
@XmlRootElement(name = "BUILD-ACTION-MANIFEST")
public class BuildActionManifest {

    
    
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
    
    
    
    protected ArrayList<StartActionRef> startActionRefs;
    
    
    
    protected ArrayList<TearDownActionRef> tearDownActionRefs;
    
    
    
    protected ArrayList<BuildAction> buildActions;
    
    
    
    protected ArrayList<BuildActionEnvironment> buildActionEnvironments;
    
    
    
    protected ArrayList<DynamicActionRef> dynamicActionRefs;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="START-ACTION-REFS")
@XmlElement(name="START-ACTION-REF")
    public ArrayList<StartActionRef> getStartActionRefs() {
    return this.startActionRefs;
}

    public void setStartActionRefs(ArrayList<StartActionRef> value) {
        this.startActionRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="TEAR-DOWN-ACTION-REFS")
@XmlElement(name="TEAR-DOWN-ACTION-REF")
    public ArrayList<TearDownActionRef> getTearDownActionRefs() {
    return this.tearDownActionRefs;
}

    public void setTearDownActionRefs(ArrayList<TearDownActionRef> value) {
        this.tearDownActionRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="BUILD-ACTIONS")
@XmlElement(name="BUILD-ACTION")
    public ArrayList<BuildAction> getBuildActions() {
    return this.buildActions;
}

    public void setBuildActions(ArrayList<BuildAction> value) {
        this.buildActions = value;
    }
    
    
    
    @XmlElementWrapper(name="BUILD-ACTION-ENVIRONMENTS")
@XmlElement(name="BUILD-ACTION-ENVIRONMENT")
    public ArrayList<BuildActionEnvironment> getBuildActionEnvironments() {
    return this.buildActionEnvironments;
}

    public void setBuildActionEnvironments(ArrayList<BuildActionEnvironment> value) {
        this.buildActionEnvironments = value;
    }
    
    
    
    @XmlElementWrapper(name="DYNAMIC-ACTION-REFS")
@XmlElement(name="DYNAMIC-ACTION-REF")
    public ArrayList<DynamicActionRef> getDynamicActionRefs() {
    return this.dynamicActionRefs;
}

    public void setDynamicActionRefs(ArrayList<DynamicActionRef> value) {
        this.dynamicActionRefs = value;
    }
    
    
}