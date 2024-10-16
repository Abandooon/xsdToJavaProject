package stdgui.data.model.orimodel;
@XmlRootElement(name = "ECUC-REFERENCE-DEF")
public class EcucReferenceDef {

    
    
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
    
    
    
    protected EcucConfigurationClassAffection configurationClassAffection;
    
    
    
    protected ArrayList<EcucImplementationConfigurationClass> implementationConfigClasses;
    
    
    
    protected ArrayList<EcucMultiplicityConfigurationClass> multiplicityConfigClasses;
    
    
    
    protected String origin;
    
    
    
    protected Boolean postBuildVariantMultiplicity;
    
    
    
    protected Boolean postBuildVariantValue;
    
    
    
    protected Boolean requiresIndex;
    
    
    
    protected ArrayList<EcucValueConfigurationClass> valueConfigClasses;
    
    
    
    protected DestinationRef destinationRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="CONFIGURATION-CLASS-AFFECTION")
    public EcucConfigurationClassAffection getConfigurationClassAffection() {
    return this.configurationClassAffection;
}

    public void setConfigurationClassAffection(EcucConfigurationClassAffection value) {
        this.configurationClassAffection = value;
    }
    
    
    
    @XmlElementWrapper(name="IMPLEMENTATION-CONFIG-CLASSES")
@XmlElement(name="ECUC-IMPLEMENTATION-CONFIGURATION-CLASS")
    public ArrayList<EcucImplementationConfigurationClass> getImplementationConfigClasses() {
    return this.implementationConfigClasses;
}

    public void setImplementationConfigClasses(ArrayList<EcucImplementationConfigurationClass> value) {
        this.implementationConfigClasses = value;
    }
    
    
    
    @XmlElementWrapper(name="MULTIPLICITY-CONFIG-CLASSES")
@XmlElement(name="ECUC-MULTIPLICITY-CONFIGURATION-CLASS")
    public ArrayList<EcucMultiplicityConfigurationClass> getMultiplicityConfigClasses() {
    return this.multiplicityConfigClasses;
}

    public void setMultiplicityConfigClasses(ArrayList<EcucMultiplicityConfigurationClass> value) {
        this.multiplicityConfigClasses = value;
    }
    
    
    
    @XmlElement(name="ORIGIN")
    public String getOrigin() {
    return this.origin;
}

    public void setOrigin(String value) {
        this.origin = value;
    }
    
    
    
    @XmlElement(name="POST-BUILD-VARIANT-MULTIPLICITY")
    public Boolean getPostBuildVariantMultiplicity() {
    return this.postBuildVariantMultiplicity;
}

    public void setPostBuildVariantMultiplicity(Boolean value) {
        this.postBuildVariantMultiplicity = value;
    }
    
    
    
    @XmlElement(name="POST-BUILD-VARIANT-VALUE")
    public Boolean getPostBuildVariantValue() {
    return this.postBuildVariantValue;
}

    public void setPostBuildVariantValue(Boolean value) {
        this.postBuildVariantValue = value;
    }
    
    
    
    @XmlElement(name="REQUIRES-INDEX")
    public Boolean getRequiresIndex() {
    return this.requiresIndex;
}

    public void setRequiresIndex(Boolean value) {
        this.requiresIndex = value;
    }
    
    
    
    @XmlElementWrapper(name="VALUE-CONFIG-CLASSES")
@XmlElement(name="ECUC-VALUE-CONFIGURATION-CLASS")
    public ArrayList<EcucValueConfigurationClass> getValueConfigClasses() {
    return this.valueConfigClasses;
}

    public void setValueConfigClasses(ArrayList<EcucValueConfigurationClass> value) {
        this.valueConfigClasses = value;
    }
    
    
    
    @XmlElement(name="DESTINATION-REF")
    public DestinationRef getDestinationRef() {
    return this.destinationRef;
}

    public void setDestinationRef(DestinationRef value) {
        this.destinationRef = value;
    }
    
    
}