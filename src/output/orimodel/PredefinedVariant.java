package stdgui.data.model.orimodel;
@XmlRootElement(name = "PREDEFINED-VARIANT")
public class PredefinedVariant {

    
    
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
    
    
    
    protected ArrayList<IncludedVariantRef> includedVariantRefs;
    
    
    
    protected ArrayList<PostBuildVariantCriterionValueSetRef> postBuildVariantCriterionValueSetRefs;
    
    
    
    protected ArrayList<SwSystemconstantValueSetRef> swSystemconstantValueSetRefs;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="INCLUDED-VARIANT-REFS")
@XmlElement(name="INCLUDED-VARIANT-REF")
    public ArrayList<IncludedVariantRef> getIncludedVariantRefs() {
    return this.includedVariantRefs;
}

    public void setIncludedVariantRefs(ArrayList<IncludedVariantRef> value) {
        this.includedVariantRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="POST-BUILD-VARIANT-CRITERION-VALUE-SET-REFS")
@XmlElement(name="POST-BUILD-VARIANT-CRITERION-VALUE-SET-REF")
    public ArrayList<PostBuildVariantCriterionValueSetRef> getPostBuildVariantCriterionValueSetRefs() {
    return this.postBuildVariantCriterionValueSetRefs;
}

    public void setPostBuildVariantCriterionValueSetRefs(ArrayList<PostBuildVariantCriterionValueSetRef> value) {
        this.postBuildVariantCriterionValueSetRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="SW-SYSTEMCONSTANT-VALUE-SET-REFS")
@XmlElement(name="SW-SYSTEMCONSTANT-VALUE-SET-REF")
    public ArrayList<SwSystemconstantValueSetRef> getSwSystemconstantValueSetRefs() {
    return this.swSystemconstantValueSetRefs;
}

    public void setSwSystemconstantValueSetRefs(ArrayList<SwSystemconstantValueSetRef> value) {
        this.swSystemconstantValueSetRefs = value;
    }
    
    
}