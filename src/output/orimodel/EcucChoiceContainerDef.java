package stdgui.data.model.orimodel;
@XmlRootElement(name = "ECUC-CHOICE-CONTAINER-DEF")
public class EcucChoiceContainerDef {

    
    
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
    
    
    
    protected RelatedTraceItemRef relatedTraceItemRef;
    
    
    
    protected ArrayList<EcucValidationCondition> ecucValidationConds;
    
    
    
    protected EcucConditionSpecification ecucCond;
    
    
    
    protected PositiveIntegerValueVariationPoint lowerMultiplicity;
    
    
    
    protected PositiveIntegerValueVariationPoint upperMultiplicity;
    
    
    
    protected BooleanValueVariationPoint upperMultiplicityInfinite;
    
    
    
    protected EcucScopeEnum scope;
    
    
    
    protected ArrayList<DestinationUriRef> destinationUriRefs;
    
    
    
    protected ArrayList<EcucMultiplicityConfigurationClass> multiplicityConfigClasses;
    
    
    
    protected Boolean postBuildChangeable;
    
    
    
    protected Boolean postBuildVariantMultiplicity;
    
    
    
    protected Boolean requiresIndex;
    
    
    
    protected ArrayList<EcucParamConfContainerDef> choices;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="DESTINATION-URI-REFS")
@XmlElement(name="DESTINATION-URI-REF")
    public ArrayList<DestinationUriRef> getDestinationUriRefs() {
    return this.destinationUriRefs;
}

    public void setDestinationUriRefs(ArrayList<DestinationUriRef> value) {
        this.destinationUriRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="MULTIPLICITY-CONFIG-CLASSES")
@XmlElement(name="ECUC-MULTIPLICITY-CONFIGURATION-CLASS")
    public ArrayList<EcucMultiplicityConfigurationClass> getMultiplicityConfigClasses() {
    return this.multiplicityConfigClasses;
}

    public void setMultiplicityConfigClasses(ArrayList<EcucMultiplicityConfigurationClass> value) {
        this.multiplicityConfigClasses = value;
    }
    
    
    
    @XmlElement(name="POST-BUILD-CHANGEABLE")
    public Boolean getPostBuildChangeable() {
    return this.postBuildChangeable;
}

    public void setPostBuildChangeable(Boolean value) {
        this.postBuildChangeable = value;
    }
    
    
    
    @XmlElement(name="POST-BUILD-VARIANT-MULTIPLICITY")
    public Boolean getPostBuildVariantMultiplicity() {
    return this.postBuildVariantMultiplicity;
}

    public void setPostBuildVariantMultiplicity(Boolean value) {
        this.postBuildVariantMultiplicity = value;
    }
    
    
    
    @XmlElement(name="REQUIRES-INDEX")
    public Boolean getRequiresIndex() {
    return this.requiresIndex;
}

    public void setRequiresIndex(Boolean value) {
        this.requiresIndex = value;
    }
    
    
    
    @XmlElementWrapper(name="CHOICES")
@XmlElement(name="ECUC-PARAM-CONF-CONTAINER-DEF")
    public ArrayList<EcucParamConfContainerDef> getChoices() {
    return this.choices;
}

    public void setChoices(ArrayList<EcucParamConfContainerDef> value) {
        this.choices = value;
    }
    
    
}