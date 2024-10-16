package stdgui.data.model.orimodel;
@XmlRootElement(name = "ECUC-MODULE-DEF")
public class EcucModuleDef {

    
    
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
    
    
    
    protected RelatedTraceItemRef relatedTraceItemRef;
    
    
    
    protected ArrayList<EcucValidationCondition> ecucValidationConds;
    
    
    
    protected EcucConditionSpecification ecucCond;
    
    
    
    protected PositiveIntegerValueVariationPoint lowerMultiplicity;
    
    
    
    protected PositiveIntegerValueVariationPoint upperMultiplicity;
    
    
    
    protected BooleanValueVariationPoint upperMultiplicityInfinite;
    
    
    
    protected EcucScopeEnum scope;
    
    
    
    protected CIdentifier apiServicePrefix;
    
    
    
    protected Boolean postBuildVariantSupport;
    
    
    
    protected RefinedModuleDefRef refinedModuleDefRef;
    
    
    
    protected ArrayList<EcucConfigurationVariantEnum> supportedConfigVariants;
    
    
    
    protected Containers containers;
    
    

    
    
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
    
    
    
    @XmlElement(name="RELATED-TRACE-ITEM-REF")
    public RelatedTraceItemRef getRelatedTraceItemRef() {
    return this.relatedTraceItemRef;
}

    public void setRelatedTraceItemRef(RelatedTraceItemRef value) {
        this.relatedTraceItemRef = value;
    }
    
    
    
    @XmlElementWrapper(name="ECUC-VALIDATION-CONDS")
@XmlElement(name="ECUC-VALIDATION-CONDITION")
    public ArrayList<EcucValidationCondition> getEcucValidationConds() {
    return this.ecucValidationConds;
}

    public void setEcucValidationConds(ArrayList<EcucValidationCondition> value) {
        this.ecucValidationConds = value;
    }
    
    
    
    @XmlElement(name="ECUC-COND")
    public EcucConditionSpecification getEcucCond() {
    return this.ecucCond;
}

    public void setEcucCond(EcucConditionSpecification value) {
        this.ecucCond = value;
    }
    
    
    
    @XmlElement(name="LOWER-MULTIPLICITY")
    public PositiveIntegerValueVariationPoint getLowerMultiplicity() {
    return this.lowerMultiplicity;
}

    public void setLowerMultiplicity(PositiveIntegerValueVariationPoint value) {
        this.lowerMultiplicity = value;
    }
    
    
    
    @XmlElement(name="UPPER-MULTIPLICITY")
    public PositiveIntegerValueVariationPoint getUpperMultiplicity() {
    return this.upperMultiplicity;
}

    public void setUpperMultiplicity(PositiveIntegerValueVariationPoint value) {
        this.upperMultiplicity = value;
    }
    
    
    
    @XmlElement(name="UPPER-MULTIPLICITY-INFINITE")
    public BooleanValueVariationPoint getUpperMultiplicityInfinite() {
    return this.upperMultiplicityInfinite;
}

    public void setUpperMultiplicityInfinite(BooleanValueVariationPoint value) {
        this.upperMultiplicityInfinite = value;
    }
    
    
    
    @XmlElement(name="SCOPE")
    public EcucScopeEnum getScope() {
    return this.scope;
}

    public void setScope(EcucScopeEnum value) {
        this.scope = value;
    }
    
    
    
    @XmlElement(name="API-SERVICE-PREFIX")
    public CIdentifier getApiServicePrefix() {
    return this.apiServicePrefix;
}

    public void setApiServicePrefix(CIdentifier value) {
        this.apiServicePrefix = value;
    }
    
    
    
    @XmlElement(name="POST-BUILD-VARIANT-SUPPORT")
    public Boolean getPostBuildVariantSupport() {
    return this.postBuildVariantSupport;
}

    public void setPostBuildVariantSupport(Boolean value) {
        this.postBuildVariantSupport = value;
    }
    
    
    
    @XmlElement(name="REFINED-MODULE-DEF-REF")
    public RefinedModuleDefRef getRefinedModuleDefRef() {
    return this.refinedModuleDefRef;
}

    public void setRefinedModuleDefRef(RefinedModuleDefRef value) {
        this.refinedModuleDefRef = value;
    }
    
    
    
    @XmlElementWrapper(name="SUPPORTED-CONFIG-VARIANTS")
@XmlElement(name="SUPPORTED-CONFIG-VARIANT")
    public ArrayList<EcucConfigurationVariantEnum> getSupportedConfigVariants() {
    return this.supportedConfigVariants;
}

    public void setSupportedConfigVariants(ArrayList<EcucConfigurationVariantEnum> value) {
        this.supportedConfigVariants = value;
    }
    
    
    
    @XmlElement(name="CONTAINERS")
    public Containers getContainers() {
    return this.containers;
}

    public void setContainers(Containers value) {
        this.containers = value;
    }
    
    
}