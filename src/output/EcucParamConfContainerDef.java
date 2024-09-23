package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class EcucParamConfContainerDef {

    
    
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
    
    
    
    protected RelatedTraceItemRef relatedTraceItemRef;
    
    
    
    protected EcucValidationConds ecucValidationConds;
    
    
    
    protected EcucConditionSpecification ecucCond;
    
    
    
    protected PositiveIntegerValueVariationPoint lowerMultiplicity;
    
    
    
    protected PositiveIntegerValueVariationPoint upperMultiplicity;
    
    
    
    protected BooleanValueVariationPoint upperMultiplicityInfinite;
    
    
    
    protected EcucScopeEnum scope;
    
    
    
    protected DestinationUriRefs destinationUriRefs;
    
    
    
    protected MultiplicityConfigClasses multiplicityConfigClasses;
    
    
    
    protected Boolean postBuildChangeable;
    
    
    
    protected Boolean postBuildVariantMultiplicity;
    
    
    
    protected Boolean requiresIndex;
    
    
    
    protected Boolean multipleConfigurationContainer;
    
    
    
    protected Parameters parameters;
    
    
    
    protected References references;
    
    
    
    protected SubContainers subContainers;
    
    

    
    
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
    
    
    
    @XmlElement(name="RELATED-TRACE-ITEM-REF")
    public RelatedTraceItemRef getRelatedTraceItemRef() {
        return this.relatedTraceItemRef;
    }

    public void setRelatedTraceItemRef(RelatedTraceItemRef value) {
        this.relatedTraceItemRef = value;
    }
    
    
    
    @XmlElement(name="ECUC-VALIDATION-CONDS")
    public EcucValidationConds getEcucValidationConds() {
        return this.ecucValidationConds;
    }

    public void setEcucValidationConds(EcucValidationConds value) {
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
    
    
    
    @XmlElement(name="DESTINATION-URI-REFS")
    public DestinationUriRefs getDestinationUriRefs() {
        return this.destinationUriRefs;
    }

    public void setDestinationUriRefs(DestinationUriRefs value) {
        this.destinationUriRefs = value;
    }
    
    
    
    @XmlElement(name="MULTIPLICITY-CONFIG-CLASSES")
    public MultiplicityConfigClasses getMultiplicityConfigClasses() {
        return this.multiplicityConfigClasses;
    }

    public void setMultiplicityConfigClasses(MultiplicityConfigClasses value) {
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
    
    
    
    @XmlElement(name="MULTIPLE-CONFIGURATION-CONTAINER")
    public Boolean getMultipleConfigurationContainer() {
        return this.multipleConfigurationContainer;
    }

    public void setMultipleConfigurationContainer(Boolean value) {
        this.multipleConfigurationContainer = value;
    }
    
    
    
    @XmlElement(name="PARAMETERS")
    public Parameters getParameters() {
        return this.parameters;
    }

    public void setParameters(Parameters value) {
        this.parameters = value;
    }
    
    
    
    @XmlElement(name="REFERENCES")
    public References getReferences() {
        return this.references;
    }

    public void setReferences(References value) {
        this.references = value;
    }
    
    
    
    @XmlElement(name="SUB-CONTAINERS")
    public SubContainers getSubContainers() {
        return this.subContainers;
    }

    public void setSubContainers(SubContainers value) {
        this.subContainers = value;
    }
    
    
}